package praktikum6;

import java.util.Scanner;

public class IfBersarangNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== KONVERSI NILAI MATAKULIAH ===");
        System.out.print("Masukkan Nilai Akhir (0-100): ");
        int nilai = input.nextInt();

        if (nilai >= 85) {
            System.out.println("Grade: A");
        } else if (nilai >= 80) {
            System.out.println("Grade: A-");
        } else if (nilai >= 75) {
            System.out.println("Grade: B+");
        } else if (nilai >= 70) {
            System.out.println("Grade: B");
        } else if (nilai >= 65) {
            System.out.println("Grade: B-");
        } else if (nilai >= 60) {
            System.out.println("Grade: C+");
        } else if (nilai >= 55) {
            System.out.println("Grade: C");
        } else if (nilai >= 50) {
            System.out.println("Grade: C-");
        } else if (nilai >= 45) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }
    }
}
