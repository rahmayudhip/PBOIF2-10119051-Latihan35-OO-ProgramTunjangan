/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan35.oo.programtunjangan;
import data.tunjangan;
import java.util.Scanner;
/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program tunjangan
 */
public class PBOIF210119051Latihan35OOProgramTunjangan {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        tunjangan tunj = new tunjangan();
        System.out.println("===========Program Tunjangan=========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp.");
        tunj.gajiPokok = input.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        tunj.status = input.next();
        
        tunj.tampilHasil();
    }
    
}
