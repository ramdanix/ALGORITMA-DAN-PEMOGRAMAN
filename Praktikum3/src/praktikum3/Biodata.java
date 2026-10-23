/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author RAHMAT
 */
public class Biodata {
    public static void main(String[] args) {
        // 1. KONSTANTA (final)
        final String KAMPUS = "Universitas Amikom Purwokerto";
        final String KODE_PRODI = "SI-01";

        // 2. TIPE DATA REFERENSI (String)
        String nama = "Gustin";
        String nidn = "0623089102";
        String prodi = "Sistem Informasi";
        String matakuliah = "Algoritma dan Pemrograman";

        // 3. TIPE DATA PRIMITIF
        int kuotaKelas = 40; // int (jumlah mahasiswa/kapasitas)
        double jamSKS = 3.0; // double (bobot SKS / jam)
        char akreditasiProdi = 'U'; // char (akreditasi)
        boolean isRuanganTersedia = true; // boolean (status ketersediaan Lab)

        // 4. TAMPILAN OUTPUT
        System.out.println("==========================================");
        System.out.println("INFORMASI KELAS " + KAMPUS);
        System.out.println("==========================================");
        System.out.println("Dosen Pengampu\t: " + nama);
        System.out.println("NIDN\t\t: " + nidn);
        System.out.println("Program Studi\t: " + prodi + " (" + KODE_PRODI + ")");
        System.out.println("Akreditasi Prodi: " + akreditasiProdi);
        System.out.println("------------------------------------------");
        System.out.println("Mata Kuliah\t: " + matakuliah);
        System.out.println("Bobot SKS\t: " + jamSKS + " SKS");
        System.out.println("Kapasitas Lab\t: " + kuotaKelas + " Kursi");
        System.out.println("Status Lab\t: " + (isRuanganTersedia ? "Tersedia" : "Penuh"));
        System.out.println("==========================================");
    }
}
