public class MyHashTable<K,V> {
    private class HashNode<K,V>{
        private K key;
        private V value;
        private HashNode<K,V> next;
        public HashNode(K key, V value){
            this.key = key;
            this.value = value;
        }
        @Override
        public String toString(){
            return "{"+key+" "+value+"}";
        }
    }
    private int capacity;
    private int size;
    private HashNode<K, V>[] table;

    public MyHashTable(){
        this.capacity = 100;
        this.table = new HashNode[capacity];
    }
    //Creates a new MyHashTable object with default capacity of 100.
    public MyHashTable(int capacity){
        this.capacity = capacity;
        this.table = new HashNode[capacity];
    }
    //Creates a new MyHashTable object with the specified capacity.
    private int hash(K key){
        String strKey = String.valueOf(key);
        int hashCode = 0;
        for (char c : key.toString().toCharArray()) {
            hashCode = (43 * hashCode + c) % capacity;
        }
        return hashCode;
    }
    //Private method that returns an index for the given key using a hashing function.


    public void put(K key, V value){
        int index = hash(key);
        HashNode<K,V> node = table[index];
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        HashNode<K,V> newNode = new HashNode<K,V>(key, value);
        newNode.next = table[index];
        table[index] = newNode;
        size++;
    }
    //Inserts the given key-value pair into the hash table. If the key already exists, it updates its value.
    public V get(K key){
        int index = hash(key);
        HashNode<K,V> node = table[index];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }
    //Returns the value associated with the given key. If the key is not found, it returns null.
    public V remove(K key){
        int index = hash(key);
        HashNode<K,V> prev = null;
        HashNode<K,V> curr = table[index];
        while (curr != null) {
            if (curr.key.equals(key)) {
                if (prev == null) {
                    table[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                size--;
                return curr.value;
            }
            prev = curr;
            curr = curr.next;
        }
        return null;
    }
    //Removes the key-value pair associated with the given key from the hash table. If the key is not found, it returns null.
    public boolean contains(V value){
        for (int i = 0; i < capacity; i++) {
            HashNode<K,V> node = table[i];
            while (node != null) {
                if (node.value.equals(value)) {
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }
    //Returns true if the given value is present in the hash table. Otherwise, returns false.
    public K getKey(V value){
        for (int i = 0; i < capacity; i++) {
            HashNode<K,V> node = table[i];
            while (node != null) {
                if (node.value.equals(value)) {
                    return node.key;
                }
                node = node.next;
            }
        }
        return null;
    }
    //Returns the key associated with the given value. If the value is not found, it returns null.
    public void getterOfTenThousand(){
        for (int i = 0; i < capacity; i++) {
            int count = 0;
            HashNode<K, V> node = table[i];
            while (node != null) {
                count++;
                node = node.next;
            }
            System.out.println("Bucket " + i + ": " + count + " entries");
        }
    }
    //Prints the number of entries in each bucket of the hash table. Used for testing purposes only.
}
