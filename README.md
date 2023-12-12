# koala Projesi (Time Management App)

[Databasede tablo oluşturmadan önce burayı oku/\Read here before creating a table in a database](https://github.com/why20w18/Koala/blob/main/src/veriTabaniPaketi/hata.md)
<p>
JDBC ile database bağlantısı yapılmıştır , kullanıcı kayıt olduğunda databasede çalıştığı süre" kendi id numarasına özel tutulur.
Xampp üzerinden localhost kurulup database adı "kullanicilar" yapilıp tablo adı "kullanici" yapilarak Apache ve MySQL portları başlatılarak direkt programı çalıştırabilirsiniz
kullanicilar adlı database oluşturmadan önce <b><i>bağlantıda</i></b> belirttiğim gibi tablo oluşturun yoksa id değeri increament olarak artmadığından NULL hatası alınıyor
Farklı tablolarda çalışacaksanız yada Xampp dışında farklı bir uygulama kullanıyorsanız port , host , driver gibi değerleri "SQLBaglanti.java" dosyasından elle ayarlamanız gerekecektir</p>
<br>
<br>
<p>
Database connection is made with JDBC, when the user registers, the time he works in the database" is kept specific to his id number. You can run the program directly by starting Apache and MySQL ports by setting up localhost via Xampp, making the database name "kullanicilar" and making the table name "kullanici". Before creating a database named "kullanicilar", create a table as I mentioned in the link, otherwise a NULL error is received because the id value does not increase incrementally. If you will work in different tables or if you are using a different application other than Xampp, you will need to manually set values such as port, host, driver from the "SQLBaglanti.java" file.</p>
<br>

>## koala Giriş Ekranı (Login Screen) 
<img src="https://i.imgur.com/uog7qzl.png" alt="alt text" width="512" height="768">

>## koala Kayıt Ekranı (Register Screen)
<img src="https://i.imgur.com/9l9T00s.png" alt="alt text" width="512" height="768">

>## koala Parola Sıfırlama Ekranı (Password Reset Screen)
<img src="https://i.imgur.com/H6zOuvS.png" alt="alt text" width="512" height="768">

>### koala Menü Ekranı (Zamanlayıcı Daha Başlamadı) | koala Menu Screen (Timer has not started yet)
<img src="https://i.imgur.com/A4y8UOP.png" alt="alt text" width="768" height="512">

>### koala Menü Ekranı (Zamanlayıcı Başladı) |  koala Menu Screen (Timer Started)
<img src="https://i.imgur.com/8zePdf5.png" alt="alt text" width="768" height="512">

>#### koala Menü Ekranı (Zamanlayıcıda Ayarlanan Süre Tamamlandı) | koala Menu Screen (Timer Set Time Completed)
<img src="https://i.imgur.com/1N3hanD.png" alt="alt text" width="768" height="512">

>## koala Rapor Sekmesi | koala Report Tab
<img src="https://i.imgur.com/vcgbAyv.png" alt="alt text" width="768" height="512">
