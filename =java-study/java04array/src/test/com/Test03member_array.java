package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test03member_array {

	public static void main(String[] args) throws IOException {
		// 회원가입프로그램 do~while지우고 for+array
		System.out.println("hello...");

		// 최종 출력부분 - do~while지우고 for+array
		// 1 admin hi1234 kim 010
		// 2 tester hi1234 lee 02
		// 3 yang1004 hi1234 yang 031
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		boolean bool = true;
		
		
		String[] result = new String[3];
		for (int i = 0; i < result.length; i++) {
			System.out.println("num["+(i+1)+"] input id:");
			String id = "admin";
			
			System.out.println("num["+(i+1)+"] input pw:");
			String pw = "hi1234";
			
			System.out.println("num["+(i+1)+"] input name:");
			String name = "kim";
			
			System.out.println("num["+(i+1)+"] input tel:");
			String tel = "010";
			
			result[i] = "num["+(i+1)+"] "+id+" "+pw+" "+name+" "+tel;
			
		}//end for
		
		
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("end main....");
	}// end main

}// end class