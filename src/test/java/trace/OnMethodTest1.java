package trace;

public class OnMethodTest1 {
    private static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        OnMethodTest1 onMethodTest = new OnMethodTest1();

        while (true) {
            Thread.sleep(5000L);
            onMethodTest.args(i++, String.valueOf(i));
        }
    }

    public void args(int i, String str) {
        System.out.println(i + ":" + str);
    }
}
