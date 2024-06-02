/*Nama      : Ahmad Muhammad Ghifar Hirawan */
/*Nim       : 24060122140160                */
/*Tanggal   : 1 Juni 2024                   */
/*Nama File : Airport.java                  */

public class Airport {
    private Airplane airplane;
    private String name;

    public Airport(String name){
        this.name = name;
    }

    public String givePermissionToLand(iFlyer flyer){
        if (flyer instanceof Airplane){
            return "Izin diberikan untuk mendarat";
        }else{
            return "Izin tidak diberikan untuk mendarat";
        }
    }
}
