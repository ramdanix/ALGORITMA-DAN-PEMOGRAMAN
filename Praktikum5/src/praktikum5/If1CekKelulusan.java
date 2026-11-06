/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author RAHMAT
 */

import java.util.Scanner;

public class If1CekKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Ujian (0-100): ");
        int nilai = input.nextInt();

        if (nilai >= 70) {
            System.out.println("Selamat, Anda dinyatakan LULUS!");
        }
    }
}
