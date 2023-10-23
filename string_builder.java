import java.util.Scanner;

// /**
//  * string_builder
//  */
// public class string_builder {

//     public static void main(String[] args) {
//         // string in java is inmutable
//         StringBuilder foo = new StringBuilder("Sumit");
//         System.out.println(foo);

//         // char at index 0
//         System.out.println(foo.charAt(0));

//         // set char at index

//         foo.setCharAt(0, 'P');
//         System.out.println(foo);

//         // Insert the character at any 

//         foo.insert(0, "s");
//         System.out.println(foo);

//         // delete a character 
//         foo.delete(2, 3);
//         System.out.println(foo);

        
//     }
// }

/**
 * string_builder
 */
/**
 * string_builder
 */
import java.util.*;
public class string_builder 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        StringBuilder foo = new StringBuilder(x);
        
        for (int i = 0; i <foo.length()/2; i++) {
            int front = i;
            int back = foo.length()-1-i;
            char frontchar = foo.charAt(front); // add front variable value into forntchar
            char backchar = foo.charAt(back);

            foo.setCharAt(front,backchar);
            foo.setCharAt(back,frontchar);

        }
        System.out.println(foo);
    }
}