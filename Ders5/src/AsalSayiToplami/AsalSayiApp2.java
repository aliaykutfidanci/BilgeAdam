package AsalSayiToplami;

/**
 * 1 den 100e kadar olan asal sayıların bulunması
 */
public class AsalSayiApp2 {

    public static void main(String[] args) {

        int i;
        int sayi = 0;
        String AsalSayilar = "";

        for (i = 0; i < 100; i++) {

            int sayac = 0;

            for (sayi = i; sayi >= 1; sayi--) {

                if (i % sayi == 0) {

                    sayac++;

                }
            }
            if (sayac == 2) {

                AsalSayilar += i + " ";
                //AsalSayilar=AsalSayilar+i" ";

            }
        }
        System.out.println("1'den 100'e kadar olan asal sayılar: " + AsalSayilar);
    }

}
