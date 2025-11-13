/*
 * Ad Soyad: [MUHAMMED ALİ YÜCESU]
 * Ogrenci No: [250541065]
 * Tarih: [TARIHI BURAYA YAZIN]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesap {
    // Sabitler
    //kdv oranı
    final static double VAT_RATE = 0.18;
    //kargo ücreti
    final static double SHIPPING_FEE = 29.99;

    public static double calculateLineTotal(double fiyat , int adet) {
        return fiyat * adet;
    }

    public static double calculateSubtotal(double urun1 , double urun2 , double urun3) {
        return urun1 + urun2 + urun3;
    }

    public static double calculateDiscountAmount(double araToplam , double indirimYuzdesi) {
        return araToplam * (indirimYuzdesi) / 100;
    }

    public static double applyDiscount(double araToplam , double indirimTutari) {
        return araToplam - indirimTutari;
    }

    public static double calculateVAT(double indirimliToplam) {
        return indirimliToplam * VAT_RATE;
    }

    public static double calculateGrandTotal(double indirimliToplam , double kdvTutari , double SHIPPING_FEE) {
        return indirimliToplam + kdvTutari + SHIPPING_FEE;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== E-TİCARET SEPET HESAPLAYICI ===");
        System.out.println("\nLütfen 3 ürünün bilgilerini girin:");

        System.out.println("\nURUN 1:");
        System.out.print(" Birim Fiyatı: ");
        double fiyat1 = input.nextDouble();
        System.out.print(" Adet: ");
        int adet1 = input.nextInt();

        System.out.println("\nURUN 2:");
        System.out.print(" Birim Fiyatı: ");
        double fiyat2 = input.nextDouble();
        System.out.print(" Adet: ");
        int adet2 = input.nextInt();

        System.out.println("\nURUN 3:");
        System.out.print(" Birim Fiyatı: ");
        double fiyat3 = input.nextDouble();
        System.out.print(" Adet: ");
        int adet3 = input.nextInt();

        System.out.print("\nİndirim oranı (%): ");
        double indirimYuzdesi = input.nextDouble();

        double toplam1 = calculateLineTotal(fiyat1, adet1);
        double toplam2 = calculateLineTotal(fiyat2, adet2);
        double toplam3 = calculateLineTotal(fiyat3, adet3);

        double araToplam = calculateSubtotal(toplam1, toplam2 ,toplam3);
        double indirimTutari = calculateDiscountAmount(araToplam, indirimYuzdesi);
        double indirimliToplam = applyDiscount(araToplam, indirimTutari);
        double kdvTutari = calculateVAT(indirimliToplam);
        double genelToplam = calculateGrandTotal(indirimliToplam, kdvTutari, SHIPPING_FEE);

        System.out.printf("\nAra Toplam: %.2f TL%n", araToplam);
        System.out.printf("İndirim Tutarı: %.2f TL%n", indirimTutari);
        System.out.printf("İndirimli Toplam: %.2f TL%n", indirimliToplam);
        System.out.printf("KDV Tutarı: %.2f TL%n", kdvTutari);
        System.out.printf("Kargo Ücreti: %.2f TL%n", SHIPPING_FEE);
        System.out.printf("Genel Toplam: %.2f TL%n", genelToplam);

        input.close();
    }
}

