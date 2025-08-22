public class OperatorLogika {
    
    public static void main (String[] args){

        boolean a = true;
        boolean b = false;
        boolean hasil;

        hasil = a && b;
        System.out.println("hasil nya a && b :" + hasil);

        hasil = a && a;
        System.out.println("hasil nya a && a :" + hasil);

        hasil = b && b;
        System.out.println("hasil nya b && b :" + hasil);

        hasil = a || b;
        System.out.println("hasil nya a || b :" + hasil);

        hasil = a || a;
        System.out.println("hasil nya a && a :" + hasil);

        hasil = b || b;
        System.out.println("hasil nya b || b :" + hasil);

        hasil = !a;
        System.out.println("hasil nya !a :" + hasil);

        hasil = !b;
        System.out.println("hasil nya !b :" + hasil);

        System.out.println("===========================");

        hasil = (5>4) && (4>6);
        System.out.println("(5>4) && (4>6)" + hasil);

        hasil = (5>4) && (7>6);
        System.out.println("(5>4) && (7>6)" + hasil);

        hasil = (3>4) && (4>6);
        System.out.println("(3>4) && (4>6)" + hasil);

        hasil = (5>4) || (4>6);
        System.out.println("(5>4) || (4>6)" + hasil);

        hasil = (5>4) || (7>6);
        System.out.println("(5>4) || (7>6)" + hasil);

        hasil = (3>4) || (4>6);
        System.out.println("(3>4) || (4>6)" + hasil);

        hasil = !(3>4);
        System.out.println("!(3>4)" + hasil);

        hasil = !(7>6);
        System.out.println("!(7>6)" + hasil);
    }
}
