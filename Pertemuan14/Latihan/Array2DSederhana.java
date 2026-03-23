/*
NIM: D1041241004
Nama: Faliha Imtinan
Array2DSederhana
*/
package Pertemuan14.Latihan;

public class Array2DSederhana {
    public static void main(String[] args) {
        System.out.println("=== TABEL 3x3 ===");
        int[][] data = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for (int i=0; i<data.length; i++){
            for (int j=0; j<data[i].length; j++){
                System.out.print(data[i][j]+"    ");
            }
            System.out.println("");
        }
    }
}