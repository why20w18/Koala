/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package girisEkraniPaketi;

import girisKaynakKODislemler.islemGiris;
import girisKaynakKODislemler.ikonGecisRenkGecis;
import veriTabaniPaketi.islemlerKullaniciDB;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import veriKullaniciPaketi.kullanici;

/**
 *
 * @author bvos
 */
public class girisEkrani extends javax.swing.JFrame {
    
    private String DB_TABLO_KULLANICI = "kullanicilar";//tablo degil veritabani
    
    //
    ikonGecisRenkGecis ikonRenk = new ikonGecisRenkGecis();
    islemlerKullaniciDB islemDB = new islemlerKullaniciDB(DB_TABLO_KULLANICI);
    islemGiris islemGiris; //objesi olusturulunca hata veriyor bunu gerekli yerlerde olusturacagiz referans olarak kalsin
    
    //ekrani ortada baslatmak icin obje olusturuyorum
    Dimension boyut = Toolkit.getDefaultToolkit().getScreenSize(); /*uygulama acilirken ortaya almali 
    o yuzden constructorda kullancagim*/
    
    //
    public String kullaniciAdi = "bugra";
    public String kullaniciParola = "password";
    
    public girisEkrani() { //constructorda cagiriyoruz ki basta oto bunlar calissin
        initComponents();
        sifreUnuttumAcKapa(false);
        kayitOlAcKapa(false);
    }

    public Boolean sifreUnuttumAcKapa(boolean dogruMu){
        
        jTextField_DogrulamaKoduGiris.setVisible(dogruMu);
        jTextField_KullaniciAdiGiris.setVisible(!dogruMu); //basta false girildiginden constructorda , true olup gozukur
        
        
        jLabel_KalanSureKurtarma.setVisible(dogruMu);
        jLabel_KurtarmaGeriSayimInt.setVisible(dogruMu);
        
        jPasswordField_ParolaGiris.setVisible(!dogruMu);
        
        jButton_GirisEkrani.setVisible(!dogruMu);
        jButton_KayitButon.setVisible(false);
        jButton_KoduGonderSifreUnuttum.setVisible(dogruMu);
        
        jLabel_kayitOl.setVisible(!dogruMu);
        jLabel_sifremiUnuttum.setVisible(!dogruMu);

        if(dogruMu){ //basta false girildi , uyari ikonu gelmeyecek
            jLabel_GirisUserIkon.setIcon(ikonRenk.getUser128pxGirisSifreUnuttun());
        }
        else{
            jLabel_GirisUserIkon.setIcon(ikonRenk.getUser128pxGirisBeyaz());
            //program acildiginda ilk burasi calisacak o yuzden ekrani dimensionla burada ortalayacagiz
            this.setLocation(boyut.width/2 - this.getSize().width / 2,boyut.height/2 - this.getSize().height / 2);
        }
        
        return dogruMu;
    }
   public Boolean kayitOlAcKapa(boolean dogruMu){
    jTextField_KullaniciAdiGiris.setVisible(!dogruMu);
    jPasswordField_ParolaGiris.setVisible(!dogruMu);
    
    jTextField_DogrulamaKoduGiris.setVisible(false);
    jLabel_KalanSureKurtarma.setVisible(false);
    jLabel_KurtarmaGeriSayimInt.setVisible(false);
    
    
    jLabel_kayitOl.setVisible(!dogruMu);
    jLabel_sifremiUnuttum.setVisible(!dogruMu);
    jTextField_KayitKullaniciAdi.setVisible(dogruMu);
    jTextField_Kayýt_Email.setVisible(dogruMu);
    jPasswordField_kayitParola.setVisible(dogruMu);
    
    
    jButton_GirisEkrani.setVisible(!dogruMu);
    jButton_KayitButon.setVisible(dogruMu);
    jButton_KoduGonderSifreUnuttum.setVisible(false);
        

    if(dogruMu){

        jLabel_GirisUserIkon.setIcon(ikonRenk.getUser128pxKayitOl());

    }else{
    
        jLabel_GirisUserIkon.setIcon(ikonRenk.getUser128pxGirisBeyaz());
    }

    return dogruMu;
}

    /*public void KayitOl(){
        jTextField_DogrulamaKoduGiris.setVisible(false);
        jLabel_KalanSureKurtarma.setVisible(false);
        jLabel_KurtarmaGeriSayimInt.setVisible(false);
        jTextField_KullaniciAdiGiris.setVisible(false); //basta false girildiginden constructorda , true olup gozukur
        jPasswordField_ParolaGiris.setVisible(false);
        jTextField_KayitKullaniciAdi.setVisible(true);
        jTextField_Kayýt_Email.setVisible(true);
        jPasswordField_kayitParola.setVisible(true);
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_girisPosterPaneli = new javax.swing.JPanel();
        jLabel_koalaGirisPosteri = new javax.swing.JLabel();
        jPanel_LoginTutucuPanelGirisEkrani = new javax.swing.JPanel();
        jPanel_MinCloseTasiGirisEkrani = new javax.swing.JPanel();
        jPanel_logoTutanGiris = new javax.swing.JPanel();
        jLabel_GirisUserIkon = new javax.swing.JLabel();
        jTextField_KullaniciAdiGiris = new javax.swing.JTextField();
        jTextField_DogrulamaKoduGiris = new javax.swing.JTextField();
        jPasswordField_ParolaGiris = new javax.swing.JPasswordField();
        jLabel_KalanSureKurtarma = new javax.swing.JLabel();
        jLabel_KurtarmaGeriSayimInt = new javax.swing.JLabel();
        jLabel_sifremiUnuttum = new javax.swing.JLabel();
        jLabel_kayitOl = new javax.swing.JLabel();
        jButton_GirisEkrani = new javax.swing.JButton();
        jTextField_KayitKullaniciAdi = new javax.swing.JTextField();
        jTextField_Kayýt_Email = new javax.swing.JTextField();
        jPasswordField_kayitParola = new javax.swing.JPasswordField();
        jButton_KoduGonderSifreUnuttum = new javax.swing.JButton();
        jButton_KayitButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_koalaGirisPosteri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPack/koalaGirisEkraniPosteri2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_girisPosterPaneliLayout = new javax.swing.GroupLayout(jPanel_girisPosterPaneli);
        jPanel_girisPosterPaneli.setLayout(jPanel_girisPosterPaneliLayout);
        jPanel_girisPosterPaneliLayout.setHorizontalGroup(
            jPanel_girisPosterPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_koalaGirisPosteri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_girisPosterPaneliLayout.setVerticalGroup(
            jPanel_girisPosterPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_koalaGirisPosteri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel_LoginTutucuPanelGirisEkrani.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_MinCloseTasiGirisEkrani.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_MinCloseTasiGirisEkraniLayout = new javax.swing.GroupLayout(jPanel_MinCloseTasiGirisEkrani);
        jPanel_MinCloseTasiGirisEkrani.setLayout(jPanel_MinCloseTasiGirisEkraniLayout);
        jPanel_MinCloseTasiGirisEkraniLayout.setHorizontalGroup(
            jPanel_MinCloseTasiGirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_MinCloseTasiGirisEkraniLayout.setVerticalGroup(
            jPanel_MinCloseTasiGirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jPanel_logoTutanGiris.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_GirisUserIkon.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_GirisUserIkon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_GirisUserIkon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPack/user128pxGirisBeyaz.png"))); // NOI18N
        jLabel_GirisUserIkon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_GirisUserIkonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel_logoTutanGirisLayout = new javax.swing.GroupLayout(jPanel_logoTutanGiris);
        jPanel_logoTutanGiris.setLayout(jPanel_logoTutanGirisLayout);
        jPanel_logoTutanGirisLayout.setHorizontalGroup(
            jPanel_logoTutanGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_GirisUserIkon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_logoTutanGirisLayout.setVerticalGroup(
            jPanel_logoTutanGirisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_GirisUserIkon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextField_KullaniciAdiGiris.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " Kullanýcý Adý ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 0, 15))); // NOI18N
        jTextField_KullaniciAdiGiris.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_KullaniciAdiGirisKeyPressed(evt);
            }
        });

        jTextField_DogrulamaKoduGiris.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " Doðrulama Kodu ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 0, 15))); // NOI18N
        jTextField_DogrulamaKoduGiris.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_DogrulamaKoduGirisKeyPressed(evt);
            }
        });

        jPasswordField_ParolaGiris.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " Parola ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 0, 15))); // NOI18N
        jPasswordField_ParolaGiris.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_ParolaGirisKeyPressed(evt);
            }
        });

        jLabel_KalanSureKurtarma.setFont(new java.awt.Font("Serif", 1, 17)); // NOI18N
        jLabel_KalanSureKurtarma.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_KalanSureKurtarma.setText("Kalan Süre:");

        jLabel_KurtarmaGeriSayimInt.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jLabel_KurtarmaGeriSayimInt.setText("180");

        jLabel_sifremiUnuttum.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jLabel_sifremiUnuttum.setForeground(new java.awt.Color(102, 153, 255));
        jLabel_sifremiUnuttum.setText("Þifremi Unuttum");
        jLabel_sifremiUnuttum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_sifremiUnuttumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_sifremiUnuttumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_sifremiUnuttumMouseExited(evt);
            }
        });

        jLabel_kayitOl.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jLabel_kayitOl.setForeground(new java.awt.Color(51, 51, 255));
        jLabel_kayitOl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_kayitOl.setText("Kayýt Ol !");
        jLabel_kayitOl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_kayitOlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_kayitOlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_kayitOlMouseExited(evt);
            }
        });

        jButton_GirisEkrani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPack/koalaGirisEkraniButon.png"))); // NOI18N
        jButton_GirisEkrani.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_GirisEkraniMouseClicked(evt);
            }
        });
        jButton_GirisEkrani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GirisEkraniActionPerformed(evt);
            }
        });

        jTextField_KayitKullaniciAdi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " Kullanýcý Adý ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 0, 15))); // NOI18N

        jTextField_Kayýt_Email.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " E Posta ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 0, 15))); // NOI18N

        jPasswordField_kayitParola.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Parola", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 0, 15))); // NOI18N

        jButton_KoduGonderSifreUnuttum.setText("Gönder");

        jButton_KayitButon.setText("Kayýt");

        javax.swing.GroupLayout jPanel_LoginTutucuPanelGirisEkraniLayout = new javax.swing.GroupLayout(jPanel_LoginTutucuPanelGirisEkrani);
        jPanel_LoginTutucuPanelGirisEkrani.setLayout(jPanel_LoginTutucuPanelGirisEkraniLayout);
        jPanel_LoginTutucuPanelGirisEkraniLayout.setHorizontalGroup(
            jPanel_LoginTutucuPanelGirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_MinCloseTasiGirisEkrani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_logoTutanGiris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_LoginTutucuPanelGirisEkraniLayout.createSequentialGroup()
                .addComponent(jLabel_KalanSureKurtarma, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_KurtarmaGeriSayimInt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel_LoginTutucuPanelGirisEkraniLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(jPanel_LoginTutucuPanelGirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_KullaniciAdiGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_kayitParola, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Kayýt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_KayitKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_DogrulamaKoduGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_ParolaGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_GirisEkrani)
                    .addComponent(jLabel_sifremiUnuttum)
                    .addComponent(jLabel_kayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_KoduGonderSifreUnuttum)
                    .addComponent(jButton_KayitButon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel_LoginTutucuPanelGirisEkraniLayout.setVerticalGroup(
            jPanel_LoginTutucuPanelGirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_LoginTutucuPanelGirisEkraniLayout.createSequentialGroup()
                .addComponent(jPanel_MinCloseTasiGirisEkrani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_logoTutanGiris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_LoginTutucuPanelGirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_KalanSureKurtarma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_KurtarmaGeriSayimInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_KullaniciAdiGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField_ParolaGiris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_DogrulamaKoduGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_KayitKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTextField_Kayýt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField_kayitParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_GirisEkrani)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_LoginTutucuPanelGirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_sifremiUnuttum)
                    .addComponent(jButton_KoduGonderSifreUnuttum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_kayitOl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_KayitButon, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_girisPosterPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_LoginTutucuPanelGirisEkrani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_girisPosterPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_LoginTutucuPanelGirisEkrani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_GirisUserIkonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_GirisUserIkonMouseEntered
  
            //
            
    }//GEN-LAST:event_jLabel_GirisUserIkonMouseEntered

    private void jLabel_sifremiUnuttumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_sifremiUnuttumMouseEntered

        jLabel_sifremiUnuttum.setForeground(Color.BLACK);
        jLabel_sifremiUnuttum.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
    }//GEN-LAST:event_jLabel_sifremiUnuttumMouseEntered

    private void jLabel_sifremiUnuttumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_sifremiUnuttumMouseExited
        
        jLabel_sifremiUnuttum.setForeground(ikonRenk.getSifreUnuttumMavi());
        
    }//GEN-LAST:event_jLabel_sifremiUnuttumMouseExited

    private void jLabel_kayitOlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_kayitOlMouseEntered
        
        jLabel_kayitOl.setForeground(Color.GREEN);
        jLabel_kayitOl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
    }//GEN-LAST:event_jLabel_kayitOlMouseEntered

    private void jLabel_kayitOlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_kayitOlMouseExited

            jLabel_kayitOl.setForeground(ikonRenk.getKayitOlMavi());
    }//GEN-LAST:event_jLabel_kayitOlMouseExited

    private void jLabel_sifremiUnuttumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_sifremiUnuttumMouseClicked
        
    String kullaniciAdi = jTextField_KullaniciAdiGiris.getText();
    //String kullaniciParola2 = new String(jPasswordField_ParolaGiris.getPassword());
    //islemDB.kullaniciDBcek(kullaniciAdi); //mail ve pass cekiyor
    //islemDB.sifreUnuttum(kullaniciAdi); //mail kontrol ediyor -> islemMail Classindan mail gonderiyor yada kayit olmadin diyor
    
    kullaniciAdi = kullaniciAdi.replaceAll(" ", "");//bosluklu kullanici adina izin yok bufferoverflow ihtimali
    jTextField_KullaniciAdiGiris.setText(kullaniciAdi);
       
    int neSectin = new JOptionPane().showConfirmDialog(this, "Kurtarma"
            + " kodu e-postanýza gönderilsin mi ?", "E-Posta Ýsteði", JOptionPane.YES_NO_OPTION);
    
    if(!kullaniciAdi.equals("")){ //DOGRU GIRIS
        
        if(neSectin == JOptionPane.YES_OPTION){
            
            //JOptionPane.showMessageDialog(this, "E-Posta adresinize gelen 4 haneli kodu girin !");
            
            sifreUnuttumAcKapa(true); //artik kullanici adi girdiyse ve mail almak istiyorsa mail alacak
            //girdiyse geri sayim baslasin
            //kullaniciAdi getText ile textfield uzerinden alindi
            
            
            
            jLabel_koalaGirisPosteri.setIcon(ikonRenk.getKoalaParolaSifirlamaEkraniPosteri());
            
            
            
            SwingWorker<Boolean , Integer> swingWorker = new SwingWorker<Boolean, Integer>() {
                @Override
                protected Boolean doInBackground() throws Exception{
                    
                    for(int i = 180 ; i >= 0 ; i--){
                        
                        jLabel_KurtarmaGeriSayimInt.setText(String.valueOf(i));
                        Thread.sleep(1000); // dongu hizlica bitmesin 1 saniyeye esit olsun her iterasyon
                    }
                    return true;   //?
                }

                @Override
                protected void done() { //islem bittiginde
                jLabel_koalaGirisPosteri.setIcon(ikonRenk.getKoalaGirisEkraniPosteri());
                    sifreUnuttumAcKapa(false);
                    //gui ekranla bilgi verilebilir burada invokelater
                     
                }
                
            };
            swingWorker.execute(); //SwingWorker execute edilmeden calismadi
       
      
        }
        
        else if(neSectin == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, "E-Posta adresinize doðrulama kodu GÖNDERÝLMEYECEKTÝR !");
        }
    }
    
    else{ //YANLIS GIRIS
        
        JOptionPane.showMessageDialog(this, "Kullanýcý Adý boþ býrakýlamaz");
    }
    
    
        
        

    }//GEN-LAST:event_jLabel_sifremiUnuttumMouseClicked

    private void jLabel_kayitOlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_kayitOlMouseClicked
        
        kayitOlAcKapa(true);

    }//GEN-LAST:event_jLabel_kayitOlMouseClicked

    private void jButton_GirisEkraniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_GirisEkraniMouseClicked
        
       
        
    }//GEN-LAST:event_jButton_GirisEkraniMouseClicked

    private void jTextField_KullaniciAdiGirisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_KullaniciAdiGirisKeyPressed
        
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){ //enter basinca oto buton bassin
            jButton_GirisEkrani.doClick();
        }

    }//GEN-LAST:event_jTextField_KullaniciAdiGirisKeyPressed

    private void jPasswordField_ParolaGirisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_ParolaGirisKeyPressed
        
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            jButton_GirisEkrani.doClick();
        }

    }//GEN-LAST:event_jPasswordField_ParolaGirisKeyPressed

    private void jButton_GirisEkraniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GirisEkraniActionPerformed
        
        islemGiris = new islemGiris(jTextField_KullaniciAdiGiris, jPasswordField_ParolaGiris);
        
        String girilenKullanýcýAdý = jTextField_KullaniciAdiGiris.getText();
        String girilenKullanýcýSifre = new String(jPasswordField_ParolaGiris.getPassword());
                
        boolean girisSonuc = false;
        boolean sifreSonuc = false;
        
        kullanici kullanýci;
                
          
                        
            try {
            // Giriþ iþlemleri yapýyoruz
            
                girisSonuc = islemGiris.bosGirisKontrol();
                
                if(girisSonuc){
                
                    kullanýci = islemDB.kullaniciBulDB(girilenKullanýcýAdý, girilenKullanýcýSifre);
                    
                    if(kullanýci == null){
                        throw new NullPointerException();
                    }else {
                    
                       
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(this, islemGiris.getSonucMesaj());
                }
            
                
            } catch (SQLException ex) {
                Logger.getLogger(islemGiris.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NullPointerException ex){
                JOptionPane.showMessageDialog(this, "Hatalý Kullanýcý Adý veya Þifresi Girdiniz");
            }
                   
            
    }//GEN-LAST:event_jButton_GirisEkraniActionPerformed

    private void jTextField_DogrulamaKoduGirisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DogrulamaKoduGirisKeyPressed
        
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
            jButton_KoduGonderSifreUnuttum.doClick();
        }

    }//GEN-LAST:event_jTextField_DogrulamaKoduGirisKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(girisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(girisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(girisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(girisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new girisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GirisEkrani;
    private javax.swing.JButton jButton_KayitButon;
    private javax.swing.JButton jButton_KoduGonderSifreUnuttum;
    private javax.swing.JLabel jLabel_GirisUserIkon;
    private javax.swing.JLabel jLabel_KalanSureKurtarma;
    private javax.swing.JLabel jLabel_KurtarmaGeriSayimInt;
    private javax.swing.JLabel jLabel_kayitOl;
    private javax.swing.JLabel jLabel_koalaGirisPosteri;
    private javax.swing.JLabel jLabel_sifremiUnuttum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_LoginTutucuPanelGirisEkrani;
    private javax.swing.JPanel jPanel_MinCloseTasiGirisEkrani;
    private javax.swing.JPanel jPanel_girisPosterPaneli;
    private javax.swing.JPanel jPanel_logoTutanGiris;
    private javax.swing.JPasswordField jPasswordField_ParolaGiris;
    private javax.swing.JPasswordField jPasswordField_kayitParola;
    private javax.swing.JTextField jTextField_DogrulamaKoduGiris;
    private javax.swing.JTextField jTextField_KayitKullaniciAdi;
    private javax.swing.JTextField jTextField_Kayýt_Email;
    private javax.swing.JTextField jTextField_KullaniciAdiGiris;
    // End of variables declaration//GEN-END:variables
}
