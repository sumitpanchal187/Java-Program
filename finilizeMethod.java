class sumit{
    public void finalize(){
        System.out.println("garbage collector");
    }
}
public class finilizeMethod {

    public static void main(String[] args) {
        new sumit();
        System.gc();


    }
}