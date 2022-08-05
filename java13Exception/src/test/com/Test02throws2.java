package test.com;

import java.io.*;

public class Test02throws2 {
    public static void main(String[] args) /*throws IOException*/ {
        System.out.println("Hello throws");
        // throws 처리: 예외 전가
        // try~catch : 예외 처리

        try {
            test();
            System.out.println("Found");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("end main()...");
    }// end main

    private static void test() throws ClassNotFoundException {
        Class.forName("java.lang.String"); // 클래스를 찾을 때 이용

//        try {
//            Class.forName("java.lang.String"); // 클래스를 찾을 때 이용
//            System.out.println("Found");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}// end class
