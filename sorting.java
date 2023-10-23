/*

public class sorting {
    public static void sumit(int arr[]) // function creation for print array
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
    }
    public static void main(String[] args) { // main function 
        // toatal 3 type of sorting
        // bubble , selection , insertion
        
        // 1) bubble sorting
        int arr[]={7,8,3,1,2};
        for (int i = 0; i < arr.length-1; i++) { // position n-1 
            for (int j = 0; j < arr.length-i-1; j++) { // n-1 
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        sumit(arr);

        // TC : n^2
    }
}
*/
/**
 *  selection sorting
 */
/*
 
public class sorting {

    public static void main(String[] args) {
            int arr[] = {7,8,3,1,2};
            for (int i = 0; i < arr.length-1; i++) {
                int smallest = i;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[smallest]>arr[j]) {
                        smallest=j;

                    }
                }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            }
            // print statement 
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");
            }
    }
}

*/

/**
 * insertion sorting
 */

 /*
public class sorting {
    static void sumit(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] =  {7,8,3,1,2}; // array creation
        for (int i = 1; i < arr.length; i++) { // check for only unsorted array
            int current = arr[i]; // add sorted element in current variable
            int j = i-1; // sorted element
            while(j>=0 && current<arr[j])
            {
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = current;
        }
        sumit(arr);
    }
}*/