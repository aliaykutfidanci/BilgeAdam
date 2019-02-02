package AritmetikOperatorler;

public class IliskiselKarsilastirmaOperatorleri {
    //psvm tab yapinca otomatik geliyor

    public static void main(String[] args){

    int a=5, b=10, c=5;

    //<, <=, >, >=, ==, !=

    boolean sonuc;
    sonuc=a<b;
    System.out.println("a'nin b'den kucuk olma durumu: "+sonuc);
       // ya da  System.out.println(a<b);

    sonuc=a>b;
        System.out.println("a'nin b'den buyuk olma durumu: "+sonuc);

    sonuc=a<=b;
        System.out.println("a'nin b'den kucuk esit olma durumu: "+sonuc);

    sonuc=a<=c;
        System.out.println("a'nin c'den kucuk esit olma durumu: "+sonuc);

    sonuc=a>=b;
        System.out.println("a'nin b'den buyuk esit olma durumu: "+sonuc);

    sonuc=a==b;
        System.out.println("a'nin b'ye esit olma durumu: "+sonuc);

    sonuc=a!=b;
        System.out.println("a'nin b'ye esit olmama durumu: "+sonuc);

    }
}
