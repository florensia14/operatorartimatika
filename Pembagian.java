import java.util.Scanner;

public class Pembagian{

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan angka pertama :");
        int firstnumber = scanner.nextInt();

        System.out.print("masukan angka kedua :");
        int secondnumber = scanner.nextInt();

        int hasil = firstnumber / secondnumber ;

        System.out.println("hasil dari pembagian :" + hasil);
        scanner.close();
    }
}