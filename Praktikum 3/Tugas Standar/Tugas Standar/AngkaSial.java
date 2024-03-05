/*Nama: Ahmad Muhammad Ghifar Hirawan
NIM: 24060122140160
Nama File: AngkaSial.java
Desc: Program penggunaan exception buatan sendiri dan pengenalan klausa 'throw' dan 'throws'*/

public class AngkaSial{

    public void cobaAngka (int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + "Bukan Angka Sial");
    }


    public static void main(String[]Args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException ase){
            //method getMessage() telah pada kelas Ëxception
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

//*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//Pertama baris tersebut akan di eksekusi pada as.cobaAngka(10) lalu baris ini tidak akan di eksekusi lagi
//karena pada eksekusi berikutnya akan terjadi eksepsi di fungsi cobaAngka dan akan di "throw" ke fungsi AngkaSial
//lalu muncul peringatan karena adanya eksepsi dan maka dari itu fungsi cobaAngka ketiga tidak akan bisa dijalankan