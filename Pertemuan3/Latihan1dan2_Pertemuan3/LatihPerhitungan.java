package Pertemuan3.Latihan1dan2_Pertemuan3;

public class LatihPerhitungan {
    public static void main(String[] args) {
        int SaldoAwal= 1000000;
        int Setoran = 500000;
        System.out.println("=== SIMULASI TRANSAKSI BANK ===");
        System.out.println("Saldo Awal            : "+SaldoAwal);
        System.out.println("Setoran               : "+Setoran);
        SaldoAwal += Setoran;
        System.out.println("Saldo Setelah Setor   : "+SaldoAwal);
        int Penarikan  = 250000;
        int SaldoAkhir = SaldoAwal - Penarikan;
        System.out.println("Penarikan             : " + Penarikan);
        System.out.println("Saldo Akhir           : " + SaldoAkhir);
    }
}
