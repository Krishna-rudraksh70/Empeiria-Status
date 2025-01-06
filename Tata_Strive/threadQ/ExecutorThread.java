package threadQ;

import java.util.concurrent.*;

class Task implements Runnable {
    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " - Executing Task: " + taskName);

            Thread.sleep(2000);  
            System.out.println(Thread.currentThread().getName() + " - Completed Task: " + taskName);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + " - Task was interrupted.");
        }
    }
}

public class ExecutorThread {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            Task task = new Task("Task-" + i);
            executorService.submit(task);
        }

        executorService.shutdown();

        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
