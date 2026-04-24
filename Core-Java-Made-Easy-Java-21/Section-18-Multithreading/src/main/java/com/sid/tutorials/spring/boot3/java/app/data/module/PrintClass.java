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
public class PrintClass {
    private int nextThreadId;
    private int printValue;

    public void print(int threadId) {
        System.out.println(Thread.currentThread().getName() + " "
                + threadId + " Printing...: " + printValue);
    }

    public void printValueIncrement() {
        this.printValue++;
    }
}
