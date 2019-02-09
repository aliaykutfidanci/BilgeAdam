package AsalSayiToplami;
/**
 * 1'den 100 e kadar olan asal sayilar
 */
public class AsalSayiToplamiApp {

    public static void main(String[] args) {

        for (int sayi = 1; sayi < 100; sayi++) {

            if (sayi > 1) {

                boolean asalMiDegilMi = true; //flag

                for (int i = 2; i < sayi; i++) { //eşit olmaması lazım

                    if (sayi % i == 0) {

                        asalMiDegilMi = false;
                    }
                }

                if (asalMiDegilMi) {

                    System.out.println("Asal sayı : " + sayi);

                }
            }

        }

    }
}
