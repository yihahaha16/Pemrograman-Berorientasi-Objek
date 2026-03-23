/*
NIM: D1041241004
Nama: Faliha Imtinan
JaggedArray
*/
package Pertemuan14.Latihan;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] jagged = {
            {10, 20},
            {30, 40, 50, 60},
            {70, 80, 90}
        };
        System.out.println("=== JAGGED ARRAY ===");
        for (int i=0; i<jagged.length; i++){
            System.out.print("Baris " + i + " (" + jagged[i].length + " elemen): ");
            for (int j=0; j<jagged[i].length; j++){
                System.out.print(jagged[i][j]+" ");
            }
            System.out.println("");
        }
    }
}