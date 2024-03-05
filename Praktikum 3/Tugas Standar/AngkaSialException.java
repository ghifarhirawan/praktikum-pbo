/*Nama: Ahmad Muhammad Ghifar Hirawan
NIM: 24060122140160
Nama File: AngkaSialException.java
Desc: Eksepsi buatan sendiri, menolak masukan angka 13*/

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super ("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}
