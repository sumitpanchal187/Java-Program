// public class exceptionHandling1 {
//     public static void main(String[] args) {
//         try {
//             try {
//                 // System.out.println("Going to divide by 0");
//                 int a = 45/1;
//             } catch (ArithmeticException e) {
//                 System.out.println(e);
//             }
//             try{
//                 int a[] =new int[5];
//                 a[2] = 45;
//             }
//             catch(ArrayIndexOutOfBoundsException a){
//                 System.out.println(a);
//             }
//             // System.out.println("other statement");
//         }
//         catch(Exception e)
//         {
//             System.out.println("exception occure");
//         }
//         System.out.println("sumit panchal");   
//     }
// }

/**
 * exceptionHandling1
 */
public class exceptionHandling1 {

    public static void main(String[] args) {
        try {
            int a = 5/0;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            // int b = 8/0;
            System.out.println(e);
        }
    }
}