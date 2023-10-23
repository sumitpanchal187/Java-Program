// divide & conquer
public class merge_sort {
    public static void conquer(int arr[] , int si , int mid , int ei) {
        
        int merger [] = new int[ei-si+1]; // merger array creation

        int ind1 = si ; // index 1 starting from start index
        int ind2 = mid + 1 ; // index2 starting from mid+1 index
        int x = 0 ; // merge index 
        
        while (ind1<=mid && ind2<=ei) {
            if (arr[ind1] <= arr[ind2]) {
                merger[x++] = arr[ind1++];
            }
            else
            {
                merger[x++] = arr[ind2++];
            }
        }
        while (ind1 <= mid) {
            merger[x++] = arr[ind1++];
        }
        while (ind2 <= ei) {
            merger[x++] = arr[ind2++];
        }

        for (int i = 0,j=si; i < merger.length; i++,j++) {
            arr[j] = merger[i];
        }

    }
    public static void divide(int arr[],int si , int ei) 
    {

        if (si>=ei) {
            return ;
        }

        int mid = si + (ei-si)/2 ; // (ei + si)/2

        // divide
        divide(arr, si, mid);
        divide(arr, mid+1, ei);

        // conquer
        conquer(arr, si, mid, ei);




    }
    public static void printsp(int arr[] , int n)
    {
        // print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        
        divide(arr, 0, n-1);
        printsp(arr, n);

    }
}

// time complexity : n * logn
 