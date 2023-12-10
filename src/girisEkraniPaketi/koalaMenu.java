package girisEkraniPaketi;

import girisKaynakKODislemler.ikonGecisRenkGecis;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;
import veriKullaniciPaketi.kullanici;

/**
 *
 * @author bvos
 */
public class koalaMenu extends javax.swing.JFrame {
    
    ikonGecisRenkGecis ikonveRenk = new ikonGecisRenkGecis();
    private Dimension boyut = Toolkit.getDefaultToolkit().getScreenSize(); 
    Timer timer;

    public koalaMenu() {
        initComponents();
        this.setLocation(boyut.width/2 - this.getSize().width / 2,boyut.height/2 - this.getSize().height / 2); //ortalamak icin
        zamanOlc();
    }
     public koalaMenu(kullanici kullanici) {
        setTitle("koala App | Kullan�c� : "+kullanici.getKullaniciAdi());
        initComponents();
        JOptionPane.showMessageDialog(this,"Ho�geldin "+kullanici.getKullaniciAdi());
    }
     
     private int sure = 0;
     
    public void zamanOlc(){
        timer = new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 sure++;
                 jLabel_GecenSureINT.setText(String.valueOf(sure));
                 
                
            }
        } );
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel_KoalaEnAltPanel = new javax.swing.JPanel();
        jPanel_KoalaMenuler = new javax.swing.JPanel();
        jButton_istatistiklerKullanici = new javax.swing.JButton();
        jButton_GenelSiralama = new javax.swing.JButton();
        jButton_ArkadasSiralama1 = new javax.swing.JButton();
        jLabel_ayarlananSure = new javax.swing.JLabel();
        jButton_zamanDurdur = new javax.swing.JButton();
        jButton_zamanDuraklat = new javax.swing.JButton();
        jLabel_gecenSure = new javax.swing.JLabel();
        jLabel_KoalaDurum = new javax.swing.JLabel();
        jButton_Baslat = new javax.swing.JButton();
        jLabel_GecenSureINT = new javax.swing.JLabel();
        jTextField_GirilenSure = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel_KoalaEnAltPanel.setBackground(new java.awt.Color(129, 211, 151));

        jPanel_KoalaMenuler.setBackground(new java.awt.Color(255, 255, 255));

        jButton_istatistiklerKullanici.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPack/kullaniciRapor32px.png"))); // NOI18N
        jButton_istatistiklerKullanici.setText("Raporlar");

        jButton_GenelSiralama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPack/dunyaSiralama32pxBeyaz.png"))); // NOI18N
        jButton_GenelSiralama.setText("Genel S�ralama");

        jButton_ArkadasSiralama1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPack/arkadasSiralama32pxSiyah.png"))); // NOI18N
        jButton_ArkadasSiralama1.setText("Arkada� S�ralama");

        javax.swing.GroupLayout jPanel_KoalaMenulerLayout = new javax.swing.GroupLayout(jPanel_KoalaMenuler);
        jPanel_KoalaMenuler.setLayout(jPanel_KoalaMenulerLayout);
        jPanel_KoalaMenulerLayout.setHorizontalGroup(
            jPanel_KoalaMenulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KoalaMenulerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton_ArkadasSiralama1)
                .addGap(61, 61, 61)
                .addComponent(jButton_GenelSiralama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jButton_istatistiklerKullanici)
                .addGap(35, 35, 35))
        );
        jPanel_KoalaMenulerLayout.setVerticalGroup(
            jPanel_KoalaMenulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KoalaMenulerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton_GenelSiralama, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton_ArkadasSiralama1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton_istatistiklerKullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel_ayarlananSure.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel_ayarlananSure.setText("Ayarlanan S�re:");

        jButton_zamanDurdur.setText("Durdur");
        jButton_zamanDurdur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_zamanDurdurMouseClicked(evt);
            }
        });
        jButton_zamanDurdur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_zamanDurdurActionPerformed(evt);
            }
        });

        jButton_zamanDuraklat.setText("Duraklat");
        jButton_zamanDuraklat.setEnabled(false);
        jButton_zamanDuraklat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_zamanDuraklatActionPerformed(evt);
            }
        });

        jLabel_gecenSure.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel_gecenSure.setText("Ge�en S�re:");

        jLabel_KoalaDurum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesPack/koalaUyuyorZaman128px.png"))); // NOI18N

        jButton_Baslat.setText("Ba�lat");
        jButton_Baslat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_BaslatMouseClicked(evt);
            }
        });
        jButton_Baslat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BaslatActionPerformed(evt);
            }
        });

        jLabel_GecenSureINT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_GecenSureINT.setText("0");

        jTextField_GirilenSure.setBackground(new java.awt.Color(129, 211, 151));
        jTextField_GirilenSure.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jTextField_GirilenSure.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "S�reyi Ayarlay�n", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        javax.swing.GroupLayout jPanel_KoalaEnAltPanelLayout = new javax.swing.GroupLayout(jPanel_KoalaEnAltPanel);
        jPanel_KoalaEnAltPanel.setLayout(jPanel_KoalaEnAltPanelLayout);
        jPanel_KoalaEnAltPanelLayout.setHorizontalGroup(
            jPanel_KoalaEnAltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_KoalaMenuler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_KoalaEnAltPanelLayout.createSequentialGroup()
                .addGroup(jPanel_KoalaEnAltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_KoalaEnAltPanelLayout.createSequentialGroup()
                        .addGroup(jPanel_KoalaEnAltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_KoalaEnAltPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_ayarlananSure, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_KoalaEnAltPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton_Baslat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jButton_zamanDuraklat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_KoalaEnAltPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_KoalaEnAltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_KoalaEnAltPanelLayout.createSequentialGroup()
                                .addComponent(jButton_zamanDurdur, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jTextField_GirilenSure, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel_KoalaEnAltPanelLayout.createSequentialGroup()
                                .addComponent(jLabel_gecenSure)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_GecenSureINT, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel_KoalaEnAltPanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel_KoalaDurum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_KoalaEnAltPanelLayout.setVerticalGroup(
            jPanel_KoalaEnAltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_KoalaEnAltPanelLayout.createSequentialGroup()
                .addComponent(jPanel_KoalaMenuler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_KoalaEnAltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ayarlananSure, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_gecenSure, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_GecenSureINT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel_KoalaDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(jPanel_KoalaEnAltPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_zamanDurdur, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_zamanDuraklat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Baslat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_GirilenSure, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_KoalaEnAltPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_KoalaEnAltPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_zamanDurdurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_zamanDurdurMouseClicked

       
        
         



    }//GEN-LAST:event_jButton_zamanDurdurMouseClicked

    private void jButton_BaslatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BaslatActionPerformed
    
        timer.start();
        

    }//GEN-LAST:event_jButton_BaslatActionPerformed

    private void jButton_BaslatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_BaslatMouseClicked
        jLabel_KoalaDurum.setIcon(ikonveRenk.getKoalaDusunceliZaman128px());
        jButton_zamanDuraklat.setEnabled(true);

    }//GEN-LAST:event_jButton_BaslatMouseClicked

    private void jButton_zamanDurdurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_zamanDurdurActionPerformed
        
        int sifirlansinMi = new JOptionPane().showConfirmDialog(this, "T�m"
            + " ilerlemeniz kaybolacak durdurmak istiyor musunuz ?", "S�re S�f�rlanacak Uyar�s� !", JOptionPane.YES_NO_OPTION);


        if(sifirlansinMi == JOptionPane.YES_OPTION){
            sure = 0;
            timer.stop();
             jLabel_KoalaDurum.setIcon(ikonveRenk.getKoalaUyuyorZaman128px());
             jButton_zamanDuraklat.setEnabled(false);
        }
        
    }//GEN-LAST:event_jButton_zamanDurdurActionPerformed

    private void jButton_zamanDuraklatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_zamanDuraklatActionPerformed
        
        timer.stop();

    }//GEN-LAST:event_jButton_zamanDuraklatActionPerformed

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
            java.util.logging.Logger.getLogger(koalaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(koalaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(koalaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(koalaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new koalaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ArkadasSiralama1;
    private javax.swing.JButton jButton_Baslat;
    private javax.swing.JButton jButton_GenelSiralama;
    private javax.swing.JButton jButton_istatistiklerKullanici;
    private javax.swing.JButton jButton_zamanDuraklat;
    private javax.swing.JButton jButton_zamanDurdur;
    private javax.swing.JLabel jLabel_GecenSureINT;
    private javax.swing.JLabel jLabel_KoalaDurum;
    private javax.swing.JLabel jLabel_ayarlananSure;
    private javax.swing.JLabel jLabel_gecenSure;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_KoalaEnAltPanel;
    private javax.swing.JPanel jPanel_KoalaMenuler;
    private javax.swing.JTextField jTextField_GirilenSure;
    // End of variables declaration//GEN-END:variables
}
