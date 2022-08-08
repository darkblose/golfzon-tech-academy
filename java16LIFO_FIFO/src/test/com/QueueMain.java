package test.com;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        System.out.println("Hello Queue");

        Message msg1 = new Message("sendMail", "Hong");
        Message msg2 = new Message("sendSMS", "Shin");
        Message msg3 = new Message("sendKakaotalk", "Yang");
        Queue<Message> q = new LinkedList<Message>();

        q.offer(msg1);
        q.offer(msg2);
        q.offer(msg3);

        System.out.println(q.poll());

        while(!q.isEmpty()) {
            Message m = q.poll();
            switch (m.command) {
                case "sendMail" :
                    System.out.println(m.to + " >> 메일 보내기");
                    break;
                case "sendSMS" :
                    System.out.println(m.to + " >> 문자 보내기");
                    break;
                case "sendKakaotalk" :
                    System.out.println(m.to + " >> 카카오톡 보내기");
                    break;

                default:
                    break;
            }
        }

        System.out.println("=============");

        for (Message m : q) {
            System.out.println(m);
        }
    }
}
