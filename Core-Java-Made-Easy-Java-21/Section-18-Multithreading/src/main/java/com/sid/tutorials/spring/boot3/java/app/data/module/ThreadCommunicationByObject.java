package com.sid.tutorials.spring.boot3.java.app.data.module;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kunmu On 24-04-2026
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThreadCommunicationByObject implements Runnable {
    private PrintClass isPrinted;
    private int threadId;
    private int maxValue;

    @Override
    public void run() {
        while (true) {
            synchronized (isPrinted) {
                print();
            }
        }
    }

    public void print() {
        if (isPrinted.getNextThreadId() != threadId && isPrinted.getPrintValue() <= maxValue) {
            try {
                isPrinted.wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        // Only print if value is less than maxValue
        if (isPrinted.getPrintValue() <= maxValue) {
            isPrinted.print(threadId);
            isPrinted.printValueIncrement();
            assignNextThread();
        }
        isPrinted.notifyAll();
    }

    private void assignNextThread() {
        switch (threadId) {
            case 1:
                isPrinted.setNextThreadId(2);
                break;
            case 2:
                isPrinted.setNextThreadId(3);
                break;
            case 3:
                isPrinted.setNextThreadId(1);
                break;
            default:
                System.out.println("Invalid Thread Id");
        }
    }
}
