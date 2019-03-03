package polimorfizmCokBicimlilik;

import java.util.ArrayList;

public class StartApp3 {
    public static void main(String[] args) {

        //genisletebilirlilik();
        //dinamikDizi();

        sekillerAlanlariWithArrayList();
    }


    public static void genisletebilirlilik() {

        Sekiller sekiller = new Sekiller();
        Sekiller sekiller2 = new Sekiller();
        Dikdortgen dikdortgen = new Dikdortgen(3, 5);
        Dikdortgen dikdortgen2 = new Dikdortgen();
        dikdortgen2.setEn(2);
        dikdortgen2.setBoy(3);
        Kare kare = new Kare(9);
        Kare kare2 = new Kare();
        kare2.setKenar(7);

        Sekiller[] sekillerDizisi = new Sekiller[6];
        sekillerDizisi[0] = sekiller;
        sekillerDizisi[1] = sekiller2;
        sekillerDizisi[2] = dikdortgen;
        sekillerDizisi[3] = dikdortgen2;
        sekillerDizisi[4] = kare;
        sekillerDizisi[5] = kare2;

        sekillerAlanlari(sekillerDizisi);
    }
public static void genisletebilirlilikWithArrayList{

        Sekiller sekiller=new Sekiller();
        Sekiller sekiller1=new Sekiller();
        Dikdortgen dikdortgen=new Dikdortgen(3,2);
        Dikdortgen dikdortgen1=new Dikdortgen(6,7);
        Kare kare=new Kare(90);
        Kare kare1=new Kare(50);

        ArrayList<Sekiller> sekillerList = new ArrayList<>();
        sekillerList.add(sekiller);
        sekillerList.add(sekiller1);
        sekillerList.add(dikdortgen);
        sekillerList.add(dikdortgen1);
        sekillerList.add(kare);
        sekillerList.add(kare1);

        sekillerAlanlariWithArrayList(sekillerList);

    }

    public static void sekillerAlanlariWithArrayList(ArrayList<Sekiller> sekillerList) {

    }

    public static void sekillerAlanlari(Sekiller[] sekillerDizi) {
        if (sekillerDizi.length > 0) {

            for (Sekiller sekiller : sekillerDizi) {

                System.out.println("Sekillerin alani: " + sekiller.alanHesapla());
            }
        }
    }

    public static void dinamikDizi(){

        ArrayList<Integer> arrayList=new ArrayList<>();

        for (Integer i=1; i<10;i++){
            arrayList.add(i);
        }

        arrayList.remove(3); //3. indisi siler

        arrayList.add(1); //0. indis
        arrayList.add(2); //1. indis
        arrayList.add(3); //2. indis
        arrayList.add(4); //3. indis
        //arrayList.addAll(arrayList); //farkli listeyi aktarmak icin
        //arrayList.get(0); //kacinci indeksteki veriyi alacagi

        System.out.println("temizlenmeden önceki boyut: "+arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));

        for (Integer eleman:arrayList){
            System.out.println(eleman);
        }

        arrayList.clear();
        System.out.println("temizlendikten sonraki boyut: "+arrayList.size());

    }
}
