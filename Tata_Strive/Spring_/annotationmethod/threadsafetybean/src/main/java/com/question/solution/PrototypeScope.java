package com.question.solution;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeScope {
    
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCounter() {
        return count;
    }

}
