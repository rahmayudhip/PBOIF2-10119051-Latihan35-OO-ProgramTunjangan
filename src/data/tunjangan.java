/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author RYP
 */
public class tunjangan {
    public String status;
    public int gajiPokok;
    
    public double hitungTunjangan(){
        if("Menikah".equals(status)){
            return 0.35 * gajiPokok;
        } else{
            return 0;
        }
    }
    public double hitungGaji(){
        return gajiPokok+hitungTunjangan();
    }
    
    public void tampilHasil(){
        System.out.println("======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok      : Rp. "+gajiPokok);
        System.out.println("Tunjangan       : Rp. "+hitungTunjangan());
        System.out.println("Total Gaji      : Rp. "+hitungGaji());
    }
}
