/*
 * Nama : Ahmad Muhammad Ghifar Hirawan
 * NIM : 24060122140160
 * Nama File : MGaris.java
 * Deskripsi : berisikan main class untuk program Garis
 */

public class MGaris {
    public static void main(String[]args){
        Titik T1 = new Titik(3, 3);
        Titik T2 = new Titik(5, 5);
        Garis G = new Garis(T1, T2);
        Titik titikAwal = G.getTitikAwal();
        Titik titikAkhir = G.getTitikAkhir();

        System.out.println("Titik Awal : (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ")");
        System.out.println("titik Akhir : (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");

        System.out.println("Panjang Garis G : " + G.getPanjang());
        System.out.println("Panjang Garis G : " + G.getGradien());

        Garis GRefleksiY = G.getRefleksiY();
        Titik tAwalRefleksiY = GRefleksiY.getTitikAwal();
        Titik tAkhirRefleksiY = GRefleksiY.getTitikAkhir();

        System.out.println("Titik Awal (" + tAwalRefleksiY.getAbsis() + "," + tAwalRefleksiY.getOrdinat() + ")");
        System.out.println("Titik Akhir (" + tAkhirRefleksiY.getAbsis() + "," + tAkhirRefleksiY.getOrdinat() + ")");

        System.out.println("Garis G Tegak Lurus Dengan Garis GRefleksiY : " + G.IsTegakLurus(GRefleksiY));
    }
}

//Kesimpulannya adalah jika access modifynya adalah public maka file pada main bisa di panggil tetapi jika statusnya adalah private maka file tidak akan bisa dipanggil karena tidak memiliki access dan akan error