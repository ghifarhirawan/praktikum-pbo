/*Nama: Ahmad Muhammad Ghifar Hirawan
NIM: 24060122140160
Nama File: MPrismaSegitiga.java
Desc: Berisikan Main function untuk menampilkan output program*/

public class MPrismaSegitiga {
    public static void main(String[]args){
        Segitiga Seg1 = new Segitiga(3,4);
        PrismaSegitiga Pris1= new PrismaSegitiga(Seg1, 5);

        System.out.println("Volume dari Prisma Segitiga : " + Pris1.hitungVolume());
        System.out.println("Luas Permukaan dari Prisma Segitiga : " + Pris1.hitungLuasPermukaan());
    }
}
