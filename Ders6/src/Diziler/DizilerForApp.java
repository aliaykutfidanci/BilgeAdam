package Diziler;

public class DizilerForApp {
    public static void main(String[] args) {
        int[] dizi = new int[100];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = i + 2;
        }

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Dizinin " + i + ". indisinin değeri: " + dizi[i]);

        }
    }
}
