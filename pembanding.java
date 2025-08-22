import java.util.Scanner ;

public class pembanding {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Nilai 1 = ");
        int nilai1 = sc.nextInt();

        System.out.print("Nilai 2 = ");
        int nilai2 = sc.nextInt();

        boolean hasil;

        // int a = 20;
        // int b = 10;

        hasil = nilai1 == nilai2 ;
        System.out.println("nilai : "+ nilai1 + " == " + nilai2  + "nilai" + hasil);

        hasil = nilai1 != nilai2 ;
        System.out.println("nilai : "+ nilai1 + " != " + nilai2  + "nilai" + hasil);

        hasil = nilai1 > nilai2 ;
        System.out.println("nilai : "+ nilai1 + "  > " + nilai2  + "nilai" + hasil);

        hasil = nilai1 < nilai2 ;
        System.out.println("nilai : "+ nilai1 + "  < " + nilai2  + "nilai" + hasil);

        hasil = nilai1 >= nilai2 ;
        System.out.println("nilai : "+ nilai1 + " >= " + nilai2  + "nilai" + hasil);

        hasil = nilai1 <= nilai2 ;
        System.out.println("nilai : "+ nilai1 + " <= " + nilai2  + "nilai" + hasil);


        // hasil = a == b;
        // System.out.println("apakah a == b ?" + hasil);

        // hasil = a != b;
        // System.out.println("apakah a != b ?" + hasil);

        // hasil = a > b;
        // System.out.println("apakah a > b ?" + hasil);

        // hasil = a < b;
        // System.out.println("apakah a < b ?" + hasil);

        // hasil = a >= b;
        // System.out.println("apakah a >= b ?" + hasil);

        // hasil = a <= b;
        // System.out.println("apakah a <= b ?" + hasil);
      sc.close();
    }
}
