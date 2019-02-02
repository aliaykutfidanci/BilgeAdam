package TipDonusumleri;

public class Main {

    // bu kisimda / cift yildiz ile farkli yorum yeri cikar

    public static void main(String[] args) {

        // tek satir yorum icin
    /*
    coklu yorum yazarken bu sekilde yapilmali

    ctrl+shit+/ satiri yoruma alir
    ctrl+alt+L

     */

        //Tip donusumleri genelde kucuk veri tipinden buyuk veri tipine gore degisiklik olmali
        //Dikkat edilmesi gereken buyukten kucuge donusum yapilirken dogru olan tipi kullanmak

        byte bytea = 127;
        int intb;
        int intc;

        intb = bytea;

        intb = 127;
        bytea = (byte) intb;
        System.out.println("Max boyutu gecmedigim tip donusumu:" + bytea);
        intc=256;
        bytea = (byte) intc;
        System.out.println("Max boyutu gecince cikan tip donusumu:" +bytea);

        //integer tipi string ifadeye cevirme
        Integer xInt=12;
        String xString;
        xString=xInt.toString();
        System.out.println(xString);

        /*
        git guncellemek icin once add sonra commit sonra pull ve push
         */
    }

}
