package test.com;

public class Test01class_main {

	public static void main(String[] args) {
		// ��ü�� ����(�Ӽ��� �ʱ�ȭ�� ���ͷ�)�ϰ� ����ϴ� �Լ�.
		String name = new String("kim");
		System.out.println(name.length());
		
		Score s =  new Score();
		//System.out.println(s);
		s.num = 11;
		s.name = "kim2";
		s.kor = 992;
		s.eng = 882;
		s.math = 772;
		System.out.println(s.num);
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.math);
		
	}//end main

}//end class
