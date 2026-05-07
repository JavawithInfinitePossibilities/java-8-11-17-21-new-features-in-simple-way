package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

/**
 * @author kunmu On 07-05-2026
 * Try with resources improved.
 */
public final class TryResourcesExmpl implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing the resource...!!!");
    }
}
