package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test06while_main {

	public static void main(String[] args) throws IOException {
		// 반복문 while, do~while
		//while반복문 : 무한반복에서 
		//특정 신호,상황일때 그만 break;
		//특정 신호,상황일때 스킵해 continue;
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		System.out.println("hello");
		boolean bool = true;
		
		String x = "y";
		while (bool) {
			//성적처리로직
			System.out.println("종료시 x입력[계속하려면 아무키]:");
//			x = "x";
			x = br.readLine();
			if(x.equals("x")) break;
		}//end while
		
		System.out.println("end main....");
		
	}//end main

}//end class
