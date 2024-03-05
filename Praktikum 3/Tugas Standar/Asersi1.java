/*Nama: Ahmad Muhammad Ghifar Hirawan
NIM: 24060122140160
Nama File: Asersi1.java
Desc: Program Untuk Menunjukkan Asersi*/

public class Asersi1{
    public static void main (String[]Args){
        int x = 0;
        if (x > 0){
            System.out.println("X Bilangan Positif");
        }else{
            assert (x < 0) : "Ada kesalahan kode";
            System.out.println("X Bilangan Negatif");
        }
    }
}