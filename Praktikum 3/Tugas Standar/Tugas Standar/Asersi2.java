/*Nama: Ahmad Muhammad Ghifar Hirawan
NIM: 24060122140160
Nama File: Asersi2.java
Desc: Program Untuk demo asersi, yang akan menolak input jari jari lingkaran yang bernilai nol*/

import static java.lang.Math.PI;

class Lingkaran{
    private double jejari;
    public Lingkaran (double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        double keliling = 2 * PI *jejari;
        return keliling; 
    } 
}

public class Asersi2 {
    public static void main (String[]Args){
        double jariJari = -2;
        assert (jariJari > 0) : "Jari jari tidak boleh nol!";
        Lingkaran l = new Lingkaran (jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
    
}

//pada fungsi diatas seharusnya message "Jari jari tidak boleh nol!" diubah menjadi "Jari jari harus lebih besar dari 0" sehingga konsep asersi sudah benar
