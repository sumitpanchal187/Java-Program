import java.util.Scanner;
// import java.util.jar.Attributes.Name;

public class user_input {
    public static void main(String[] args) {
        // Scanner x = new Scanner(System.in);
        // String Name = x.nextLine();
        // System.out.println(Name);
        System.out.print("Enter a : ");
        Scanner x =  new Scanner(System.in);
        int a = x.nextInt();
        // System.out.println(a);
        System.out.print("Enter b : ");
        Scanner y =  new Scanner(System.in);
        int b = y.nextInt();
        // System.out.println(b);
        int c = a+b;
    

        System.out.println("Sum Of a and b is : " + c);
    }
}
