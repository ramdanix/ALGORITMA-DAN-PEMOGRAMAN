package praktikum6;

import java.util.Scanner;

public class IfBersarangKredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== SISTEM PENGAJUAN KREDIT LAPTOP ===");
        System.out.print("Apakah Anda memiliki pekerjaan tetap? (true/false): ");
        boolean punyaPekerjaan = input.nextBoolean();
        System.out.print("Masukkan Penghasilan Bulanan (Rp): ");
        double penghasilan = input.nextDouble();

        System.out.println("\n=== HASIL EVALUASI KREDIT ===");
        if (punyaPekerjaan) {
            // Nested IF: Diperiksa jika sudah punya pekerjaan tetap
            if (penghasilan >= 4000000) {
                System.out.println("Status: DISETUJUI (Kredit Laptop Dapat Diproses)");
            } else {
                System.out.println("Status: DITOLAK (Penghasilan Minimal Rp 4.000.000/bulan)");
            }
        } else {
            System.out.println("Status: DITOLAK (Wajib Memiliki Pekerjaan Tetap)");
        }
    }
}
