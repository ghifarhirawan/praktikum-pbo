/* Nama      : Ahmad Muhammad Ghifar Hirawan */
/* NIM       : 24060122140160                */
/* Nama File : MPoligon.java                 */
/* Deskripsi : File Main                     */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main (String[]args){
        PersegiPanjang persegi = new PersegiPanjang (10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        Segitiga Segitiga = new Segitiga(5,7,3);
        Segitiga.printInfo();
        System.out.println("Luas Segitiga : " + Segitiga.hitungLuas());
    }
}
