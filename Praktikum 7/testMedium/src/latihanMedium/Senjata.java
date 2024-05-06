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

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = peluru;
    }
    
    public String getBunyi(){
        return this.bunyi;
    }
    
    public int getPeluru(){
        return this.peluru;
    }
    
    public boolean isMenusuk(){
        return this.menusuk;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
