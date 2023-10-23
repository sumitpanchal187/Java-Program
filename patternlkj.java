public class patternlkj {
    public static void main(String[] args) {
        int n = 5 ;
        for (int i = 0; i <n; i++) {
            if (i==2) {

                for (int j = 0; j < 5; j++) {
                    System.out.print("*    ");
                }
                // System.out.println();
            }
            for (int j = 2*(n-i); j >=0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                if (i==2) {
                    break;
                }else{
                System.out.print("*   ");
            }}
            System.out.println();
        }
        int x = 2 ;

        for (int i = x; i >= 0 ; i--) {
            for (int j = 0; j <=i; j++) {
                if (i==2) {
                    
                    System.out.print("   ");
                }else
                {
                    System.out.print("      ");

                }
            }
            for (int j = i-1; j >=0; j--) {
                System.out.print("*   ");
            }
            System.out.println();
            
        }
    }
}
