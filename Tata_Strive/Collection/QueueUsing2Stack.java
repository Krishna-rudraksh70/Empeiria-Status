import java.util.Scanner;
import java.util.Stack;

class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    void enqueue(int n) {
        s1.push(n);
    }

    int dequeue() {
        if (s1.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (s2.isEmpty())
            while (!s1.isEmpty())
                s2.push(s1.pop());

        return s2.pop();
    }

    boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    int peek() {
        if (s1.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        if (s2.isEmpty())
            while (!s1.isEmpty())
                s2.push(s1.pop());

        return s2.peek();

    }
}

public class QueueUsing2Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue queue = new MyQueue();
        
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a number to enqueue: ");
                    int value = sc.nextInt();
                    queue.enqueue(value);
                }
                case 2 -> {
                    try {
                        System.out.println("Dequeued: " + queue.dequeue());
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        System.out.println("Peek: " + queue.peek());
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 -> {
                    System.out.println("Queue is empty: " + queue.isEmpty());
                }
                case 5 -> {
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}