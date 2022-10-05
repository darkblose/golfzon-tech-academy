package test.com;

/*import java.lang.*;*/  //생략가능

public class Person /* extends Object */{
	
	double weight = 50;
	String address;
	
	public Person() {
		System.out.println("Person()....");
	}
	public Person(double weight) {
		System.out.println("Person(double weight)....");
		this.weight = weight;
	}
	
	public void sleep() {
		System.out.println("Person sleep()...");
	}

}
