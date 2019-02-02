package AritmetikOperatorler;

public class AritmetikArttirimApp {
    public static void main(String[] args) {

        int a=2;
        int b=7;
        int c=40;
        int d=50;

        a++; //degiskeni ata sonra artir anlaminda
        ++b; //degiskeni artir sonra ata
        c--; //degiskeni ata sonra azalt
        --d; //degiskeni azalt sonra ata

        System.out.println("degiskeni ata sonra artir: "+a);
        System.out.println("degiskeni artir sonra ata: "+b);
        System.out.println("degiskeni ata sonra azalt: "+c);
        System.out.println("degiskeni azalt sonra ata: "+d);

        int x=7;
        int y=7;
        int sonuc1;
        int sonuc2;

        sonuc1=++x;
        sonuc2=y++;

        System.out.println("sonuc1: "+sonuc1);
        System.out.println("Arttirimdan sonra x'in degeri: "+x);
        System.out.println("sonuc2: "+sonuc2);
        System.out.println("Arttirimdan sonra y'nin degeri: "+y);



    }
}
