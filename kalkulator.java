import java.util.Scanner;

public class kalkulator{

    public static void main(String[] args){
        int operator, firstnumber,secondnumber;

         System.out.println("1.masukan angka 1 untuk perjumlahan"+ "\n" +
         "2, masukan angka 2 untuk pengurangan" + "\n" +
         "3,masukan angka 3 untuk perkalian"+"\n"+
         "4,masukan angka 4 untuk pembagian"+"\n"+
         "5,masukan angka 5 untuk modulus"+"\n"+
         "6,masukan angka 6 untuk perpangkatan");
         


         Scanner sc = new Scanner (System.in); 
       
         System.out.print("silahkan pilih dan masukan operator :");
         operator = sc.nextInt();
         
         System.out.print("masukan angka pertama :"); 
         firstnumber = sc.nextInt();

         System.out.print("masukan angka kedua :");
         secondnumber = sc.nextInt();

         int hasil = 0 ;

         if(operator == 1){
         hasil= firstnumber + secondnumber;
         System.out.println("hasil penjumlahan :" +hasil);
         }
         else if (operator == 2){
         hasil = firstnumber - secondnumber;
         System.out.println ("hasil pengurangan :" + hasil);
         }

         else if (operator ==3){
         hasil = firstnumber * secondnumber;
         System.out.println ("hasil perkalian:"+ hasil);
         }

         else if (operator == 4){
         hasil = firstnumber / secondnumber ;
         System.out.println("hasil pembagian" + hasil);
         }
         else if (operator == 5){
         hasil = firstnumber % secondnumber ;
         System.out.println ("hasil modulus" + hasil);
         }
         else if (operator == 6) {
         hasil = (int)Math.pow(firstnumber, secondnumber) ;
         System.out.println ("hasil perpangkatan" + hasil);


             
         }
                            
         sc.close();
        
   
        }
       }
               
    
            


    

