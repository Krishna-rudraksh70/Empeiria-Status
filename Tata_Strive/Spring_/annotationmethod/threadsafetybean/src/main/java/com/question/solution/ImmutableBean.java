package com.question.solution;

import org.springframework.stereotype.Component;

@Component
public class ImmutableBean {

    private final int counter;

    public ImmutableBean() {
        this.counter = 0;
    }

    public int getCounter() {
        return counter;
    }
    
}
