package girisKaynakKODislemler;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ikonGecisRenkGecis {
    
    
    private Icon user128pxGirisBeyaz = new ImageIcon(getClass().getResource("/imagesPack/user128pxGirisBeyaz.png"));
    private Icon user128pxGirisSiyah = new ImageIcon(getClass().getResource("/imagesPack/user128pxGirisSiyah.png"));
    private Icon user128pxGirisSifreUnuttun = new ImageIcon(getClass().getResource("/imagesPack/user128pxGirisSifreUnuttun.png"));
    private Icon user128pxKayitOl = new ImageIcon(getClass().getResource("/imagesPack/user128pxKayitOl.png"));
    
    //posterler
    private Icon koalaGirisEkraniPosteri = new ImageIcon(getClass().getResource("/imagesPack/koalaGirisEkraniPosteri2.png"));

    public Icon getKoalaGirisEkraniPosteri() {
        return koalaGirisEkraniPosteri;
    }
    private Icon koalaParolaSifirlamaEkraniPosteri = new ImageIcon(getClass().getResource("/imagesPack/koalaParolaSifirlamaEkraniPosteri.png"));
    
    private Color sifreUnuttumMavi = new Color(102,153,255);
    private Color kayitOlMavi = new Color(51,51,255);

    public Icon getUser128pxKayitOl() {
        return user128pxKayitOl;
    }

    public Icon getKoalaParolaSifirlamaEkraniPosteri() {
        return koalaParolaSifirlamaEkraniPosteri;
    }
    
    //getter

    public Icon getUser128pxGirisBeyaz() {
        return user128pxGirisBeyaz;
    }

    public Icon getUser128pxGirisSiyah() {
        return user128pxGirisSiyah;
    }

    public Color getSifreUnuttumMavi() {
        return sifreUnuttumMavi;
    }

    public Color getKayitOlMavi() {
        return kayitOlMavi;
    }

    public Icon getUser128pxGirisSifreUnuttun() {
        return user128pxGirisSifreUnuttun;
    }
    
    
}
