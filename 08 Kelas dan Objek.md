## Outline
- Pemrograman Berorientasi Objek
- Method
- Membuat Kelas dan Objek
- Atribut kelas
- Access Modifier
- Getter dan Setter
- Konstruktor
- Static
- Final
- Package

## Pemrograman Berorientasi Objek
Java merupakan bahasa pemrograman berorientasi objek, yakni suatu pemrograman yang bertujuan untuk membuat cara berfikir dalam pemrograman mendekati dengan cara berfikir di dunia nyata.

Dalam bahasa pemrograman berorientasi objek, setiap objek memiliki 3 dimensi yakni identitas, atribut dan kebiasaan (_behavior_).
``` java
class PersegiPanjang{
  int panjang; //atribut
  int lebar; //atribut
  
  //behavior
  int luas(){
    return panjang*lebar; 
  }
  
  //behavior
  int keliling(){
    return 2*panjang*lebar;
  }
}
```

## Method
Method mendefinisikan suatu kebiasaan. Method adalah suatu kumpulan dari pernyataan yang dikelompokan bersama untuk menjalankan suatu operasi.

Dalam bahasa pemrograman Java ada 2 jenis method, yakni:
- Method yang tidak mengembalikan nilai (Method void)
- Method yang mengembalikan nilai (Method Return Type)

### Method void (tidak mengembalikan nilai)
``` java
class MyClass{
  static void halo(){
    System.out.println("Selamat datang");
  }
  
  public static void main(String[] args){
    halo();
  }
}

// Output "Selamat datang"
```
#### Memanggil Method
Method dapat dipanggil secara berulang. Ketika method dipanggil, maka kode di dalam method tersebut akan dieksekusi dan setelah semua kode tersebut selesai dieksekusi, maka program akan lanjut ke baris awal pada saat method tersebut dipanggil dan lanjut ke baris berikutnya.

``` java
class MyClass{
  static void halo(){
    System.out.println("Selamat datang");
  }
  
  public static void main(String[] args){
    halo();
    halo();
    halo();
  }
}

// Selamat datang
// Selamat datang
// Selamat datang
```

#### Method dengan parameter
Suatu method juga dapat mengambil suatu data yang disebut parameter, bersamaan pada saat method tersebut dipanggil.
``` java
class MyClass{
  static void halo(String nama){
    System.out.println("Selamat datang" + nama);
  }
  
  public static void main(String[] args){
    halo("Tedy");
    halo("Darmawan");
  }
}

// Selamat datang Tedy
// Selamat datang Darmawan
```

#### Keuntungan menggunakan method:
- code reuse: suatu method hanya ditulis sekali dan method tersebut dapat digunakan berulang kali tanpa harus menulis ulang kode yang ada didalam method tersebut setiap waktu
- parameter: method dapat menjalankan aksi yang berbeda berdasarkan parameter yang diberikan.

### Method Return Type (Mengembalikan nilai)
Method return type adalah method yang mengembalikan suatu nilai, untuk mengembalikan nilai maka digunakanlah keyword return. Contoh membuat suatu method dengan nama __sum__ yang mengembalikan hasil penjumlahan dari dua buah parameter.
``` java
static int sum(int angka1, int angka2){
  return angka1 + angka2;
}
```
Tipe return didefinisikan sebelum mendefinisikan nama suatu method.

Menggunakan method dengan tipe return di kelas utama
``` java
class MyClass{
  static int sum(int angka1, int angka2){
    return angka1 + angka2;
  }
  
  public static void main(String[] args){
    int jumlah = sum(7,3);
    System.out.println(jumlah);
  }
}

//Output 10
```

Perbandingan method return type (mengembalikan nilai), void (tidak mengembalikan nilai) dan method utama
``` java
// Method tipe return
static int returnTen(){
  return  10;
}

// Method void
static void show(){
  System.out.println("Selamat datang");
}

// Method utama
public static void main(String[] args){
  //pernyataan
}

```

## Membuat Kelas dan Objek
Kelas dapat digambarkan sebagai deskripsi atau definisi dari suatu objek, sehingga kelas yang sama dapat digunakan untuk membuat beberapa objek yang berbeda.

#### Membuat Kelas
1. Klik kanan folder src pada Eclipse
2. Pilih New > Class
3. Isi nama kelas, misal "Distributor"
4. Klik Finish

``` java
public class Distributor{

}
```

Membuat suatu method
``` java
public class Distributor{
  void show(){
    System.out.println("Selamat datang");
  }
}
```

#### Membuat Objek
``` java
class MyClass{
  public static void main(String[] args){
    Distributor d1 = new Distributor();
    d1.show();
  }
}

//Output "Selamat datang"
```
d1 merupakan suatu objek dari kelas Distributor, oleh karena itu d1 dapat memanggil method show() dengan menggunakan nama objek diikuti dengan sebuah tanda dot (.).
Tanda dot (.) digunakan untuk mengakses atribut dan method dari suatu objek.


## Atribut Kelas
#### Mendefinisikan Atribut
Suatu kelas memiliki atribut dan method. Pada dasarnya atribut merupakan variabel-variabel didalam sebuah kelas.
``` java
public class Distributor{
  String kode;
  String nama;
  String alamat;
  long bankGaransi;
  
  void showNama(){
    System.out.println("Nama: " + nama);
  }
}
```

#### Membuat Objek
``` java
class MyClass{
  public static void main(String[] args){
    Distributor d1 = new Distributor();
    Distributor d2 = new Distributor();
    
    d1.nama = "Maju Makmur Mandiri (3M)";
    d1.showNama();
  }
}
```


## Access Modifier
``` java
public static void main(String[] args){}
```
public adalah sebuah access modifier, yang digunakan untuk mengatur level akses. Access modifier dapat digunakan untuk kelas, atribut dan method.

Akses modifier untuk kelas:
- default (blank): Kelas hanya dapat diakses oleh kelas dalam package yang sama.
- public: Kelas dapat diakses oleh kelas manapun.


Akses modifier untuk atribut dan method:
- default: atribut atau method hanya dapat diakses oleh kelas dalam package yang sama.
- public: atribut atau method dapat diakses oleh kelas manapun
- protected: sama dengan default dengan tambahan sub-kelas dapat mengakses variabel dan method dari super-kelas.
- private: hanya dapat diakses oleh kelas tersebut.

``` java
public class Distributor{
  private String kode;
  private String nama;
  private String alamat;
  private long bankGaransi;
  
  public void show(){
    System.out.println(kode + " " + nama + " " + alamat + " " + bankGaransi);
  }
}
```
> Pada saat membuat variabel didalam suatu kelas disarankan untuk membuatnya secara private. Variabel tersebut dapat diakses dan dimodifikasi menggunakan Getter dan Setter. 

## Getter dan Setter
Getter dan Setter biasanya digunakan untuk melindungi data secara efektif, terutama pada saat membuat suatu kelas. Untuk setiap variabel, getter method akan mengembalikan nilai dari variabel tersebut, sedangkan method set akan memberikan nilai ke variabel tersebut.

Getter dimulai dengan kata get, diikuti dengan nama variabel dimana huruf pertamanya diubah menjadi kapital.
Setter dimulai dengan kata set, diikuti dengan nama variabel dimana huruf pertamanya diubah menjadi kapital.
``` java
public class Distributor{
  private String nama;
  
  // Getter
  public String getNama(){
    return nama;
  }
  
  // Setter
  public void setNama(String nama){
    this.nama = nama;
  }
  
  // keyword this digunakan agar variabel yang memiliki nama yang sama dengan parameter pada method dapat mengacu pada atribut objek.
}
```
Keyword this digunakan untuk mengacu pada atribut objek.

#### Mengakses getter dan setter
``` java
public static void main(String[] args){
  Distributor d1 = new Distributor();
  d1.setNama("Maju Makmur Mandiri (3M)");
  System.out.println(d1.getNama());
  
  //Output Maju Makmur Mandiri (3M)
}
```

## Konstruktor
Konstruktor adalah method khusus yang dipanggil ketika sebuah objek dibuat dan digunakan untuk menginisialisasi objek tersebut.
- Nama suatu konstruktor harus sama dengan nama kelasnya
- Suatu konstruktor tidak boleh memiliki nilai tipe kembalian
``` java
public class Distributor{
  private String nama;
  
  // konstruktor
  Distributor(){
    nama = "Demo";
  }
}
```
Konstruktor juga dapat menerima parameter untuk menginisialisasi atribut.
``` java
public class Distributor{
  private String nama;
  
  // konstruktor
  Distributor(String nama){
    this.nama = nama;
  }
}
```
Sebuah kelas dapat memiliki beberapa konstruktor dengan jumlah parameter yang berbeda.
``` java
public class Distributor{
  private String nama;
  
  // konstruktor
  Distributor(){
    nama = "Demo";
  }
  
  // konstruktor
  Distributor(String nama){
    this.nama = nama;
  }
  
  public String getNama(){
    return nama;
  }
}
```
#### Memanggil Konstruktor
Konstruktor dipanggil ketika membuat sebuah objek dengan menggunakan keyword new.
``` java
public class MyClass{
  public static void main(String[] args){
    Distributor d1 = new Distributor();
    Distributor d2 = new Distributor("Maju Makmur Mandiri (3M)");
    
    System.out.println(d1.getNama());
    System.out.println(d2.getNama());
    
    /* Output
       Demo
       Maju Makmur Mandiri (3M)
    */
  }
}
```

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
    System.out.println(PI);
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
