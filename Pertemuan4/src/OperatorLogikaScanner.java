import java.util.Scanner;

public class OperatorLogikaScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Masukkan Nilai Ujian (0-100)\t\t: ");
        int nilaiUjian = input.nextInt();

        System.out.print("Masukkan Persentase Kehadiran (%)\t: ");
        int persentaseKehadiran = input.nextInt();

        System.out.print("Status Registrasi Ulang (true/false) : ");
        boolean statusRegistrasi = input.nextBoolean();

        System.out.println("\n=== DEMO OPERATOR LOGIKA ===");
        System.out.println("Nilai Ujian\t\t: " + nilaiUjian);
        System.out.println("Kehadiran (%)\t\t: " + persentaseKehadiran);
        System.out.println("Status Registrasi\t: " + statusRegistrasi + "\n");

        // 1. Operator AND (&&)
        boolean isLulus = (nilaiUjian >= 70) && (persentaseKehadiran >= 75);
        System.out.println("1. Lulus Mata Kuliah (AND)\t: " + isLulus);

        // 2. Operator OR (||)
        boolean isRemedial = (nilaiUjian < 70) || (persentaseKehadiran < 75);
        System.out.println("2. Perlu Remedial (OR)\t\t: " + isRemedial);

        // 3. Operator NOT (!)
        boolean isTidakRegistrasi = !statusRegistrasi;
        System.out.println("3. Tidak Registrasi (NOT)\t: " + isTidakRegistrasi);
    }
}