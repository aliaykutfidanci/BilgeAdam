package methodOrnek;

import java.util.Scanner;

public class DortIslem2App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secenek, sayi1, sayi2;
        double sonuc;
        boolean devamEdilsinMi = false;

        do {
            System.out.println("Hoşgeldiniz...");
            System.out.println("Hangi işlemi yapmak istiyorsunuz?");
            System.out.println("1.Toplama İşlemi");
            System.out.println("2.Çıkarma İşlemi");
            System.out.println("3.Çarpma İşlemi");
            System.out.println("4.Bölme İşlemi");
            System.out.println("0.Çıkış");
            System.out.print("Seçiniz: ");
            secenek = input.nextInt();

            switch (secenek) {
                case 1:
                    System.out.print("Birinci sayıyı giriniz: ");
                    sayi1 = input.nextInt();
                    System.out.print("İkinci sayıyı giriniz: ");
                    sayi2 = input.nextInt();
                    sonuc = toplamaIslemi(sayi1, sayi2);
                    System.out.println("Toplama işleminizin sonucu: " + sonuc);
                    devamEdilsinMi = true;
                    break;

                case 2:
                    System.out.print("Birinci sayıyı giriniz: ");
                    sayi1 = input.nextInt();
                    System.out.print("İkinci sayıyı giriniz: ");
                    sayi2 = input.nextInt();
                    sonuc = cikarmaIslemi(sayi1, sayi2);
                    System.out.println("Toplama işleminizin sonucu: " + sonuc);
                    devamEdilsinMi = true;
                    break;

                case 3:
                    System.out.print("Birinci sayıyı giriniz: ");
                    sayi1 = input.nextInt();
                    System.out.print("İkinci sayıyı giriniz: ");
                    sayi2 = input.nextInt();
                    sonuc = carpmaIslemi(sayi1, sayi2);
                    System.out.println("Toplama işleminizin sonucu: " + sonuc);
                    devamEdilsinMi = true;
                    break;

                case 4:
                    System.out.print("Birinci sayıyı giriniz: ");
                    sayi1 = input.nextInt();
                    System.out.print("İkinci sayıyı giriniz: ");
                    sayi2 = input.nextInt();
                    sonuc = bolmeIslemi(sayi1, sayi2);
                    System.out.println("Toplama işleminizin sonucu: " + sonuc);
                    devamEdilsinMi = true;
                    break;

                case 0:
                    devamEdilsinMi = false;
                    System.out.println("Teşekkürler...");
                    break;

                default:
                    System.out.println("Yanlış bir giriş yaptınız!"); // System.err.println("Yanlış bir giriş yapıtınız!"); kırmızı hata yazısı verir.
                    System.out.println("Tekrar deneyiniz...");
                    devamEdilsinMi = true;
            }

        } while (devamEdilsinMi);
    }

    public static double toplamaIslemi(double sayi1, double sayi2) {
        double sonuc;
        sonuc = sayi1 + sayi2;
        return sonuc;
//        return sayi1+sayi2;
    }

    public static double cikarmaIslemi(double sayi1, double sayi2) {
        return sayi1 - sayi2;
    }

    public static double carpmaIslemi(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }

    public static double bolmeIslemi(double sayi1, double sayi2) {
        return sayi1 / sayi2;
    }
}
