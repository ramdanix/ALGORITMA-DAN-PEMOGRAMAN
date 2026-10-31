/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author RAHMAT
 */
public class TipeDataVariabel {
    public static void main(String[] args) {
        // 1. DEKLARASI KONSTANTA (final)
        final String NAMA_TOKO = "Toko Alat Tulis Amikom";
        final double PERSEN_PAJAK = 0.11; // Konstanta Pajak 11%

        // 2. TIPE DATA PRIMITIF & REFERENSI
        // Tipe Data Referensi (String)
        String kodeBarang = "BRG-001";
        String namaBarang = "Buku Tulis A5";

        // Tipe Data Primitif
        int jumlahBeli = 5; // Integer (bilangan bulat)
        double hargaSatuan = 12500.0; // Double (bilangan desimal)
        char kualitasiBarang = 'A'; // Char (karakter tunggal)
        boolean statusDiskon = true; // Boolean (logika true/false)

        // 3. PEMROSESAN DATA / PERHITUNGAN
        double totalHarga = jumlahBeli * hargaSatuan;
        double nilaiPajak = totalHarga * PERSEN_PAJAK;
        double totalBayar = totalHarga + nilaiPajak;

        // 4. OUTPUT / TAMPILAN PROGRAM
        System.out.println("==========================================");
        System.out.println("\t" + NAMA_TOKO);
        System.out.println("==========================================");
        System.out.println("Kode Barang\t: " + kodeBarang);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Kualitas\t: " + kualitasiBarang);
        System.out.println("Dapat Diskon\t: " + statusDiskon);
        System.out.println("------------------------------------------");
        System.out.println("Harga Satuan\t: Rp " + hargaSatuan);
        System.out.println("Jumlah Beli\t: " + jumlahBeli + " pcs");
        System.out.println("Subtotal\t: Rp " + totalHarga);
        System.out.println("Pajak (11%)\t: Rp " + nilaiPajak);
        System.out.println("------------------------------------------");
        System.out.println("TOTAL BAYAR\t: Rp " + totalBayar);
        System.out.println("==========================================");
    }
}
