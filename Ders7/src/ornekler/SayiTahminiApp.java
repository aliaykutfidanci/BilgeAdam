package ornekler;

import java.util.Scanner;

public class SayiTahminiApp {
    /**
     * Kullanıcının 1 ile 10 arasında girdiği bir sayıyı
     * programın belirlediği rasgele sayı ile eşleştirme
     * sayının 2 eksiğine ve 2 fazlasına yaklaştığında
     * yaklaştınız uyarısı veren
     * yaklaşamadığında kullanıcıya yaklaşamadınız diye uyarı veren
     * sayıyı bulduğunda kazandınız yazan bir uygulama
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = (int) (Math.random() * 10);
        boolean devamEdilsinMi = false;

        do {
            System.out.print("Bir sayı giriniz: ");
            int girilenSayi = input.nextInt();
            if (sayi == girilenSayi) {
                System.out.println("Doğru tahmin.");
                devamEdilsinMi = false;
            } else if (sayi == girilenSayi + 2 || sayi == girilenSayi - 2) {
                System.out.println("Yaklaştınız.");
                devamEdilsinMi = true;
            } else if (sayi == girilenSayi + 1 || sayi == girilenSayi - 1) {
                System.out.println("Çok yaklaştınız.");
                devamEdilsinMi = true;
            } else {
                System.out.println("Tekrar deneyin.");
                devamEdilsinMi = true;
            }
        } while (devamEdilsinMi);
    }
}
