package test.com.hello;

public class Test01hello {

	public static void main(String[] args) {
		// �����ּ�.
		System.out.println("hello");
		
		//������ �ּ�-ctrl+shift+/,\
		/*
		 * System.out.println("hello"); 
		 * System.out.println("hello");
		 * System.out.println("hello");
		 */
		//����ȭ �ּ�
		/**
		 * System.out.println("hello"); 
		 * System.out.println("hello");
		 * System.out.println("hello");
		 */
		//�κ��ּ�
		System.out.println("hello" + "world");
		System.out.println();
		System.out.println("hello" /* + "world" */);
		
		System.out.println(true);	//false << boolean
		System.out.println('A');	//char
		System.out.println("AAA");	//String
		System.out.println(100);	//byte,short,char,int,long
		System.out.println(3.14);	//float,double
		System.out.println(new Object());
		System.out.println(new Test01hello());
		System.out.println();
		System.out.print(100);
		System.out.print('A');
		System.out.print("kim");
		System.out.println("lee");
		System.out.println("100"+"lee"+"200");
		
		System.out.printf("han\n");
		System.out.printf("yang\n");
		System.out.printf("%dyang%d\n",100,200);
		System.out.printf("%fyang%.2f\n",100.123,200.456);
		System.out.printf("%c\tyang%10s\n",'X',"MMM");
		
		
		
	}//end main() : method(�Լ�,function)

}//end class
