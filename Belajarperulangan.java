import java.util.Scanner;

public class Belajarperulangan {



    public static void main (String[] args){
         Scanner sc = new Scanner (System.in);

         System.out.print("Masukan Tinggi segitiga");
         int num = sc.nextInt();

    

             int i, j;
             for (i= 1; i <= 20; i++){
                for (j= 1; j<=i ; j++){
                System.out.print(" *");

        
              }
              System.out.println();
        }
    }
}