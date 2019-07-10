package trace;

public class OnMethodTest {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;

        while (true) {
            Thread.sleep(5000L);
            args(i++, String.valueOf(i));
        }
    }

    public static void args(int i, String str) {
        System.out.println(i + ":" + str);
    }
}
