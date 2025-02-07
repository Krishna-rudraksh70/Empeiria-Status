package com.question;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.question.config.AppConfig;

import com.question.problem.ConcurrentThread;

import com.question.solution.ImmutableBean;
import com.question.solution.PrototypeScope;
import com.question.solution.SynchronizingAccess;
import com.question.task.CounterTask;


public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {

            ConcurrentThread concurrentThread = context.getBean(ConcurrentThread.class);
            ImmutableBean immutableBean  = context.getBean(ImmutableBean.class);
            PrototypeScope prototypeScope  = context.getBean(PrototypeScope.class);
            SynchronizingAccess synchronizingAccess  = context.getBean(SynchronizingAccess.class);

            Thread t11 = new Thread(new CounterTask<>(concurrentThread));
            Thread t12 = new Thread(new CounterTask<>(concurrentThread));
            Thread t13 = new Thread(new CounterTask<>(concurrentThread));

            t11.start();
            t12.start();
            t13.start();

            t11.join();
            t12.join();
            t13.join();

            System.out.println("Unsynchronized : " + concurrentThread.getCounter());

            Thread t2 = new Thread(new CounterTask<>(immutableBean));

            t2.start();
            t2.join();
            System.out.println("Immutable Bean : " + immutableBean.getCounter());

            Thread t31 = new Thread(new CounterTask<>(prototypeScope));
            Thread t32 = new Thread(new CounterTask<>(prototypeScope));
            Thread t33 = new Thread(new CounterTask<>(prototypeScope));

            t31.start();
            t32.start();
            t33.start();

            t31.join();
            t32.join();
            t33.join();

            System.out.println("Prototype Scope : " + prototypeScope.getCounter());

            Thread t41 = new Thread(new CounterTask<>(synchronizingAccess));
            Thread t42 = new Thread(new CounterTask<>(synchronizingAccess));
            Thread t43 = new Thread(new CounterTask<>(synchronizingAccess));

            t41.start();
            t42.start();
            t43.start();

            t41.join();
            t42.join();
            t43.join();

            System.out.println("Synchronized : " + synchronizingAccess.getCounter());

        }

    }

}
