/*
NIM: D1041241004
Nama: Faliha Imtinan
ArrayNilai
*/
package Pertemuan13.Latihan;

public class ArrayNilai {
    public static void main (String[] args){
        System.out.println("=== DAFTAR NILAI ===");
        int[] nilai = {85,90,78,92,88};
        for (int idx = 0; idx < nilai.length; idx++) {
            System.out.println("Nilai "+ (idx+1) + ": " + nilai[idx]);
        }
        System.out.println("\nTotal Nilai: " + nilai.length);
    }
}