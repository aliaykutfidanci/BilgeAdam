package AsalSayiToplami;

public class TekSayiYazdirmaApp {
    public static void main(String[] args) {

        int i;
        String TekSayilar = " ";

        for (i=1; i<=100; i++){

            if (i%2==1){

                TekSayilar+=i+" "; //concat işlemi birleştirme işlemi

            }
        }

        System.out.println("1'den 100'e kadar olan tek sayılar: "+TekSayilar);
    }
}
