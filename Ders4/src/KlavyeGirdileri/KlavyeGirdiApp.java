package KlavyeGirdileri;

import java.util.Scanner;
//import java.util.* until'in altindaki tum kutuphaneleri kullanma anlamina geliyor

public class KlavyeGirdiApp {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        //scanner.nextInt(); integer deger okuyacagimiz zaman kullanacagimiz method
        //scanner.nextDouble(); double deger okuyacagimiz zaman kullanilir
        //scanner.next(); //String degerleri okumak icin, nextLine'a gore daha dar alani okuyor
        //scanner.nextLine(); //String degerleri okumak icin, tum satiri okuyor

        int sayi1, sayi2, sonuc;

        System.out.println("İki sayıyı toplayan program...");
        System.out.print("Birinci sayıyı giriniz: "); //println bir satir asagi iner, print yan yana yazar
        sayi1=scanner.nextInt();

        //System.out.print("Girdiğiniz sayı: "+sayi1);

        System.out.print("İkinci sayıyı giriniz: ");

        sayi2=scanner.nextInt();

        sonuc=sayi1+sayi2;
        System.out.println("Toplama işleminin sonucu: "+sonuc);
    }

}
