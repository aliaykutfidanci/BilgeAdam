package polimorfizmCokBicimlilik;

public class StartApp {
    public static void main(String[] args) {

        //Dikdortgen dikdortgen=new Dikdortgen();

        //dikdortgen.en=5;
        //dikdortgen.boy=6;

       /*
        dikdortgen.setEn(5);
        dikdortgen.setBoy(6);
        System.out.println(dikdortgen.getEn());
        System.out.println(dikdortgen.getBoy());
       */

        Sekiller sekiller = new Sekiller();
        //System.out.println(sekiller.alanHesapla());

        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.setEn(5);
        dikdortgen.setBoy(6);
        //System.out.println("Dikdörtgen alanı: "+dikdortgen.alanHesapla());

        Kare kare = new Kare();
        kare.setKenar(3);
        // System.out.println("Karenin alanı: "+kare.alanHesapla());

        sekillerinAlaniniHesapla(sekiller);
        sekillerinAlaniniHesapla(dikdortgen);
        sekillerinAlaniniHesapla(kare);

        sekillerinCevresiniHesapla(dikdortgen);
        sekillerinCevresiniHesapla(kare);
    }

    public static void sekillerinAlaniniHesapla(Sekiller sekiller) {
        System.out.println("Şeklin alanı: " + sekiller.alanHesapla());

    }

    public static void sekillerinCevresiniHesapla(Sekiller sekiller) {
        System.out.println("Şekillerin çevresi: " + sekiller.cevreHesapla());

    }
}
