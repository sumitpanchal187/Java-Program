import java.util.*;
// /**
//  * string_ex
//  */

// //  Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
// public class string_ex {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner (System.in);
//         int size = sc.nextInt();
//         String array[] = new String[size];
//         int totLength = 0;


//         for(int i=0; i<size; i++) {
//         array[i] = sc.next();
//         totLength += array[i].length();
//         }


//         System.out.println(totLength);

//     }
// }


/**
 * string_ex
 */

 /*
 public class string_ex {
    public static void main(String args[]) {
      Scanner sc = new Scanner (System.in);
      String str = sc.next();
      String result = "";
 
 
      for(int i=0; i<str.length(); i++) {
        if(str.charAt(i) == 'e') {
          result += 'i';
        } else {
          result += str.charAt(i);
        }
      }
 
 
      System.out.println(result);
    }
 }
 */
/**
 * string_ex
 */
public class string_ex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();

        String un="";

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@') {
                break;
            }
            else
            {
                un += email.charAt(i);
            }
        }
        System.out.println(un);
    }
}