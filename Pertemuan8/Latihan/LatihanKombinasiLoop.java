/*
NIM: D1041241004
Nama: Faliha Imtinan
LatihanKombinasiLoop
*/
package Pertemuan8.Latihan;

public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        boolean isTrue = true;
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 5; j++){
                System.out.println("Cek: ["+ i + "," + j + "]");
                if(i==2 && j==3){
                    System.out.println("[OK] Koordinat ditemukan!");
                    System.out.println("Pencarian selesai.");
                    isTrue = false;
                    break;
                }
            }
            if (isTrue == false){
                break;
            }
        }
    }
}
