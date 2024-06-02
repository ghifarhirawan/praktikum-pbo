/*Nama      : Ahmad Muhammad Ghifar Hirawan */
/*Nim       : 24060122140160                */
/*Tanggal   : 1 Juni 2024                   */
/*Nama File : Vehicle.java                  */

public abstract class Vehicle {
    public double calcFuelEfficency;
    public double calcTripDistance;

    public String toString(){
        return this.getClass().getSimpleName();
    }
}