package Methodlar;

public class OrneklerApp {

    public static void main(String[] args) {

        helloMethod();
        sayiYaz(12);
        int sonuc = 10 + 20;
        sayiYaz(sonuc);
        toplamaIslemi(5, 30);

        int gelenDeger=donusTipiOlanToplamaIslemi(7,2);
        System.out.println("donus tipi olan islem: "+gelenDeger);

    }

    //return tipi olmayan ve parametre almayan method
    //static olmasının sebebi ststic method'dan çağırabilmek için

    public static void helloMethod() {
        System.out.println("Hello Method..");
    }

    //return tipi olmayan, parametre alan method
    public static void sayiYaz(int sayi) {
        System.out.println("Sayınız: " + sayi);
    }

    //return tipi olmayan birden fazla parametre alan method
    public static void toplamaIslemi(int sayi1, int sayi2) { //7 parametrenin üzerinde yazmamak daha makuldur ama yazilabilir
        int sonuc = sayi1 + sayi2;
        System.out.println("Toplama işlemi sonucu: " + sonuc);
    }

    public static int donusTipiOlanToplamaIslemi(int sayi1,int sayi2){
        int sonuc = sayi1+ sayi2;
        return sonuc;
    }

}
