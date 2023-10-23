import java.util.ArrayList;

// /* charAt() Method in string */
// public class StringMethod {
//     public static void main(String[] args) {
//         String s = "javatpoint";

//     /* charAt */
//         // System.out.println(s.charAt(4));
//         // System.out.println(s.charAt(0));
//         // System.out.println(s.charAt(s.length()-1));

//         // for (int i = 0; i <= s.length(); i++) {
//         //     if (i%2!=0) {
//         //         System.out.println(s.charAt(i));
//         //     }
//         // }

//         // String str = "Welcome to javatpoint portal";
//         // int count = 0 ;
//         // for (int i = 0; i < str.length(); i++) {
//         //     if (str.charAt(i)=='t') {
//         //         count++;
//         //     }
//         // }
//         // System.out.println(count);

//     /* Counting the Number of Vowels in a String by Using the chatAt() Method */
//         // int count = 0 ;
//         // for (int i = 0; i <s.length(); i++) {
//         //     if (s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||
//         //     s.charAt(i)=='u'||s.charAt(i)=='U'||s.charAt(i)=='o'||s.charAt(i)=='O') {
//         //         System.out.println(s.charAt(i));
//         //         count++;
//         //     }

//         // }
//         // System.out.println(count);
            
        

//     }
// }


/* CompareTo() */

public class StringMethod {

    public static void main(String[] args) {
        // String s1 = "hello";
        // String s2 = "";
        // String s3 = "HELLO";

        // System.out.println(s1.compareTo(s2));
        // System.out.println(s1.compareTo(s3));
        // System.out.println(s2.compareTo(s3));
        
    /* Concat */

        // String s1 = "Java" ,s2 ="tpoint",s3="hello";
        // // s1 = s1.concat(s2.concat(s3));
        // // System.out.println(s1);

        // String s4 = s1.concat(" ").concat(s2).concat(" ").concat(s3);
        // System.out.println(s4);
        
        // s4=s4.concat("!!!");
        // System.out.println(s4);
        
        // s4=s4.concat("@").concat(s1);
        // System.out.println(s4);

    /* contains */
        
        // String str = "hello my name is sumit panchal";

        // System.out.println(str.contains("Sumit"));
        // System.out.println(str.contains("sumit"));

    /* endsWith() */
        
        // System.out.println(str.endsWith(""));
        // System.out.println(str.endsWith(" "));

    /* Equals() */
        
        // String s1 = "sumit";
        // ArrayList<String> list = new ArrayList<>();
        // list.add("sumit");
        // list.add("rahul");
        // list.add("harsh");

        // for (String i : list) {
        //     if (i.equals(s1)) {
        //         System.out.println("sumit panchal");
        //     }
        // }

    /* Format */
        // String name ="Sumit";
        // System.out.println(String.format("%s", name));
        // System.out.println(String.format("%f", 3.546));
        // System.out.println(String.format("%c", 3));

        /*getbytes () */

        // String s = "ABCDabcd";

        // for (int i = 0; i < s.length(); i++) {
        //     System.out.println(s.getBytes()[i]);
        // }

        // String se = new String(s.getBytes());
        // System.out.println(se);

        // String str = new String("Hello sumit how are you");
        // char[] ch = new char[10];
        // try 
        // {
        //     str.getChars(6, 11, ch, 3);
        //     System.out.println(ch);
        // } 
        // catch (Exception e) 
        // {
        //     System.out.println(e);
        // }

        
    }
}