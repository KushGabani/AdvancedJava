public class MultithreadingWithoutSync extends Thread{
    private Thread thread;
    private final String threadName;
    dummyPrintClass dpc;

    MultithreadingWithoutSync(String threadName, dummyPrintClass dpc) {
        System.out.println("Creating thread: " + threadName);
        this.threadName = threadName;
        this.dpc = dpc;
    }

    @Override
    public void run() {
        dpc.printCount();
        System.out.println("Thread: " + this.threadName + " exiting..");
    }

    public void config() {
        System.out.println("Starting Thread");
        if(this.thread == null) {
            this.thread = new Thread(this, this.threadName);
            this.thread.start();
        }
    }

    public static void main(String[] args) {
        dummyPrintClass dpc = new dummyPrintClass();
        MultithreadingWithoutSync T1 = new MultithreadingWithoutSync("1", dpc);
        MultithreadingWithoutSync T2 = new MultithreadingWithoutSync("2", dpc);

        T1.config();
        T2.config();

        try {
            T1.join();
            T2.join();
        } catch(Exception E) {
            System.out.println("Interrupted.");
        }
    }
}