package KosulluIfadeler;

import java.util.Scanner;

public class IfElseApp2 {
    public static void main(String[] args) {

        System.out.println("Sayı karşılaştırma programı..");

        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2=input.nextInt();

        if (sayi1==sayi2){
            System.out.println("Birinci sayı ikinci sayıya eşittir.");
        } else {
            System.out.println("Birinci sayı ikinci sayıya eşit değildir.");
        }
        System.out.println("Teşekkürler...");

    }
}
