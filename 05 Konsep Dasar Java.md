## Outline
- Komentar
- Variabel
- Operator Primitif
- _Increment & Decrement_
- String

## Komentar
Tujuan dari adanya komentar pada kode adalah untuk menjelaskan apa yang dilakukan oleh kode tersebut. 
Java dapat menambahkan komentar 1 baris (_single-line comment_) atau beberapa baris (_multi-line comment_) dan juga komentar dokumentasi (documentation comment). Semua karakter yang muncul dalam komentar akan diabaikan oleh compiler Java.

#### Komentar 1 baris
``` java
// ini adalah komentar 1 baris
int x = 5; // ini adalah komentar 1 baris lainnya
```

#### Komentar beberapa baris
``` java
/* ini adalah
komentar 
beberapa baris
*/
```

#### Komentar dokumentasi
Komentar dokumentasi merupakan komentar khusus yang digunakan untuk membuat dokumentasi eksternal dengan bantuan tool Javadoc.
``` java
/** ini adalah komentar dokumentasi */

/** ini juga merupakan 
komentar dokumentasi */
```

Javadoc adalah tool bawaan JDK yang digunakan untuk membuat dokumentasi kode Java dalam format HTML.

## Variabel
Variabel digunakan untuk menyimpan data yang akan diproses.
``` java
String nama = "Budi";
int a = 42, b = 11;
```

> Java itu _case sensitive_, variabel namaDistributor != NamaDistributor. Untuk penamaan variabel disarankan untuk menggunakan camelCase.

Contoh deklrasi variabel
``` java
class MyClass{
  public static void main(String[] args){
    String nama = "Budi";
    int umur = "17";
    double diskon = "25.5";
    char grup = "Z";
  }
}
```

## Operator Primitif
#### Operator Matematika
``` java
/*
Operator:
+ Pertambahan
- Pengurangan
* Perkalian
/ Pembagian
% Sisa bagi
*/
int x = 6 + 3
// 6 dan 3 adalah operand
```
## _Increment & Decrement_
Operator _increment_ dan _decrement_ menyediakan cara yang ringkas untuk menaikkan atau menurunkan nilai variabel satu per satu.

#### _Prefix Increment & Decrement_
Operator _increment_ dan _decrement_ muncul sebelum _operand_
``` java
int x = 34;
int y = ++x; //y = 35
//berlaku sebaliknya untuk decrement --x
```

#### _Postfix Increment & Decrement_
Operator _increment_ dan _decrement_ muncul setelah _operand_
``` java
int x = 34
int y = x++; //y = 34
//berlaku sebaliknya untuk decrement x--
```

#### _Assignment Operator_
Penambahan dan _assignment_ operator
``` java
int num1 = 3;
int num2 = 9;
num2 += num1; //sama halnya dengan num2 = num2 + num1;
```
Pengurangan dan _assignment_ operator
``` java
int num1 = 3;
int num2 = 9;
num2 -= num1; //sama halnya dengan num2 = num2 - num1;
```
## String
Di Java, String adalah sebuah objek yang merepresentasikan serangkaian karakter;
``` java
String s = "Development"; //String dari 11 karakter
```
#### String Concatenation
Operator + diantara string menambahkan string tersebut menjadi satu untuk membuat sebuah string baru. Proses ini disebut _concatenation_.
``` java
String namaDepan, namaBelakang;
namaDepan = "System";
namaBelakang = "Support";
System.out.println("Divisi " + namaDepan + " " + namaBelakang);
// Output: Divisi System Support
```
