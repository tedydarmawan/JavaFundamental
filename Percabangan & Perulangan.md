## Outline
- Percabangan if
- Percabangan if else
- Percabangan nested if
- Percabangan else if
- Operator logika
- Perulangan switch
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
