/*
NIM: D1041241004
Nama: Faliha Imtinan
MethodVarArgs
*/
package Pertemuan15.Latihan;

public class MethodVarArgs {
    static double hitungRataRata(int... nilai){
        if(nilai.length==0)
            return 0;

        int total = 0;
        for (int n:nilai){
            total +=n; 
        }

        return (double)total/nilai.length;
    }
    public static void main(String[] args) {
        double avg1 = hitungRataRata(75,80,85);
        System.out.println("Rata-rata (3 nilai): " + avg1);
        double avg2 = hitungRataRata(80, 84, 86, 88, 92);
        System.out.println("Rata-rata (5 nilai): " + avg2);
    }
}