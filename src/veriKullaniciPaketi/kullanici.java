/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veriKullaniciPaketi;

/**
 *
 * @author bvos
 */
public class kullanici {
    
    private Integer id;
    private String kullaniciAdi;
    private String kullaniciParola;
    private String kullaniciMail;
    private Integer toplamSure;

    public kullanici(Integer id, String kullaniciAdi, String kullaniciParola, String kullaniciMail, Integer toplamSure) {
        this.id = id;
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciParola = kullaniciParola;
        this.kullaniciMail = kullaniciMail;
        this.toplamSure = toplamSure;
    }

    public Integer getId() {
        return id;
    }

    

    public Integer getToplamSure() {
        return toplamSure;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getKullaniciParola() {
        return kullaniciParola;
    }

    public String getKullaniciMail() {
        return kullaniciMail;
    }

    

    
}
