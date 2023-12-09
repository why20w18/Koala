
package veriTabaniPaketi;

import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.SwingWorker;




/**
 *
 * @author bvos
 */
public class islemlerKullaniciDB {
    //bu classi girisEkraninda tanýmladým <-> islemMail classiniysa burada tanimlayacagim
    //zincir seklinde birbirine baglanarak gidecek
    //islemMail mail = new islemMail();
 
    
    private String mailAtilacakPosta = "";
    private String unutulanPass = "";    
    
   public void kullaniciDBcek(String kullaniciAdi){ //hangi kullanicinin maili ve sifresi
       this.mailAtilacakPosta = "bugrakaa06@gmail.com";
       this.unutulanPass = "123456";
   }
   
   
}

    
    

