package com.question.task;

import com.question.problem.ConcurrentThread;
import com.question.solution.ImmutableBean;
import com.question.solution.PrototypeScope;
import com.question.solution.SynchronizingAccess;

public class CounterTask<T> implements Runnable {

    private final T sol;

    public CounterTask(T sol) {
        this.sol = sol;
    }

    @Override
    public void run() {

        // System.out.println("\nStarting thread for "+ sol.toString() + "\tCurrent thread: " + Thread.currentThread().getName());
        System.out.println("\nStarting thread for "+ sol.toString());

        if (sol instanceof ConcurrentThread) {
            for (int i = 0; i < 100000; i++) {
                ((ConcurrentThread) sol).increment();
                // System.out.println("Thread: " + Thread.currentThread().getName() + " increased by 1 result: " + ((ConcurrentThread) sol).getCounter());
            }
            System.out.println("\n" + sol.toString() + " count: " + ((ConcurrentThread) sol).getCounter());
        }
        else if (sol instanceof ImmutableBean)
            System.out.println("\n" + sol.toString() + " count: " + ((ImmutableBean)sol).getCounter());
        else if (sol instanceof PrototypeScope) {
            for (int i = 0; i < 100000; i++) {
                ((PrototypeScope) sol).increment();
                // System.out.println("Thread: " + Thread.currentThread().getName() + " increased by 1 result: " + ((PrototypeScope) sol).getCounter());
            }
            System.out.println("\n" + sol.toString() + " count: " + ((PrototypeScope) sol).getCounter());
        }
        else if (sol instanceof SynchronizingAccess) {
            for (int i = 0; i < 100000; i++) {
                ((SynchronizingAccess) sol).increment();
            }
            System.out.println("\n" + sol.toString() + " count: " + ((SynchronizingAccess) sol).getCounter());
        }
    }

}