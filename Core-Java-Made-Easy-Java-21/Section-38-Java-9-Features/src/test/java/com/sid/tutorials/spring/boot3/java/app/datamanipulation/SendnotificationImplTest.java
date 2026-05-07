package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author kunmu On 07-05-2026
 */
@DisplayName("SendnotificationImpl Tests")
class SendnotificationImplTest {

    SendNotification sendNotification;

    @BeforeEach
    void setUp() {
        sendNotification = new SendnotificationImpl();

    }

    @Test
    void send() {
        sendNotification.sendNotifications("Hello World!", "from", "to");
    }

    @Test
    void sendNotification() {
        SendNotification.sendNotification("Hello World!", "from", "to");
    }

    final TryResourcesExmpl exmpl = new TryResourcesExmpl();

    @Test
    void testTryResources() {
        try (exmpl) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*4.   Collection Factory Methods*/
    @Test
    void testImmutableCollection() {
        // List.of() returns an immutable list
        // Attempting to add/remove/modify throws UnsupportedOperationException
        List<String> immutableList = List.of("Hello World!", "from", "to");

        // assertThrows syntax: assertThrows(ExceptionClass.class, () -> { code that throws })
        assertThrows(UnsupportedOperationException.class, () -> immutableList.add("New Item"));
        assertThrows(UnsupportedOperationException.class, () -> immutableList.remove(0));
        assertThrows(UnsupportedOperationException.class, () -> immutableList.set(0, "Modified"));

        // You can also capture the exception and validate its message
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> immutableList.add("Test"));
        assertTrue(exception.getMessage() != null || exception.getClass().equals(UnsupportedOperationException.class));
    }

    @Test
    void testOfNullable() {
        // List.of() does not allow null elements - throws NullPointerException at creation
        assertThrows(NullPointerException.class, () -> List.of("Hello", null, "World"));

        // For stream operations with null, use ArrayList instead
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Hello");
        mutableList.add(null);
        mutableList.add("World");

        // Stream filter without terminal operation - does NOT execute (lazy evaluation)
        // Stream needs a terminal operation like forEach(), collect(), count() to return void

        // Using forEach() as terminal operation to return void
        assertThrows(NullPointerException.class, () ->
                mutableList.stream()
                        .filter(x -> x.equalsIgnoreCase("Hello"))// Error HERE when x is null
                        .map(x -> x)
                        .forEach(System.out::println)  // Terminal operation - returns void
        );

        // ===== SOLUTION 1: Use flatMap() with Stream.ofNullable() (Java 9+) =====
        System.out.println("=== Solution 1: flatMap(Stream::ofNullable) ===");
        mutableList.stream()
                .flatMap(Stream::ofNullable)  // Stream.ofNullable handles null gracefully
                .filter(x -> x.startsWith("H"))  // Now safe to call methods on x
                .forEach(System.out::println);

        // ===== SOLUTION 2: Combine filter + Stream.ofNullable() =====
        System.out.println("=== Solution 2: filter + flatMap(Stream::ofNullable) ===");
        mutableList.stream()
                .flatMap(x -> Stream.ofNullable(x))  // Explicitly handle each element
                .filter(x -> x.startsWith("H"))  // Now safe to call methods on x
                .forEach(System.out::println);

        // Alternative with collect() - also returns void when you consume it
        assertThrows(NullPointerException.class, () ->
                mutableList.stream()
                        .filter(x -> x.equalsIgnoreCase("Hello"))
                        .collect(ArrayList::new, List::add, List::addAll)  // Terminal operation
        );
    }
}