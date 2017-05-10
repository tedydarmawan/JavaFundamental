## Outline
- Exception Handling
- Multiple Exception
- Thread
- Runtime vs. Checked Exception
- ArrayList
- LinkedList
- HashMap
- Sets
- Sorting List
- Iterator
- File
- Membaca File
- Menulis & Membuat File

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



