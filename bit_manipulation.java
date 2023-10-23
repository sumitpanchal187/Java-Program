import java.util.Scanner;

/**
 * bit_manipulation
 */
public class bit_manipulation {

     public static void main(String[] args) {
        // System.out.println(1010>>1);
        // get set update clear
        // 1) get bit
        // bit masl 1<<i (i= position) & perform and operation 1010 & 0100
        /*
        int n = 5 ;//0101
        int pos = 2; // 0010 
        int bm = 1<<2; // 0100
        if ((bm &n)==0) { // 0100 & 0101 
            System.out.println("bit was 0");            
        }
        else{
            System.out.println("bit was 1");
        }

        */

        /* Set bit */

        // int n = 5 , pos = 1 ,bm=1<<pos;
        // int new_number = bm | n;
        // System.out.println(new_number);


        /* clear bit */

        // int num = 5 ;
        // int pos = 2 ;
        // int bm = 1<<pos;
        // int new_num = ~bm&num;
        // System.out.println(new_num);



        /* UPDATE BIT */

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt(); // 0|1
        int num = 5 ;
        int pos = 1 ;
        int bm = 1<<pos;
        if (op==1) {
            // set bit operation
            int new__no = bm | num;
            System.out.println(new__no);

        }
        else if (op==0){
            int new___no = ~bm &num;
            System.out.println(new___no);
        }
        else
        {
            System.out.println("enter either 0 or 1 ");
        }
    }
}