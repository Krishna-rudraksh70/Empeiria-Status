package com.question.solution;

public class SynchronizingAccess {
    
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCounter() {
        return count;
    }

}
