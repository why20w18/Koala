package girisKaynakKODislemler;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class islemGiris {
    
    private JTextField jTextField_Kullan�c�Ad�;
    private JPasswordField jPasswordField_Sifre;
    
    private String girilenKullan�c�Ad�;
    private String girilenSifre;
    
    // De�i�kenlerimiz - Mesaj
    private String sonucMesaj;
    
    public islemGiris(JTextField jTextField_Kullan�c�Ad�, JPasswordField jPasswordField_Sifre) {
        this.jTextField_Kullan�c�Ad� = jTextField_Kullan�c�Ad�;
        this.jPasswordField_Sifre = jPasswordField_Sifre;
        
        // Bu de�erlerin her metod �a�r�ld���nda g�ncellenmesi gerekir.
        this.girilenKullan�c�Ad� = jTextField_Kullan�c�Ad�.getText();
        this.girilenSifre = new String(jPasswordField_Sifre.getPassword());
    }
    
    
    public boolean bosGirisKontrol(){
        // Her metod �a�r�ld���nda g�ncel de�erleri al.
        this.girilenKullan�c�Ad� = jTextField_Kullan�c�Ad�.getText();
        this.girilenSifre = new String(jPasswordField_Sifre.getPassword());
    
        if(girilenKullan�c�Ad�.equals("") && girilenSifre.equals("")){
            this.sonucMesaj = "Kullan�c� Ad� ve �ifresi Giriniz.";
            return false;
        }
        else if(girilenKullan�c�Ad�.equals("")){
            this.sonucMesaj = "Kullan�c� Ad� Giriniz.";
            return false;
        }
        else if(girilenSifre.equals("")){
            this.sonucMesaj = "�ifre Giriniz";
            return false;
        }
        else {
            this.sonucMesaj = "Ba�ar�l�";
            return true;
        }
    }
    
    public String getSonucMesaj() {
        return sonucMesaj;
    }
}
