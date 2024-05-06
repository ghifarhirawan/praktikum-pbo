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

public class kontrolSenjata {
    private Senjata s;
    
    public kontrolSenjata(Senjata s){
        this.s = s;
    }
    
    public boolean isAdaPeluru(){
        return s.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
       s.setPeluru(jumPeluru);
       System.out.println(">> peluru berhasil ditambah : " + jumPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (s.getPeluru() == 0){
            System.out.println("peluru habis");
        }else{
            int i;
            for (i=0; i < jumlah; i++){
                if(s.getPeluru() > 0){
                    System.out.println(s.getBunyi() + "");
                    s.setPeluru(s.getPeluru() - 1);
                }
                else if (s.getPeluru() == 0){
                    System.out.println("Gagal tembak, peluru habis");
            }
          
        }   
                System.out.println(">> Peluru Sisa : " + s.getPeluru());
        }
    }
    
    public String menusuk(){
        if(s.isMenusuk()){
            return "Jleb!";
        }else{
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet(){
        System.out.println("Bayonet Terpasang");
    }
}
