/*
NIM: D1041241004
Nama: Faliha Imtinan
LatihanMenuHarian
*/
package Pertemuan8.Latihan;

public class LatihanMenuHarian {
    public static void main(String[] args){
        System.out.println("=== MENU MAKAN 3 HARI ===");
        for(int hari=1;hari<=3;hari++){
            System.out.println("Hari " + hari + ": ");
            for(int waktu=1;waktu<=2;waktu++){
                if(waktu == 1 && hari == 1){
                    System.out.println("  Pagi: Nasi Goreng");
                }else if(waktu == 2 && hari == 1){
                    System.out.println("  Siang: Soto Ayam");
                }else if(waktu == 1 && hari == 2){
                    System.out.println("  Pagi: Bubur Ayam");
                }else if(waktu == 2 && hari == 2){
                    System.out.println("  Siang: Mie Goreng");
                }else if(waktu == 1 && hari == 3){
                    System.out.println("  Pagi: Roti Bakar");
                }else if(waktu == 2 && hari == 3){
                    System.out.println("  Siang: Nasi Uduk");
                }
            }
            System.out.println(" ");
        }
    }
}
