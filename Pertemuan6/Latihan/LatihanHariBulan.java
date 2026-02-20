/*
NIM: D1041241004
Nama: Faliha Imtinan
LatihanHariBulan
*/
package Pertemuan6.Latihan;

public class LatihanHariBulan {
    public static void main(String[] args) {
        int month=4;
        String bulan;
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");

        switch (month){
            case 1:
                bulan = "Januari";
                System.out.println("Bulan: " + bulan + " (bulan ke-"+month+")");
                break;
            case 3:
                bulan = "Maret";
                System.out.println("Bulan: " + bulan + " (bulan ke-"+month+")");
                break;
            case 5:
                bulan = "Mei";
                System.out.println("Bulan: " + bulan + " (bulan ke-"+month+")");
                break;
            case 7:
                bulan = "Juli";
                System.out.println("Bulan: " + bulan + " (bulan ke-"+month+")");
                break;
            case 8:
                bulan = "Agustus";
                System.out.println("Bulan: " + bulan + " (bulan ke-"+month+")");
                break;
            case 10:
                bulan = "Oktober";
                System.out.println("Bulan: " + bulan + " (bulan ke-"+month+")");
                break;
            case 12:
                bulan = "Desember";
                System.out.println("Bulan: " + bulan + " (bulan ke-"+month+")");
                break;
            case 4:
                bulan = "April";
                System.out.println("Bulan: " + bulan + " (bulan ke-"+month+")");
                break;
            case 6:
                bulan = "Juni";
                System.out.println("Bulan: " + bulan + " (bulan ke-"+month+")");
                break;
            case 9:
                bulan = "September";
                System.out.println("Bulan: " + bulan + " (bulan ke-"+month+")");
                break;
            case 11:
                bulan = "November";
                System.out.println("Bulan: " + bulan + " (bulan ke-"+month+")");
                break;
            case 2:
                bulan = "Februari";
                System.out.println("Bulan: " + bulan + " (bulan ke-"+month+")");
                break;  
        }
        
        switch (month){
            case 1:        
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Jumlah hari: " + 31 + " hari");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Jumlah hari: " + 30 + " hari");
                break;
            case 2:
                System.out.println("Jumlah hari: " + 31 + " hari");
                break;
        }
    }
}
