package stringler;

public class StringMethodlari {

    public static void main(String[] args) {

        String deger="Merhaba Java";

        System.out.println(deger.toUpperCase()); //buyuk harfe cevirme
        System.out.println(deger.toLowerCase()); //kucuk harfe cevirme

       /* deger.toLowerCase();
        System.out.println(deger); şeklinde yazılırsa değişiklik olmayacaktır. çünkü string ifadeler finaldır, değiştirilemez
        değiştirmek için deger=deger.toLowerCase() kullanımı yapılmalıdır
        */

        System.out.println(deger.charAt(1)); //i. indisteki karakteri getirir
        System.out.println(deger.indexOf('a')); //Karakterin kacinci indekste (ilk indeks) oldugunu getirir
        System.out.println(deger.lastIndexOf('a')); //Karakterin kacinci indekste (son indeks) oldugunu getirir
        System.out.println(deger.substring(8)); //sql deki substr gibi calisir, yazilan indisten sonra hepsini getirir
        System.out.println(deger.substring(0,3)); //0dan baslar 3. indise kadar getir
        System.out.println(deger.concat(" Naber")); //String birlestirme
        System.out.println(deger.replace('a','o')); //karakter degistirmek icin
        System.out.println(deger.replaceAll(" ","")); //karakter degistirmek gibi bosluklari kaldirdik, bu kural varsa sunu yap
        System.out.println(deger.replaceAll(""," "));

        String bosluk=" Merhaba ";
        System.out.println(bosluk);
        System.out.println(bosluk.trim()); //bastaki ve sondaki boslugu siler

        String adSoyad="Ali Fidancı";
        String ad="";
        String soyad="";

        int boslukDeger=adSoyad.indexOf(" ");
        System.out.println("Boşluk değeri: "+boslukDeger);

        ad=adSoyad.substring(0,boslukDeger);
        soyad=adSoyad.substring(boslukDeger+1);

        System.out.println("Adı: "+ad);
        System.out.println("Soyadı: "+soyad);


        System.out.println("Char array kullanimi");
        char[] dizi=deger.toCharArray();
        for (char c:dizi){
            System.out.println(c);
        }

        String a="12";

        // Ilkel tipe donusturmek icin parseInt() methodu kullanilir
        int sayi=Integer.parseInt(a); //String ifadeyi integer a pars eder
        System.out.println(sayi);
        //(Wrapper) nesne tipe donusturmek icin valueOf() methodu kullanilir
        Integer sayi2=Integer.valueOf(a);
        System.out.println(sayi2);

        //primitive tipleri String veri tipine donusturmek icin valueOf() kullanilir
        String stringSayi=String.valueOf(sayi);
        String stringSayi2=sayi2.toString();
        //Wrapper (nesne) tipindeki bir degeri string cevirmek icin valueOf() kullanabiliriz
        //String.valueOf() methodu Object turunden nesne aldigi icin Javada tum nesneler Object sinifindan turer
        String asa=String.valueOf(sayi2);

        double  doubleSayi=Double.parseDouble(a);
        System.out.println(doubleSayi);

    }
}
