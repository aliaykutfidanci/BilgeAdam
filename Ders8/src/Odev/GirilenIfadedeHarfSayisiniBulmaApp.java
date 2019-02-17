package Odev;

import java.util.Scanner;

public class GirilenIfadedeHarfSayisiniBulmaApp {
    public static void main(String[] args) {
        //kullanici ilk olarak string bir ifade girecek
        //sonrasinda bir harf girecek
        //program girilen harf sayisini o ifade icerisinde bulacak

        Scanner input=new Scanner(System.in);
        System.out.print("Bir string ifade giriniz: ");
        String ifade=input.nextLine(); //ard arda string ifade girilirken nextLine kullanilmali
        ifade=ifade.toLowerCase();
        System.out.println("Sayisini bulmak istediginiz harfi giriniz: ");
        String harf=input.next();

        /*
         *
         *
         */


        System.out.println("Girilen harf sayisi: ");





    }
}
