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
/* Nama File : Senjata.java                   */

public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.peluru = peluru;
    }
    
    public String getBunyi(){
        return this.bunyi;
    }
    
    public int getPeluru(){
        return this.peluru;
    }
    
    public void menembak(){
        System.out.println(getBunyi() + " ");
        this.peluru = this.peluru - 1;
        System.out.println("Sisa Peluru : " + getPeluru());
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
