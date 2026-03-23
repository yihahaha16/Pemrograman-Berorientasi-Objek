/*
NIM: D1041241004
Nama: Faliha Imtinan
StaticCounter
*/
package Pertemuan12.Latihan;

class Mahasiswa{
    static int jumlahMahasiswa = 0;
    String nama;

    Mahasiswa(String nama){
        this.nama = nama;
        System.out.println("Mahasiswa dibuat: " + this.nama);
        jumlahMahasiswa++;
    }
    
    static int getJumlah(int jumlahMahasiswa){
        return jumlahMahasiswa;
    }
}

public class StaticCounter {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi");
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi");
        Mahasiswa mahasiswa3 = new Mahasiswa("Citra");  
        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.jumlahMahasiswa);
    }
}