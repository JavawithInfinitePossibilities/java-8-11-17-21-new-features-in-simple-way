package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

/**
 * @author kunmu On 07-05-2026
 */
public class SendnotificationImpl implements SendNotification {
    @Override
    public void send(String message, String from, String to) {
        System.out.println("Sending notification by implementing abstract method: " + message + " from: " + from + " to: " + to);
    }
}
