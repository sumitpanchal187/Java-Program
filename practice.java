/**
 * practice
 */
public class practice {
    public void finalize()
    {
        System.out.println("object is garbage collector");
    }
    public static void main(String[] args) {
        practice p = new practice();
        practice pw = new practice();
        p = null;
        pw = null;
        System.gc();
    }
}