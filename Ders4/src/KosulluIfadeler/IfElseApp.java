package KosulluIfadeler;

import java.util.Scanner;

public class IfElseApp {
    public static void main(String[] args) {

        int a=5;

        //if parantezleri icindeki degeri true ise blok icindeki islemi yapar, degil ise blok disindaki islemi yapar

        if (a==5) {
            System.out.println("a degiskeni 5'e eşittir.");
        }
        System.out.println("Good bye..");

        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=scanner.nextInt();

        if (sayi<10){

            System.out.println("Girilen sayı 10'dan küçüktür.");
        }
        System.out.println("Girilen sayı 10'dan büyük eşittir.");
    }
}
