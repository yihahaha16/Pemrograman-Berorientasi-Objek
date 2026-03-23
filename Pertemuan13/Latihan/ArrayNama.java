/*
NIM: D1041241004
Nama: Faliha Imtinan
ArrayNama
*/
package Pertemuan13.Latihan;

public class ArrayNama {
    public static void main(String[] args) {
        System.out.println("=== DAFTAR NAMA ===");
        String[] nama = {"Andi","Budi","Citra","Deni","Eka"};
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i+1) + ". " + nama[i]);
        }
    }
}