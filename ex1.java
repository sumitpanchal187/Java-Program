/*import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = (a+b+c)/3;
        System.out.println(d);
        
    }
}
*/




/**
 * ex1/* */

// public class ex1 
// {
//     public static void sumOddNumbers(int n) 
//     {
//         int total = 0;
//         for (int i = 1; i <= n; i += 2) {
//             total += i;
//         }
//         System.out.println("The sum of all odd numbers from 1 to " + n + " is " + total);
//     }
    
//     public static void main(String[] args) {
//         sumOddNumbers(15);
//     }
// }



/**
 * ex1
 */
// import java.util.Scanner;

// public class ex1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int positiveCount = 0;
//         int negativeCount = 0;
//         int zeroCount = 0;
//         char choice;
//         do {
//             System.out.print("Enter a number: ");
//             int num = input.nextInt();
//             if (num > 0) {
//                 positiveCount++;
//             } else if (num < 0) {
//                 negativeCount++;
//             } else {
//                 zeroCount++;
//             }
//             System.out.print("Do you want to enter another number? (y/n): ");
//             choice = input.next().charAt(0);
//         } while (choice == 'y' || choice == 'Y');
//         System.out.println("Number of positive numbers entered: " + positiveCount);
//         System.out.println("Number of negative numbers entered: " + negativeCount);
//         System.out.println("Number of zero numbers entered: " + zeroCount);
//     }
// }

/**
 * ex1
//  */
// public class ex1 {

//     public static void sumit(int x , int n) {
//         System.out.println(Math.pow(x, n));
//     }
//     public static void main(String[] args) {
//         sumit(2, 5);
//     }
// }


// GCD
/**
 * ex1
 */
// public class ex1 {

//     public static int gcd(int a, int b) {
//         if (b == 0) {
//             return a;
//         } else {
//             return gcd(b, a % b);
//         }
//     }
//     public static void main(String[] args) {
//         // int gcdResult = gcd(12, 18);
//         System.out.println(gcd(12, 18)); // Output: 6
//         System.out.println(gcd(12, 0)); 
//         System.out.println(gcd(0, 18)); 

//     }    
// }


/* Fibonacci Series */
/**
 * ex1
 */
public class ex1 {

    static void Fibonacci(int n)
    {
        int a = 0 , b=1 ,c;
        for (int i = 1; i <=n; i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Fibonacci(10);
    }
}