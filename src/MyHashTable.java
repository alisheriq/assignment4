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
}
