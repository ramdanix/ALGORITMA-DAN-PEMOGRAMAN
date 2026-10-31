import java.util.Scanner;

public class OperatorKalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka Pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan Angka Kedua   : ");
        double angka2 = input.nextDouble();

        double tambah = angka1 + angka2;
        double kurang = angka1 - angka2;
        double kali   = angka1 * angka2;
        double bagi   = angka1 / angka2;
        double sisa   = angka1 % angka2;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.printf("Hasil Penjumlahan : %.2f\n", tambah);
        System.out.printf("Hasil Pengurangan : %.2f\n", kurang);
        System.out.printf("Hasil Perkalian   : %.2f\n", kali);
        System.out.printf("Hasil Pembagian   : %.2f\n", bagi);
        System.out.printf("Sisa Bagi (Mod)   : %.2f\n", sisa);

        input.close();
    }
}