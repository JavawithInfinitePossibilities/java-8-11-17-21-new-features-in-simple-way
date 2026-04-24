package com.sid.tutorials.spring.boot3.java.app.data.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author kunmu On 24-04-2026
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomExecutorServices extends Thread {
    private BlockingQueue<Runnable> taskQueue;
    boolean isShutdown;

    public CustomExecutorServices(int size) {
        this.taskQueue = new ArrayBlockingQueue<>(size);
    }

    public void addTask(Runnable task) throws InterruptedException {
        try {
            // Blocks until space is available in the queue
            taskQueue.put(task);
            System.out.println("Task added successfully. Queue size: " + taskQueue.size());
        } catch (InterruptedException e) {
            System.err.println("ERROR: Failed to add task - Thread interrupted!");
            Thread.currentThread().interrupt();
            throw e;
        }
    }

    // Alternative method with timeout
    public boolean addTaskWithTimeout(Runnable task, long timeout, TimeUnit unit) {
        try {
            boolean added = taskQueue.offer(task, timeout, unit);
            if (added) {
                System.out.println("Task added successfully. Queue size: " + taskQueue.size());
            } else {
                System.err.println("ERROR: Task Queue is FULL! Could not add task within " + timeout + " " + unit);
            }
            return added;
        } catch (InterruptedException e) {
            System.err.println("ERROR: Failed to add task - Thread interrupted!");
            Thread.currentThread().interrupt();
            return false;
        }
    }

    @Override
    public void run() {
        while (true && !isShutdown) {
            try {
                Runnable task = taskQueue.take();
                task.run();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
