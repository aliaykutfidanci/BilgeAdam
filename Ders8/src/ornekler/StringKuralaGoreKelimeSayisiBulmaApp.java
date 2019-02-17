package ornekler;

import java.util.Scanner;

public class StringKuralaGoreKelimeSayisiBulmaApp {
    public static void main(String[] args) {

        //Camel Case girilen string bir cumledeki kelime sayisi bulma
        //Camel Case string ifade kullanici tarafindan girilecek
        //String deger="stringIfadeleriGetirenMethod"; //camel case ifade yazimi

        Scanner scanner = new Scanner(System.in);
        System.out.print("Camel Case bir cumle giriniz: ");
        String deger = scanner.next();

        int sayac = 1;

        char[] dizi = deger.toCharArray();

        String a = "";

        for (int i = 0; i < dizi.length; i++) {
            a = String.valueOf(dizi[i]);

            if (a.equals(a.toUpperCase())) {
                sayac++;
            }
        }
        System.out.println("Girilen cumledki kelime sayisi: " + sayac);
    }
}
