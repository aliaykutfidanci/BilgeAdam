package matematikIslemler;

import java.util.Random;

public class MathApp {
    public static void main(String[] args) {
        //Math sınıfı java.lang paketi ile otomatik olarak beraber gelir.

        System.out.println("Sayının kökünü alma: "+Math.sqrt(16));
        System.out.println("Sayının mutlak değeri: "+Math.abs(-2+1));
        System.out.println("Ondalıklı sayının bir üst tam sayı değerini alma: "+Math.ceil(3.14));
        System.out.println("Ondalıklı sayının bir alt tam sayı değerini alma: "+Math.floor(3.14));
        System.out.println("Ondalıklı sayının en yakın tam sayı değerini alma: "+Math.round(2.51));
        System.out.println("Bir sayının üssünü alma: "+Math.pow(5,2));
        System.out.println("Sayılar arasında büyük olanı alma: "+Math.max(3,5));
        System.out.println("Sayılar arasında küçük olanı alma: "+Math.min(3,5));
        System.out.println("Pi sayını döner: "+Math.PI);
        System.out.println("Random sayı: "+Math.random()*20); //0 ile 20 arasında random sayı döner
        System.out.println("Tam sayı random sayı: "+(int)(Math.random()*20)); //0 ile 20 arasında random tam sayı

        int a = (int)(Math.random()*20);
        System.out.println(a);

        Random random=new Random();
        System.out.println(random);
    }
}
