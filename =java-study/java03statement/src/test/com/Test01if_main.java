package test.com;

public class Test01if_main {

	public static void main(String[] args) {
		// if, if~else, if ~ else if ~ else if ~else

		System.out.println("hello if...");
		// if(boolean°á°ú) ;,{}
		if (true)
			System.out.println("OK");

		if (5 == 5)
			System.out.println("OK2");

		double avg = 88.99;
		if (avg >= 90) {
			System.out.println("A");
			System.out.println("hello");
		} else if (avg >= 80) {
			System.out.println("B"+avg%10);
			if(avg%10>0) {
				System.out.println("B2");
			}
		}else if (avg >= 70) {
			System.out.println("C");
		}else if (avg >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}// end main

}// end class
