class DisplayThread extends Thread {
    private String message;

    public DisplayThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(1000); // Adjust the sleep duration as needed
            }
        } catch (InterruptedException e) {
            // Thread interrupted, exit gracefully
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        try {
            // Create and start the first thread
            DisplayThread thread1 = new DisplayThread("Thread 1: Hello!");
            thread1.start();

            // Create and start the second thread
            DisplayThread thread2 = new DisplayThread("Thread 2: Hi there!");
            thread2.start();

            // Wait for the user to press Ctrl+C to interrupt the program
            System.out.println("Press Ctrl+C to stop the threads.");
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            // Program interrupted, exit gracefully
        }
    }
}
