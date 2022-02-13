package hashtables;


import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Employee janeJones = new Employee("jane", "jones", 123);
        Employee johnDoe = new Employee("john", "doe", 46567);
        Employee marySmith = new Employee("mary", "smith", 22);
        Employee mikeWilson = new Employee("mike", "wilson", 3245);

        Map<String, Employee> map = new HashMap<>();
        map.put("Jonas", janeJones);
        map.put("Doe", johnDoe);
        map.put("Smith", marySmith);
        map.putIfAbsent("Doe", mikeWilson);


        map.forEach((v, k) -> System.out.println("Key = " + k + " Employee = " + k));
        System.out.println(map.getOrDefault("some", mikeWilson));
        System.out.println(map.remove("Doe"));

    }
}

