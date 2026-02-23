/*
NIM: D1041241004
Nama: Faliha Imtinan
LatihanTabelPerkalian
*/
package Pertemuan7.Latihan;

public class LatihanTabelPerkalian {
    public static void main(String[] args) {
        int angka = 7;
        System.out.println("=== TABEL PERKALIAN 7 ===");
        for(int i=1;i<=12;i++){
            int hasil = angka * i;
            System.out.println(angka + " x " + i + " = " + hasil);
        }
    }
}