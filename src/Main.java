import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*MyHashTable myHashTable = new MyHashTable();
        myHashTable.put("France", "Paris");
        myHashTable.put("England", "London");
        myHashTable.put("Switzerland", "Geneva");
        myHashTable.put("Mexico", "Mexico");
        myHashTable.remove("England");
        System.out.println(myHashTable.get("France"));
        System.out.println(myHashTable.contains("Kazakhstan"));
        System.out.println(myHashTable.get("England"));
        System.out.println(myHashTable.getKey("Geneva"));*/
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);
            MyTestingClass key = new MyTestingClass(x, y);
            Student value = new Student("Student " + i, i);
            table.put(key, value);
        }
    }
}