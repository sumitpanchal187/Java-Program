class sumit extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println(e);
                // TODO: handle exception
            }
            System.out.println(i);
        }
    }
}


public class JoinThread {
    public static void main(String[] args) {
        sumit s = new sumit();
        s.start();
        try {
            System.out.println("s : " + Thread.currentThread().getName());
            s.join();
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }
    }
}
