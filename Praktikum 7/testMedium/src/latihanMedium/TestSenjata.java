/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

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
        Senjata m16 = new Senjata("DOR");
        
        kontrolSenjata kontrolAK47 = new kontrolSenjata(ak47);
        kontrolSenjata kontrolm16 = new kontrolSenjata(m16);
                
        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);
        
        System.out.println("========================== ");
        
        kontrolm16.menembak(1);
        kontrolm16.isiPeluru(5);
        kontrolm16.menembak(2);
    }
}
