/*
NIM: D1041241004
Nama: Faliha Imtinan
LatihanTotalGenap
*/
package Pertemuan8.Latihan;

public class LatihanTotalGenap {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
        for(int angka = 1; angka <= 20; angka++){
            if(angka % 2 != 0){
                continue;
            }else{
                total += angka;
                System.out.println("Tambah: "+ angka + " -> Total: " + total);
            }
        }
        System.out.println("---");
        System.out.println("Total akhir: " + total);
    }
}
