package test.com;

public class Test02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		//3.비교연산 ==,!=,>,<,>=,<= : boolean
		int su1 = 5;
		int su2 = 5;
		System.out.println(su1==su2);
		System.out.println(su1!=su2);
		System.out.println(su1>su2);
		System.out.println(su1<su2);
		System.out.println(su1>=su2);
		System.out.println(su1<=su2);
		
		//4.비트연산 : 논리 & | ^ , 반전 ~
		System.out.println(10 & 3);
		//1010
		//0011
		//1001 >>> 9
		System.out.println(10 | 3);
		System.out.println(10 ^ 3);
		System.out.println(~10);
		
		//5.비트연산 : 이동(쉬프트) >>,<<,>>>
		//0000 1000 : 8 >> 1 : 4
		//1000 0000 : 128 >> 1 : 64
		System.out.println(8 >> 1);
		System.out.println(8 >> 2);
		System.out.println(128 >> 1);
		System.out.println(128 >> 2);
		System.out.println("=======");
		System.out.println(8 << 1);
		System.out.println(8 << 2);
		System.out.println(128 << 1);
		System.out.println(128 << 2);
		
		System.out.println("=======");
		System.out.println(128 >>> 1);
		System.out.println(-128 >>> 1);
		
		
		System.out.println("=======");
		//6.논리연산. &,|,&&,||
		//true & false, 5==5 & Boolean.parseBoolean("true")
		System.out.println(true & false);
		System.out.println(true && false);
		System.out.println(false & true);
		System.out.println(false && true);
		System.out.println(true | false);
		System.out.println(true || false);
		System.out.println(true || false);
		
		//단항연산자 : 증감연산(++,--),음양(+,-),부정!
		int max = 10;
		max++;//1증가 >> max += 1;>> max = max + 1;
		System.out.println(max);
		++max;//1증가 >> max += 1;>> max = max + 1;
		System.out.println(max);
		System.out.println("=======");
		
		
		int top = ++max;
		System.out.println(top);
		System.out.println(max);
		System.out.println("=======");
		int top2 = max++;
		System.out.println(top2);
		System.out.println(max);
		
		System.out.println("=======");
		//기타 : (),{},[], 삼항(boolean? 참일때 반환값:거짓일때)
		
		System.out.println(true ? 100 : 0);
		System.out.println(false ? 100 : 0);
		
		boolean bool = true;
		System.out.println(bool ? 100 : 0);
		
		int min = 60;
		System.out.println(min<=60 ? "NO" : "Good");
		
		int total = 60+60+60;
		double avg = total/3.0;//9x.xxx
		System.out.println(
				avg>=90 ? "A" : 
					avg>=80 ? "B" : 
						avg>=70 ? "C" : "D");
		String grade = avg>=90 ? "A" : 
			avg>=80 ? "B" : 
				avg>=70 ? "C" : "D";
	}//end main

}//end class
