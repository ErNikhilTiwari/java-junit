package org.bridgelabz;

public class Performance {
    public static void longRunningTask() {
        try {
            Thread.sleep(4000); // Simulates a long-running operation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
