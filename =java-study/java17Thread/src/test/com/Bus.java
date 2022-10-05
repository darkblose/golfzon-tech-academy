package test.com;

public class Bus extends Car implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 100; i < 110; i++) {
                System.out.println("Bus run(): " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
