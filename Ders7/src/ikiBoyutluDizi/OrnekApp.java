package ikiBoyutluDizi;

public class OrnekApp {

    //kosegenleri toplayıp birbirinden çıkarınca sonuc nedir?
    /*public static void main(String[] args) {

        int[][] dizi = {{3, 4, 1}, {8, 4, 6}, {2, 4, 15}};

        int sayac = dizi.length;

        int toplam1 = 0;
        int toplam2 = 0;
        int sonuc = 0;

        for (int i = 0; i < dizi.length; i++) {

            sayac--;
            int toplam = dizi[i][i];
            toplam1 = toplam1 + toplam;

            int ttoplam = dizi[i][sayac];
            toplam2 = toplam2 + ttoplam;

            sonuc = toplam1 - toplam2;


        }
        System.out.println("İlk köşegen: " + toplam1);
        System.out.println("İkinci köşegen: " + toplam2);
        System.out.println("Köşegenler farkı: " + Math.abs(sonuc));


    }
*/
    public static void main(String[] args) {
        int[][] dizi = {{3, 4, 1}, {8, 4, 6}, {2, 4, 15}};

        for (int i = 0; i < dizi.length; i++) {

            for (int j = 0; j < dizi[i].length; j++) {

                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }
        int sayac = dizi.length;
        int sagCapraz = 0;
        int solCapraz = 0;
        int sonuc = 0;
        for (int i = 0; i < dizi.length; i++) {
            sayac--;
            sagCapraz += dizi[i][sayac];
            solCapraz += dizi[i][i];

        }
        
        sonuc = sagCapraz - solCapraz;

        System.out.println("Sonuc: " + Math.abs(sonuc));

    }
}
