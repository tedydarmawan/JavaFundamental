## Outline
- Pemrograman Berorientasi Objek
- Method
- Method yang mengembalikan nilai
- Membuat Kelas dan Objek
- Atribut kelas
- Akses Modifier
- Getter dan Setter
- Konstruktor
- Nilai dan Tipe Referensi
- Kelas Matematika
- Static
- Final
- Package

## Static
Ketika menggunakan keyword static pada suatu variabel atau suatu method, maka method atau variabel tersebut adalah milik suatu kelas bukan melainkan milik suatu instance objek. ini berarti bahwa method atau variabel yang memiliki keyword static hanya memiliki 1 instance meskipun kelas tersebut dibuat beberapa instance objek secara berkali-kali.
``` java
public class Counter{
  public static int COUNT = 0;
  public int COUNT2 = 0;
  Counter(){
    COUNT++;
    COUNT2++;
  }
}
// variabel COUNT akan dibagi untuk semua instance objek dari kelas tersebut
```
Mengakses variabel static di kelas utama
``` java
public class MyClass{
  public static void main(String[] args){
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    System.out.println(Counter.COUNT);
    System.out.println(c1.COUNT2);
    System.out.println(c2.COUNT2);
  }
}
/*
Output 
2
1
1
*/
```
Output = 2 dikarenakan variabel COUNT adalah static dan akan bertambah nilainya setiap kali membuat objek baru dari kelas Counter. Untuk mengakses variabel COUNT dapat juga dilakukan dengan cara mengakses variabel tersebut melalui objek dari kelas Counter, seperti c1.COUNT atau c2.COUNT.

## Final
Keyword final digunakan untuk menandakan suatu variabel adalah konstanta, sehingga variabel tersebut hanya bisa diberi nilai satu kali saja.
``` java
class MyClass{
  public static final double PI = 3.14;
  
  public static void main(String[] args){
    Sysem.out.println(PI);
  }
}
// Variabel PI adalah konstanta, jika mencoba memberikan nilai baru ke variabel PI maka akan menyebabkan error.
```
Method dan kelas dapat juga diberi keyword final. Pada suatu method, keyword final akan menyebabkan method tersebut tidak dapat di override. Sedangkan pada suatu kelas, keyword final akan menyebabkan kelas tersebut tidak dapat dijadikan sub-kelas.

## Package
Package digunakan untuk menghindari konflik nama pada suatu kelas dan mengatur akses ke suatu kelas. Suatu package dapat didefinisikan sebagai grup dari kelas-kelas atau sub-package yang memiliki tipe yang sama.

Untuk Membuat package:
1. Klik kanan direktori src
2. Klik New > Package
3. Isi nama package
4. Klik Finish

Setelah itu package akan muncul di direktori projek, kemudian kita dapat memindahkan kelas-kelas atau membuat kelas baru didalam package tersebut. 

![alt text][membuat_package]

Ketika memindahkan suatu kelas ke dalam package, package tersebut akan muncul di dalam kelas tersebut diposisi paling atas.
``` java
package samples;
```
Pada kelas utama, untuk menggunakan suatu kelas didalam suatu package maka kelas tersebut harus di import.
``` java
import samples.Vehicle;

class MyClass{
  public static void main(String[] args){
    Vehicle vObj = new Vehicle();
    v1.move();
  }
}
```

Untuk mengimport semua kelas yang ada didalam suatu package dapat menggunakan tanda "*" .
``` java
import samples.*;
```

[membuat_package]: https://api.sololearn.com/DownloadFile?id=2868 "Membuat Package"
