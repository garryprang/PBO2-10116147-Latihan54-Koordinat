/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan54.koordinat;

/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM      `: 10116147
 * Deskripsi : Program untuk menghitung koordinat warna.
 */
public class PBO210116147Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat koordinat = new WarnaKoordinat(10,4,"Jingga");
        
        System.out.println("Warna Koordinat: " + koordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x: " + koordinat.getX() + ", y: " + koordinat.getY());
    }
    
}
