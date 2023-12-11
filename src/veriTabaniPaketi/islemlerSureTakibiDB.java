package veriTabaniPaketi;

import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author bvos
 */
public class islemlerSureTakibiDB extends SQLBaglanti{
    
    public islemlerSureTakibiDB(String DBIsmi) {
        super(DBIsmi);
    }
    
    private final String SURE_TAKIBI_EKLE = "INSERT INTO süre_takibi (kullanici_id, tarih) VALUES (?, ?)";

// ...

public void sureTakibiEkle(int kullaniciId, Date tarih) {
    try{
        komuttamamlayýcý = baglantý.prepareStatement(SURE_TAKIBI_EKLE);
        komuttamamlayýcý.setInt(1, kullaniciId);
        komuttamamlayýcý.setDate(2, new java.sql.Date(tarih.getTime())); // Java tarihini SQL tarihine çevir
        komuttamamlayýcý.executeUpdate();
    } 
    catch (SQLException ex){
        ex.printStackTrace();
    }
}

            
    
}
