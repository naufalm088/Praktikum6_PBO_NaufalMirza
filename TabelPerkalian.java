/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Naufal Mirza Aldilla
 */
import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n (max 10): ");
        int n = input.nextInt();

        if (n > 10 || n < 1) {
            System.out.println("Masukkan nilai antara 1 dan 10.");
            return;
        }

        System.out.println("Tabel Perkalian " + n + " x " + n + ":");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}

