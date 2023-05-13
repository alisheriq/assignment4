import java.util.Random;

public class MyTestingClass {
    private int x;
    private int y;
    MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();
    Random random = new Random();

    public MyTestingClass(int x, int y) {
        this.x = x;
        this.y = y;
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
