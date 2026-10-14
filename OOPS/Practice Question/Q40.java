// Q40: Counter - static variable counts objects
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}

public class Q40 {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println("Objects created so far = " + Counter.count);
    }
}
