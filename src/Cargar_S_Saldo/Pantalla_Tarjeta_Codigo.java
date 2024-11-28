/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cargar_S_Saldo;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import Main_paquete.Bdd;
import java.sql.Connection;
/**
 *
 * @author HP OMEN
 */
public class Pantalla_Tarjeta_Codigo {
    Bdd bdd = new Bdd();
    public DefaultListModel mostrar(DefaultListModel modelo,Connection conexion,int id){
        
        
        ArrayList array=bdd.Select_todo_tar(conexion,id);
        for (int i=0; i<array.size(); i++){
            modelo.addElement(array.get(i));
        }
        return modelo;
        
    }
}

