package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test09member_main {

	public static void main(String[] args) throws IOException {
		// 회원가입프로그램
		System.out.println("hello...");
		// 번호 num : int (자동번호)
		// 아이디 id : String
		// 비번 pw : String
		// 이름 name : String
		// 폰번 tel : String

		// 최종 출력부분 - do~while 이용할것.
		// 1 admin hi1234 kim 010
		// 2 tester hi1234 lee 02
		// 3 yang1004 hi1234 yang 031
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		boolean bool = true;
		
		int i = 0;
		String result = "";
		
		do {
			System.out.println("num["+(i+1)+"] input id:");
			String id = "admin";
			
			System.out.println("num["+(i+1)+"] input pw:");
			String pw = "hi1234";
			
			System.out.println("num["+(i+1)+"] input name:");
			String name = "kim";
			
			System.out.println("num["+(i+1)+"] input tel:");
			String tel = "010";
			
			result += "num["+(i+1)+"] "+id+" "+pw+" "+name+" "+tel;
			result += "\n";
			
			i++;
			/////////////////////////////
			System.out.println("종료시x[계속은 아무키]:");
			String x= br.readLine();
			if (x.equals("x")) {
				break;
			}
		} while (bool);
		
		System.out.println(result);

		System.out.println("end main....");
	}// end main

}// end class
