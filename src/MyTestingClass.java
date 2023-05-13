import java.util.Random;

public class MyTestingClass {
    private int x;
    private int y;
    MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
    MyHashTable myHashTable = new MyHashTable();
    Random random = new Random();

    public MyTestingClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void testPutGet(){
        myHashTable.put("France", "Paris");
        myHashTable.put("England", "London");
        myHashTable.put("Switzerland", "Geneva");
        myHashTable.put("Mexico", "Mexico");
        System.out.println(myHashTable.get("France"));
        System.out.println(myHashTable.get("England"));
        System.out.println(myHashTable.get("Kazakhstan"));
    }
    public void testRemoveGet(){
        myHashTable.put("Poland", "Warsaw");
        myHashTable.put("Finland", "Helsinki");
        myHashTable.put("Germany", "Berlin");
        myHashTable.put("Australia", "Canberra");
        myHashTable.remove("Finland");
        System.out.println(myHashTable.get("Finland"));
        System.out.println(myHashTable.get("Australia"));
    }
    public void testContainsGetKey(){
        myHashTable.put("Poland", "Warsaw");
        myHashTable.put("Finland", "Helsinki");
        myHashTable.put("Switzerland", "Geneva");
        myHashTable.put("Mexico", "Mexico");
        System.out.println(myHashTable.contains("Finland"));
        System.out.println(myHashTable.contains("South Korea"));
        System.out.println(myHashTable.getKey("Moscow"));
        System.out.println(myHashTable.getKey("Geneva"));
    }
    public void testTenThousand(){
        putterOfTenThousand();
        table.getterOfTenThousand();
    }
    public void putterOfTenThousand(){
        for (int i = 0; i < 10000; i++) {
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);
            MyTestingClass key = new MyTestingClass(x, y);
            Student value = new Student("Student " + i, i);
            table.put(key, value);
        }
    }
}
