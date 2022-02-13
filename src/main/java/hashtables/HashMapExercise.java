package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExercise {
    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));


        System.out.println("----------------------");

        var map = new HashMap<String, Integer>();


        var words = List.of("Foo", "Bar", "Foo", "Buzz", "Foo", "Buzz", "Fizz", "Fizz");

        words.forEach(word -> {
            map.merge(word, 1, Integer::sum);
        });

        map.entrySet().forEach(System.out::println);
        
//        ListIterator<Employee> iterator = employees.listIterator();
//        List<Employee> remove = new ArrayList<>();
//        
//        while (iterator.hasNext()) {
//            Employee employee = iterator.next();
//            if (map.containsKey(employee.getId()))
//                remove.add(employee);
//            else
//                map.put(employee.getId(), employee);
//        }
//
//        for (Employee employee : remove) {
//            employees.remove(employee);
//        }
//
//        System.out.println("---------------------");
//        employees.forEach(System.out::println);
//        int[] nums = new int[10];
//        int[] numsToAdd = {59382, 43, 6894, 500, 99, -58};
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
class Maps {
    public static void main(String[] args) {
        
        var map = new TreeMap<Integer, String>();
        map.put(1, "Petyr Baelish");
        map.put(2, "Sansa Stark");
        map.put(3, "Jon Snow");
        map.put(4, "Jamie Lannister");
        
        map.entrySet().forEach(System.out::println);


        System.out.println("-------------------");
        map.forEach((k,v) -> System.out.println("key: " + k + ", value: " + v));

        Map<Integer, String> immutableMap = Map.of(10, "Amir", 20, "Beth", 30, "Arnie", 40, "Lucy");
        
        immutableMap.entrySet().forEach(System.out::println);
    }
}