package KosulluIfadeler;

import java.util.Scanner;

public class IfElseApp3 {
    public static void main(String[] args) {

        int sayi1, sayi2;
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        sayi1=input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        sayi2=input.nextInt();

        if (sayi1>sayi2){
            System.out.println("Birinci sayı ikinci sayıdan büyüktür.");
        } else if (sayi1==sayi2){
            System.out.println("Birinci sayı ikinci sayıya eşittir.");
        }
        else {
            System.out.println("Birinci sayı ikinci sayıdan küçüktür.");
        }
    }
}
