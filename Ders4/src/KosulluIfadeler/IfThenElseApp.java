package KosulluIfadeler;

import java.util.Scanner;

public class IfThenElseApp {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi=input.nextInt();

        String cevap=(sayi>5)?"Girilen değer 5'ten büyüktür.":"Girilen değer 5'ten küçüktür";

        System.out.println(cevap);
    }
}
