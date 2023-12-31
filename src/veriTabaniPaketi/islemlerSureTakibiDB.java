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
    
    private final String SURE_TAKIBI_EKLE = "INSERT INTO suretakibi (kullanici_id, tarih) VALUES (?, ?)";


    public void sureTakibiEkle(int kullaniciId, Date tarih){
        try{
            komuttamamlayıcı = baglantı.prepareStatement(SURE_TAKIBI_EKLE);
            komuttamamlayıcı.setInt(1, kullaniciId);
            komuttamamlayıcı.setDate(2, new java.sql.Date(tarih.getTime())); 
            komuttamamlayıcı.executeUpdate();
        } 
        catch (SQLException ex){
            System.out.println("hata !");
            ex.printStackTrace();
        }
    }

            
    
}
