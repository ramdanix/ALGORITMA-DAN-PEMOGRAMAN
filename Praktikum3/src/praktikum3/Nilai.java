/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author RAHMAT
 */
public class Nilai {
    public static void main(String[] args) {
 // Data Mahasiswa (String & Primitive)
        String nim = "26SA21A0000";
        String nama = "Gustin Setyaningsih";

        // Komponen Nilai
        double nilaiTugas = 85.5;
        double nilaiUTS = 78.0;
        double nilaiUAS = 82.0;

        // Perhitungan Nilai Akhir (Tugas 20%, UTS 30%, UAS 50%)
        double nilaiAkhir = (nilaiTugas * 0.20) + (nilaiUTS * 0.30) + (nilaiUAS * 0.50);

        // Penentuan Nilai Huruf & Status
        char nilaiHuruf = 'A';
        boolean isLulus = nilaiAkhir >= 60.0;

        // Output Display
        System.out.println("==========================================");
        System.out.println("\tINFORMASI HASIL BELAJAR");
        System.out.println("==========================================");
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("------------------------------------------");
        System.out.println("Nilai Akhir\t: " + nilaiAkhir);
        System.out.println("Nilai Huruf\t: " + nilaiHuruf);
        System.out.println("Status Lulus\t: " + isLulus);
        System.out.println("==========================================");
    }   
}
