package com.question.problem;

import org.springframework.stereotype.Component;

@Component
public class ConcurrentThread {
    
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCounter() {
        return count;
    }

}
