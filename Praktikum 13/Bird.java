/*Nama      : Ahmad Muhammad Ghifar Hirawan */
/*Nim       : 24060122140160                */
/*Tanggal   : 1 Juni 2024                   */
/*Nama File : Bird.java                     */
 
public class Bird extends Animal implements iFlyer {
    public void takeOff(){
        System.out.println("Burung ingin terbang");
    }
    
    public void land(){
        System.out.println("Burung ingin mendarat");
    }

    public void fly(){
        System.out.println("Burung sedang terbang");
    }

    public void buildNest(){
        System.out.println("Burung ingin membuat sarang");
    }

    public void layEggs(){
        System.out.println("Burung sedang bertelur");
    }

    public void eat(){
        System.out.println("Burung sedang makan");
    }
}
