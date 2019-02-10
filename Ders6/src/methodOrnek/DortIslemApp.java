package methodOrnek;

import java.util.Scanner;

public class DortIslemApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secenek;
        int sayi1;
        int sayi2;
        float sonuc;

        System.out.println("Hoşgeldiniz..");
        System.out.println("Hangi işlemi yapmak istiyorsunuz?");
        System.out.println("1.Toplama");
        System.out.println("2.Çıkarma");
        System.out.println("3.Çarpma");
        System.out.println("4.Bölme");
        System.out.print("Seçiniz: ");

        secenek = input.nextInt();


        switch (secenek) {
            case 1:
                System.out.print("İlk sayıyı giriniz: ");
                sayi1 = input.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                sayi2 = input.nextInt();
                sonuc = ToplamaIslemi(sayi1, sayi2);
                System.out.println("Toplama işlemi sonucu: " + sonuc);
                break;

            case 2:
                System.out.print("İlk sayıyı giriniz: ");
                sayi1 = input.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                sayi2 = input.nextInt();
                sonuc = CikarmaIslemi(sayi1, sayi2);
                System.out.println("Çıkarma işlemi sonucu: " + sonuc);
                break;

            case 3:
                System.out.print("İlk sayıyı giriniz: ");
                sayi1 = input.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                sayi2 = input.nextInt();
                sonuc = CarpmaIslemi(sayi1, sayi2);
                System.out.println("Çarpma işlemi sonucu: " + sonuc);
                break;

            case 4:
                System.out.print("İlk sayıyı giriniz: ");
                sayi1 = input.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                sayi2 = input.nextInt();
                sonuc = BolmeIslemi(sayi1, sayi2);
                System.out.println("Bölme işlemi sonucu: " + sonuc);
                break;
        }

    }


    public static int ToplamaIslemi(int sayi1, int sayi2) {

        int sonuc = sayi1 + sayi2;
        return sonuc;

    }

    public static int CikarmaIslemi(int sayi1, int sayi2) {

        int sonuc = sayi1 - sayi2;
        return sonuc;
    }

    public static float BolmeIslemi(float sayi1, float sayi2) {

        float sonuc = sayi1 / sayi2;
        return sonuc;
    }

    public static int CarpmaIslemi(int sayi1, int sayi2) {

        int sonuc = sayi1 * sayi2;
        return sonuc;
    }

}
