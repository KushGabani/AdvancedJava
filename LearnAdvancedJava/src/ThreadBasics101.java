public class ThreadBasics101 implements Runnable {
    private Thread thread;
    private final String threadName;

    ThreadBasics101(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating Thread: " + this.threadName);
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
        System.out.println("Starting Thread: " + this.threadName);
        if(this.thread == null) {
            this.thread = new Thread(this, this.threadName);
            this.thread.start();
        }
    }

    public static void main(String[]args) {
        ThreadBasics101 thread1 = new ThreadBasics101("1");
        ThreadBasics101 thread2 = new ThreadBasics101("2");

        thread1.config();
        thread2.config();
    }
}
