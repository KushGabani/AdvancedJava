public class PriorityThreads extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Running: " + Thread.currentThread().getName());
        System.out.println("Priority Level: " + Thread.currentThread().getName());
    }

    public static void main(String[]args) {
        PriorityThreads pt1 = new PriorityThreads();
        PriorityThreads pt2 = new PriorityThreads();

        pt1.setPriority(Thread.MIN_PRIORITY);
        pt2.setPriority(Thread.MAX_PRIORITY);
        pt1.start();
        pt2.start();
    }
}
