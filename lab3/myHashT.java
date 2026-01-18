package lab3;

import java.util.LinkedList;

public class myHashT<K, V> {
    private LinkedList<Entry<K, V>>[] table;
    private int size;

    private static class Entry<K, V> {
        private K key;
        private V value;
        
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        
        public K getKey() {
            return key;
        }
        
        public V getValue() {
            return value;
        }
        
        public void setValue(V value) {
            this.value = value;
        }
    }


    @SuppressWarnings("unchecked")
    public myHashT() {
        this.table = new LinkedList[32];
        this.size = 0;
    }

    public void put(K key, V value) {
        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<Entry<K, V>> ();
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        table[index].add(new Entry<K, V> (key, value));
        size++;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % 32;
    }

    public V get(K key) {
        for (Entry<K, V> entry : table[hash(key)]) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    
    public V remove(K key) {
        if (key == null) {
            return null;
        }
        
        int index = hash(key);
        if (table[index] == null) {
            return null;
        }
        
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                V value = entry.getValue();
                table[index].remove(entry);
                size--;

                if (table[index].isEmpty()) {
                    table[index] = null;
                }
                
                return value;
            }
        }
        
        return null;
    }


    public boolean isEmpty(K key) {
        if (table[hash(key)] == null) {
            return true;
        }

        return false;
    }

    public int size() {
        return size;
    }
}