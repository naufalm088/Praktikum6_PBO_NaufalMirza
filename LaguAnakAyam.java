/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
import java.util.Scanner;

public class LaguAnakAyam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah anak ayam dari user
        System.out.print("Masukkan jumlah anak ayam: ");
        int n = input.nextInt();

        // Iterasi menampilkan lagu anak ayam
        for (int i = n; i > 1; i--) {
            System.out.println("Anak ayam turun " + i);
            System.out.println("Mati satu tinggal " + (i - 1));
        }

        // Baris terakhir jika tinggal 1 anak ayam
        System.out.println("Anak ayam turun 1");
        System.out.println("Mati satu habis semuanya.");
    }
}

