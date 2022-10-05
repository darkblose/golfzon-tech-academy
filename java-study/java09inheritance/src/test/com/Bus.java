package test.com;

public class Bus extends Car {

	protected int station_count;
	protected String com_name;
	
	public Bus() {
		System.out.println("Bus()...");
	}
	
	protected String autoDoorOpen() {
		System.out.println("autoDoorOpen()..");
		System.out.println(station_count);
		System.out.println(com_name);
		System.out.println(price);
		System.out.println(model_name);
		open();
		return "back door";
	}
	
	@Override
	public int open() {
		System.out.println("Bus override open()...");
		return 2;
	}
	
}
