import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * reverse a string abcd = dcba
 */


// public class iml_recursion {

//     public static void sumit(String str , int ind)
//     {
//         if (ind==0) {
//             System.out.println(str.charAt(ind));
//             return;
//         }
//         System.out.print(str.charAt(ind));
//         sumit(str, ind-1);
//     }
//     public static void main(String[] args) {
//         String str = "harsh";
//         sumit(str,str.length()-1);       
//     }
// }

/* find the first & last occurence of the element in the given string */

/**
 * iml_recursion
 */

/*
public class iml_recursion {

    public static int first = -1 ;
    public static int last = -1 ;

    public static void sumit(String str , int index , char ele)
    {
        if (index==str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        int ce = str.charAt(index);
        if (ce==ele) {
            if (first==-1) {
                first = index;
            }
            else
            {
                last = index;
            }
        }
        sumit(str, index+1, ele);
    }
    public static void main(String[] args) {
        String str = "abaackdefaah";
        sumit(str, 0, 'a');
    }
}*/


/*check if an array is sorted (strictly increasing) */
/*
public class iml_recursion {
    public static boolean sumit(int arr[],int inedex)
    {
        if (inedex==arr.length-1) {
            return true ;
        }
        if (arr[inedex]<arr[inedex+1]) { // >= for unsorted array
            return sumit(arr, inedex+1); // or return false
        }
        else // return sumit(arr,index+1); inside of else condition
        {
            return false ;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(sumit(arr, 0));
    }
}
*/

/* move all 'x' character to the end of the string 
 * ex --> "axbcxx" then new string is "abcxxx"
*/

/*
public class iml_recursion {

    public static void sumiit(String str , int index , int count , String newstr)
    {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newstr+='x';
            }
            System.out.println(newstr);
            System.out.println("total number of x is : "  + count);
            return ;
        }
        char current = str.charAt(index);
        if (current =='x') {
            count++;
            sumiit(str, index+1, count, newstr);
        }
        else
        {
            newstr+=current;
            sumiit(str, index+1, count, newstr);
        }
    }
    public static void main(String[] args) {
        sumiit("abxcxcxx", 0, 0, "");
    }
}
*/

/* remove a duplicate in a string */

/* 
public class iml_recursion {
    public static boolean[] map = new  boolean[26];
    public static void sumit(String str , int index , String newstring)
     // creating function

     {
        if (index==str.length()) {
            System.out.println(newstring);
            return;
        }
        char current = str.charAt(index);
        if (map[current-'a']==true) {
            sumit(str, index+1, newstring);
        }
        else
        {
            newstring+=current;
            map[current -'a'] = true;
            sumit(str, index+1, newstring);
        }
     }

    public static void main(String[] args) {
        String str = "abbcdddfrg";
        sumit(str, 0, "");
    }
}

*/

/*important 
 * print all the subsequences of a given string 
 */

//  public class iml_recursion {
//     public static void sumit(String str , int index , String newstr)
//     {
//         if (index == str.length()) {
//             System.out.println(newstr);
//             return ;
//         }
//         char current = str.charAt(index); // for index 0 is 'a'

//         sumit(str, index+1, newstr+current); 
//         sumit(str, index+1, newstr);
//     }
 
//     public static void main(String[] args) {
//         String str = "abc";
//         sumit(str, 0, "");
//     }
//  }


/*
 * print all the "unique" subsequences of a given string
 */

 /**
  * iml_recursion
  */
  /* hash set -- help to find the unique  element */


//    public class iml_recursion {
//     public static void sumit(String str , int index , String newstr,HashSet<String> set)
//     {
//         if (index == str.length()) {
//             if (set.contains(newstr)) {
//                 return;
//             } else {
//                 System.out.println(newstr);
//                 set.add(newstr);
//                 return ;
                
//             }
//         }
//         char current = str.charAt(index); // for index 0 is 'a'

//         sumit(str, index+1, newstr+current,set); 
//         sumit(str, index+1, newstr,set);
//     }
 
//     public static void main(String[] args) {
//         String str = "bbb";
//         HashSet<String> set = new HashSet<>();
//         sumit(str, 0, "",set);
//     }
//  }




/* print keyboard combination
 * abc def gef ..................
 */

 /**
  * iml_recursion
  */
 public class iml_recursion {
     public static String[] kp = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"}; // static string array
    public static void sumit(String str , int index , String combination) {
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char current = str.charAt(index);
        String mapping = kp[current-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            sumit(str, index+1, combination+mapping.charAt(i));
        }
        }
    public static void main(String[] args) {
        String str = "4";
        sumit(str, 0, "");
    }
 }