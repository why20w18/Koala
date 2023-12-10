package veriKullaniciPaketi;

/**
 *
 * @author bvos
 */
public class admin extends kullanici{

    private Integer adminParola;

    public admin(Integer adminParola, Integer id, String kullaniciAdi, String kullaniciParola, String kullaniciMail, Integer toplamSure) {
        super(id, kullaniciAdi, kullaniciParola, kullaniciMail, toplamSure);
        this.adminParola = adminParola;
    }

    

    
    public Integer getAdminParola() {
        return adminParola;
    }
    
}
