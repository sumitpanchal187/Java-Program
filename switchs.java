import java.util.*;
public class switchs {
    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);
        int button = foo.nextInt();

        // if(button == 1 )
        // {
        //     System.out.println("Hello");
        // }
        // else if(button == 2 )
        // {
        //     System.out.println("namste");
        // }
        // else
        // {
        //     System.out.println("kem cho ");
        // }

        /*Switch statment  */
        switch (button) {
            case 1:
                System.out.println("hello ");
                break;
            case 2:
                System.out.println("namaste ");
                break;
            case 3:
                System.out.println("Kem cho ");
                break;
        
            default:
            System.out.println("invalid buttton");
                break;
        }
    }
}
