package test.com;

import java.io.InputStreamReader;
import java.io.Reader;

import test.kosta.AirBus;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Car car = new Car();
		System.out.println(car.price);
		System.out.println(car.model_name);
		System.out.println(car.open());
		System.out.println("===========");
		
		Bus bus = new Bus();
		System.out.println(bus.price);
		System.out.println(bus.model_name);
		System.out.println(bus.station_count);
		System.out.println(bus.com_name);
		System.out.println(bus.autoDoorOpen());
		System.out.println(bus.open());
		System.out.println("===========");
		
		AirBus ab = new AirBus();
		System.out.println(ab.price);
		System.out.println(ab.model_name);
		System.out.println(ab.station_count);
		System.out.println(ab.com_name);
		System.out.println(ab.staff_count);
		System.out.println(ab.wing_count);
		System.out.println(ab.autoDoorOpen());
		System.out.println(ab.open());
		System.out.println(ab.fly());
		
		System.out.println("==========");
//		Reader r = new InputStreamReader(System.in);
		
		//다형성.
		Car c1 = new Bus();
		System.out.println(c1.model_name);
		System.out.println(c1.price);
		c1.open();
		System.out.println("==다형성=========");
		
		Car c2 = new AirBus();
		c2.open();
		
		System.out.println("==다형성Taxi=========");
		Car c3 = new Taxi();
		c3.open();
		
		System.out.println("==다형성 리턴=========");
		Car c4 = testCar();
		c4.open();
		
		System.out.println("==다형성 익명내부anonymous inner=========");
		Car c5 = new Car() {
			int num;
			public void aaa() {
				System.out.println("aaa()...");
			}
			@Override
			public int open() {
				System.out.println("anonymous open");
				aaa();
				return 44;
			}
		};
		c5.open();
		
		Car c6 = new Car() {
			int num;
			public void aaa() {
				System.out.println("aaa()...");
			}
			@Override
			public int open() {
				System.out.println("anonymous open");
				aaa();
				return 44;
			}
		};
		c6.open();
		
		//다형성
		Bus b1 = new AirBus();
		System.out.println(b1.price);
		System.out.println(b1.model_name);
		System.out.println(b1.station_count);
		System.out.println(b1.com_name);
		System.out.println(b1.autoDoorOpen());
		System.out.println(b1.open());
		System.out.println("===========");
		
		
		
	}//end main

	private static Car testCar() {
		return new Bus();
//		return new Taxi();
	}

}//end class
