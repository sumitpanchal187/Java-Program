import java.util.Scanner;

/**
 * array2d
 */
/*public class array2d {

    public static void main(String[] args) {
        // int[] marks = new int [5]; // 1D array
        // int marks[] = new int [5];
        // int marks[] = {1,2,3,4,5};

        // 2D ARRAY Creation 
        Scanner sc = new  Scanner(System.in);  
        int row = sc.nextInt();     
        int col = sc.nextInt();     
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //  output

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/

/*
 * 
 
public class array2d {

    public static void main(String[] args) {

        // 2D ARRAY Creation 
        Scanner sc = new  Scanner(System.in);  
        int row = sc.nextInt();     
        int col = sc.nextInt();     
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]==x)
                {
                    System.out.println("x found at location : ("+i+","+j+")");
                }
            }
        }
        // //  output

        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}

*/

/**
 * array2d
 */
public class array2d {

    public static void main(String[] args) {
        System.out.println("enter a size of 2d array");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt() ;
        int c = sc.nextInt() ;

        int arr[][] = new int [r][c];

        System.out.println("Enter a rows & col values : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("OUTPUT");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
            System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        

        
    }
}