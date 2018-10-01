/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * Nama                 : Aditya Nur Iskandar
 * Kelas                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program yang berisi tentang mengetahui coding 
 * pernyataan perbandingan
 */
public class PBO210117070Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai1;
        int nilai2;
        String yes;
        String nilai;
        
        Scanner pt = new Scanner(System.in);
        System.out.println("======Program Perbandingan Nilai======");
        do {            
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = pt.nextInt();
        System.out.print("Masukkan nilai Kedua : ");
        nilai2 = pt.nextInt();
        System.out.print("Hasil : ");
        
        if(nilai1> nilai2){
            System.out.println(nilai1+" Lebih besar dari "+nilai2);
        }else if(nilai1 == nilai2){
            System.out.println(nilai1+" Sama Dengan "+nilai2);
            
        }else if(nilai1<nilai2){
            System.out.println(nilai1+" Lebih kecil dari "+nilai2);
            
        }
            System.out.println("");
            System.out.print("Ulangi aktivitas diatas? (Ya/Tidak) : ");
            nilai = pt.next();
            yes = nilai.toUpperCase();
        } while (yes.equals("YA"));
        
        
      
        
    }
    
}
