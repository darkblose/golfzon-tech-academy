package test.com;

public class Test01Main {
	
	static String model = "KN";
	String model2 = "KN2";
	
	public void eat() {
		System.out.println("eat()...");
	}

	public static void main(String[] args) {
		System.out.println("Hello static");
		
		Test01static st = new Test01static();
		System.out.println(st.num1);
		System.out.println(Test01static.num2);
		st.num1 = 100;
		Test01static.num2 = 200;
		System.out.println(st.num1);
		System.out.println(Test01static.num2);
		
		System.out.println("=============");
		System.out.println(st.name1);
		System.out.println(Test01static.name2);
		st.name1 = "kim";
		Test01static.name2 = "lee";
		System.out.println(st.name1);
		System.out.println(Test01static.name2);
		
		System.out.println(Test01static.NAME_THREE);
		//Test01static.NAME_THREE = "kim";//readonly
		
		//Test01static.run();
		st.start();
		Test01static.sleep();
		
		System.out.println("=============");
		Test01Main main = new Test01Main();
		main.eat();
		System.out.println(main.model2);
		System.out.println(model);
	}//end main

}//end class
