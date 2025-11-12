/*
 * Ad Soyad: [MUHAMMED ALİ YÜCESU]
 * Ogrenci No: [250541065]
 
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;
import java.lang.Math;

public class GeometrikHesaplayıcı {

    // kare alan
    public static double calculateSquareArea(double kenar) {
        return kenar * kenar;
    }

    // kare çevre
    public static double calculateSquarePerimeter(double kenar) {
        return 4 * kenar;
    }

    // dikdörtgen alan
    public static double calculateRectangleArea(double uzun_kenar, double kısa_kenar) {
        return uzun_kenar * kısa_kenar;
    }

    // dikdörtgen çevre
    public static double calculateRectanglePerimeter(double uzun_kenar, double kısa_kenar) {
        return 2 * (uzun_kenar + kısa_kenar);
    }

    // daire alan
    public static double calculateCircleArea(double yarıcap) {
        return Math.PI * yarıcap * yarıcap;
    }

    // daire çevre
    public static double calculateCircleCircumference(double yarıcap) {
        return 2 * Math.PI * yarıcap;
    }

    // Üçgenin alanı = (taban * yükseklik) / 2
    public static double calculateTriangleArea(double taban, double yükseklik) {
        return (taban * yükseklik) / 2;
    }

    // üçkenin çevresi
    public static double calculateTrianglePerimeter(double kenar1, double kenar2, double taban) {
        return kenar1 + kenar2 + taban;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====GEOMETRİK HESAPLAYICI====");

        // --- Kare Hesaplamaları ---
        System.out.print("\nKarenin kenar uzunluğunu giriniz ): ");
        double kenar = input.nextDouble();

        double kareAlan = calculateSquareArea(kenar);
        double kareCevre = calculateSquarePerimeter(kenar);

        // %2.f yerine %.2f kullanıldı
        System.out.printf("Kare Alanı : %.2f\n", kareAlan);
        System.out.printf("Kare Çevre : %.2f\n", kareCevre);

        // --- Dikdörtgen Hesaplamaları ---
        System.out.print("\nDikdörtgen Uzun Kenarını Giriniz : ");
        double uzunKenarDikdortgen = input.nextDouble();
        System.out.print("Dikdörtgen Kısa Kenarını Giriniz : ");
        double kisaKenarDikdortgen = input.nextDouble();

        double dikdörtgenAlan = calculateRectangleArea(uzunKenarDikdortgen, kisaKenarDikdortgen);
        double dikdörtgenCevre = calculateRectanglePerimeter(uzunKenarDikdortgen, kisaKenarDikdortgen);


        System.out.printf("Dikdörtgen Alanı : %.2f\n", dikdörtgenAlan);
        System.out.printf("Dikdörtgen Çevresi : %.2f\n", dikdörtgenCevre);


        System.out.print("\nDairenin Yarıçapını (r) Giriniz (ör: 3): ");
        double daireYarıcap = input.nextDouble();

        double daireAlan = calculateCircleArea(daireYarıcap);

        double daireCevre = calculateCircleCircumference(daireYarıcap) ;


        System.out.printf("Daire Alanı : %.2f\n", daireAlan);
        System.out.printf("Daire Çevresi : %.2f\n", daireCevre);


        System.out.print("\nÜçgenin Taban Uzunluğunu Giriniz (ör: 6): ") ;
        double taban = input.nextDouble();
        System.out.print("Üçgenin Yüksekliğini Giriniz (ör: 8): ");
        double yükseklik = input.nextDouble();

        System.out.print("Üçgenin 1. Kenarını Giriniz (ör: 7): ") ;
        double kenar1 = input.nextDouble();
        System.out.print("Üçgenin 2. Kenarını Giriniz (ör: 9): ");
        double kenar2 = input.nextDouble();



        double ücgenAlan = calculateTriangleArea(taban, yükseklik);
        double ücgenCevre = calculateTrianglePerimeter(kenar1, kenar2, taban);


        System.out.printf("Üçgenin Alanı : %.2f\n", ücgenAlan);
        System.out.printf("Üçgenin Çevresi : %.2f\n", ücgenCevre) ;

        input.close();
        System.out.println("\nHesaplama Tamamlandı");
    }
}
