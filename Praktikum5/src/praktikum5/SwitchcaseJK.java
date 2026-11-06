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

public class SwitchcaseJK {
    public static void main(String[] args) {
        String JK;
        System.out.print("Jenis Kelamin (L/P) = ");
        Scanner inJK = new Scanner(System.in);
        JK = inJK.next();

        switch (JK) {
            case "L":
                System.out.println("\nJenis Kelamin Anda Laki-Laki\n");
                break;
            case "P":
                System.out.println("\nJenis Kelamin Anda Perempuan\n");
                break;
            default:
                System.out.println("\nJenis Kelamin Tidak Dikenali\n");
                break;
        }
    }
}