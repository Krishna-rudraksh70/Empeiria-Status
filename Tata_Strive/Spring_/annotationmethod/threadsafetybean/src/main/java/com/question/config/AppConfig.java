package com.question.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.question.problem.ConcurrentThread;

import com.question.solution.ImmutableBean;
import com.question.solution.PrototypeScope;
import com.question.solution.SynchronizingAccess;

@Configuration
public class AppConfig {

    @Bean
    public ConcurrentThread concurrentThread() {
        return new ConcurrentThread();
    }

    @Bean
    public ImmutableBean immutableBean() {
        return new ImmutableBean();
    }

    @Bean
    @Scope("prototype")
    public PrototypeScope prototypeScope() {
        return new PrototypeScope();
    }

    @Bean
    public SynchronizingAccess synchronizingAccess() {
        return new SynchronizingAccess();
    }

}