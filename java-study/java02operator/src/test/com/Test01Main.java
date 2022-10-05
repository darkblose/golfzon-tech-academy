package test.com;

public class Test01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		//1.산술연산
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3);
		System.out.println(10 % 3);
		System.out.println("========");
		
		//2.대입,할당
		int su = 100;
		System.out.println(su);
		int result = su + 100;
		System.out.println(result);
		
		su = su + 1000;
		System.out.println(su);
		
		su += 1000;
		System.out.println(su);
		
		su += 1000;
		System.out.println(su);
		
		su += 1000;
		System.out.println(su);
		
		su -= 1;
		System.out.println(su);
		
		su -= 1;
		System.out.println(su);
		
		su -= 1;
		System.out.println(su);
		
		//&=,|=,<<=,>>=,>>>=
		su = 10;
		su ^= 3;
		System.out.println(su);
		
	}//end main()

}//end class
