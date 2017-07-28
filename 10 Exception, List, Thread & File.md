## Outline
- Exception Handling
- Multiple Exception
- Thread
- Runtime vs. Checked Exception
- Tipe Collection
- ArrayList
- LinkedList
- HashMap
- Set
- Sorting List
- Iterators
- File

## Exception Handling

Exception adalah masalah yang terjadi pada saat mengeksekusi suatu program. Exception menyebabkan berhentinya program secara tidak wajar.
Exception handling adalah suatu mekanisme yang kuat untuk menangani runtime eror agar aplikasi dapat berjalan dengan baik.

Exception dapat terjadi disebabkan oleh beberapa alasan, contohnya:
- User menginput data yang tidak valid
- File yang akan dibuka tidak ditemukan
- Hilangnya koneksi internet
- Memory tidak cukup

> Suatu program yang baik harus dapat menangani semua kemungkinan exception.

Exception dapat ditangani dengan menggunakan keyword __try__ dan __catch__. try dan catch ditempatkan disekitar kode yang dapat memunculkan exception.

#### try catch

``` java
try{
  // kode
}catch(Exception e){
  // kode untuk menangani error
}
```

Pada saat menggunakan catch, tipe Exception harus didefinisikan sesuai dengan exception yang ingin ditangani. Sehingga pada saat error terjadi maka penanganan exception yang muncul akan disesuaikan dengan tipe Exception yang dideklarasikan.
Contoh tipe exception:
- Exception
- IndexOutOfBoundsException
- FileNotFoundException

Tipe Exception digunakan untuk menangani semua kemungkinan exception yang terjadi.

``` java
public class MyClass{
  public static void main(String[] args){
    try{
      int a[] = new int[2];
      System.out.println(a[5]);
    }catch(Exception e){
      System.out.println("Error terjadi");
    }
  }
}
```
Pada kode diatas akan menyebabkan error dan program berhenti dikarenakan program mencoba mengakses index ke 5 pada array a padahal maksimal index adalah 1, dikarenakan ukuran arraynya adalah 2 (index 0, 1). 
Dengan adanya try catch maka pada saat error terjadi akan mengirimkan pesan "Error terjadi" ke console dan program tetap berjalan hingga selesai.

satu block keyword try bisa mempunyai beberapa blok keyword catch yang dapat digunakan untuk menangani exception yang berbeda.
``` java
try{
  //kode
}catch(ExceptionType1 e1){
  //kode
}catch(ExceptionType2 e2){
  //kode
}catch(ExceptionType3 e3){
  //kode
}
```

#### throw

Keyword throw digunakan untuk membuat exception handling secara manual pada suatu method.
``` java
int div(int a, int b) throws ArithmeticException{
  if(b == 0){
    throw new ArithmeticException("Division by Zero");
  }else{
    return a / b;
  }
}
```

Exception throw dapat didefinisikan lebih dari satu dengan dipisahkan menggunakan tanda koma (,).
``` java
int div(int a, int b) throws ArithmeticException, IndexOutOfBoundsException{
  // kode
}
```

## Thread
Java merupakan bahasa pemrograman multithreading, yang berarti program Java dapat mengoptimalkan resource yang ada dengan menjalankan dua atau lebih komponen secara bersamaan dan setiap komponen dapat menangani tugas yang berbeda.

Life cycle dari Thread

![alt text][thread_lifecycle]

Ada dua cara untuk membuat thread

__1. Extend kelas Thread__

Melakukan inheritance pada kelas Thread, override method run() dan menuliskan kode/fungsi di method run().
``` java
class Loader extends Thread{
  public void run(){
    System.out.println("Hello");
  }
}

class MyClass{
  public static void main(String[] args){
    Loader obj = new Loader();
    obj.start();
  }
}
```
> Setiap thread Java diprioritaskan untuk membantu sistem operasi menentukan urutan penjadwalan thread. Range prioritas dimulai dari 1 hingga 10, dan default prioritas thread adalah 5. Untuk mengatur prioritas thread dapat menggunakan method setPriority().

__2. Implement interface Runnable__
``` java
class Loader implements Runnable{
  public void run(){
    System.out.println("Hello");
  }
}

class MyClass{
  public static void main(String[] args){
    Thread t = new Thread(new Loader());
    t.start();
  }
}
```

[thread_lifecycle]: https://api.sololearn.com/DownloadFile?id=2880 "Thread Lifecycle"


## Runtime vs. Checked Exception
Ada 2 macam tipe exception, __checked__ dan __unchecked__ (runtime). Perbedaan utamanya adalah exception checked akan dicek pada saat compile, sedangkan exception unchecked dicek pada saat runtime.

## Tipe Collection
Java memiliki beberapa tipe collection untuk menyimpan kumpulan data yaitu:
- List
- Map
- Set

## ArrayList
Java API menyediakan kelas khusus untuk menyimpan dan memanipulasi kumpulan objek yakni ArrayList. Perbedaan Arraylist dengan array pada Java adalah array panjangnya statis sesuai dengan nilai yang diberikan pada saat inisialisasi sedangkan ArrayList panjangnya dinamis atau dapat berubah-ubah.

ArrayList akan menyimpan objek, oleh karena itu tipe yang harus dispesifikasikan harus tipe kelas. Contoh: tipe data int tidak bisa dijadikan objek pada ArrayList melainkan harus menggunakan tipe kelasnya yakni Integer, contoh lainnya seperti Double untuk double, Long untuk long dan lainnya.

``` java
ArrayList<String> warna = new ArrayList<String>();
```

Kapasitas awal dari ArrayList dapat didefinisikan dengan cara berikut ini
```java
ArrayList<String> warna = new ArrayList<String>(3);

```

Berikut ini beberapa method yang sering digunakan pada ArrayList
- add(objek), digunakan untuk menambahkan objek pada ArrayList
- remove(objek) atau remove(index), digunakan untu menghapus objek pada ArrayList
- get(index), digunakan untuk mengakses objek pada ArrayList

``` java
//Membuat dan inisialisasi objek ArrayList
ArrayList<String> warna = new ArrayList<String>();

//Menambahkan objek ArrayList
warna.add("Merah");
warna.add("Kuning");

//Mengakses objek ArrayList
warna.get(0);

//Menghapus objek ArrayList
warna.remove("Merah");
```

## LinkedList
LinkedList memiliki sintaks yang mirip dengan ArrayList.
Untuk mendeklarasikan LinkedList tinggal ganti ArrayList dengan LinkedList. Berbeda halnya dengan ArrayList, kapasitas awal dari LinkedList tidak dapat didefinisikan.

Berikut ini beberapa method yang sering digunakan pada LinkedList
- add(objek), digunakan untuk menambahkan objek pada LinkedList
- remove(objek) atau remove(index), digunakan untu menghapus objek pada LinkedList
- get(index), digunakan untuk mengakses objek pada LinkedList

``` java
//Membuat dan inisialisasi objek LinkedList
LinkedList<String> warna = new LinkedList<String>();

//Menambahkan objek LinkedList
warna.add("Merah");
warna.add("Kuning");
warna.add("Hijau");

//Mengakses objek LinkedList
warna.get(0);

//Menghapus objek LinkedList menggunakan index
warna.remove(0);

//Menghapus objek LinkedList menggunakan objek
warna.remove("Kuning");
```

Perbedaan penting diantara LinkedList dan ArrayList adalah cara mereka menyimpan objek.
- ArrayList lebih baik digunakan untuk menyimpan dan mengakses data, hal ini mirip dengan array normal
- LinkedList lebih baik digunakan untuk memanipulasi data seperti insert dan delete

## HashMap
Array dan List digunakan untuk menyimpan kumpulan data yang terurut dengan setiap elemen memiliki sebuah index integer.
HashMap digunakan untuk menyimpan kumpulan data sebagai pasangan key dan value. Objek pertama digunakan sebagai sebuah key(index) dan objek lainnya digunakan sebagai value.

Berikut ini beberapa method yang sering digunakan pada HashMap
- put(key, value), digunakan menyimpan objek pada HashMap
- remove(key), digunakan untuk menghapus objek pada HashMap
- get(key), digunakan untuk mengakses objek pada HashMap
- containsKey(key), digunakan untuk mengecek apakah ada key tersebut pada HashMap
- containsValue(value), digunakan untuk mengecek apakah ada value tersebut pada HashMap

``` java
HashMap<String, Integer> nilaiMatematika = new HashMap<String, Integer>();
ipk.put("Mahasiswa 1", 100);
ipk.put("Mahasiswa 2", 89);
ipk.put("Mahasiswa 3", 85);

ipk.get("Mahasiswa 2"); //Output 89

ipk.remove("Mahasiswa 2");
```
HashMap tidak dapat berisi duplikat key. Jika menambahkan item baru dengan key yang sama maka akan menimpah/overwrite elemen lama.
Jika mencoba mengakses key yang tidak ada pada HashMap makan akan dikembalikan / return nilai null.

## Set
Set adalah kumpulan data yang tidak bisa mempunyai duplikat elemen. Salah satu contoh implementasi dari Set adalah HashSet.
HashSet tidak secara otomatis mengatur urutan elemen sesuai dengan data yang ditambahkan.
``` java
HashSet<String> set = new HashSet<String>();
set.add("A");
set.add("B");
set.add("C");
```
### Apa itu Hashing?
Sebuah table hash menyimpan informasi melalui mekanisme yang disebut hashing dimana konten yang dijadikan kunci dan digunakan untuk menentukan nilai unik yang disebut hash code. sehingga, pada dasarnya setiap elemen pada HashSet berkaitan dengan masing-masing hash code uniknya.

## Sorting List
Java API menyediakan kelas Collections untuk memanipulasi data pada tipe Collection.
Salah satu method yang popular digunakan adalah sort() yang berfungsi untuk mengurutkan data pada tipe Collection. Method-method yang ada pada kelas Collections adalah static sehingga tidak perlu terlebih dahulu membuat objek untuk memanggil method-method tersebut.
``` java
ArrayList<String> binatang = new ArrayList<String>();
binatang.add("Harimau");
binatang.add("Kucing");
binatang.add("Gajah");
binatang.add("Ular");
binatang.add("Anjing");

Collections.sort(binatang);

System.out.println(binatang);
//Output: [Anjing, Gajah, Harimau, Kucing, Ular]
```
Method lainnya yang bermanfaat pada kelas Collection adalah:
- max(Collection c), mengembalikan nilai maksimum elemen yang terdapat pada collection
- min(Collection c), mengembalikan nilai minimum elemen yang terdapat pada collection
- reverse(List list), membalikan urutan elemen-elemen pada List
- shuffle(List list), mengacak-acak secara random elemen-elemen pada List

## Iterators
Sebuah Iterator adalah sebuah objek yang membuat sebuah perulangan melalui collection untuk mendapatkan atau menghapus elemen dari collection. Setiap kelas collection menyediakan method iterator() yang akan mengembalikan nilai awal perulangan dari collection, satu elemen setiap waktu.

Kelas Iterator menyediakan method-method berikut ini:
- hasNext(), mengembalikan nilai true jika minimal ada satu elemen didalam collection
- next(), mengembalikan objek dan menambah 1 nilai ke perulangan selanjutnya
- remove(), menghapus objek terakhir yang diperoleh dari method next()

``` java
LinkedList<String> binatang = new LinkedList<String>();
binatang.add("Harimau");
binatang.add("Kucing");
binatang.add("Gajah");
binatang.add("Ular");
binatang.add("Anjing");

Iterator<String> it = binatang.iterator();
while(it.hasNext()){
  System.out.println(it.next());
}
/*
Output:
Harimau
Kucing
Gajah
Ular
Anjing
*/
```
## File
Pada package java.io terdapat kelas File yang dapat digunakan untuk menangani file-file yang terkait dengan program Java. Pada saat membuat objek File masukkan path dari file yang akan dibaca oleh program Java.
``` java
File file = new File("C:\\data\\contoh.txt");
```

Gunakan method exists() untuk mengecek apakah file ada atau tidak dan methode getName() untuk mendapatkan nama dari file.
``` java
File file = new File("C:\\data\\contoh.txt");
if(file.exists()){
  System.out.println(file.getName() + " ada!");
}else{
  System.out.println(file.getName() + " tidak ada!");
}
```

### Membaca File
File berguna untuk menyimpan dan mengakses data secara eksternal. Salah satu cara paling sederhana untuk membaca file adalah dengan menggunakan kelas Scanner.
``` java
try{
  File file = new File("C:\\data\\contoh.txt");
  Scanner s = new Scanner(file);
}catch(Exception e){

}
// try catch digunakan karena ada kemungkinan file tidak ada
```

Kelas scanner extends Iterator oleh karena itu kelas scanner dapat menggunakan semua method yang ada pada kelas Iterator.
``` java
try{
  File file = new File("C:\\data\\contoh.txt");
  Scanner s = new Scanner(file);
  while(s.hasNext()){
    System.out.println(s.next());
  }
  s.close();
}catch(Exception e){
  System.out.println("Error");
}
```
Best practice: Disarankan untuk memanggil method close() setelah selesai membaca file.

### Membuat File
Kelas Formatter digunakan untuk membuat content dan menuliskannya ke sebuah file.
``` java
try{
  Formatter f = new Formatter("D:\\test.txt");
  f.format("%s %s %s", "1", "Tedy", "Darmawan \r\n");
  f.close();
}catch(Exception e){
  System.out.println("Error");
}
```

%s adalah string yang akan digantikan oleh parameter sesuai dengan urutannya.
\r\n adalah simbol yang digunakan di Windows untuk baris baru.
