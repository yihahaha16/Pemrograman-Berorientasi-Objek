/*
NIM: D1041241004
Nama: Faliha Imtinan
LatihanProduk
*/
package Pertemuan4.Latihan;

public class LatihanProduk {
    public static final double PAJAK = 0.11;
    public static void main(String[] args) {
        String namaProduk = "Laptop Asus";
        String mataUang = "Rp ";
        int hargaSatuan = 7000000;
        int jumlahStok = 15;
        boolean statusTersedia = true;
        int totalNilaiStok = hargaSatuan * jumlahStok;
        //agar output dalam hasil hitungPajak menjadi integer
        int hitungPajak = (int)(totalNilaiStok * PAJAK);
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Satuan: " + mataUang + hargaSatuan);
        System.out.println("Jumlah Stok: " + jumlahStok);
        System.out.println("Status Tersedia: " + statusTersedia);
        System.out.println("---");
        System.out.println("Total Nilai Stok: " + mataUang + totalNilaiStok);
        System.out.println("Pajak (11%): " + mataUang + hitungPajak);
    }
}
