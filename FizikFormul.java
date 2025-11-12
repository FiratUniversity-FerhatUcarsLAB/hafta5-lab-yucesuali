/*
 * Ad Soyad: [MUHAMMED ALİ YÜCESU]
 * Ogrenci No: [250541065]

 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;                                                                          
import java.lang.Math;                                                                             
                                                                                                   
public class TemelFizikHesaplayıcı {                                                               
                                                                                                   
    final static double GRAVITY = 9.81;                                                             
    //HIZ                                                                                          
    public static double hiz(double yol , double zaman){                                            
        return yol / zaman;                                                                        
    }                                                                                              
    //İVME                                                                                         
    public static double ivme(double deltaV , double zaman) {                                       
        return deltaV / zaman;                                                                     
    }                                                                                              
    //KUVVET                                                                                       
    public static double kuvvet(double kutle , double ivme) {                                       
        return kutle * ivme;                                                                       
    }                                                                                              
    //İŞ                                                                                           
    public static double isYapılan(double kuvvet , double mesafe) {                                 
        return kuvvet * mesafe;                                                                    
    }                                                                                              
    //GÜÇ                                                                                          
    public static double guc(double isYapılan , double zaman) {                                     
        return isYapılan / zaman;                                                                  
    }                                                                                              
    //KİNETİK ENERJİ                                                                               
    public static double kinetikEnerji(double kutle , double hız){                                  
        return 0.5 * kutle * hız * hız;                                                            
    }                                                                                              
    //POTANSİYEL ENERJİ                                                                            
    public static double potansiyelEnerji(double kutle , double yukseklik){                         
        return kutle * yukseklik * GRAVITY;                                                        
    }                                                                                              
    //MOMENTUM                                                                                     
    public static double momentum(double kutle , double hız){                                       
        return kutle * hız;                                                                        
    }                                                                                              
                                                                                                   
    public static void main(String[] args) {                                                       
        Scanner input = new Scanner(System.in);                                                    
        System.out.print("Yol (m) :");                                                             
        double yol = input.nextDouble();                                                           
        System.out.print("Zaman (t) :");                                                           
        double zaman= input.nextDouble();                                                          
        double hiz= yol * zaman;                                                                   
                                                                                                   
        System.out.printf("Hız = %.2f\n", hiz);                                                    
                                                                                                   
        System.out.print("Hız Değişimi (∆v) :");                                                   
        double dv = input.nextDouble();                                                            
        double a  = ivme(dv,zaman);                                                                
                                                                                                   
        System.out.printf("İvme = %.2f\n", a);                                                     
                                                                                                   
        System.out.print("Kütle (kg) :");                                                          
        double kutle = input.nextDouble();                                                         
        double  baki= kuvvet(kutle,a);                                                             
                                                                                                   
        System.out.printf("Kuvvet = %.2f\n", baki);                                                
                                                                                                   
        System.out.print("Mesafe (m) :");                                                          
        double mesafe = input.nextDouble();                                                        
        double  is= isYapılan(baki, mesafe);                                                       
                                                                                                   
        System.out.printf("iş = %.2f\n", is);                                                      
                                                                                                   
        double ali=  is / zaman;                                                                   
        double guc = guc(ali, zaman);                                                              
        System.out.printf("guc = %.2f\n", ali);                                                    
                                                                                                   
        double kinetik = kinetikEnerji(kutle, hiz);                                                
        System.out.printf("kinetik = %.2f\n", kinetik);                                            
                                                                                                   
        System.out.print("Yükseklik (h) :");                                                       
        double yukseklik = input.nextDouble();                                                     
        double potansiyel = potansiyelEnerji(kutle,yukseklik);                                     
        System.out.printf("potansiyel = %.2f\n", potansiyel);                                      
                                                                                                   
        double momentum = momentum(kutle,hiz);                                                     
        System.out.printf("momentum = %.2f\n", momentum);                                          
                                                                                                   
                                                                                                   
         input.close();                                                                            
         System.out.println("\nHesaplama Tamamlandı");                                             
                                                                                                   
                                                                                                   
                                                                                                   
                                                                                                   
    }                                                                                              
}                                                                                                  
                                                                                                   
