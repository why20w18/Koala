package veriTabaniPaketi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import veriKullaniciPaketi.kullanici;

public class islemlerKullaniciDB extends SQLBaglanti{
    //sql baglantidan kalitim yapip komutlari dogrudan kullanacagim
    public islemlerKullaniciDB(String DBIsmi) {
        super(DBIsmi);
    }
    
    private final String KULLANICI_ADI_SIFRESI = "SELECT * FROM kullanici WHERE kullaniciAdi=? AND kullaniciParola=?";
    //sql sorgusu
   
            
    
    
    public kullanici kullaniciBulDB(String girilenKullaniciAdi , String girilenKullaniciParola) throws SQLException{
        kullanici kullanici;
        
        komuttamamlayýcý = baglantý.prepareStatement(KULLANICI_ADI_SIFRESI);
        komuttamamlayýcý.setString(1, girilenKullaniciAdi);
        komuttamamlayýcý.setString(2, girilenKullaniciParola);
        //en bastaki soru isaretlerini ayarladik index 1 baslar 
        
        ResultSet sonuc = komuttamamlayýcý.executeQuery();
        
        while(sonuc.next()){
            System.out.println("id:"+sonuc.getInt("id"));
            System.out.println("Kullanici Adi:"+sonuc.getString("kullaniciAdi"));
            System.out.println("Parola:"+sonuc.getString("kullaniciParola"));
            System.out.println("Email:"+sonuc.getString("kullaniciMail"));
            System.out.println("Toplam Sure:"+sonuc.getInt("toplamSure"));
            
        }
        
        
        //veritabanindan donen degerleri resultSet classi ile tutabiliriz
        //yukaridan kacinci soru isaretine denk geliyorsa onu yazacagiz sayma sayisi olarak baslar soru isaretleri
        //databasedeki id ile arayacaksak string degil setInt diyerek arama yapariz
        
        kullanici = new kullanici(0,"bug", "12345", "bug@bug.com", 1);
        
        return kullanici;
    }
    
    //PreparedStatement komuttamamlayýcý; SQLBaglanti classinda tanimlandi ve kalitiliyor
     private final String KULLANICI_EKLE = "INSERT INTO kullanici (kullaniciAdi, kullaniciParola, kullaniciMail, toplamSure) VALUES (?, ?, ?, ?)";
     
    
    public kullanici kullaniciEkleDB(String kullaniciAdi, String kullaniciParola, String kullaniciMail) {
        try {
            komuttamamlayýcý = baglantý.prepareStatement(KULLANICI_EKLE);
            komuttamamlayýcý.setString(1, kullaniciAdi);
            komuttamamlayýcý.setString(2, kullaniciParola);
            komuttamamlayýcý.setString(3, kullaniciMail);
            //komuttamamlayýcý.setString(4, toplamSure);
            
        

            int sonuc = komuttamamlayýcý.executeUpdate();

            if (sonuc > 0) {
                System.out.println("Kullanýcý baþarýyla eklendi.");
            } else {
                System.out.println("Kullanýcý eklenirken bir hata oluþtu.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(islemlerKullaniciDB.class.getName()).log(Level.SEVERE, null, ex);
        }       
                kullanici kullanici = null;
                return kullanici;
    }
}
    
    
   
      
