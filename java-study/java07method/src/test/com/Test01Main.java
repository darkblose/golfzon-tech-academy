package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Hello method");
		System.out.println(args);
		System.out.println(args.length);
		for (String x : args) {
			System.out.println(x);
		}
		
		//void : 반환값이 없다.반환타입이없다.
		System.out.println(System.currentTimeMillis());
		System.out.println();
		
		Test01Person p = new Test01Person();
		p.sleep1();
		p.sleep2(30000000,"KN_K9");
		
		int sleep_time = p.sleep3();
		System.out.println(sleep_time);
		
		String result = p.sleep4(3.14,3);
		System.out.println(result);
		
		
		//return;
	}// end main

}// end class
