import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable<V> {
    private int size;
    private Map<Integer, V> table;

    public SymbolTable(int size) {
        this.size = size;
        this.table = new HashMap<>();
    }

    public SymbolTable() {
        this(100); // Default size is 100
    }

    private int hashFunction(V value) {
        // A simple hash function that returns the index for a given value
        return value.hashCode() % size;
    }

    public void insert(V value) {
        int key = hashFunction(value);
        table.put(key, value);
    }

    public void delete(V value) {
        int key = hashFunction(value);
        table.remove(key);
    }

    public V lookup(V value) {
        int key = hashFunction(value);
        return table.get(key);
    }

    public void display() {
        for (Map.Entry<Integer, V> entry : table.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }


}
