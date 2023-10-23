// import java.util.regex.*;

// // import java.util.regex;

// /* class or interface provided by java.util.regex
//  * MatchResult interface
//  * Matcher class
//  * Pattern class
//  * PatternSyntaxException class
//  */

// public class RegEx {
//     public static void main(String[] args) {

//     // 1st way
//         // Pattern p = Pattern.compile("..d");
//         // Matcher m = p.matcher("asd");
//         // boolean b = m.matches();
//         // System.out.println(b);
//     // 2nd way
//         // boolean b1 = Pattern.compile("..s").matcher("ads").matches();
//         // System.out.println(b1);

//     // 3rd way

//         // boolean b3 = Pattern.matches(".s", "as");
//         // System.out.println(b3);

//         // System.out.println(Pattern.matches("[abc]{1,5}", "bbbbbb"));

//         // System.out.println(Pattern.matches("\\B", "hello"));

        

        
//     }
// }


import java.util.regex.Pattern;  
import java.util.Scanner;  
import java.util.regex.Matcher;    
public class RegEx
{    
    public static void main(String[] args){   
        while (true) {
            Scanner x = new Scanner(System.in);
            Pattern p = Pattern.compile(x.nextLine());
            Matcher m = p.matcher(x.nextLine());

            boolean found = false;
            while (m.find()) {
                System.out.println(m.group());
                found = true;
            }
            if (!found) {
                System.out.println("No match found");
            }

        } 
    }    
}    