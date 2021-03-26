/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverRiding;

/**
 *
 * @author Bintang.Ilham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //membuat parent class / super class yang diisi dengan sifat-sifat dasar objek
 
        System.out.println("==== Merek-merek Mobil ====");
        System.out.println("");
        
        //membuat objek baru
        toyota objek = new toyota();
        honda objek1 = new honda();
        //mengisi data toyota
        objek.nama = "Avanza";
        objek.warna = "Putih";
        objek.harga = 100000000;
        //mengisi data honda
        objek1.nama = "Honda Jazz";
        objek1.warna = "Hitam";
        objek1.harga = 90000000;
        
        //mencetak seluruh hasil method panggilan
        System.out.println(">>>> Toyota <<<<");
        objek.spek();
        System.out.println();
        System.out.println(">>>> Honda <<<<");
        objek1.spek();
 
    }
    
}