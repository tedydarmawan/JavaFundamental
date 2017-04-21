## Outline
- Percabangan if
- Percabangan if else
- Percabangan nested if
- Percabangan else if
- Operator logika
- Percabangan switch
- Perulangan while
- Perulangan for
- Perulangan do while

## Percabangan if
if biasanya digunakan untuk menampilkan aksi yang berbeda berdasarkan kondisi yang berbeda.
```
if(kondisi){
  //dieksekusi ketika kondisi = true
}

/*
Operator perbandingan:
< lebih kecil daripada
> lebih besar daripada
!= tidak sama dengan
== sama dengan
<= lebih kecil sama dengan
>= lebih besar sama dengan
*/
```

Contoh:
``` java
int x = 7;
if(x < 42){
  System.out.println("Halo");
}
```
## Percabangan if else
Suatu percabangan if bisa diikuti dengan opsi pernyataan else yang akan dieksekusi ketika kondisi = false.
``` java
int age = 30;

if(age < 16){
  System.out.println("Terlalu muda");
}else{
  System.out.println("Selamat datang");
}
//Output: Selamat datang
```
## Percabangan Nested if
Java dapat menggunakan percabangan if-else didalam if atau else lainnya.
``` java
int umur = 25;
if(umur > 0){
  if(umur > 16){
    System.out.println("Selamat datang");
  }else{
    System.out.println("Terlalu muda");
  }
}else{
  System.out.println("Error");
}
//Output: Selamat datang
```
## Percabangan else if
Percabangan else if digunakan untuk menguji beberapa kondisi.
``` java
int umur = 25;

if(umur <= 0){
  System.out.println("Error");
}else if(umur <= 16){
  System.out.println("Terlalu muda");
}else if(umur < 100){
  System.out.println("Selamat datang!");
}else{
  System.out.println("Serius?");
}
```

## Operator Logika
Operator logika digunakan untuk menggambungkan beberapa kondisi.
```
&&  |   AND   |   jika semua kondisi benar maka true
||  |   OR    |   jika salah satu kondisi benar maka true
!   |   NOT   |   jika kondisi benar maka false, sebaliknya
```

Contoh nested if:
``` java
if(umur > 18){
  if(uang > 500){
    System.out.println("Selamat datang!");
  }
}
```

Contoh operator AND:
``` java
if(umur > 18 && uang > 500){
  System.out.println("Selamat datang!");
}
```
Contoh operator OR:
``` java
int umur = 25;
int uang = 100;

if(umur > 18 || uang > 500){
  System.out.println("Selamat datang!");
}
```

Contoh operator NOT:
``` java
int umur = 25;
if(!(age > 18)){
  System.out.println("Terlalu muda");
}else{
  System.out.println("Selamat datang!");
}
```
## Percabangan Switch
Percabangan switch akan mencari kesamaan nilai suatu variabel pada suatu daftar nilai. Setiap nilai disebut dengan **case** dan variabel akan dicek kesamaannya dengan setiap case yang ada.
```
switch(ekspresi){
  case nilai1:
    //pernyataan
    break; //optional
  case nilai2:
    //pernyataan
    break; //optional
  ...
  default: //optional
    //pernyataan
}
```
Karektersitik percabangan switch:
- Pada saat switch, jika nilai variabel sama dengan suatu case maka pernyataan yang ada pada case tersebut akan dieksekusi sampai **break** tercapai
- Ketika **break** tercapai, switch akan berhenti dan program akan lanjut ke baris berikutnya sesudah pernyataan switch
- Tidak semua case memerlukan **break**. Jika break tidak muncul, maka program akan lanjut ke case berikutnya sampai break tercapai.
``` java
int hari = 3;
switch(hari){
  case 1:
    System.out.println("Senin");
    break;
  case 2:
    System.out.println("Selasa");
    break;
  case 3:
    System.out.println("Rabu");
    break;
}
// Output: Rabu
```
