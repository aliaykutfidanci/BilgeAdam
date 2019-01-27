package IlkelTipler;

public class Main {

    public static void main(String[] args) {

        int a=5;
        System.out.println("Bu bir integer deger:" +a);

        Integer b=5;
        System.out.println("Bu bir integer deger:" +b);

        Integer c=new Integer(5);
        System.out.println("Bu bir integer deger:" +c);

        int x; //kod blogu disinda (class disinda)deger tanimlanamaz.
        x=29;
        x=28; //javada en son atanan degeri alir.
        System.out.println(x);

        long along=11;
        System.out.println("Bu bir long deger:" +along);
        Long bLong=2L;
        System.out.println("Bu bir long deger:" +bLong);
        Long cLong=new Long(2);
        System.out.println("Bu bir long deger:" +cLong);

        short aShort=50;
        System.out.println("Bu bir short deger:" +aShort);
        short bShort=40;
        System.out.println("Bu bir short deger:" +bShort);
        short cShort=new Short((short) 50);
        System.out.println("Bu bir short deger:" +cShort);

        byte aByte=20;
        System.out.println("Byte deger:" +aByte);
        byte bByte=20;
        System.out.println("Byte deger:" +bByte);
        byte cByte=new Byte((byte) 20);
        System.out.println("Byte deger:" +cByte);

        char aChar='a'; //char tek karakter deger alir
        System.out.println("Char deger:" +aChar);
        Character bChar='a';
        System.out.println("Char deger:" +bChar);
        Character cChar= new Character('a');
        System.out.println("Char deger:" +cChar);

        String aString="java";
        System.out.println("String deger:" +aString);
        String bString=new String("javab");
        System.out.println("String deger:" +bString);
    }


}
