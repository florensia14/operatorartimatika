import java.util.BelajarScanner;

public class scanner{

    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("masukan bilangan bulat :");
        int num = sc.nextInt();

        // untuk menghasilkan hasil imputan
        System.out.println("bilangan bulat :" + num);
        sc.close ();
    }
}