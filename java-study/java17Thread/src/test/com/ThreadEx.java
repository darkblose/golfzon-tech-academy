package test.com;

public class ThreadEx extends Thread {

    public ThreadEx() {
        setName("Thread >> ThreadEx");
    }
    @Override
    public void run() {
        System.out.println("ThreadEX...run()");
        try {
            for (int i = 30; i < 40; i++) {
                Thread.sleep(500);
                System.out.println("ThreadEX()...run(): " + i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
