/**
 * backtracking
 */
public class backtracking {
    public static void perm(String str , int index , String permm) {
        if (str.length()==0) {
            System.out.println(permm);
            return ;
        }
        for (int i = 0; i < str.length(); i++) {
            char current =str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            perm(newstr, index+1, permm+current);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        perm(str, 0, "");

    }
}