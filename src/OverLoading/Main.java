/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverLoading;

/**
 *
 * @author Bintang.Ilham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("========= Mencari Luas Bangun Datar =========");
        
        //objek baru class 1
        class1 on = new class1();
        //method class lain(hitungLuas)
        on.hitungLuas(7);
        on.hitungLuas(10,8);
 
        System.out.println("");
        System.out.println("======== Mencari Volume Bangun Ruang ========");
       
        //objek baru class 2
        class2 off = new class2();
        //method class lain(hitungVolume)
        off.hitungVolume(7);
        off.hitungVolume(10,9,8);
   }
    
}
