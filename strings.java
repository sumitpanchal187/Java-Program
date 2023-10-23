import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        // System.out.println("enter your name ");
        Scanner sc = new Scanner(System.in);
        // String x = sc.nextLine();
        // System.out.println("Your name is : "+x);
        
        // concatenation 

        String fn = "sumit";
        String ln = "panchal";
        String full = fn + " " + ln;
        System.out.println(full);

        // Length
        System.out.println(full.length());

        // chaAt
        System.out.println(full.charAt(0));
        for (int i = 0; i < full.length(); i++) {
            System.out.println(i + " : " + full.charAt(i));
        }

        // / compare strings

        String x = "Sumit";
        String y = "sumit";
        // if(x.compareTo(y)==0)
        if(x==y)
        {
            System.out.println("string are equal");
        }
        else
        {
            System.out.println("String are not equal");
        }

        String s = "Sumit panchal";
        String name = s.substring(6);
        System.out.println(name);

         // declare integer number using string data type
         String str = "180703";
         System.out.println(Integer.parseInt(str));

        //  ToString Method of String class
        int number= 187;
        String str1 = Integer.toString(number);
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
