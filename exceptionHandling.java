// import java.io.FileNotFoundException;
// import java.io.PrintWriter;

// /**
//  * exceptionHandling
//  */
// public class exceptionHandling {

//     public static void main(String[] args) {
//         try {
//             PrintWriter s = new PrintWriter("ert.txt");
//             s.println("sumit");
//         } catch (FileNotFoundException e) {
//             // TODO: handle exception
//             System.out.println(e);
//         }
//         System.out.println("file found");
//     }
// }
/*
public class exceptionHandling {

    public static void main(String[] args) {
        try {
            // int d = 50/0;

            // int[] d = {1,2,3,4,5};
            // // d[10] = 50;
            // System.out.println(d[10]);

            // String s = null ;
            // System.out.println(s.length());

            int a[] = new int[5];
            a[5] = 30/0;
            System.out.println(a[10]);

        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception occurs");
        } catch(ArrayIndexOutOfBoundsException r){
            System.out.println("Arrayindexoutofbound occurs");
        } catch (Exception a){
            System.out.println("exception occurs");
        }
        System.out.println("sumit panchal");
    }
}
*/

public class exceptionHandling {

    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 50/0;
        } catch(ArithmeticException a){
            // TODO: handle exception\
            System.out.println("exception");
        } catch(ArrayIndexOutOfBoundsException g){
            System.out.println("Arithmetic");
        } catch (Exception e) {
            System.out.println("Arrayindexofbound");
        }
        System.out.println("sumit");
    }
}