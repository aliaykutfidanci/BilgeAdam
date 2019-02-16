package Diziler;

public class DizilerOrnekApp {

    public static void main(String[] args) {
        int[] dizi = {7, 3, 125, 9, 1, 0, 17, 88, 22, 4};
        System.out.println("Dizinin boyutu: " + dizi.length);
        int temp = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j <= dizi.length - 1; j++) {
                if (dizi[i] > dizi[j]) {
                    temp = dizi[j];
                    dizi[j] = dizi[i];
                    dizi[i] = temp;
                }
            }
        }
        String sonuc = "";
        for (int diziElemani : dizi) {
            sonuc += diziElemani + " ";
        }
        System.out.println("Dizinin sıralı hali: " + sonuc);
    }
}
