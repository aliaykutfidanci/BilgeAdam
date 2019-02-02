package MantiksalOperatorler;

public class MantiksalOperatorlerApp {

    public static void main(String[] args) {

        /*
        &&: ve operatoru (sagdaki ve soldaki degisken degeri true ise true degeri doner)
        ||: ya da operatoru (sagindaki ve solundaki degerler false ise false degeri doner)
            (sagindaki ya da solundaki degerden birisi true ise true degeri doner)
        !: degil mi operatoru (verilen degiskenin tersini verir. true ise false verir. false ise true verir)
        ^: XOR operatoru. ||'nın tersi olarak calisir. true true ise false doner
        */

    boolean x=true, y=false, z=true, t=false, sonuc;

    sonuc=x&&z;
        System.out.println("x ve z'nin and ile karsilastirilmasi "+sonuc);

    sonuc=x&&y;
        System.out.println("x ve y'nin and ile karsilastirilmasi "+sonuc);

    sonuc=y&&t;
        System.out.println("y ve t'nin and ile karsilastirilmasi "+sonuc);

    sonuc=y||t;
        System.out.println("y ve t'nin or ile karsilastirilmasi "+sonuc);

    sonuc=x||y;
        System.out.println("x ve y'nin ya da ile karsilastirilmasi "+sonuc);

    sonuc=x||z;
        System.out.println("x ve z'nin ya da ile karsilastirilmasi "+sonuc);

    sonuc=!x;
        System.out.println("x degiskenini tersine cevirir "+sonuc);

    sonuc=!y;
        System.out.println("y degiskenini tersine cevirir "+sonuc);

    sonuc=x^z;
        System.out.println(sonuc);
    }
}
