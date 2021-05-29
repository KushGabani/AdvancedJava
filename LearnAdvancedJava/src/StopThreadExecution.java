public class StopThreadExecution implements Runnable{
    private volatile boolean exit = false;
    @Override
    public void run() {
        while (!exit) {
            System.out.println("Thread Status: Running.");
        }
        System.out.println("Thread Status: Stopped.");
    }

    public void stop() {
        exit = true;
    }

    public static void main(String[]args) throws InterruptedException {
        StopThreadExecution userThread = new StopThreadExecution();
        Thread thread = new Thread(userThread, "1");
        thread.start();

        System.out.println("main is stopping user thread");
        userThread.stop();
        Thread.sleep(2000);
        System.out.println("main is finished now");
    }
}
