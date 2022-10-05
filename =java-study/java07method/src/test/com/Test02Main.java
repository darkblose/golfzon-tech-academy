package test.com;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Hello Bus");
		
		Test02Bus bus = new Test02Bus();
		bus.start1();
		System.out.println();
		
		int[] sus = bus.start2();
		for (int i = 0; i < sus.length; i++) {
			System.out.println(sus[i]);
		}
		
		bus.start3(new String[] {"aaa","bbb","ccc"});
		
		Car[] cars = bus.start4(new Car());
		for (Car car : cars) {
			System.out.println(car);
		}
		
		System.out.println("===============");
		
		bus.start5(11, 22,33,44);
		bus.start5(new int[] {55,66,77});
		
		//String kor = br.readLine();
		//int xKor = Integer.parseInt(kor);
		
		bus.start6("aa","bb","cc");
		
	}//end main

}//end class
