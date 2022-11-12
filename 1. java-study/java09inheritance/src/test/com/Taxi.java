package test.com;

public class Taxi extends Car {
	
	@Override
	public int open() {
		System.out.println("Taxi open()...");
		return 3;
	}

}
