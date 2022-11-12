package test.com;

public class Test01Main {

    public class Inner extends Thread {
        public Inner() {
            System.out.println("Inner...");
        }

        @Override
        public void run() {
            TestThread tt = new TestThread();
            tt.sleep_for(50, 60, "Inner run(): ", 500);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello Thread...");

        Thread main = Thread.currentThread();
        System.out.println("main: " + main);

        TestThread tt = new TestThread();

//        1. Thread 클래스를 상속받아 스레드 처리하기
//        오버라이딩: run() 메소드
//        스레드 실행명령: start()

//        1-1. 익명내부클래스 상속처리

        Thread t = new Thread() {
            @Override
            public void run() {
                tt.sleep_for(10, 20, "run()...sleep: ", 500);
            }
        };
        t.start();
        t.setName("Thread 1-1");
        System.out.println("t: " + t.getName());

//        1-2. extends Thread

        ThreadEx tex = new ThreadEx();
        tex.start();
        System.out.println("tex: " + tex.getName());

//        1-3. Inner extends Thread
        Inner inner = new Test01Main().new Inner();
        inner.run();

//        2. Runnable 인터페이스를 상속받아 스레드 처리하기
//        오버라이딩 : run() 메소드
//        스레드 실행명령이 없다.
//        Thread 생성자의 매개변수로 전달 후
//        스레드객체로 실행명령 : start()

//        2-1. 익명내부클래스 Runnable

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                tt.sleep_for(1000, 1010, "Annoymous run() : ", 500);
            }
        });

        t3.start();

//        2-2. implements Runnable

        Thread t2 = new Thread(new Bus());
        t2.start();

        tt.sleep_for(0, 10, "i : ", 1000);

        System.out.println("end main");
    }
}