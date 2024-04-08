package stopwatch;

public class StopWatchTest {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        for (int i = 0; i < 100000000; i++) {
            System.out.println("hello World");
        }
        System.out.println( stopWatch.elapsedTime());
    }

}
