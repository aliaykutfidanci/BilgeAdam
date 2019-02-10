package Diziler;

public class DizilerApp {
    public static void main(String[] args) {

        /**
         *  int[] dizi = new int[5]; //5 boyutlu dizi oluşturuldu
         dizi[0] = 5;
         dizi[1] = 4;
         dizi[2] = 3;
         dizi[3] = 2;
         dizi[4] = 1;

         System.out.println("Dizinin 0. indisi ve 1. elemanı: " + dizi[0]);
         System.out.println("Dizinin 1. indisi ve 2. elemanı: " + dizi[1]);
         System.out.println("Dizinin 2. indisi ve 3. elemanı: " + dizi[2]);
         System.out.println("Dizinin 3. indisi ve 4. elemanı: " + dizi[3]);
         System.out.println("Dizinin 4. indisi ve 5. elemanı: " + dizi[4]);
         */

        /**
         hata alınacak yazım
         dizi[5]=7;
         System.out.println("Dizinin 5. indisi ve 6. elemanı: "+dizi[5]);
         */

        /**
         * int[] dizi2=new int[5];
         * System.out.println("Dizinin 0. indisi ve 1. elemanı: "+dizi2[0]); //değer atanmadığı için sıfır döner
         * System.out.println("Dizinin 4. indisi ve 5. elemanı: "+dizi2[4]); //değer atanmadığı için sıfır döner
         */

        /**
         * eğer bir diziye boyut atanmazsa java bunu JVMde bulunan heap memory'de oluşturamaz.
         * bu yüzden compiler bize dizinin boyunu belirlememiz için uyarır
         * int[] dizi3=new int[];
         * */

      /*  //dizi tanımlama şekli
        int[] dizi={5,4,3,2,1};
        System.out.println("Dİzinin 0. indisi ve 1. elemanı: "+dizi[0]);
        System.out.println("Dizinin 1. indisi ve 2. elemanı: "+dizi[1]);
        System.out.println("Dizinin 2. indisi ve 3. elemanı: "+dizi[2]);
        System.out.println("Dizinin 3. indisi ve 4. elemanı: "+dizi[3]);
        System.out.println("Dİzinin 4. indisi ve 5. elemanı: "+dizi[4]);

        //dizinin boyutunu öğrenmek için
        int diziBoyutu=dizi.length;
        System.out.println("Dizinin boyutu: "+diziBoyutu);
        System.out.println("Dizinin boyutu: "+dizi.length); //final değiştirilemez key worddür. */

        int[] dizi = new int[5]; //int dizi[] = new int[5];  şeklinde de yazılabilir
        System.out.println("Dizinin boyutu: " + dizi.length);

        dizi = new int[15];
        System.out.println("Dizinin yeni boyutu: " + dizi.length);


    }
}
