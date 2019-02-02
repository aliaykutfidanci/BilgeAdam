package KodBloklari;

public class KodBloklariApp {
/*
ust kademedeki degiskenlere alt kademeler ulasabilir fakat
alt kademedeki degiskenlere ust kedemeler ulasamaz
 */
    public static void main(String[] args) {
        int a=5;
        System.out.println("Kademe1: "+a);
        {
            a=3;
            System.out.println("Kademe2: "+a);

            {
                int b=10;
                a=2;
                System.out.println("Kademe3; "+"a degeri: " +a+" b degeri: "+b);
                {
                    b=7;
                    System.out.println("Kademe4: "+"a degeri: "+a+" b degeri: "+b);
                }

            }

        }

    }
}
