/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan56.umurbarangantik;

/**
 *Nama  : Brigigta Julia Puspita Nai Goncalves
 *Kelas : PBO2
 *NIM   : 10117074
 *Deskripsi Program : program ini berisi program yang menampilkan umur suatu
 *                    barang antik
 */
public class PBO210117074Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama Barang Antik : "+radio.getName());
        radio.tampilUmur();
    }
    
}
