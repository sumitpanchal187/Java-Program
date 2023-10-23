class A{
    void printTable(int n)
    {
        synchronized(this)
        {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
}

class B extends Thread{
    A t;
    B(A t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}

class C extends Thread{
    A t;
    C(A t){
        this.t = t;
    }
    public void run(){
        t.printTable(7);
    }
}
public class Synchronization {

    public static void main(String[] args) {
        A t1 = new A();
        B b = new B(t1);
        C c = new C(t1);
        b.start();
        c.start();

    }
}