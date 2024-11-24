/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_paquete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JTable;
/**
 *
 * @author HP OMEN
 */
public class Bdd {
     // Inicializa la conexión como nula
    
    public Connection Conectar() {
        Connection conexion=null;
        try {
            // Asegúrate de que la URL esté correctamente formateada
            String url = "jdbc:mysql://b5unxzg8ciaamd2n5b6n-mysql.services.clever-cloud.com:3306/b5unxzg8ciaamd2n5b6n";
            String user = "uvwdpj98ebhxvzsb"; // Nombre de usuario
            String password = "ic3UNYGo9BtyGmGm0988"; // Contraseña

            // Intenta establecer la conexión

            conexion = DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null, "Se conecto correctamente la BDD");   
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se conecto correctamente la BDD: "+e.toString());
        }
        return conexion; // Retorna la conexión (puede ser nula si hubo un error)
    }
    
    public void Desconectar(Connection conexion){
        try{
            if(conexion != null && !conexion.isClosed()){
                conexion.close();
                //JOptionPane.showMessageDialog(null, "Se desconecto correctamente la BDD");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.toString());
        }
    }
    
    public boolean GmYNom(String Gm, String Nom, Connection conexion){
        try{
            boolean resultado;
            String str="CALL verificar_usuario_proc(?,?,?);";

            CallableStatement query=conexion.prepareCall(str);
            query.setString(1,Nom);
            query.setString(2,Gm);
            query.registerOutParameter(3, Types.BOOLEAN);
            query.execute();
            resultado = query.getBoolean(3);
            
            if (resultado){
                return true;
            }else{
                
                return false;
            }
            
        }catch(Exception e){
           return false;
           
        }
    }
    
    public void Insert_nuevo_usuario(String Nom,String C1,String Gm,Connection conexion){
        try{
            String str="CALL insertar_usuario(?,?,?);";
            PreparedStatement insert= conexion.prepareStatement(str);
            insert.setString(1,Nom);
            insert.setString(2,Gm);
            insert.setString(3,Nom);
            
            insert.executeUpdate();

            Desconectar( conexion);
            
             
        }catch(Exception e){
            
        }
        
    }
    
    public boolean Select_Nombre_Contraseña(String Nom, String Con,Connection conexion){
        try{
            boolean resultado;
            String str="CALL Verificar_si_existe(?,?,?);";
            CallableStatement query=conexion.prepareCall(str);
            query.setString(1,Nom);
            query.setString(2,Con);
            query.registerOutParameter(3, Types.BOOLEAN);
            query.execute();
            resultado = query.getBoolean(3);
            
            if (resultado){
                return false;
            }else{
                
                return true;
            }
            
        }catch(Exception e){
            return false;
    }
   }
    
    public int sacar_id(String Nom, Connection conexion){
        try{
            int Item=0;
            String str="SELECT id FROM Usuario WHERE Nombre=?";
            PreparedStatement  query=conexion.prepareStatement(str);
            query.setString(1,Nom);
            ResultSet result=query.executeQuery();
            while(result.next()){
                Item=Integer.parseInt(result.getString("id"));
            }
            return Item;
        }catch(Exception e){
            return 0;
            
        }
    }
    
    public boolean insert_tarjeta(int Num, int Fecha, int Num_seguridad, int id,Connection conexion){
        try{
            String str="CALL insertar_tarjeta(?,?,?,?);";
            PreparedStatement insert= conexion.prepareStatement(str);
            insert.setInt(1,Num);
            insert.setInt(2,Fecha);
            insert.setInt(3,Num_seguridad);
            insert.setInt(4,id);
            
            
            
            insert.executeUpdate();
            return true;
        }catch(Exception e){
            return false;
    }
    }
    
    public ArrayList Select_todo_tar(Connection conexion,int id){
        try{
             ArrayList<String> array = new ArrayList<String>();
            String str="SELECT * FROM Tarjeta WHERE id_usuario=?";
            PreparedStatement statement = conexion.prepareStatement(str);
            
            statement.setInt(1,id);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                String Item=result.getInt("id") + "-" + result.getInt("Numero")+ "-" + result.getInt("Cargo")+ "-" + result.getInt("fecha_de_vencimiento")+ "-" + result.getInt("num_seguridad");
                array.add(Item);
            }
            return array;
            
        }catch(Exception e){
            return null;
            
        }
    }
    
}
