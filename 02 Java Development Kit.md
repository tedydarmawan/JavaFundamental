## Outline
- Java Development Kit
- Download Java Development Kit
- Instalasi Java Development Kit

## Java Development Kit
Java Development Kit (JDK) merupakan software development environment untuk program Java yang meliputi:
1. Java Compiler (javac)
2. Java Archiving Tool (jar)
3. Java Debugging Tool (jdb)
4. Java Runtime Environement (JRE)

Setelah selesai melakukan instalasi JDK, perintah javac, jar dan jdb dapat dijalankan melalui command prompt Windows.

## Download Java Development Kit
#### Langkah 1
Akses www.oracle.com > Downloads > Java SE

#### Langkah 2
Klik checkbox "Accept License Agreement"
Pilih installer sesuai dengan platform

#### Langkah 3
Setelah berhasil mendownload JDK, ikuti petunjuk instalasi pada Windows.
![alt text][download_jdk]

## Instalasi Java Development Kit
#### Langkah 1
Pada Windows, JDK akan terinstall secara default ke direktori "C:\Program Files\Java\jdk1.8.0_xx" dan JRE secara default ke "C:Program Files\Java\jre.1.8.0_xx".
Buka folder JDK > bin dan copy pathnya
![alt text][copy_jdk]
#### Langkah 2
Tambahkan path yang dicopy tadi ke PATH Environment Variable pada Windows.

Klik kanan My Computer > Properties > Advanced System Settings

Pindah ke Advanced Tab > Environement Variable dan Klik New jika variabel PATH tidak ada atau klik Edit jika variabel PATH sudah ada.

![alt text][environment_variable]

#### Langkah 3
Tambahkan path yang sudah dicopy tadi ke variabel value

![alt text][copy_variable]

Simpan perubahan

#### Langkah 4
Untuk memverifikasi bahwa JDK sudah terinstall dengan baik. 
1. Buka command prompt
2. Ketik javac
3. Enter

Jika sudah sesuai akan tampil informasi seperti pada gambar berikut:
![alt text][command_prompt]


[download_jdk]: https://api.sololearn.com/DownloadFile?id=2384 "Download JDK"
[copy_jdk]: https://api.sololearn.com/DownloadFile?id=2390 "Copy Path JDK"
[environment_variable]: https://api.sololearn.com/DownloadFile?id=2389 "Environement Variable"
[copy_variable]: https://api.sololearn.com/DownloadFile?id=2391 "Copy Variable"
[command_prompt]: https://api.sololearn.com/DownloadFile?id=2392 "Command Prompt"
