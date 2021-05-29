public class SuspendThread extends Thread{
    private final String threadName;

    public SuspendThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Thread: " + this.threadName);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[]args) {
        SuspendThread t1 = new SuspendThread("1");
        SuspendThread t2 = new SuspendThread("2");
        SuspendThread t3 = new SuspendThread("3");

        t1.start();
//        t1.suspend();
        t2.start();
//        t1.resume();
        t3.start();
    }
}
