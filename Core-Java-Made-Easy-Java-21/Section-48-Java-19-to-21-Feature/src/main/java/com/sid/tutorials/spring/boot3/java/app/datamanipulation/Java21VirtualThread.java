package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * @author kunmu On 08-05-2026
 */
/*
* Benefits of Virtual Threads:
1. Lightweight: Virtual threads are much lighter than traditional threads,
*               allowing you to create thousands or even millions of them without significant overhead.
2. Improved Concurrency: Virtual threads enable better concurrency and scalability,
*               especially in applications that involve a large number of I/O-bound tasks,
*               such as web servers or database applications.
3. Simplified Code: Virtual threads can simplify code by allowing you to write synchronous-looking code
*               that is actually asynchronous under the hood. This can make it easier to read and maintain.
4. Better Resource Utilization: Virtual threads can help improve resource utilization by allowing
*               you to efficiently manage a large number of concurrent tasks without blocking threads unnecessarily.
5. Enhanced Performance: In scenarios where there are many blocking operations,
*               virtual threads can help improve performance by allowing other tasks to continue executing
*               while waiting for I/O operations to complete.
* */
public class Java21VirtualThread {

    public void virtualThreadExample() throws InterruptedException {
        Runnable runnable = () -> {
            System.out.println("Running in virtual thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(Duration.ofSeconds(1));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Finished in virtual thread: " + Thread.currentThread().getName());
        };

        Thread vt = Thread.startVirtualThread(runnable);
        vt.join();
        System.out.println("Virtual thread has completed execution.");
    }

    public void vertualThreadWithExecutorServices() throws InterruptedException {
        System.out.println("Submitting tasks to virtual thread executor...");
        try(ExecutorService service= Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0,1000).forEach(i->{
                service.submit(()->{
                    System.out.println("Running in virtual thread: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(Duration.ofSeconds(1));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Finished in virtual thread: " + Thread.currentThread().getName());
                });
            });
        }
        System.out.println("All virtual threads have completed execution.");
    }
}
