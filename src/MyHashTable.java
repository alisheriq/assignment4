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
    public MyHashTable(int capacity){
        this.capacity = capacity;
        this.table = new HashNode[capacity];
    }
    private int hash(K key){
        String strKey = String.valueOf(key);
        int hashCode = 0;
        for (char c : key.toString().toCharArray()) {
            hashCode = (31 * hashCode + c) % capacity;
        }
        return hashCode;
    }


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
}
