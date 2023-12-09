
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author bvos
 */
public class islemGiris {
        
    //giris butonu action performed kisminda yapilacak islemleri buraya tasiyacagim
    
    //bosluk kontrol
    private String id_Parola_Bos;
    private String parola_Bos;
    private String id_Bos;
    private String biriYanlis;
    private String basariliGiris;
    
    //id ve pass giris kontrol
    private String giris_basarili;
    private String giris_basarisiz;
    
    private JTextField jTextField_KullaniciAdiGiris;
    private JPasswordField jPasswordField_ParolaGiris;
    
    private String girilenKullaniciAdi;
    private String girilenParola;

    public islemGiris(JTextField jTextField_KullaniciAdiGiris, JPasswordField jPasswordField_ParolaGiris) {
        this.jTextField_KullaniciAdiGiris = jTextField_KullaniciAdiGiris;
        this.jPasswordField_ParolaGiris = jPasswordField_ParolaGiris;
        
        girilenKullaniciAdi = jTextField_KullaniciAdiGiris.getText();
        girilenParola = new String(jPasswordField_ParolaGiris.getPassword());

    }
    
    public girisYap(String kullaniciAdi , String kullaniciParola){
        boolean girisBosAlanDegeri = girisBosAlan();
        boolean loginDogruMuDegeri = loginDogruMu(kullaniciAdi, kullaniciParola);
        
    }
    
    //alttakilerin hepsi true yada false deger dondurecek cagirdigimda
    public boolean girisBosAlan(){
         
        
        if(girilenKullaniciAdi.equals("") && girilenParola.equals("")){
            System.out.println("Kullanýcý Adý ve Þifre alanlarý boþ !");
            id_Parola_Bos = "Kullanýcý Adý ve Þifre alanlarý boþ !";
            return false;
        }
        else if(girilenKullaniciAdi.equals("")){
            System.out.println("Kullanýcý Adý alaný boþ lütfen parolanýzý girin!");
            id_Bos = "Kullanýcý Adý alaný boþ lütfen parolanýzý girin!";
            return false;
        }
        else if(girilenParola.equals("")){
            System.out.println("Parola alaný boþ lütfen parolanýzý girin!");
            parola_Bos = "Parola alaný boþ lütfen parolanýzý girin!";
            return false;
        }
        else{
            System.out.println("Giris Basarili !");
            basariliGiris = "Giris Basarili !";
            return true;
        }
    }
    
    protected boolean loginDogruMu(String kullaniciAdi , String kullaniciParola){
        
        if(girilenKullaniciAdi.equals(kullaniciAdi) && Objects.equals(girilenParola,kullaniciParola)){
            giris_basarili = "Kullanici adi ve parola dogrudur";
            return true;
        }
        else{
            giris_basarisiz = "kullanici adi veya parola yanlis !"; 
            return false;
        }
        
        
    }
    
    
}