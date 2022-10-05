package test.com;

public class Student extends Person {
	
	int num;
	String school_name;
	double weight = 100;
	public Student() {
		super(10000);
		System.out.println("Student()...");
		System.out.println(super.weight);//50.0,10000
		System.out.println( this.weight);//100.0
		super.sleep();
		this.sleep();
	}
	//슈퍼클래스 함수를 재정의 했다>>> 오버라이딩
	@Override
	public void sleep() {
		System.out.println("Student sleep()...");
	}
	
	//오버로딩
	public void sleep(int x) {
		System.out.println("Student sleep(int x)...");
	}
	
	public void study() {
		System.out.println("study()...");
	}
	
}
