package Odev;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        /**
         * AsalSayiApp
         * Kalvyeden girilen sayının asal olup olmadığını bulan program yazılacak
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");

        int sayi = input.nextInt();

        if (sayi > 1) {

            boolean asalMiDegilMi = false; //flag

            for (int i = 2; i < sayi; i++) { //eşit olmaması lazım

                if (sayi % i == 0) {

                    asalMiDegilMi = true;
                }
            }

            if (asalMiDegilMi) {

                System.out.println("Sayı asal değildir..");

            } else {

                System.out.println("Sayı asaldır.");

            }
        }

    }
}
