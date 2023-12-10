database olusturduktan sonra tablolarin id degeri otomatik increament olmuyorsa kayit sirasinda cok fazla ugrastiriyor bunun icin sifirdan ayni isimde tablo kurulmali


kullanicilar DATABASE'indeki
kullanici tablosu silindikten sonra id değeri oto artan bir tablo olusturulur sql uzerinden

>localhost > SQL
>
    CREATE TABLE kullanici (
    id INT AUTO_INCREMENT PRIMARY KEY,
 
    kullaniciAdi VARCHAR(255),
    
    kullaniciParola VARCHAR(255),
    
    kullaniciMail VARCHAR(255),

    toplamSure INT );
>

