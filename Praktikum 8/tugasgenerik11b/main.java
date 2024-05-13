/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasgenerik11b;

/* Nama : Ahmad Muhammad Ghifar Hirawan */
/* NIM  : 24060122140160                */
/* File : main.java                     */

/**
 *
 * @author Ghifar
 */
public class main {
    public static void main(String[]args){
        ulat K = new ulat();
        data<kupu> anu = new data<kupu>();
        
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new kupuDewasa());
        anu.getIsi().gerak();
    }
}
