/**
 * patterns
 */
public class patterns {

    public static void main(String[] args) {
        // for (int i = 1; i <=4; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int m = 4;
        int n = 5; 
        // for (int i = 1; i <= 4; i++) {
        //     for (int j = 1; j <=5 ; j++) {
        //         if(i==1 ||j==n ||j==1 ||i==m)
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // for (int i = m; i >=1; i--) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 10; i >=1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= n ; i++) {
        //     for (int j = 1; j <=n-i+1; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // int num = 1 ;

        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         int sum = i + j;
        //         if(sum%2==0)
        //         {
        //             System.out.print("1");
        //         }
        //         else
        //         {
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <=n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }







    }

}