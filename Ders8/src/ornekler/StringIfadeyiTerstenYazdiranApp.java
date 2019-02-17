package ornekler;

public class StringIfadeyiTerstenYazdiranApp {

    /*public static void main(String[] args) {
        String deger = "Merhaba Java"; //avaJ abahreM yazmasi gerekmekte

        char[] dizi = deger.toCharArray();

        char temp;
        for (int i = 0; i < dizi.length; i++){
            temp=dizi[i];

            dizi[i]=dizi[dizi.length];
            dizi[dizi.length]=temp;
        }

        for (char c:dizi){

            System.out.println(c);
        }
    }*/

    public static void main(String[] args) {
        String deger = "Merhaba Java"; //avaJ abahreM yazmasi gerekmekte

        char[] dizi=deger.toCharArray();

        String sonuc="";
        for (int i=dizi.length-1; i>=0; i--){
            sonuc+=dizi[i];

        }
        System.out.println(sonuc);
    }
}