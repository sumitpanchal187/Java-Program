
 /*
public class recursion {
    public static void sumit(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        sumit(n-1);
    }

    public static void main(String[] args) {
        sumit(5);
    }
}

*/

/*
 public class recursion {
    public static void sumit(int n)
    {
        if (n==6) {
            return;
        }
        System.out.println(n);
        sumit(n+1);
    }

    public static void main(String[] args) {
        sumit(1);
    }
}
*/

/**
 * recursion
 */

 /*
public class recursion {
    public static void sumit(int i , int n , int sum)
    {
        if (i==n) {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        sumit(i+1, n, sum);
    }

    public static void main(String[] args) {
        sumit(0, 5, 0);
    }
}*/

/**
 * recursion
 */
/**
 * recursion
 *//*
public class recursion {
    public static int sumit(int n)
    {
        if(n==0 || n==1)
        {
            return 1 ;
        }
        int x = n* sumit(n-1);
        return x ;

    }

    public static void main(String[] args) {
        System.out.println(sumit(4));
    }
}*/

/**
 * fibonacci series using recursion
 */
/*
public class recursion {
    public static void fibo(int a,int b ,int n)
    {
        if (n==0) {
            return;
        }
        int c = a + b ;
        System.out.println(c);
        a = b;
        b = c ;
        fibo(a,b, n-1);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(0);
        System.out.println(1);
        fibo(0, 1, n-2);
}
}*/

/* print X^n (stack height = n) */

/**
 * recursion
 */

 /*
public class recursion {

    public static int sumit(int x , int n)
    {
        if (n==0) {
            return 1 ;
        }
        if (x==1) {
            return 0 ;
        }
        int xn = x * sumit(x, n-1);
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(sumit(5, 2));
    }
}

*/

/**
 * print x^n (stack height = logX^n)
 */

 /*
public class recursion {

    public static int sumit(int x , int n)
    {
        if (x==0) {
            return 0 ;
        }
        if (n==1) {
            return 1 ;
        }
        if (n%2==0) { // even number 
            return sumit(x, n/2) * sumit(x, n/2); // x^n --> x^n/2 * x^n/2 for even number 
        }
        else{ // odd number 
            return sumit(x, n/2) * sumit(x, n/2) * n; // x^n --> x^n/2 * x^n/2 * x^1 for odd number
        }
    }
    public static void main(String[] args) {
        System.out.println(sumit(2, 5));
    }
}*/