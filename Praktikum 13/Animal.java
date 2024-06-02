/*Nama      : Ahmad Muhammad Ghifar Hirawan */
/*Nim       : 24060122140160                */
/*Tanggal   : 1 Juni 2024                   */
/*Nama File : Animal.java                   */

public abstract class Animal {
    public abstract void eat();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
