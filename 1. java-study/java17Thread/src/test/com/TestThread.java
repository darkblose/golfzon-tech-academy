package test.com;

public class TestThread {
    void sleep_for(int start, int finish, String msg, long st) {
        try {
            for (int i = start; i < finish; i++) {
                System.out.println(msg + i);
                Thread.sleep(st);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
