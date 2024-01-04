class FibonacciThread extends Thread {
    public void run() {
        int n = 20;
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series (first " + n + " terms):");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            try {
                Thread.sleep(100); // Adding delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ReverseOrderThread extends Thread {
    public void run() {
        System.out.println("\nNumbers from 9999 to 1 in Reverse Order:");
        for (int i = 9999; i >= 1; i--) {
            System.out.print(i + " ");

            try {
                Thread.sleep(50); // Adding delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        FibonacciThread fibonacciThread = new FibonacciThread();
        ReverseOrderThread reverseOrderThread = new ReverseOrderThread();

        fibonacciThread.start();
        reverseOrderThread.start();
    }
}
