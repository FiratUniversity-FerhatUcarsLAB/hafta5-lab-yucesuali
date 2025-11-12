[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/RaOsJaQH)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=21606690&assignment_repo_type=AssignmentRepo)
# Java Programlama Laboratuvarı - Metotlar ve Matematiksel Hesaplamalar

## 📚 Ders Bilgileri

**Ders:** Algoritma ve Programlama I  
**Konu:** Metot Tanımlama, Return, Matematiksel Formüller  
**Teslim Tarihi:** `13 Kasım Perşembe Gecesi`

## 🎯 Görev Amaçları

Bu görevlerde öğrenecekleriniz:

  * Metot tanımlama ve çağırma
  * `return` ifadesi kullanma
  * Parametreli metotlar yazma
  * Matematiksel formüller uygulama
  * Modüler kod yazma

## ⚠️ KULLANILACAK KAVRAMLAR

**SADECE BUNLAR:**

  * ✅ Metotlar (return ile)
  * ✅ Değişkenler ve veri tipleri
  * ✅ Matematiksel işlemler (+, -, \*, /, %)
  * ✅ `Math` sınıfı (`Math.pow`, `Math.sqrt`, `Math.PI`)
  * ✅ `Scanner` ile girdi alma
  * ✅ `printf` ile çıktı

**KULLANILMAYACAK:**

  * ❌ `if-else` (henüz görmedik)
  * ❌ Döngüler (henüz görmedik)
  * ❌ Diziler (henüz görmedik)

## 📝 Görevler

-----

### Görev 1: Geometrik Şekil Hesaplayıcı (Basit - 30 puan)

**Dosya:** `GeometriHesap.java`

Temel geometrik şekillerin alan ve çevre hesaplamalarını yapan program.

#### 📖 Problem Tanımı

Kullanıcıdan ölçüleri alıp, çeşitli şekillerin alan ve çevrelerini hesaplayın.

**Hesaplanacak Şekiller:**

1.  **Kare:** kenar uzunluğu
2.  **Dikdörtgen:** kısa kenar, uzun kenar
3.  **Daire:** yarıçap
4.  **Üçgen:** taban, yükseklik (alan için), 3 kenar (çevre için)

#### 🎯 Zorunlu Metotlar

```java
// 1. Kare alanı
public static double calculateSquareArea(double side)

// 2. Kare çevresi
public static double calculateSquarePerimeter(double side)

// 3. Dikdörtgen alanı
public static double calculateRectangleArea(double width, double height)

// 4. Dikdörtgen çevresi
public static double calculateRectanglePerimeter(double width, double height)

// 5. Daire alanı
public static double calculateCircleArea(double radius)

// 6. Daire çevresi
public static double calculateCircleCircumference(double radius)

// 7. Üçgen alanı (taban ve yükseklik ile)
public static double calculateTriangleArea(double base, double height)

// 8. Üçgen çevresi
public static double calculateTrianglePerimeter(double a, double b, double c)
```

#### 💡 Formüller

**Kare:**

  * Alan = kenar × kenar
  * Çevre = 4 × kenar

**Dikdörtgen:**

  * Alan = genişlik × yükseklik
  * Çevre = 2 × (genişlik + yükseklik)

**Daire:**

  * Alan = π × r²
  * Çevre = 2 × π × r
  * PI = 3.14159 veya `Math.PI`

**Üçgen:**

  * Alan = (taban × yükseklik) / 2
  * Çevre = a + b + c

#### 📋 Örnek Çalışma

```
=== GEOMETRIK SEKIL HESAPLAYICI ===

KARE:
Kenar uzunlugu (cm): 5

DIKDORTGEN:
Kisa kenar (cm): 3
Uzun kenar (cm): 7

DAIRE:
Yaricap (cm): 4

UCGEN:
Taban (cm): 6
Yukseklik (cm): 8
1. kenar (cm): 6
2. kenar (cm): 8
3. kenar (cm): 10

========================================
        HESAPLAMA SONUCLARI
========================================

KARE (kenar: 5.0 cm):
  Alan      : 25.00 cm²
  Cevre     : 20.00 cm

DIKDORTGEN (3.0 x 7.0 cm):
  Alan      : 21.00 cm²
  Cevre     : 20.00 cm

DAIRE (yaricap: 4.0 cm):
  Alan      : 50.27 cm²
  Cevre     : 25.13 cm

UCGEN (taban: 6.0, yukseklik: 8.0 cm):
  Alan      : 24.00 cm²
  Cevre     : 24.00 cm

========================================
```

#### 🎯 Değerlendirme (30 puan)

  * 8 metot doğru tanımlanmış ve çalışıyor: 20 puan
  * Hesaplamalar doğru: 5 puan
  * Çıktı formatı düzenli (`printf`): 5 puan

-----

### Görev 2: Fizik Formül Asistanı (Orta - 35 puan)

**Dosya:** `FizikFormul.java`

Temel fizik formüllerini uygulayan hesaplama programı.

#### 📖 Problem Tanımı

Kullanıcıdan fiziksel büyüklükleri alıp, çeşitli hesaplamalar yapın.

**Hesaplanacaklar:**

1.  **Hız:** Mesafe ve zaman verildiğinde hız
2.  **İvme:** Hız değişimi ve zaman verildiğinde ivme
3.  **Kuvvet:** Kütle ve ivme verildiğinde kuvvet (F = m × a)
4.  **İş:** Kuvvet ve mesafe verildiğinde iş (W = F × d)
5.  **Güç:** İş ve zaman verildiğinde güç (P = W / t)
6.  **Kinetik Enerji:** Kütle ve hız verildiğinde (KE = 0.5 × m × v²)
7.  **Potansiyel Enerji:** Kütle, yerçekimi ve yükseklik (PE = m × g × h)
8.  **Momentum:** Kütle ve hız (p = m × v)

#### 🎯 Zorunlu Metotlar

```java
// 1. Hız hesapla (v = s / t)
public static double calculateVelocity(double distance, double time)

// 2. İvme hesapla (a = Δv / t)
public static double calculateAcceleration(double velocityChange, double time)

// 3. Kuvvet hesapla (F = m * a)
public static double calculateForce(double mass, double acceleration)

// 4. İş hesapla (W = F * d)
public static double calculateWork(double force, double distance)

// 5. Güç hesapla (P = W / t)
public static double calculatePower(double work, double time)

// 6. Kinetik enerji (KE = 0.5 * m * v²)
public static double calculateKineticEnergy(double mass, double velocity)

// 7. Potansiyel enerji (PE = m * g * h)
public static double calculatePotentialEnergy(double mass, double gravity, 
                                              double height)

// 8. Momentum (p = m * v)
public static double calculateMomentum(double mass, double velocity)
```

#### 💡 Formüller ve Sabitler

```java
final double GRAVITY = 9.8;  // m/s² (Yerçekimi ivmesi)
```

**Temel Formüller:**

  * Hız: v = s / t (m/s)
  * İvme: a = Δv / t (m/s²)
  * Kuvvet: F = m × a (Newton)
  * İş: W = F × d (Joule)
  * Güç: P = W / t (Watt)
  * Kinetik Enerji: KE = ½ × m × v² (Joule)
  * Potansiyel Enerji: PE = m × g × h (Joule)
  * Momentum: p = m × v (kg⋅m/s)

#### 📋 Örnek Çalışma

```
=== FIZIK FORMUL ASISTANI ===

TEMEL OLCUMLER:
Kutle (kg): 10
Mesafe (m): 100
Zaman (s): 5
Hiz degisimi (m/s): 20
Yukseklik (m): 15

========================================
        HESAPLAMA SONUCLARI
========================================

HIZ ve HAREKET:
  Hiz (v = s/t)             : 20.00 m/s
  Ivme (a = Δv/t)           : 4.00 m/s²

KUVVET ve IS:
  Kuvvet (F = m*a)          : 40.00 N
  Is (W = F*d)              : 4000.00 J
  Guc (P = W/t)             : 800.00 W

ENERJI:
  Kinetik Enerji (KE)       : 2000.00 J
  Potansiyel Enerji (PE)    : 1470.00 J
  Toplam Enerji             : 3470.00 J

MOMENTUM:
  Momentum (p = m*v)        : 200.00 kg·m/s

========================================
```

#### 🎯 Değerlendirme (35 puan)

  * 8 metot doğru tanımlanmış: 20 puan
  * Hesaplamalar ve formüller doğru: 10 puan
  * Çıktı formatı ve birimler: 5 puan

-----

### Görev 3: E-Ticaret Sepet Hesaplayıcı (Zor - 35 puan)

**Dosya:** `SepetHesap.java`

Basit bir e-ticaret sepetinin toplam tutarını hesaplayan program.

#### 📖 Problem Tanımı

Kullanıcıdan **sabit olarak 3 farklı ürünün** fiyat ve adet bilgilerini alın. Bu ürünlere ait ara toplam, KDV, indirim ve kargo ücretini hesaplayarak genel toplamı bulun.

**Hesaplanacaklar:**

1.  **Ürün Satır Toplamı:** Bir ürünün (fiyat × adet) tutarı.
2.  **Ara Toplam:** Sepetteki tüm ürünlerin (3 ürün) toplam tutarı.
3.  **İndirim Tutarı:** Ara toplama uygulanan yüzdesel indirim miktarı.
4.  **İndirimli Toplam:** Ara toplamdan indirimin düşülmüş hali.
5.  **KDV Tutarı:** İndirimli toplam üzerinden hesaplanan KDV miktarı.
6.  **Genel Toplam:** İndirimli toplam + KDV + Kargo Ücreti.

#### 🎯 Zorunlu Metotlar

```java
// 1. Bir urunun toplam fiyatini hesaplar (fiyat * adet)
public static double calculateLineTotal(double price, int quantity)

// 2. Sepetteki 3 urunun ara toplamini hesaplar
public static double calculateSubtotal(double line1, double line2, double line3)

// 3. Indirim tutarini hesaplar (araToplam * (indirimYuzdesi / 100))
public static double calculateDiscountAmount(double subtotal, double discountPercentage)

// 4. Indirimli fiyati hesaplar (araToplam - indirimTutari)
public static double applyDiscount(double subtotal, double discountAmount)

// 5. KDV tutarini hesaplar (indirimliTutar * kdvOrani)
public static double calculateVAT(double discountedTotal, double vatRate)

// 6. Genel toplami hesaplar (indirimliTutar + kdv + kargo)
public static double calculateGrandTotal(double discountedTotal, double vatAmount, 
                                       double shippingFee)
```

#### 💡 Formüller ve Sabitler

```java
final double VAT_RATE = 0.18;      // KDV Oranı (%18)
final double SHIPPING_FEE = 29.99; // Sabit kargo ücreti (TL)
```

**Formüller:**

  * Satır Toplamı = Fiyat × Adet
  * Ara Toplam = SatırTop\_1 + SatırTop\_2 + SatırTop\_3
  * İndirim Tutarı = Ara Toplam × (İndirim Yüzdesi / 100)
  * İndirimli Toplam = Ara Toplam - İndirim Tutarı
  * KDV Tutarı = İndirimli Toplam × `VAT_RATE`
  * Genel Toplam = İndirimli Toplam + KDV Tutarı + `SHIPPING_FEE`

#### 📋 Örnek Çalışma

```
=== E-TICARET SEPET HESAPLAYICI ===

Lutfen 3 urunun bilgilerini girin:

URUN 1:
  Birim Fiyat (TL): 100
  Adet: 2

URUN 2:
  Birim Fiyat (TL): 50
  Adet: 1

URUN 3:
  Birim Fiyat (TL): 200
  Adet: 1

Indirim Kuponu Yuzdesi (%): 10

========================================
           SIPARIS OZETI
========================================

Urun 1 Toplam (100.00 TL x 2): 200.00 TL
Urun 2 Toplam (50.00 TL x 1) : 50.00 TL
Urun 3 Toplam (200.00 TL x 1): 200.00 TL
----------------------------------------
Ara Toplam                   : 450.00 TL

Indirim Tutari (%10)         : -45.00 TL
Indirimli Toplam             : 405.00 TL

KDV Tutari (%18)             : +72.90 TL
Kargo Ucreti                 : +29.99 TL
----------------------------------------
GENEL TOPLAM                 : 507.89 TL
========================================
```

#### 🎯 Değerlendirme (35 puan)

  * 6 metot doğru tanımlanmış ve çalışıyor: 20 puan
  * Hesaplamalar (KDV, indirim, toplam) doğru: 10 puan
  * Çıktı formatı düzenli ve açıklayıcı: 5 puan

-----

## 📋 Genel Kurallar

### ✅ Zorunlu Gereksinimler

1.  **Kimlik Bilgileri (Toplam 10 puan):** Her `.java` dosyasının başına yorum bloğu olarak eklenmelidir.

    ```java
    /*
     * Ad Soyad: [ADINIZ SOYADINIZ]
     * Ogrenci No: [NUMARA]
     * Tarih: [TARIH]
     * Aciklama: [GOREV]
     */
    ```

2.  **Metot Kullanımı (Toplam 60 puan):**

      * İstenen tüm metotlar `public static` olarak tanımlanmalı.
      * Her metot `return` anahtar kelimesi ile bir değer döndürmeli.
      * `main` metodu içerisinde sadece girdi alma (`Scanner`), metot çağırma ve çıktı (`printf`) işlemleri olmalı. **Hesaplamalar `main` içinde yapılmamalıdır.**

3.  **Kod Kalitesi (Toplam 20 puan):**

      * Anlamlı değişken isimleri (örn: `calculateArea` yerine `alanHesapla`).
      * `final` sabitler (PI, GRAVITY, KDV\_ORANI, KARGO\_UCRETI).
      * Gerekli yerlerde kısa açıklamalar (yorum satırları).
      * Düzenli girintileme (indentation).

4.  **Çıktı (Toplam 10 puan):**

      * Çıktılar `System.out.printf()` ile formatlanmalı.
      * Parasal ve ondalıklı değerler 2 basamak olarak gösterilmeli (örn: `%.2f`).
      * Çıktılarda birimler (cm, m/s, TL) belirtilmeli.

## 🎓 Değerlendirme Özeti

| Kriter | Görev 1 (30p) | Görev 2 (35p) | Görev 3 (35p) | Toplam (100p) |
|:---|:---:|:---:|:---:|:---:|
| Kimlik Bilgileri | 3 | 3 | 4 | 10 |
| Metot Tanımlama | 20 | 20 | 20 | 60 |
| Hesaplama Doğruluğu | 5 | 10 | 10 | 25 |
| Çıktı Formatı | 2 | 2 | 1 | 5 |
| **GÖREV TOPLAMI** | **30** | **35** | **35** | **100** |

## 📤 Teslim

```bash
git add .
git commit -m "Odev 2 - Metotlar tamamlandi"
git push origin main
```

## ⏰ Tahmini Süre

  * Görev 1: 1-2 saat
  * Görev 2: 2-3 saat
  * Görev 3: 2-3 saat
  * **Toplam: 5-8 saat**

## 🆘 Yardım

**Office Hours:** `[BELIRTIN]`  
**E-posta:** `[BELIRTIN]`

**Faydalı:**

  * `Math.pow(taban, us)`
  * `Math.sqrt(sayi)`
  * `Math.PI`
  * `printf("%.2f", sayi)`

## 🎯 Başarılar\!

Bu ödev, metot kullanarak problemleri küçük, yönetilebilir parçalara ayırma becerinizi geliştirmek için tasarlanmıştır.

-----

*Doç. Dr. Ferhat Uçar - Algoritma ve Programlama I*
