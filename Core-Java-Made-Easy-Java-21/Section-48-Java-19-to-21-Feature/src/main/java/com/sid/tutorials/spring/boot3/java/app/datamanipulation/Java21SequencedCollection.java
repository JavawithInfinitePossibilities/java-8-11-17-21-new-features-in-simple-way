package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import java.util.List;

/**
 * @author kunmu On 08-05-2026
 */
public class Java21SequencedCollection {

    public void sequencedCollectionExample() {
        // Example of using a sequenced collection (e.g., List)
        List<String> sequencedList = List.of("A", "B", "C", "D");
        System.out.println("Sequenced Collection: " + sequencedList);
        System.out.println("First element: " + sequencedList.get(0));
        sequencedList.addFirst("a");
        System.out.println("Sequenced Collection: " + sequencedList);
        sequencedList.addLast("b");
        System.out.println("Sequenced Collection: " + sequencedList);
    }
}
