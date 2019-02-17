package stringler;

public class StringIfadeler {

    public static void main(String[] args) {

        String jv = "Merhaba Java";
        String a = new String("Merhaba Java"); //Bu şekilde zor durumda kalmadıkça kullanılmaz
        //String a = "Merhaba Java"; //bu şekilde yazılırsa if koşulunda eşit olarak görür
        System.out.println(jv);
        System.out.println(a);

        System.out.println("Jv değişkenin boyutu: " + jv.length());
        System.out.println("a değişkeninin boyutu: " + a.length());

        if (jv == a) {

            System.out.println("Eşit");
        }

        if (jv.equals(a)) {

            System.out.println("Equals ile eşittir.");
        }



    }
}
