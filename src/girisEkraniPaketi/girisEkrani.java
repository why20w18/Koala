/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package girisEkraniPaketi;

import girisKaynakKODislemler.ikonGecisRenkGecis;
import java.awt.Color;
import java.awt.Cursor;

/**
 *
 * @author bvos
 */
public class girisEkrani extends javax.swing.JFrame {
    
    ikonGecisRenkGecis ikonRenk = new ikonGecisRenkGecis();
    
    public girisEkrani() {
        initComponents();
        sifreUnuttumAcKapa();
    }

    public Boolean sifreUnuttumAcKapa(){
        
        jTextField_DogrulamaKoduGiris.setVisible(false);
        jLabel_KalanSureKurtarma.setVisible(false);
        jLabel_KurtarmaGeriSayimInt.setVisible(false);
        
        
        
        return true;
    }
    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_koalaGirisPosteri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPack/koalaGirisEkraniPosteri.png"))); // NOI18N

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

        jTextField_KullaniciAdiGiris.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " Kullan�c� Ad� ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 0, 15))); // NOI18N

        jTextField_DogrulamaKoduGiris.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " Do�rulama Kodu ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 0, 15))); // NOI18N

        jPasswordField_ParolaGiris.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), " Parola ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 0, 15))); // NOI18N

        jLabel_KalanSureKurtarma.setFont(new java.awt.Font("Serif", 1, 17)); // NOI18N
        jLabel_KalanSureKurtarma.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_KalanSureKurtarma.setText("Kalan S�re:");

        jLabel_KurtarmaGeriSayimInt.setFont(new java.awt.Font("Serif", 1, 15)); // NOI18N
        jLabel_KurtarmaGeriSayimInt.setText("180");

        jLabel_sifremiUnuttum.setFont(new java.awt.Font("Serif", 0, 15)); // NOI18N
        jLabel_sifremiUnuttum.setForeground(new java.awt.Color(102, 153, 255));
        jLabel_sifremiUnuttum.setText("�ifremi Unuttum");
        jLabel_sifremiUnuttum.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jLabel_kayitOl.setText("Kay�t Ol !");
        jLabel_kayitOl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_kayitOlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_kayitOlMouseExited(evt);
            }
        });

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
                .addGap(0, 36, Short.MAX_VALUE)
                .addGroup(jPanel_LoginTutucuPanelGirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_DogrulamaKoduGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_ParolaGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_KullaniciAdiGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_sifremiUnuttum)
                    .addComponent(jLabel_kayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addGap(22, 22, 22)
                .addComponent(jTextField_KullaniciAdiGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPasswordField_ParolaGiris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField_DogrulamaKoduGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel_sifremiUnuttum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_kayitOl)
                .addGap(12, 12, 12))
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
    private javax.swing.JTextField jTextField_DogrulamaKoduGiris;
    private javax.swing.JTextField jTextField_KullaniciAdiGiris;
    // End of variables declaration//GEN-END:variables
}
