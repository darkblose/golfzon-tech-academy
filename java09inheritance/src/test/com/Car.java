package test.com;

public class Car {
	
	protected int price;
	protected String model_name;
	
	public Car() {
		System.out.println("Car()....");
	}
	
	//final ����� �������̵� �Ұ���.
	public int open() {
		System.out.println("Car open()...");
		return 4;
	}
	
}
