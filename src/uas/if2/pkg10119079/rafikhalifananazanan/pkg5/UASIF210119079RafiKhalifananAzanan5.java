package uas.if2.pkg10119079.rafikhalifananazanan.pkg5;

/**
 * NAMA : Rafi Khalifanan Azanan
 * NIM  : 10119079
 * Kelas : IF-2
 * Tanggal : 20-02-2021
 * No soal : 5
 */
public class UASIF210119079RafiKhalifananAzanan5 {
    public static void main(String[] args) {
        
        ModelMahasiswa mahasiswa = new ModelMahasiswa(
                                                      "10110269",
                                                      "Rizki Adam Kurniawan"
                                                      );
        
        System.out.println("Nim Mahasiswa  : " + mahasiswa.getNim());
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNama());
    }    
}