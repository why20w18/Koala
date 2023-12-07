package girisKaynakKODislemler;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ikonGecisRenkGecis {
    
    
    private Icon user128pxGirisBeyaz = new ImageIcon("/imagesPack/user128pxGirisBeyaz.png");
    private Icon user128pxGirisSiyah = new ImageIcon("/imagesPack/user128pxGirisSiyah.png");
    
    private Color sifreUnuttumMavi = new Color(102,153,255);
    private Color kayitOlMavi = new Color(51,51,255);
    
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
    
    
}
