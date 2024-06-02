/*Nama      : Ahmad Muhammad Ghifar Hirawan */
/*Nim       : 24060122140160                */
/*Tanggal   : 1 Juni 2024                   */
/*Nama File : Superman.java                 */

public class Superman extends Kryptonian {
    public String nama;

    public Superman (String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void takeOff(){
        System.out.println(nama + " mau terbang");
    }

    public void land(){
        System.out.println(nama + " mau mendarat");
    }

    public void fly(){
        System.out.println(nama + " sedang terbang");
    }

    public void leapBuilding(){
        System.out.println(nama + " sedang melompat antar gedung");
    }

    public void stopBullet(){
        System.out.println(nama + " sedang menghentikan peluru");
    }

    public void eat(){
        System.out.println(nama + " sedang makan");
    }
}
