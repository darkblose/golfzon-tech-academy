package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test08score_do_while {

	public static void main(String[] args) throws IOException {
		// �ݺ��� while, do~while

		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		// ���� ��ºκ�
		// 1 kim 99 88 77 264 88.0 B
		// 2 lee 99 99 99 264 99.0 A
		// 3 yang 77 77 77 264 77.0 C

		System.out.println("hello");
		boolean bool = true;
		String x = "y";
		
		String result = "";
		int i = 0;
		do {
			// ����ó������
			System.out.println((i + 1) + "���л��� �̸��� �Է��ϼ���:");
			String name = br.readLine();
//			String name = "kim";

			System.out.println((i + 1) + "���л��� ���������� �Է��ϼ���:");
			String kor = br.readLine();
//			String kor = "99";

			System.out.println((i + 1) + "���л��� ���������� �Է��ϼ���:");
			String eng = br.readLine();
//			String eng = "88";

			System.out.println((i + 1) + "���л��� ���������� �Է��ϼ���:");
			String math = br.readLine();
//			String math = "77";

			int total = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);

			double avg = total / 3.0;

			String grade = "A";
			switch ((int) avg / 10) {
			case 9:
			case 10:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;

			default:
				grade = "F";
				break;
			}

			
			result += (i + 1) + " " + name + " " + kor + " " + eng + " " + math + " " + total + " " + avg + " " + grade;
			result += "\n";
			i++;
			System.out.println("����� x�Է�[����Ϸ��� �ƹ�Ű]:");
			// x = "x";
			x = br.readLine();

			if (x.equals("x"))
				break;
		} while (bool);
		
		System.out.println(result);
		br.close();
		r.close();
		System.out.println("end main....");

	}// end main

}// end class
