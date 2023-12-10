
package veriTabaniPaketi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLBaglanti {
    
    final String KULLANICI_ADI = "root";
    final String PAROLA = "";
    final String HOST = "localhost";
    final String JDBC = "jdbc:mysql://";
    final String DRIVER = "com.mysql.cj.jdbc.Driver";
    final Integer PORT = 3306; //xampp portu
    
    String DBIsmi;
    String baglantýURL;
    Connection baglantý;
    PreparedStatement komuttamamlayýcý;

    public SQLBaglanti(String DBIsmi) {
        this.DBIsmi = DBIsmi;
        DBBaglantýKur();
    }    
    
    public void DBBaglantýKur(){
    
        try {
            Class.forName(DRIVER);
            baglantýURL = JDBC + HOST + ":" + PORT + "/" + DBIsmi;
            baglantý = (Connection) DriverManager.getConnection(baglantýURL, KULLANICI_ADI, PAROLA);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SQLBaglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}