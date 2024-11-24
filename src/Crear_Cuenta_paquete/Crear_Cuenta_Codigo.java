/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crear_Cuenta_paquete;
import Main_paquete.Bdd;
import java.sql.Connection;

/**
 *
 * @author HP OMEN
 */
public class Crear_Cuenta_Codigo {
    Bdd bdd= new Bdd();
    private boolean verificar_contraseña(String C1,String C2){
        if (C1.equals(C2)){
            return true;
    }else{
            return false;
        }
       }
    
    public boolean Envio_data_c(String Nom,String C1,String C2,String Gm, Connection conexion){
        if (verificar_contraseña(C1,C2)){
            if (bdd.GmYNom(Nom,Gm,conexion)){
                bdd.Insert_nuevo_usuario(Nom, C1, Gm,conexion);
                return true;
            }
            return false;
            
        }
        return false;
    }
}
