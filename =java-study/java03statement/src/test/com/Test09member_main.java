package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test09member_main {

	public static void main(String[] args) throws IOException {
		// ȸ���������α׷�
		System.out.println("hello...");
		// ��ȣ num : int (�ڵ���ȣ)
		// ���̵� id : String
		// ��� pw : String
		// �̸� name : String
		// ���� tel : String

		// ���� ��ºκ� - do~while �̿��Ұ�.
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
			System.out.println("�����x[����� �ƹ�Ű]:");
			String x= br.readLine();
			if (x.equals("x")) {
				break;
			}
		} while (bool);
		
		System.out.println(result);

		System.out.println("end main....");
	}// end main

}// end class
