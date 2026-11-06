/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;
    import java.util.Scanner;
/**
 *
 * @author RAHMAT
 */
public class IfElseCekKelulusan {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Ujian (0-100): ");
        int nilai = input.nextInt();

        if (nilai >= 70) {
            System.out.println("Selamat, Anda dinyatakan LULUS!");
        } else {
            System.out.println("Maaf, Anda dinyatakan TIDAK LULUS.");
            System.out.println("Silakan ikuti ujian remedial.");
        }
    }

}
