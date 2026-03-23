/*
NIM: D1041241004
Nama: Faliha Imtinan
InnerClassSederhana
*/
package Pertemuan12.Latihan;

class Sekolah{
    String namaSekolah = "SMA Negeri 1";

    class Kelas{
        String namaKelas;
        Kelas (String kelas){
            namaKelas = kelas;
        }
        void info(){
            System.out.println("Sekolah: " + namaSekolah);
            System.out.println("Kelas: " + namaKelas);
        }
    }
}

public class InnerClassSederhana {
    public static void main(String[] args) {
        Sekolah sekolah = new Sekolah();
        Sekolah.Kelas kelas = sekolah.new Kelas("X-A");
        kelas.info();        
    }
}