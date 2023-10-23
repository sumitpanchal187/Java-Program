import java.util.Scanner;

/**
 * iml_recursion
 */
public class towerofhonoi {

    public static void tower (int n , String s , String h , String d)
    {
        if (n==1) {
            System.out.println("transfer disk " + n +" from " + s +" to "+ d);
            return;
        }
        tower(n-1, s, d, h);
        System.out.println("transfer disk " + n +" from " + s +" to "+ d);
        tower(n-1, h, s, d);
    }
    public static void main(String[] args) {
        Scanner c =  new Scanner(System.in);
        int n = c.nextInt();
        tower(n, "SOURCE", "HELPER", "DEST");
    }
}