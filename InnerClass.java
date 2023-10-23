interface sumit
{
    void sum();
    interface harsh
    {
        void har();
    }
}
class sp implements sumit.harsh,sumit{
    public void har(){
        System.out.println("harsh paramar");
    }
    public void sum(){
        System.out.println("sumit panchal");
    }
}
/**
 * InnerClass
 */
public class InnerClass {

    public static void main(String[] args) {
        sp s = new sp();
        s.har();
        s.sum();
    }
}
