/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDeDatos;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class conexion {

    Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/gestioncitasmedicas", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("conexion fallida "+e);
        }
        return conectar;
    }
}
