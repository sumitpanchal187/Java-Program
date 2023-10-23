class customer{
    int amount = 1000;

    synchronized void withdrawn(int amount)
    {
        System.out.println("going to withdrawn");
        if (this.amount<amount) {
            System.out.println("low balance");
            try {
                wait();
            } catch (Exception e) {}
        }
        this.amount -= amount;
        System.out.println("withdrawn completed"+this.amount);
    }
    synchronized void deposit(int amount)
    {
        System.out.println("going to deposit");
        this.amount += amount;
        System.out.println("deposit completed"+this.amount);
        notify();
    }
}
public class Inter_thread_communication {
    public static void main(String[] args) {
        customer c = new customer();
        new thread(){
            public void run()
            {
                c.withdrawn(500);
            }
        }.start();
        new thread(){
            public void run()
            {
                c.deposit(5000);
            }
        }.start();
    }
}
