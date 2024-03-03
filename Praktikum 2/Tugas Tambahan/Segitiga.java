/*Nama: Ahmad Muhammad Ghifar Hirawan
NIM: 24060122140160
Nama File: Segitiga.java
Desc: Berisikan Function untuk menyusun Segitiga*/

public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga (double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggiSegitiga(){
        return tinggi;
    }

    public double hitungLuas(){
        return ((alas*tinggi)/2) ;
    }
}
