package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

/**
 * @author kunmu On 07-05-2026
 * 3.   Private Methods in Interfaces
 */
public interface SendNotification {
    void send(String message, String from, String to);

    default void sendNotifications(String message, String from, String to) {
        System.out.println("Sending notification: " + message + " from: " + from + " to: " + to);
        System.out.println("Performing some pre-processing before sending the notification...");
        System.out.println("Sending Multiple notifications: " + message + " from: " + from + " to: " + to);
        this.establishConnection();
        this.send(message, from, to);
    }


    static void sendNotification(String message, String from, String to) {
        System.out.println("Sending notification: " + message + " from: " + from + " to: " + to);
        System.out.println("Performing some pre-processing before sending the notification...");
        System.out.println("Sending one notifications: " + message + " from: " + from + " to: " + to);
        establishConnectionUsingAws();
        new SendnotificationImpl().send(message, from, to);
    }

    private void establishConnection() {
        System.out.println("Establishing connection...!!!");
    }

    private static void establishConnectionUsingAws() {
        System.out.println("Establishing connection using AWS...!!!");
    }
}
