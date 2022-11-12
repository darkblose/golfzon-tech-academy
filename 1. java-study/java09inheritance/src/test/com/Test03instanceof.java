package test.com;

public class Test03instanceof {

	public static void main(String[] args) {
		System.out.println("Hello instanceof");
		
		//Car <- Bus
		//Car <- Taxi
		
//		Car c = new Bus();
		
		Car c2 = new Taxi();
//		Car c2 = new Bus();
//		Bus b = (Bus)c2;
//		b.open();
		System.out.println(c2 instanceof Taxi);
		System.out.println(c2 instanceof Bus);
		if(c2 instanceof Taxi) {
			Taxi t = (Taxi)c2;
			t.open();
		}
		if(c2 instanceof Bus) {
			Bus t = (Bus)c2;
			t.open();
		}
		System.out.println("======");
		test(c2);
		System.out.println("======");
		
		c2 = test2();
		if(c2 instanceof Taxi) {
			Taxi t = (Taxi)c2;
			t.open();
		}
		if(c2 instanceof Bus) {
			Bus t = (Bus)c2;
			t.open();
		}
		
	}//end main

	private static Car test2() {
		return new Bus();
//		return new Taxi();
	}

	private static void test(Car c2) {
		if(c2 instanceof Taxi) {
			Taxi t = (Taxi)c2;
			t.open();
		}
		if(c2 instanceof Bus) {
			Bus t = (Bus)c2;
			t.open();
		}
	}

}//end class
