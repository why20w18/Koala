package girisKaynakKODislemler;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class islemGiris {
    
    private JTextField jTextField_KullanýcýAdý;
    private JPasswordField jPasswordField_Sifre;
    
    private String girilenKullanýcýAdý;
    private String girilenSifre;
    
    // Deðiþkenlerimiz - Mesaj
    private String sonucMesaj;
    
    public islemGiris(JTextField jTextField_KullanýcýAdý, JPasswordField jPasswordField_Sifre) {
        this.jTextField_KullanýcýAdý = jTextField_KullanýcýAdý;
        this.jPasswordField_Sifre = jPasswordField_Sifre;
        
        // Bu deðerlerin her metod çaðrýldýðýnda güncellenmesi gerekir.
        this.girilenKullanýcýAdý = jTextField_KullanýcýAdý.getText();
        this.girilenSifre = new String(jPasswordField_Sifre.getPassword());
    }
    
    
    public boolean bosGirisKontrol(){
        // Her metod çaðrýldýðýnda güncel deðerleri al.
        this.girilenKullanýcýAdý = jTextField_KullanýcýAdý.getText();
        this.girilenSifre = new String(jPasswordField_Sifre.getPassword());
    
        if(girilenKullanýcýAdý.equals("") && girilenSifre.equals("")){
            this.sonucMesaj = "Kullanýcý Adý ve Þifresi Giriniz.";
            return false;
        }
        else if(girilenKullanýcýAdý.equals("")){
            this.sonucMesaj = "Kullanýcý Adý Giriniz.";
            return false;
        }
        else if(girilenSifre.equals("")){
            this.sonucMesaj = "Þifre Giriniz";
            return false;
        }
        else {
            this.sonucMesaj = "Baþarýlý";
            return true;
        }
    }
    
    public String getSonucMesaj() {
        return sonucMesaj;
    }
}
