package veriTabaniPaketi;

import girisEkraniPaketi.girisEkrani;
import girisKaynakKODislemler.islemGiris;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import veriKullaniciPaketi.kullanici;

public class islemlerKullaniciDB extends SQLBaglanti{
    //sql baglantidan kalitim yapip komutlari dogrudan kullanacagim
    
    private String kayitMesaj = "";
    
    public islemlerKullaniciDB(String DBIsmi) {
        super(DBIsmi);
    }
    
    private final String KULLANICI_ADI_SIFRESI = "SELECT * FROM kullanici WHERE kullaniciAdi=? AND kullaniciParola=?";
    //sql sorgusu
   
            
    
    
   public kullanici kullaniciBulDB(String girilenKullaniciAdi, String girilenKullaniciParola) throws SQLException {
    kullanici kullanici = null;

    komuttamamlayıcı = baglantı.prepareStatement(KULLANICI_ADI_SIFRESI);
    komuttamamlayıcı.setString(1, girilenKullaniciAdi);
    komuttamamlayıcı.setString(2, girilenKullaniciParola);

    ResultSet sonuc = komuttamamlayıcı.executeQuery();

    while (sonuc.next()) {
        kullanici = new kullanici( //basta null olusturdugum kullanici constructorinin icini dolduruyorum veritabanindaki degerlerle
            sonuc.getInt("id"),
            sonuc.getString("kullaniciAdi"),
            sonuc.getString("kullaniciParola"),
            sonuc.getString("kullaniciMail"),
            sonuc.getInt("toplamSure")
                                     );
        
        // İstediğiniz diğer işlemleri yapabilirsiniz
        System.out.println("id:" + sonuc.getInt("id"));
        System.out.println("Kullanici Adi:" + sonuc.getString("kullaniciAdi"));
        System.out.println("Parola:" + sonuc.getString("kullaniciParola"));
        System.out.println("Email:" + sonuc.getString("kullaniciMail"));
        System.out.println("Toplam Sure:" + sonuc.getInt("toplamSure")+" Dakika");
    }

    return kullanici;
}

    
    //PreparedStatement komuttamamlayıcı; SQLBaglanti classinda tanimlandi ve kalitiliyor
     private final String KULLANICI_EKLE = "INSERT INTO kullanici (kullaniciAdi, kullaniciParola, kullaniciMail, toplamSure) VALUES (?, ?, ?, ?)";
     
    public kullanici kullaniciEkleDB(String kullaniciAdi, String kullaniciParola, String kullaniciMail , int toplamSure) {
        try {
            komuttamamlayıcı = baglantı.prepareStatement(KULLANICI_EKLE);
            komuttamamlayıcı.setString(1, kullaniciAdi);
            komuttamamlayıcı.setString(2, kullaniciParola);
            komuttamamlayıcı.setString(3, kullaniciMail);
            komuttamamlayıcı.setInt(4, toplamSure); //4.parametreyi integer ayarladik oto sifir
            

           int etkilenenSatirSayisi = komuttamamlayıcı.executeUpdate(); //insert gibi komutlarda .executeQuery calismaz

            if (etkilenenSatirSayisi > 0) {
                
                kayitMesaj = "Başarıyla kayıt oldunuz !";
                
            ResultSet generatedKeys = komuttamamlayıcı.getGeneratedKeys();
            if (generatedKeys.next()) {
                int yeniKullaniciID = generatedKeys.getInt(1);
                System.out.println("Eklenen Kullanıcı ID: " + yeniKullaniciID);
                System.out.println("Eklenen Kullanıcı Adı: " + kullaniciAdi);
                System.out.println("Eklenen Kullanıcı Parola: " + kullaniciParola);
                System.out.println("Eklenen Kullanıcı Email: " + kullaniciMail);
                System.out.println("Eklenen Kullanıcı Toplam Süre: 0");
            }
        } else {
            kayitMesaj = "Kayıt sırasında bir hata meydana geldi !";
        }
    } catch (SQLException ex) {
        Logger.getLogger(islemlerKullaniciDB.class.getName()).log(Level.SEVERE, null, ex);
    }       
                kullanici kullanici = null;
                return kullanici;
    }
    
    //toplamSureyi databasede guncellemek icin
    //private final String SUREYI_GUNCELLE = "INSERT INTO kullanici (toplamSure) VALUES (?)";

    
    private final String SUREYI_GUNCELLE = "UPDATE kullanici SET toplamSure=? WHERE kullaniciAdi=?";

    public void kullaniciGuncelleDB(kullanici kullanici) {
    try {
        komuttamamlayıcı = baglantı.prepareStatement(SUREYI_GUNCELLE);
        komuttamamlayıcı.setInt(1, kullanici.getToplamSure());
        komuttamamlayıcı.setString(2, kullanici.getKullaniciAdi());

         komuttamamlayıcı.executeUpdate();

        
    } catch (SQLException ex) {
        Logger.getLogger(islemlerKullaniciDB.class.getName()).log(Level.SEVERE, null, ex);
    }
}

   


    

    public String getKayitMesaj() {
        return kayitMesaj;
    }
    
}