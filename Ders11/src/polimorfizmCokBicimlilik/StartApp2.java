package polimorfizmCokBicimlilik;

public class StartApp2 {
    public static void main(String[] args) {
        Sekiller sekiller = new Sekiller();

        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.setEn(5);
        dikdortgen.setBoy(6);

        Kare kare = new Kare();
        kare.setKenar(10);

        //sekillerinAlaniniHesapla(sekiller);

        //Kisi kisi = new Kisi();
        //sekillerinAlaniniHesapla(kisi); //sekillerde tanimli olmadigindan else kismina girer

        sekillerinAlaniniHesapla(dikdortgen);
        sekillerinAlaniniHesapla(kare);

    }

    public static void sekillerinAlaniniHesapla(Object nesne) {

       /* if (nesne instanceof Sekiller) {
            Sekiller sekiller = (Sekiller) nesne;
            System.out.println("Sekiller nesnesinin alani: " + sekiller.alanHesapla());

        } */

        if (nesne instanceof Dikdortgen) {
            Dikdortgen dikdortgen = (Dikdortgen) nesne;
            System.out.println("Dikdortgenin alanı: " + dikdortgen.alanHesapla()); //polimorfizm olmasaydi bu sekilde tek tek yazilmasi gerekirdi.

        } else if (nesne instanceof Kare) {

            Kare kare = (Kare) nesne;
            System.out.println("Karenin alani: " + kare.alanHesapla());
        } else {
            System.out.println("Bu bir sekil degildir.");

        }
    }
}
