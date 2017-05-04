## Outline
- Array
- Penjumlahan Elemen Array
- Perulangan pada Array
- Array Multidimensi

## Array
Array adalah kumpulan variabel yang memiliki tipe data yang sama.
Untuk mendeklarasikan sebuah array, tambahkan tanda kurung kotak / _square brackets_ pada tipe datanya.
``` java
String[] kata;
// nama variabel adalah kata
// tipe data elemen yang dapat ditampung adalah String
```
Setelah itu, tentukan kapasitas arraynya atau jumlah maksimal elemen yang dapat ditampung dalam sebuah array. Untuk itu dibutuhkan keyword new untuk inisialisasi objek array tersebut.
``` java
String[] kata = new String[5];
// deklarasi array dengan kapasitas 5 elemen String
```
Dalam suatu array, elemen-elemennya terurut dan setiap elemen mempunyai posisi konstan dan spesifik yang disebut index.
Untuk mereferensi elemen pada suatu array, ketik nama array tersebut diikuti dengan posisi index didalam tanda kurung kotak / _square brackets_.
``` java
kata[2] = "Programmer";
// memberikan nilai "Programmer" ke elemen array dengan index 2
```
Elemen-elemen pada array dimulai dengan index 0, yang berarti jika mendeklarasikan suatu array dengan kapasitas 5 atau String[5], maka indexnya adalah 0, 1, 2, 3, 4 atau dengan kata lain elemen pertama array tersebut adalah 0 dan maksimal index dari array tersebut adalah 4.

#### Array Literal
Jika sudah mengetahui nilai yang akan dimasukan pada suatu array, Java menyediakan cara cepat untuk inisialisasi objek array yang disebut dengan array literal.
``` java
String[] kata = {"Programmer", "Developer", "Designer", "Engineer"};
System.out.println(kata[0]);
// Output "Programmer"
```
## Penjumlahan Elemen Array
#### Panjang array
Untuk mengecek panjang suatu array atau jumlah elemen yang disimpan, gunakan properti __length__.
``` java
String[] kata = new kata[5];
System.out.println(kata.length);
//Output 5
```
Untuk menjumlahkan semua elemen pada array, properti length dapat digunakan untuk mengetahui berapa kali perulangan dapat dilakukan.
``` java
int[] angka = {10, 9, 5, 4, 3};
int jumlah = 0;
for(int i = 0; i<angka.length; i++){
  jumlah += angka[i]; // sama dengan jumlah = jumlah + angka[i]
}
System.out.println(jumlah);
//Output 31
```
## Perulangan pada Array
Java menyediakan cara sederhana untuk melakukan perulangan pada array yang disebut perulangan "for each".
``` java
String[] kata = {"Programmer", "Developer", "Designer", "Engineer"};
for(String s: kata){
  System.out.println(s);
}
/*
Programmer
Developer
Designer
Engineer
*/
```
## Array Multidimensi
Arrray multidimensi adalah array yang berisi array.
``` java
String[][] kata = {{"Programmer", "Developer", "Designer"},{"PHP", "Android", "Java"}};
```
Untuk mengakses elemen array tersebut, gunakan dua index, index pertama untuk elemen array utama dan index kedua untuk elemen array di dalam array utama.
``` java
String s = kata[1][2];
System.out.println(s);
// Output "Java"
```



