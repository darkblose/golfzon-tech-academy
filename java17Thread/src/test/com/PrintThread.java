package test.com;

public class PrintThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("while.....");
            //방법1.Thread.sleep(100);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
            //방법2 : Thread.interrupted()
            if(Thread.interrupted()) {
                break;
            }
        }
        System.out.println("자원정리");
        System.out.println("실행종료");
    }

}