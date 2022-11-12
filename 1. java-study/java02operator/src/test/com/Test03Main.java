package test.com;

import java.util.Scanner;

public class Test03Main {

	public static void main(String[] args) {
		// console text input
		
		System.out.println("hello...");//함수,method,function
		
		//1.java.util.Scanner
		Scanner s = new Scanner(System.in);//생성자-constructor
		int score = s.nextInt() + 100;
		System.out.println("score:"+score);
		s.close();
		
		//2.java.io.BufferedReader

	}//end main

}//end class
