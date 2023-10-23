import java.util.Scanner;

public class loops
{
    public static void main(String[] args)
    {
        // for(int i = 0;i<=10;i++)
        // {
        //     System.out.println(i);
        // }


        /* While Loop */
        // int a = 1 ;
        // while (a<=20) {
        //     System.out.println(a);
        //     a++;
        // }

        /*Do While */
        // int a = 1;
        // do {
        //     System.out.println(a);
        //     a++;
        // }
        // while(a<11);


        /* print the sum of n numbers */
        // Scanner c = new Scanner(System.in);
        // int x = c.nextInt();

        // int sum = 0 ;
        // for (int i = 0; i <=x; i++) {
        //     sum = sum + i ;
        // }
        // System.out.println(sum);
        
        /* print the table of number input is given by user */
        Scanner c = new Scanner(System.in);
        int x = c.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + x*i);
        }
        

    }
}