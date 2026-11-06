class Counter {
    private static int count = 0;
    private int id;

    public void increment() {
        count++;
        id = count;
    }

    public void displayCount() {
        System.out.println("Object ID: " + id + " , Total Count: " + count);
    }
}
public class Laaa {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();

        c1.increment();
        c1.displayCount();
        c2.increment();
        c2.displayCount();
        c3.increment();
        c3.displayCount();
        c4.increment();
        c4.displayCount();
        c5.increment();
        c5.displayCount();
    }
}