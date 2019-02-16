package ikiBoyutluDizi;

public class IkıBoyutluDiziApp {
    public static void main(String[] args) {

        int satir = 3;
        int sutun = 4;

        int[][] dizi = new int[satir][sutun];

        System.out.println("Dizinin satır boyutu: " + dizi.length);
        System.out.println("Dizinin sütun boyutu: " + dizi[0].length);

        int sayac = 0;

        for (int i = 0; i < dizi.length; i++) {

            for (int k = 0; k < dizi[i].length; k++) {

                dizi[i][k] = ++sayac;
            }
        }
        //satır sayısının boyutuna erişebilmek için yazılan for dongusu
        for (int i = 0; i < dizi.length; i++) {

            //sütun boyutuna erişebilmek için yazılan for dongusu
            for (int k = 0; k < dizi[i].length; k++) {

                System.out.print(dizi[i][k] + " ");
            }
            System.out.println();
        }
    }
}
