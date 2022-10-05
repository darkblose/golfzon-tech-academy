package test.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test07member_multi_array {

	public static void main(String[] args) {
		// 2차원배열을 이용한 회원가입프로그램.
		System.out.println("Hello member");
		// 1 admin hi1234 kim 010
		// 2 tester hi1234 lee 02
		// 3 yang1004 hi1234 yang 031

		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		boolean bool = true;

		String[][] result = new String[3][5];
		for (int i = 0; i < result.length; i++) {
			System.out.println("num[" + (i + 1) + "] input id:");
			String id = "admin";

			System.out.println("num[" + (i + 1) + "] input pw:");
			String pw = "hi1234";

			System.out.println("num[" + (i + 1) + "] input name:");
			String name = "kim";

			System.out.println("num[" + (i + 1) + "] input tel:");
			String tel = "010";

//			String member = "num[" + (i + 1) + "] " + id + " " + pw + " " + name + " " + tel;
			result[i] = new String[] {
					String.valueOf(i + 1),
					id,pw,name,tel};
//			result[i] = member.split(" ");

		} // end for

		for (String[] x : result) {
			for (String i : x) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

		System.out.println("end main....");
	}// end main

}// end class
