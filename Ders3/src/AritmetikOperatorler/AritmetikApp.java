package AritmetikOperatorler;

public class AritmetikApp {
    public static void main(String[] args){

        //ctrl+alt+a git e ekleme islemi
        //ctrl+shift+k push kisayolu
        //sag alt koseden yeni branch acilabilir
        //istenilen branhce check out ile gecis yapilabilir

        System.out.println("Merhaba ilk branch");

        /*
        Arimetik operatorler    Karsilaştirma operandlari       Mantiksal Operatorler
        +                           <                               && ve anlaminda sayi1 && sayi2 iki deger de true ise true doner
        -                           >                               || ya da anlamina gelir
        *                           <=                              ! degerin tersini alir dogru ise yanlis alir
        /                           >=
        %                           ==
        ++ artirma                  !=
        -- azaltma
         */

        int a=7; //a=7, b=3; seklinde yan yana da yazilabilir
        int b=3;
        int sonuc;
        double bolmeSonucu, x=7;

        sonuc=a+b;
        System.out.println("toplama islemi: "+sonuc);

        sonuc=a-b;
        System.out.println("cikarma islemi: "+sonuc);

        sonuc=a*b;
        System.out.println("carpma islemi: "+sonuc);

        sonuc=a/b;
        System.out.println("bolme islemi: "+sonuc);

        bolmeSonucu=x/b;
        System.out.println("bolme islemi: "+bolmeSonucu);

        sonuc=a%b;
        System.out.println("kalan islemi (Mod alma): "+sonuc);

        a=a+b; //ya da a+=b;
        System.out.println("iki sayiyi toplayip atama islemi: "+a);

        a+=b;
        System.out.println("iki sayiyi toplayip atama islemi: "+a);

    }
}
