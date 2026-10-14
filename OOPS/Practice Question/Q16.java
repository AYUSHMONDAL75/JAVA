// Q16: TimeConverter - seconds to h:m:s
class TimeConverter {
    void convert(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(totalSeconds + " seconds = " + hours + " h, " + minutes + " m, " + seconds + " s");
    }
}

public class Q16 {
    public static void main(String[] args) {
        TimeConverter t = new TimeConverter();
        t.convert(3725);
        t.convert(100);
    }
}
