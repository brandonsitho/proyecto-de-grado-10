/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.sql.*;
import javax.swing.JOptionPane;
        
/**
 *
 * @author Owner
 */
public class conectar {
   Connection con=null;
   public Connection conexion(){
       try {
           //cargar nuestro driver
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/observador","root","");
           System.out.println("conexion establecida");
           JOptionPane.showMessageDialog(null, "conexion establecida");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("error de conexion");
           JOptionPane.showMessageDialog(null, "error de conexion "+e);
       }
       return con;
   }
}

