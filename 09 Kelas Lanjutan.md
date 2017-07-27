## Outline
- Enkapsulasi
- Inheritance
- Polymorphism
- Override & Overload
- Kelas Abstrak
- Interface
- Type Casting
- Kelas Anonymous
- Inner Kelas
- Method equals()
- Enum
- Java API

## Enkapsulasi
Ada 4 konsep dalam pemrograman berorientasi objek yakni 
1. Enkapsulasi
2. Inheritance
3. Polymorphism
4. Abstraksi

Ide dibalik enkapsulasi adalah untuk memastikan bahwa detail implementasi tidak terlihat oleh user. Variabel dari suatu kelas akan tersembunyi dari kelas yang lain, cara akses variabel tersebut hanya melalui method di kelas tersebut. Hal ini disebut penyembunyian data (__data hiding__).

Untuk melakukan enkapsulasi di Java, deklarasikan variabel dalam suatu kelas dengan akses modifier private dan sediakan method public getter dan setter untuk memodifikasi dan melihat nilai dari variabel tersebut.

``` java
class BankAccount{
	private double balance = 0;
	
	public void deposit(double x){
		if(x > 0){
			balance += x;
		}
	}
}
```

Implementasi diatas menyembunyikan variabel __balance__ dan menyediakan akses ke variabel tersebut melalui method deposit yang melakukan validasi nilai yang akan dideposit sebelum diupdate ke variabel.

Enkapsulasi menyediakan beberapa keuntungan berikut ini:
- Mengontrol cara data diakses atau dimodifikasi
- Lebih fleksibel dan mudah untuk mengubah data
- Kemampuan untuk mengubah suatu bagian kode tanpa mempengaruhi bagian yang lain

## Inheritance
Inheritance adalah suatu proses yang membuat suatu kelas dapat memperoleh properti (method dan variabel) dari kelas yang lain. Kelas yang diwarisi properti dari kelas lain disebut sub-kelas (derived class atau child class). Sedangkan kelas yang mewarisi properti ke kelas lain disebut super-kelas (base class atau parent class).

Untuk melakukan inheritance maka digunakan keyword __extends__.
``` java
class Kucing extends Binatang{
	// beberapa kode
}
// Kucing merupakan sub-kelas dan Binatang merupakan super-kelas
```

Ketika sub-kelas diwarisi oleh super-kelas, maka sub-kelas tersebut diwarisi semua variabel dan method yang tidak memiliki akses modifier private dari kelas super-kelas.
``` java
class Binatang{
	protected int kaki;
	public void makan(){
		System.out.println("Binatang makan");
	}
}

class Kucing extends Binatang{
	// Konstruktor
	Kucing(){
		kaki = 4;
	}
}
```

Dari kode diatas dapat dilihat bahwa kelas Kucing diwarisi variabel kaki dari kelas Binatang.
``` java
class MyClass{
	
	public static void main(String[] args){
		Kucing k = new Kucing();
		k.makan();
	}
	
}
```

Konstruktor bukan merupakan method yang akan diwariskan ke sub-kelas. Konstruktor dari super-kelas akan dipanggil ketika sub-kelas di instantiasi.
``` java
class Binatang{
	Binatang(){
		System.out.println("Binatang");
	}
}

class Kucing extends Binatang{
	Kucing(){
		System.out.println("Kucing");
	}
}

class MyClass{
	public static void main(String[] args){
		Kucing k = new Kucing();
	}
}

/* Output
Binatang
Kucing
*/
```

## Polymorphism
Polymorphism merujuk pada ide "Mempunyai banyak bentuk", ini terjadi ketika adanya hirarki antara kelas yang terhubung satu sama lain melalui inheritance. Ketika suatu method dipanggil maka akan berbeda hasilnya, tergantung pada objek mana yang memanggil method tersebut.
``` java
class Binatang{
	public void suara(){
		System.out.println("Hmm...");
	}
}

class Kucing extends Binatang{
	public void suara(){
		System.out.println("Meong...");
	}
}

class Anjing extends Binatang{
	public void suara(){
		System.out.println("Wooof...");
	}
}
```

Dikarenakan semua objek Kucing dan Anjing merupakan objek Binatang, maka dapat dilakukan hal berikut ini:
``` java
public static void main(String[] args){
	Binatang a = new Kucing();
	Binatang b = new Anjing();
	
	a.suara();
	// Output "Meong..."
	
	b.suara();
	// Output "Wooof..."
}
```

## Override & Overload

#### Override
Override adalah proses mengubah detail suatu method yang diperoleh sub-kelas dari super-kelas (inheritance).

``` java
class Binatang{
	public void suara(){
		System.out.println("Hmm...");
	}
}

class Kucing extends Binatang{
	public void suara(){
		System.out.println("Meong...");
	}
}
```

Dari contoh kode diatas, kelas Kucing melakukan override method suara() dari kelas Binatang.

Aturan untuk melakukan Override Method:
- Method harus memiliki tipe kembalian dan argumen yang sama
- Level akses method yang dioverride tidak bisa lebih dibatasi (jika level akses method di super-kelas adalah public, maka pada saat override method tersebut tidak bisa diubah menjadi private ataupun protected)
- Method yang dideklarasikan final atau static tidak bisa dioverride
- Jika suatu method tidak bisa diwariskan maka method tersebut tidak bisa dioverride
- Konstruktor tidak bisa dioverride

#### Overload
Method memiliki nama yang sama tetapi berbeda parameter, hal ini disebut overload. Hal ini akan sangat berguna ketika membutuhkan method yang memiliki fungsi yang sama tapi berbeda parameter.

``` java
int max(int a, int b){
	if(a > b){
		return a;
	}else{
		return b;
	}
}

double max(double a, double b){
	if(a > b){
		return a;
	}else{
		return b;
	}
}
```

## Kelas Abstrak
Data abstraksi adalah suatu konsep yang hanya menyediakan informasi tanpa melibatkan detail dari informasi tersebut. Contoh sederhananya seperti buku. Ketika mendengar judul suatu buku, maka informasi atau ide mengenai buku tersebut akan diketahui tetapi detail dari jumlah halaman, warna dan ukuran buku tersebut tidak diketahui.

Di Java, jenis abstraksi ada 2 yakni kelas abstrak dan interface.
Kelas abstrak didefinisikan dengana keyword __abstract__.
- Kelas abstrak tidak dapat diinstantiasi atau dibuat objek dari kelas tersebut
- Untuk menggunakan kelas abstrak maka harus melakukan inheritance dari kelas lain
- Method pada kelas abstrak harus didefinisikan sebagai method abstrak juga

> Method abstrak adalah suatu method yang dideklarasikan tanpa detail implementasi, contoh: __abstract void suara();__
``` java
abstract class Binatang{
	int kaki = 0;
	abstract void suara();
}

class Kucing extends Binatang{
	public void suara(){
		System.out.println("Meong...");
	}
}
```

## Interface
Interface merupakan kelas abstrak yang hanya mempunyai method abstrak dan variabel konstan.
Beberapa spesifikasi mengenai interface:
- Didefinisikan menggunakan keyword interface
- Hanya berisi variabel dengan keyword static final (konstan)
- Tidak bisa berisi konstruktor karena interface tidak dapat diinstantiasi
- Interface dapat mengextend interface yang lain
- Sebuah kelas dapat mengimplementasikan beberapa interface (tak terhingga)

``` java
interface Binatang {
	public static final String BINATANG_KODE = "B";
	
	public void suara();
	public void info();
}
```

interface mempunyai properti berikut ini:
- interface adalah abstrak, sehingga tidak perlu menggunakan keyword abstract untuk mendeklarasikan sebuah interface.
- Setiap method pada interface merupakan abstrak, sehingga tidak perlu menggunakan keyword abstract untuk mendeklarasikan method.
- Method pada interface memiliki access modifier public

> Sebuah kelas hanya dapat mewarisi 1 super-kelas, tetapi dapat mengimplementasikan beberapa interface.
``` java
class Kucing implements Binatang {
	
	@Override
	public void suara() {
		System.out.println("Meong...");
	}
	
	@Override
	public void info() {
		System.out.println("Kucing");
	}

}
```

> Ketika mengimplementasikan sebuah interface, maka semua method pada interface tersebut harus di override.

## Type Casting
Type Casting merupakan proses memberikan nilai dari suatu tipe ke variabel yang memiliki tipe yang berbeda.
``` java
int a = (int) 3.14;
System.out.println(a);
// Output 3

double b = 42.571;
int c = (int) b;
System.out.println(c);
// Output 42
```

Untuk kelas ada 2 jenis tipe casting yakni downcasting dan upcasting.

#### Upcasting
Upcasting adalah proses casting suatu instance dari sub-kelas ke super-kelas.
``` java
Binatang b = new Kucing();
```

#### Downcasting
Downcasting adalah proses casting suatu objek dari super-kelas ke sub-kelas.
``` java
Binatang b = new Kucing();

if(b instanceof Kucing){
  ((Kucing)b).suara();
}
```

Proses upcasting dari variabel tipe Kucing ke tipe Binatang dilakukan secara otomatis, sedangkan proses downcasting dari tipe Binatang ke tipe Kucing dilakukan secara manual.

## Kelas Anonymous
Kelas anonymous merupakan cara cepat untuk melakukan extend suatu kelas.

``` java
public class Mesin {
	
	public void mulai(){
		System.out.println("Mulai...");
	}
	
}
```

Pada saat membuat objek Mesin, method mulai() dapat diubah secara cepat
``` java
public static void main(String[] args){
	Mesin m1 = new Mesin(){
		@Override
		public void mulai() {
			System.out.println("Berhasil di override...");
		}
	};
	m1.mulai();
}
// Output "Berhasil di override"
```

Hasil modifikasi hanya berlaku untuk objek yang melakukan kelas anonymous dan tidak berlaku untuk kelas yang dioverridenya, sehingga apabila dibuat objek baru dari kelas tersebut maka pernyataannya akan berubah seperti awal.
``` java
public static void main(String[] args){
	Mesin m1 = new Mesin(){
		@Override
		public void mulai() {
			System.out.println("Berhasil di override...");
		}
	};
	m1.mulai();

	Mesin m2 = new Mesin();
	m2.mulai();
}
```

## Inner Class
Java mendukung pembuatan kelas didalam kelas (inner class) atau dengan kata lain sebuah kelas bisa menjadi anggota dari kelas lain. 
Untuk membuat inner class cukup mudah, cukup tulis kelas tersebut di dalam sebuah kelas, hanya saja access modifier dari inner class tersebut harus private. 
Ketika membuat sebuah inner class, inner class tersebut tidak dapat diakses oleh objek diluar kelas.
Contoh:
``` java
class Manusia{
  String nama;
  Manusia(String n){
    nama = n;
    Otak o = new Otak();
    o.berfikir();
  }
  
  private class Otak(){
    public void berfikir(){
      System.out.println(nama + " sedang berfikir");
    }
  }
}
```


## Method equals()

#### Membandingkan objek
Perlu diingat bahwa ketika membuat sebuah objek, variabel akan menyimpan referensi ke objek tersebut. 
Sehingga pada saat membandingkan suatu objek dengan menggunakan operator equality (==), sebenarnya itu akan membandingkan referensi dari objek-objek tersebut, bukan melainkan nilai-nilai dari objek tersebut.
``` java
class Binatang{
  String nama;
  Binatang(String nama){
    this.nama = nama;
  }
}

class MyClass{
  public static void main(String[] args){
    Binatang b1 = new Binatang("Kucing");
    Binatang b2 = new Binatang("Kucing");
    System.out.println(b1 == b2);
  }
}
// Output false
```

#### equals()
Setiap objek pada Java memiliki methode equals() yang telah didefinisikan sebelumnya, yang digunakan untuk melakukan perbandingan secara semantik. Agar method tersebut dapat berjalan untuk kelas yang dibuat maka method tersebut harus dioverride dan disesuaikan kondisinya dengan kebutuhan.
Untuk itu ada cara cepat untuk melakukan override method equals() pada suatu kelas, yakni klik kanan kelas tersebut, pilih __Source > Generate hashCode() and equals()...__

![alt text][override_equals]

Hal ini akan membuat method secara otomatis.
``` java
class Binatang {
  String nama;

  @Override
	public int hashCode() {
	  final int prime = 31;
		int result = 1;
		result = prime * result + ((nama == null) ? 0 : nama.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Binatang other = (Binatang) obj;
		if (nama == null) {
			if (other.nama != null)
				return false;
		} else if (!nama.equals(other.nama))
			return false;
		return true;
	}
}
```

Method hashCode() digunakan untuk menentukan lokasi penyimpanan objek secara internal. Pada saat mengimplementasikan method __equals__, maka method __hashCode__ harus diimplementasikan juga.

#### Membandingkan objek menggunakan method equals()
``` java
public static void main(String[] args){
  Binatang b1 = new Binatang("Kucing");
  Binatang b2 = new Binatang("Kucing");
  System.out.println(b1.equals(b2));
}
// Output true
```

## Enum
Enum merupakan tipe khusus yang digunakan untuk mendefinisikan kumpulan nilai konstan.

Contoh:
``` java
enum Hari{
  SENIN,
  SELASA,
  RABU,
  KAMIS,
  JUMAT,
  SABTU,
  MINGGU
}
```

Setiap nilai untuk tipe enum dipisahkan dengan tanda koma. 
Untuk mengakses nilai konstan pada enum dapat dilakukan dengan memanggil nama variabel enum disertai dengan tanda titik (.) dan nilainya.
``` java
Hari h = Hari.JUMAT;
```

Pada dasarnya, enum mendefinisikan variabel yang merepresentasikan anggota dari suatu hal yang tetap (fixed set), contohnya seperti Hari = {SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU} dan Bulan = {JANUARI, FEBRUARI, MARET, APRIL, MEI, JUNI, JULI, AGUSTUS, SEPTEMBER, OKTOBER, NOVEMBER, DESEMBER}.

#### Penggunaan Enum
Pada pernyataan __switch__
``` java
Hari h = Hari.JUMAT;
		
switch (h) {
  case SENIN:
    System.out.println("Ini adalah hari Senin");
    break;
  case SELASA:
    System.out.println("Ini adalah hari Selasa");
    break;
  case RABU:
    System.out.println("Ini adalah hari Rabu");
    break;
  case KAMIS:
    System.out.println("Ini adalah hari Kamis");
    break;
  case JUMAT:
    System.out.println("Ini adalah hari Jumat");
    break;
  case SABTU:
    System.out.println("Ini adalah hari Sabtu");
    break;
  case MINGGU:
    System.out.println("Ini adalah hari Minggu");
    break;
}
// Output "Ini hari Jumat"
```
## Java API
Java API (Application Program Interface) merupakan sekumpulan kelas dan interface (library) yang dapat digunakan oleh programmer Java. 
Dokumentasi Java API tersedia di website Oracle http://docs.oracle.com/javase/7/docs/api/.

Ketika ingin menggunakan package dari Java API maka diharuskan untuk mengimport package tersebut ke dalam kode Java.
Contoh:
``` java
import java.awt.*;
// package awt berisi semua kelas untuk membuat user interface, grafik dan gambar
```

[override_equals]: https://api.sololearn.com/DownloadFile?id=2439 "Override equals"
