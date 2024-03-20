/*
 * Penulis : Ahmad Muhammad Ghifar Hirawan
 * Deskripsi : implementasi cara menghitung luas lingkaran
 * Nama File : MLingkaran.java
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main (String[]Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari lingkaran : ");
        Lingkaran l = new Lingkaran(scan.nextDouble());
        System.out.println("luas lingkaran dengan" + "jejari 10.2 satuan adalah : " + l.hitungLuas());
    }
}
