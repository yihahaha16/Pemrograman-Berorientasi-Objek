/*
NIM: D1041241004
Nama: Faliha Imtinan
LatihanRefleksi
*/
package Pertemuan7.Latihan;

public class LatihanRefleksi {
    public static void main(String[] args) {
        int angka = 1;
        System.out.println("=== MENGGUNAKAN WHILE ===");
        while(angka<=5){
            System.out.print(angka + " ");
            angka++;
        }
        System.out.println(" "); 
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");     
        angka = 1;
        do{
            System.out.print(angka + " ");
            angka++;
        }while(angka<=5);
        System.out.println(" "); 
        System.out.println("=== MENGGUNAKAN FOR ==="); 
        for(int i = 1;i<=5;i++){
            System.out.print(i + " ");
        }
    }
}
/*
Jenis loop yang paling mudah dipahami menurut saya adalah for loop, karena for loop lebih sering digunakan sebelumnya. 
Selain itu inisialisasi, kondisi, dan update pada for loop lebih terstruktur sehingga lebih mudah dipahami.
*/