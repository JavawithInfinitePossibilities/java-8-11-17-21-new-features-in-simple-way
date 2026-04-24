package com.sid.tutorials.spring.boot3.java.app;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Conditional Statements in Java");
        int x = 10, y = 20;
        if (x > y) {
            System.out.println("This is an if statement");
        } else {
            System.out.println("This is an else statement");
        }
        x = 15;
        switch (x) {
            case 1:/*This is called fall through mechanism*/
            case 11:
                System.out.println("This is a switch statement and value is : " + x);
                break;
            case 10:
                System.out.println("This is a switch statement and value is : " + x);
                break;
            case 15:
                System.out.println("This is a switch statement and value is : " + x);
            case 20:
                System.out.println("This is a switch statement and value is : " + x);
                break;
            default:
                System.out.println("This is a default statement");
        }
        x = 4;
        while (x > 0) {
            System.out.println("This is a while loop and value is : " + x);
            x--;
        }
        y = 6;
        do {
            System.out.println("This is a do-while loop and value is : " + y);
            y--;
        } while (y >= 0);

        for (int i = 0; i < 5; i++) {
            /*(Initialization;condition;value evaluation)*/
            System.out.println("This is a for loop and value is : " + i);
            if (i == 3) {
                System.out.println("This is a break statement");
                break;
            }
        }
        y = 30;
        l1:
        {
            System.out.println("This is a Block L1 : " + y);
            if (y == 30) {
                System.out.println("This is a break statement");
                break l1;
            }
        }
        System.out.println("This is a Block L2 : " + y);
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("The value is odd : " + i);
        }
        String value = "check Balance";
        switch (value) {
            case "Create account":
                System.out.println("Create account");
                break;
            case "check Balance":
                System.out.println("check Balance");
                break;
            case "Withdraw form account":
                System.out.println("Withdraw form account");
                break;
            default:
                System.out.println("No choice has selected!!!");
        }
    }
}
