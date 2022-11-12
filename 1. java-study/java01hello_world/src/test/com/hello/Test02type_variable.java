package test.com.hello;

import java.math.BigInteger;

public class Test02type_variable {

	/* final */ byte b = 0;//0
	//전역변수,상수가 아닐때는 초기화하지 않으면 기본값이 할당.
	//주의: final선언시는 반드시 초기화.
	
	public static void main(String[] args) {
		//타입과 변수
		//타입종류 : 기본타입,참조타입(객체,배열)
		//변수 : 소문자로 시작하는 명사 권장.
		//		: 전역변수, 지역변수
		//final 표기시 상수(변경불가값)가됨,읽기전용을 의미.
		
		//기본타입:
		//1.정수(byte,short,char,int,long)기본값0
		/* final */ byte b = 0;//선언 + 초기화
		//사용 = 값변경(초기화)
		b = 10;//1바이트 용량1byte==8bit:0000 0000
		System.out.println(b);//값확인
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		
		short s = 100;//2byte
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		
		char c = 100;//2byte,0 또는 양의 정수
		System.out.println((int)Character.MIN_VALUE+"~"+(int)Character.MAX_VALUE);
		char c2 = 'A';//
		c2 = (char) 70000;//
		System.out.println(Character.MIN_VALUE+"~"+Character.MAX_VALUE);
		
		int su = 100;//4byte
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		
		long ll = 3000000000L;//8byte
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		
		//2.실수(float,double)0.0기본값
		float f = 3.14f;
		System.out.println(Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		
		double d = 3.14;
		System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		
		//3.참거짓(boolean) 0-false(기본값),1-true, 
		boolean bool = false;//true
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		//참조타입 널,null 기본값(주소가 할당안되었다.)
		//1.문자열(String)
		String name = "A";
		System.out.println(name);
		name = "lee";
		System.out.println(name);
		
		String name2 = new String(new char[] {'A'});
		System.out.println(name2);
		
		String name3 = new String("A");
		System.out.println(name3);
		
		//********큰정수객체 : BigInteger

		int money = 2100000000;
		int ea = 100000000;
//		int money = 2100000000,ea = 100000000;
//		int money,ea,a22,b22,c22;
		

		System.out.println(money + ea);
		//4byte범위를 벗어나면 자동 캐스팅이된다.

		System.out.println(money - ea);

		System.out.println(money * ea);

		System.out.println(money / ea);

		System.out.println(money % ea);

		System.out.println((int)2200000000L);

		System.out.println("=================");
		
		//BigInteger를 사용하면 자동캐스팅이 안되게 연산결과를 갖게된다.

		BigInteger bmoney = new BigInteger("2100000000");

		BigInteger bcount = new BigInteger("100000000");

		System.out.println(bmoney.add(bcount));

		System.out.println(bmoney.subtract(bcount));

		System.out.println(bmoney.multiply(bcount));

		System.out.println(bmoney.divide(bcount));

		System.out.println(bmoney.remainder(bcount));
		
		//2.배열(모든타입[],{},new)
		//3.객체(new,Sxxxx클래스)

		
		String user_name = "lee";
		//String 이름 = "양";
		System.out.println("공자왈 '효도하라'");
		System.out.println("공자왈 \"효도하라\"");
		System.out.println("공자왈 5\\3");
		
		byte x2 = 99;
		int y2 = x2;
		byte z2 = (byte) y2;
		
		//(type),(연산자),(값,값,값,),(type var,,,)
		
		byte su1 = 10;
		byte su2 = 20;
		byte sum = (byte) (su1 + su2) ;
		
		int total = 299;
//		double avg = total/3.0;
		double avg = (double)total/3;
		System.out.println("avg:"+(avg+100));
		System.out.printf("avg:%.2f\n",avg);
		
		//double class
		
		//기본타입의 변수또는 값을 문자열로 변환하기.
		//100+100 >> "100"+100
		int score = 100;
		System.out.println(score+100);
		System.out.println(String.valueOf(score)+100);
		
		System.out.println(new Integer(score).toString()+100);
		
		//문자열로된 변수또는 값을 기본타입으로 변환하기.
		//"1000"+1000 >> 1000 + 1000
		String point = "1000";
		System.out.println(point + 1000);
		System.out.println(
				Integer.parseInt(point) + 1000);
		
		String point2 = "3.14";
		System.out.println(
				Double.parseDouble(point2) + 1000);
		String t_f = "true";
		//!"true" >> false
		System.out.println(!true);
		System.out.println(!Boolean.parseBoolean(t_f));
	}//end main()

}//end class


