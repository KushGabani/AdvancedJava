public class ThreadBasics102 extends Thread{
    private Thread thread;
    private final String threadName;

    public ThreadBasics102(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running Thread: " + this.threadName);
        try {
            for(int i = 0; i < 4; i++) {
                System.out.println("Thread " + this.threadName + " - " + i);
                Thread.sleep(50);
            }
        } catch(InterruptedException e) {
            System.out.println("Thread: " + this.threadName + " interrupted.");
        }
        System.out.println("Thread: " + this.threadName + " exiting...");
    }

    public void config() {
        System.out.println("Creating Thread: " + this.threadName);
        if(this.thread == null) {
            this.thread = new Thread(this, this.threadName);
            this.thread.start();
        }
    }

    public static void main(String[]args) {
        ThreadBasics102 thread1 = new ThreadBasics102("1");
        ThreadBasics102 thread2 = new ThreadBasics102("2");

        thread1.config();
        thread2.config();
    }
}
