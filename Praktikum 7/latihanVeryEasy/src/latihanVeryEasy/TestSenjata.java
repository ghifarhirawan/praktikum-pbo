/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author Ghifar
 */

/* Nama      : Ahmad Muhammad Ghifar Hirawan  */
/* NIM       : 24060122140160                 */
/* Nama File : TestSenjata.java               */

public class TestSenjata {
    public static void main(String[]Args){
        Senjata ak47 = new Senjata("TAR");
        
        System.out.println("Jumlah Peluru AK47 : " + ak47.getPeluru());
        System.out.println("AK47 Mengisi Peluru ");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47 : " + ak47.getPeluru());
        
        System.out.println("AK47 Menembak ");
        ak47.menembak();
    }      
}
