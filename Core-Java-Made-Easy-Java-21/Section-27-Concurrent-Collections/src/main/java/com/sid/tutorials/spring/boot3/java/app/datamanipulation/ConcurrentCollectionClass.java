package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import com.sid.tutorials.spring.boot3.java.app.data.DummyDataTable;
import com.sid.tutorials.spring.boot3.java.app.data.module.Employee;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/**
 * @author kunmu On 06-05-2026
 */
public class ConcurrentCollectionClass {

    public void checkCopyOnwriteArrayList() {
        List<Employee> employees = DummyDataTable.getEmployees();
        /*While using the normal array list
         * java.util.ConcurrentModificationException
         * */
        /*Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println("Employee: " + employee);
            employees.add(new Employee("New Employee", "New designation", 2000, "Bangalore"));
            OR
            employees.remove();
        }*/
        CopyOnWriteArrayList<Employee> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.addAll(employees);
        System.out.println("CopyOnWriteArrayList: " + copyOnWriteArrayList);
        System.out.println("-------------------------------------------------------------");
        Iterator<Employee> iterator = copyOnWriteArrayList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
            if (employee.getName().equals("Durga")) {
                copyOnWriteArrayList.remove(employee);
            }
        }
        Thread runnable = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            copyOnWriteArrayList.add(new Employee("New Employee", "New designation", 2000, "Bangalore"));
        });
        runnable.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("CopyOnWriteArrayList: " + copyOnWriteArrayList);
    }

    public void checkCopyOnwriteArraySet() {
        Set<Employee> employees = new HashSet<>(DummyDataTable.getEmployees());
        /*While using the normal hashSet
         * java.util.ConcurrentModificationException
         * */
        /*Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
            if (employee.getName().equals("Durga")) {
                iterator.remove();
            }
        }*/
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        copyOnWriteArraySet.addAll(employees);
        System.out.println("CopyOnWriteArraySet: " + copyOnWriteArraySet);
        System.out.println("-------------------------------------------------------------");
        Iterator iterator = copyOnWriteArraySet.iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            System.out.println(employee);
            if (employee.getName().equals("Durga")) {
                copyOnWriteArraySet.remove(employee);
            }
        }
        Thread runnable = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            copyOnWriteArraySet.add(new Employee("New Employee", "New designation", 2000, "Bangalore"));
        });
        runnable.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("CopyOnWriteArraySet: " + copyOnWriteArraySet);
    }

    public void checkConcurrentHashmap() {
        Map<String, String> stateCapitalMap = DummyDataTable.stringMapData();
        /*While using the normal Hashmap
         * java.util.ConcurrentModificationException
         * */
        /*stateCapitalMap.entrySet().stream().forEach(entry -> {
            System.out.println("State: " + entry.getKey() + ", Capital: " + entry.getValue());
            if (entry.getKey().equals("Karnataka")) {
                stateCapitalMap.remove(entry.getKey());
            }
        });*/
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>(stateCapitalMap);
        System.out.println("ConcurrentHashMap: " + concurrentHashMap);
        System.out.println("------------------------------------------------------------");
        Iterator<String> iterator = concurrentHashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = concurrentHashMap.get(key);
            System.out.println(key + ": " + value);
            if (key.equals("Uttarakhand")) {
                concurrentHashMap.remove(key);
            }
        }
        Thread runnable = new Thread(() -> {
            try {
                Thread.sleep(1000);
                concurrentHashMap.put("New State", "New Capital");
            } catch (InterruptedException e) {}
        });
        runnable.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("ConcurrentHashMap: " + concurrentHashMap);
    }
}
