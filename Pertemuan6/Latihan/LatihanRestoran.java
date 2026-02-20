/*
NIM: D1041241004
Nama: Faliha Imtinan
LatihanRestoran
*/
package Pertemuan6.Latihan;

public class LatihanRestoran {
    public static void main(String[] args) {
        int menuCode = 1;
        int quantity = 2;
        int harga;
        String namaMenu;
        System.out.println("=== Menu Restoran ===");
        System.out.println("Kode Menu: "+ menuCode);
        System.out.println("Jumlah: "+ quantity);
        System.out.println("");
        System.out.println("Pesanan Anda:");
        
        switch(menuCode){
            case 1:
                namaMenu = "Nasi Goreng";
                harga = 15000;
                System.out.println("Nama Menu: "+namaMenu);
                System.out.println("Harga Satuan: Rp "+harga);
                System.out.println("Jumlah: "+ quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp "+(harga*quantity));
                break;
            case 2:
                namaMenu = "Mie Ayam";
                harga = 12000;
                System.out.println("Nama Menu: "+namaMenu);
                System.out.println("Harga Satuan: Rp "+harga);
                System.out.println("Jumlah: "+ quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp "+(harga*quantity));
                break;
            case 3:
                namaMenu = "Bakso";
                harga = 10000;
                System.out.println("Nama Menu: "+namaMenu);
                System.out.println("Harga Satuan: Rp "+harga);
                System.out.println("Jumlah: "+ quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp "+(harga*quantity));
                break;
            case 4:
                namaMenu = "Soto Ayam";
                harga = 13000;
                System.out.println("Nama Menu: "+namaMenu);
                System.out.println("Harga Satuan: Rp "+harga);
                System.out.println("Jumlah: "+ quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp "+(harga*quantity));
                break;
            case 5:
                namaMenu = "Es Teh";
                harga = 3000;
                System.out.println("Nama Menu: "+namaMenu);
                System.out.println("Harga Satuan: Rp "+harga);
                System.out.println("Jumlah: "+ quantity);
                System.out.println("---");
                System.out.println("Total Bayar: Rp "+(harga*quantity));
                break;
        }
    }
}