// // class sumit extends Thread
// class sumit implements Runnable
// {
//     public void run()
//     {
//         System.out.println("thread is running.......");
//     }
// }
// /**
//  * thread
//  */
// public class thread {

//     public static void main(String[] args) {
//         sumit s = new sumit();
//         Thread t = new Thread(s);
//         // s.start();
//         t.start();
//     }
// }

// public class thread  implements Runnable{

//     @Override
//     public void run() {
//         System.out.println("harsh chutmarika loda lund");
//     }
//     public static void main(String[] args) {
//         Runnable r = new thread();
//         Thread t = new Thread(r,"sumit");

//         t.start();

//         System.out.println(t.getName());
//     }
// }


/**
 * practice
 */
// public class thread extends Thread{
//     public void run(){
//         for (int i = 1; i < 15; i++) {
//             try {
//                 Thread.sleep(900);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//                 // TODO: handle exception
//             }
//             System.out.println(i);
//         }
//     }
// public static void main(String[] args) {
//     practice p =new practice();
//     p.start();
// }
    
// }

// public class thread extends Thread {
//     public void run()
//     {
//         System.out.println("Running.....");
//     }
//     public static void main(String[] args) {
//         practice p1 = new practice();
//         practice p2 = new practice();
//         practice p3 = new practice();

//         System.out.println(p1.getPriority());
//         System.out.println(p2.getPriority());
//         System.out.println(p3.getPriority());

//         p1.setPriority(6);
//         p2.setPriority(3);
//         p3.setPriority(9);

//         System.out.println(p1.getPriority());
//         System.out.println(p2.getPriority());
//         System.out.println(p3.getPriority());

//         System.out.println(Thread.currentThread().getName());
//         System.out.println(Thread.currentThread().getPriority());
        
//         Thread.currentThread().setPriority(MIN_PRIORITY);
        
//         System.out.println(Thread.currentThread().getPriority());

//     }
    
// }

public class thread extends Thread {
    public void run()
    {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon thread work");
        } else {
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        practice p = new practice();
        practice p1 = new practice();
        practice p2 = new practice();
        p.setDaemon(true);
        p1.setDaemon(true);
        p.start();
        p1.start();
        p2.start();

    }
}