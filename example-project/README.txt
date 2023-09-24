- JavaFX 19-ea+8
- IntelliJ IDEA
- Apache Maven 3.8.6

Saya coba jadiin .jar file tapi gak bisa dibuka, muncul error
"no main manifest attribute in..."

Padahal pada saat membuat project artifact saya udah pilih MainClass.java sebagai MainClass-nya

Lalu saya menambahkan 'MainClass: com.MainClass' secara manual di file .jar-nya dengan cara mengekstraknya lalu mengedit file META-INF/MANIFEST.MF lalu menyimpannya kembali

Pas saya running lagi, errornya beda lagi
"Error: Could not find or load main class"
"Caused by: java.lang.ClassNotFoundException:"

Padahal udah bener path MainClass-nya.

Apa yang salah yah?
