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
public class class2 {
    //method hitungvolume
    public void hitungVolume(double jarijari){
        System.out.println("Volume Bola adakah : "+(jarijari*jarijari*jarijari*22/7*4/3)); 
    }
    //method hitungvolume yang sama
    public void hitungVolume(int panjang, int lebar, int tinggi){
        System.out.println("Volume Persegi Panjang adalah : "+(panjang*lebar*tinggi));
    }
}
    


 