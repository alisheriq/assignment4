import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //MyTestingClass myTestingClass = new MyTestingClass(0, 0);
        //myTestingClass.testTenThousand();
        //myTestingClass.testPutGet();
        //myTestingClass.testRemoveGet();
        //myTestingClass.testContainsGetKey();
        MyHashTable myHashTable = new MyHashTable();
        myHashTable.put("Poland", "Moscow");
        myHashTable.put("Finland", "Helsinki");
        myHashTable.put("Switzerland", "Geneva");
        myHashTable.put("Mexico", "Mexico");
        myHashTable.remove("Poland", "Moscow","Warsaw");
        System.out.println(myHashTable.get("Poland"));
    }
}