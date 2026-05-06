package com.sid.tutorials.spring.boot3.java.app.datamanipulation;

import com.sid.tutorials.spring.boot3.java.app.data.DummyDataTable;
import com.sid.tutorials.spring.boot3.java.app.data.module.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author kunmu On 25-04-2026
 * Key Differences:
 * Operation            List                  Set
 * Index-based access   list.get(2)           No indices
 * set(index, value)    Replace at index      NOT available
 * add(index, value)    Insert at position    NOT available
 * Order                Maintains order       No order (HashSet)
 * Duplicates           Allowed               NOT allowed
 * add(value)           Append                Add if unique
 * remove(value)        Remove by value       Remove by value
 * <p>
 * Collection    Order     Sorted      Speed     Use Case
 * HashSet       No Order  No          Fast      Unique elements,General lookup
 * LinkedHashSet Order     No          Fast      Ordered tracking
 * TreeSet       No Order  Yes         Slow      Sorted unique elements,Range queries
 * HashMap       No Order  No          Fastest   Key-value lookup
 * LinkedHashMap Order     No          Fast      LRU Cache
 * TreeMap       No Order  Yes         Slow      Sorted map
 * <p>
 * Quick Comparison:
 * Feature              Arrays.sort()            Collections.sort()
 * Works with           Arrays                   Collections (List)
 * Type                 Static method            Static method
 * Input                int[], String[], T[]     List<T>
 * In-Place             Yes                      Yes
 * Time Complexity      O(n log n)               O(n log n)
 * Sorting Type         Dual-Pivot Quicksort     Timsort (hybrid)
 * Stable               No (varies)              Yes
 */
public class DataCalculation {

    public void getListOfData() {
        List<Employee> employees = DummyDataTable.getEmployees();
        List<Employee> updatedEmployees = employees.stream()
                .filter(employee -> employee.getSalary() > 20000)
                .map(employee -> {
                    employee.setSalary(employee.getSalary() + 5000);
                    return employee;
                })
                .collect(Collectors.toList());
        updatedEmployees.stream().forEach(System.out::println);
        int[] values = DummyDataTable.intArrayData();
        List<Integer> intValues = new ArrayList<>();
        IntStream.iterate(0, i -> i < values.length, i -> i + 1)
                .forEach(i -> intValues.add(values[i]));
        System.out.println(intValues);
        System.out.println("Updated values after Insert and Update");
        /*Update the existing value at the index*/
        intValues.set(6, 100);
        intValues.set(17, 200);
        /*Add the value at the add*/
        intValues.add(300);
        /*Add the value at the index and shift the remaining data to its right*/
        intValues.add(5, 500);
        System.out.println(intValues);
    }

    public void getSetOfData() {
        Set<Integer> intSet = new HashSet<>();
        int[] ints = DummyDataTable.intArrayData();
        IntStream.iterate(0, i -> i < ints.length, i -> i + 1)
                .forEach(i -> intSet.add(ints[i]));
        intSet.add(new Random().nextInt());
        System.out.println(intSet);
    }

    public void getMapOfData() {
        Map<String, String> stateAndCapital = DummyDataTable.stringMapData();
        System.out.println(stateAndCapital);
        String orDefault = stateAndCapital.getOrDefault("New keys", "Not Found");
        System.out.println(orDefault);
        String putIfAbsent = stateAndCapital.putIfAbsent("New keys", "New values");
        System.out.println(putIfAbsent);
        System.out.println(stateAndCapital);
        Collections.sort(stateAndCapital.entrySet().stream()
                        .collect(Collectors.toList()),
                Map.Entry.comparingByKey());
        System.out.println(stateAndCapital);
    }

    public Map<String, String> getSortedMapOfDataMethodAsce() {
        Map<String, String> stateAndCapital = DummyDataTable.stringMapData();
        LinkedHashMap<String, String> sortedCapitaAndState =
                stateAndCapital.entrySet().stream()
                        .sorted(Map.Entry.<String, String>comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        ));
        return sortedCapitaAndState;
    }

    public Map<String, String> getSortedMapOfDataMethodDesc() {
        Map<String, String> stateAndCapital = DummyDataTable.stringMapData();
        return stateAndCapital.entrySet()
                .stream()
                .sorted(Map.Entry.<String, String>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }


}
