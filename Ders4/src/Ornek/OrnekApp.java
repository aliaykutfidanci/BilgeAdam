package Ornek;

public class OrnekApp {
    public static void main(String[] args) {

        /**
         * 1'den 100'e kadar sayılar olacak
         * 3'e bölündüğünde Fizz yazacak
         * 5'e bölündüğünde Buzz yazacak
         * 15'e bölündüğünde FizzBuzz yazacak
         * diğer durumlarda sayıyı yazacak
         */

        int i;

        for (i = 1; i <= 100; i++) {

            if (i % 15 == 0) { // ya da if(i % 3 == 0 && i % 5 == 0)

                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {

                System.out.println("Fizz");

            } else if (i % 5 == 0) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);
            }
        }

    }
}
