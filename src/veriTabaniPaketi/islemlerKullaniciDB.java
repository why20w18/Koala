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
        
        komuttamamlay�c� = baglant�.prepareStatement(KULLANICI_ADI_SIFRESI);
        komuttamamlay�c�.setString(1, girilenKullaniciAdi);
        komuttamamlay�c�.setString(2, girilenKullaniciParola);
        //en bastaki soru isaretlerini ayarladik index 1 baslar 
        
        ResultSet sonuc = komuttamamlay�c�.executeQuery();
        
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
    
    //PreparedStatement komuttamamlay�c�; SQLBaglanti classinda tanimlandi ve kalitiliyor
     private final String KULLANICI_EKLE = "INSERT INTO kullanici (kullaniciAdi, kullaniciParola, kullaniciMail, toplamSure) VALUES (?, ?, ?, ?)";
     
    
    public kullanici kullaniciEkleDB(String kullaniciAdi, String kullaniciParola, String kullaniciMail) {
        try {
            komuttamamlay�c� = baglant�.prepareStatement(KULLANICI_EKLE);
            komuttamamlay�c�.setString(1, kullaniciAdi);
            komuttamamlay�c�.setString(2, kullaniciParola);
            komuttamamlay�c�.setString(3, kullaniciMail);
            //komuttamamlay�c�.setString(4, toplamSure);
            
        

            int sonuc = komuttamamlay�c�.executeUpdate();

            if (sonuc > 0) {
                System.out.println("Kullan�c� ba�ar�yla eklendi.");
            } else {
                System.out.println("Kullan�c� eklenirken bir hata olu�tu.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(islemlerKullaniciDB.class.getName()).log(Level.SEVERE, null, ex);
        }       
                kullanici kullanici = null;
                return kullanici;
    }
}
    
    
   
      
