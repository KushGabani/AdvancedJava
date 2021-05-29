class dummyPrintClass {
    public void printCount() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Counter - " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread Interrupted...");
        }
    }
}