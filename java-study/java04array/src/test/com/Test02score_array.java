package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test02score_array {

	public static void main(String[] args) throws IOException {
		// for문 + 배열을 이용해서 3명 성적처리.
		System.out.println("성적처리");

		// 1번학생의 이름을 입력하세요
		// 1번학생의 국어점수를 입력하세요
		// 1번학생의 영어점수를 입력하세요
		// 1번학생의 수학점수를 입력하세요

		// 최종 출력부분
		// 1 kim 99 88 77 264 88.0 B
		// 2 lee 99 99 99 264 99.0 A
		// 3 yang 77 77 77 264 77.0 C

		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		String[] result = new String[3];
		
		for (int i = 0; i < result.length; i++) {
			System.out.println((i + 1) + "번학생의 이름을 입력하세요:");
			String name = br.readLine();
//			String name = "kim";

			System.out.println((i + 1) + "번학생의 국어점수를 입력하세요:");
			String kor = br.readLine();
//			String kor = "99";

			System.out.println((i + 1) + "번학생의 영어점수를 입력하세요:");
			String eng = br.readLine();
//			String eng = "88";

			System.out.println((i + 1) + "번학생의 수학점수를 입력하세요:");
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

			
			result[i] = (i + 1) + " " + name + " " + kor + " " + eng + " " + math + " " + total + " " + avg + " " + grade;
			
		}
		System.out.println(result);
		for (String x : result) {
			System.out.println(x);
		}

		br.close();
		r.close();

	}// end main

}// end class
