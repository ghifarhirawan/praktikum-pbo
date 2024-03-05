/*Nama: Ahmad Muhammad Ghifar Hirawan
NIM: 24060122140160
Nama File: ExceptionOnArray.java
Desc: Program Untuk penggunaan eksepsi menggunakan class library java*/

public class ExceptionOnArray {
    public static void main(String[]Args){
        //instansiansi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
