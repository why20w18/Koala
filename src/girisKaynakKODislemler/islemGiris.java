package girisKaynakKODislemler;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import veriTabaniPaketi.islemlerKullaniciDB;

public class islemGiris {
    
    islemlerKullaniciDB islemDB = new islemlerKullaniciDB("kullanicilar");
    
    private JTextField jTextField_KullanıcıAdı;
    private JPasswordField jPasswordField_Sifre;
    
    private String girilenKullanıcıAdı;
    private String girilenSifre;
    
    // Değişkenlerimiz - Mesaj
    private String sonucMesaj;
    
    public islemGiris(JTextField jTextField_KullanıcıAdı, JPasswordField jPasswordField_Sifre) {
        this.jTextField_KullanıcıAdı = jTextField_KullanıcıAdı;
        this.jPasswordField_Sifre = jPasswordField_Sifre;
        
        // Bu değerlerin her metod çağrıldığında güncellenmesi gerekir.
        this.girilenKullanıcıAdı = jTextField_KullanıcıAdı.getText();
        this.girilenSifre = new String(jPasswordField_Sifre.getPassword());
    }
    
    
    public boolean bosGirisKontrol(){
        // Her metod çağrıldığında güncel değerleri al.
        this.girilenKullanıcıAdı = jTextField_KullanıcıAdı.getText();
        this.girilenSifre = new String(jPasswordField_Sifre.getPassword());
    
        if(girilenKullanıcıAdı.equals("") && girilenSifre.equals("")){
            this.sonucMesaj = "Kullanıcı Adı ve Şifresi Giriniz.";
            return false;
        }
        else if(girilenKullanıcıAdı.equals("")){
            this.sonucMesaj = "Kullanıcı Adı Giriniz.";
            return false;
        }
        else if(girilenSifre.equals("")){
            this.sonucMesaj = "Şifre Giriniz";
            return false;
        }
        else {
            this.sonucMesaj = "Başarılı";
            return true;
        }
    }
    
    public void kontrolVeriTabani(){
        //var mi yokk mu ?
        
        
        
        
    }
    
    
    public String getSonucMesaj() {
        return sonucMesaj;
    }
}
