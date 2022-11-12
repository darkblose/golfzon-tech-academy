package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Test03Main2 {

	public static void main(String[] args) throws IOException {
		// console text input
		
		System.out.println("hello...");
		//2.java.io.BufferedReader
		
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		System.out.println("Input your name:");
		String name = br.readLine();
		System.out.println("name:"+name);
		
		System.out.println("Input your kor:");
		String kor = br.readLine();
		System.out.println("kor:"+kor);
		
		System.out.println("Input your eng:");
		String eng = br.readLine();
		System.out.println("eng:"+eng);
		
		System.out.println("Input your math:");
		String math = br.readLine();
		System.out.println("math:"+math);
		
		int total = Integer.parseInt(kor) 
				+ Integer.parseInt(eng)
				+ Integer.parseInt(math);
		System.out.println("total:"+total);
		
		double avg = total/3.0;
		System.out.println("avg:"+avg);
		
//		String grade = avg>=90 ? "A" : 
//			avg>=80 ? "B" : 
//				avg>=70 ? "C" : "D";
		String grade = "A";
		if (avg >= 90) {
			grade = "A";
			
		} else if (avg >= 80) {
			grade = "B";
		}else if (avg >= 70) {
			grade = "C";
		}else if (avg >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println("grade:"+grade);
		
		//수학 math : String,
		//평균 avg : Double
		//등급 grade : String : 삼항연산자-A B C D
		
		br.close();
		r.close();
		

	}//end main

}//end class
