## Outline
- Enkapsulasi
- Inheritance
- Polymorphism
- Overriding & Overloading
- Kelas Abstrak
- Interface
- Casting
- Downcasting
- Kelas Anonymous
- Inner Kelas
- Method equals()
- Enum
- Java API

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
``` java

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
