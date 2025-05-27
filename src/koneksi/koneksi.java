/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.*;

public class koneksi {
  private Connection koneksi;
    
  public Connection connect() {
    try {
      // Using the new driver class name
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Berhasil load driver");
    } 
    catch (ClassNotFoundException ex) {
      System.out.println("Gagal load driver: " + ex);
    }
    
    // Updated connection URL with recommended parameters
    String url = "jdbc:mysql://localhost/kasir?useSSL=false&serverTimezone=UTC";
    try {
      koneksi = DriverManager.getConnection(url, "root", "");
      System.out.println("Berhasil koneksi database");
    } 
    catch (SQLException ex) {
      System.out.println("Gagal koneksi database: " + ex);
    }
    
    return koneksi;
  }  
}
