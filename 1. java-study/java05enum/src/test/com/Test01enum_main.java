package test.com;

public class Test01enum_main {

	public static void main(String[] args) {
		// 열거타입, enum
		System.out.println("hello enum");
		System.out.println(Test01_week.FRIDAY);
		Test01_week today = Test01_week.FRIDAY;
		System.out.println(today);
	}//end main

}//end class
