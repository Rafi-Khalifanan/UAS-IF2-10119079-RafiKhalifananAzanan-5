package uas.if2.pkg10119079.rafikhalifananazanan.pkg5;

/**
 * NAMA : Rafi Khalifanan Azanan
 * NIM  : 10119079
 * Kelas : IF-2
 * Tanggal : 20-02-2021
 * No soal : 5
 */
public class ModelMahasiswa {
    public String nim,nama;
    public ModelMahasiswa(String nim,String nama)
    {
        this.nim = nim ;
        this.nama = nama;
    }
    
    public String getNim()
    {
        return nim;
    }
    
    public String getNama()
    {
        return nama;
    } 
}
