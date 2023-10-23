import java.util.Scanner;

// /**
//  * function_class
//  */
// public class function_class {
//     public static int addSum(int a , int b)
//     {
//         int sum = a+b;
//         // System.out.println(a+b);
//         return sum;
//     }

//     public static void main(String[] args) {
//         System.out.println(addSum(15, 20));
//     }
// }

/**
 * function_class
 */

 /*
public class function_class {
    public static int mulNum(int a , int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    System.out.println(mulNum(a,b));
    }
}

*/

/* Factorial program */
/**
 * function_class
 */
// public class function_class {

//     public static int fact(int n)
//     {
        
//          if(n==0 || n==1)
//         {
//             return 1 ;
//         }
//         else{
//             return (n * fact(n-1));
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(fact(5));
//     }
// }

/**
//  * function_class
//  */
// public class function_class {

//     static void printFact(int n)
//     {
//         int fa=1;
//         for (int i = n; i >= 1; i--) {
//             fa = fa * i;
//         }
//         System.out.println(fa);
//         return;
//     }
//     public static void main(String[] args) {
//         printFact(5);
//     }
// }



/**
 * function_class
 */
// public class function_class {
//     static void checkPrime(int n)
//     {
//         int i,m=0,flag=0;      
//         m=n/2;      
//         if(n==0||n==1){  
//             System.out.println(n+" is not prime number");      
//         }else{  
//             for(i=2;i<=m;i++){      
//                 if(n%i==0){      
//                     System.out.println(n+" is not prime number");      
//                     flag=1;      
//                     break;      
//                 }      
//             }      
//             if(flag==0)  { System.out.println(n+" is prime number"); }  
//         }//end of else  
//     }

//     public static void main(String[] args) {
//         checkPrime(19);
//         checkPrime(88);
//         checkPrime(20);
//     }
// }


/**
 * function_class
 */
// public class function_class {

//     static void oddEven(int n)
//     {
//         if(n%2==0)
//         {
//             System.out.println("number is even");
//             return;
//         }
//         else
//         {
//             System.out.println("number is odd");
//             return;
//         }
//     }
//     public static void main(String[] args) {
//         oddEven(5);
//         oddEven(16);
//         oddEven(15);
//         oddEven(6);
//     }
// }


/**
 * function_class
 */
public class function_class {
    static void tableFun(int n)
    {
        for (int i = 1; i <=10; i++) {
            System.out.println(n + " * " + i +" = "+n*i);
        }
    }

    public static void main(String[] args) {
        tableFun(5);
    }
}