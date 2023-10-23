import java.util.ArrayList;

/* Print all permitution of a string */

// public class recursion_advanced {
//     public static void printperm(String str , String permitution) {

//         if (str.length()==0) {
//             System.out.println(permitution);
//             return ;
//         }
//         for (int i = 0; i < str.length(); i++) {
//             char current = str.charAt(i);
//             String newstr = str.substring(0, i) + str.substring(i+1);
//             printperm(newstr, permitution+current);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         printperm(str, "");
//     }
// }



/* Count total paths in a matrix (maze) to move from (0,0) to (n,m)
 * move either in right or down side .
*/
/**
 * recursion_advanced // time complexity --> n!
 */
// public class recursion_advanced {

//     public static int sumit(int i ,int j ,int n,int  m) {
//         if (i==n || j==m) {
//             return 0 ;
//         }
//         if (i==n-1 && j==m-1) {
//             return 1 ;
//         }
//         int down = sumit(i+1, j, n, m);
//         int right = sumit(i, j+1, n, m);
//         return down + right ;

//     }
//     public static void main(String[] args) {
//         int m = 3 ;
//         int n = 3 ;
//         System.out.println(sumit(0, 0, n, m));
//     }
// }

/**
 * place tiles of size 1*m in a floor of size n*m using java
 */
/**
 * recursion_advanced
 */

 /*
public class recursion_advanced {
    public static int placeTiles(int n,int m) {
        if (n==m) {
            return 2 ;
        }
        if (n<m) {
            return 1 ;
        }
        int vert = placeTiles(n-m, m);

        int horiz = placeTiles(n-1, m);

        return vert + horiz ;
    }

    public static void main(String[] args) {
        int m = 2 , n = 4 ;
        System.out.println(placeTiles(n, m));
    }
}

*/

/* find the number of ways in which you can invite n people to your party, single or in pairs  */

/**
 * recursion_advanced
 */
// public class recursion_advanced {
//     public static int inviteGuest(int n ) {
//         if (n<=1) {
//             return 1 ;
//         }
//         int way1 = inviteGuest(n-1);

//         int way2 = (n-1) * inviteGuest(n-2);

//         return way1  + way2;
//     }

//     public static void main(String[] args) {
//         int n = 3 ;
//         System.out.println(inviteGuest(n));
//     }
// }



/* print all the subset of a set of first n natural numbers */

/*
public class recursion_advanced {

    public static void printt(ArrayList<Integer> subset) {
     for (int index = 0; index < subset.size(); index++) {
        System.out.print(subset.get(index));
     }
     System.out.println();
    }
    public static void sumit(int n , ArrayList<Integer> subset) {
    if (n==0) {
        printt(subset);
        return;
    }
        subset.add(n);
        sumit(n-1, subset);
        subset.remove(subset.size()-1);
        sumit(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3 ;
        ArrayList<Integer> subset = new ArrayList<>();
        sumit(n, subset);

    }
}


*/