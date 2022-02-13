package hashtables;

public class SimpleHashTable {

    private final Employee[] hashtable;
    
    public SimpleHashTable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null) {
            System.out.println("sorry there's already an employee at position " + hashedKey);
        } else
            hashtable[hashedKey] = employee;
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }

    //hashkey is always an integer
    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
}

//containsKey, containsValue, merge, put, 