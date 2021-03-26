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
public class honda extends toyota {
    
    //mengubah atau meng override method pada super class
    
 @Override
 public void spek(){
        System.out.println("Nama        : "+ nama);
        System.out.println("Warna       : "+ warna);
        System.out.println("Harga       : "+"Rp."+ harga);
        
    }
}
    

