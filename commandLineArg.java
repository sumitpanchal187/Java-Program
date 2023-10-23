// /**
//  * commandLineArg
//  */
// public class commandLineArg {

//     public static void main(String[] args) {
//         if (args.length > 0) {
//             System.out.println("Command line arg are : ");
//             for (String s : args) {
//                 System.out.println(s);
//             }
//         }
//         else{
//             System.out.println("Command line not found");
//         }
//     }
// }
/**
 * commandLineArg
 */
public class commandLineArg {

    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}