package test.com;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("Hello Stack...");

        Stack<Coin> cs = new Stack<Coin>();

        for (int i = 0; i < 4; i++) {
            Coin c = new Coin();
            c.setValue(100 * (i + 1));
            cs.push(c);
        }
        System.out.println(cs.pop()); // 뽑기
        System.out.println(cs.pop());

        System.out.println("=============");

        System.out.println(cs.peek());
        System.out.println(cs.peek());
        System.out.println(cs.peek());

        System.out.println("=============");

        for (Coin c : cs) {
            System.out.println(c);
        }


    }
}
