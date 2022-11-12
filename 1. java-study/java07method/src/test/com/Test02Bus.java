package test.com;

public class Test02Bus {
	
	//start1 X X
	public void start1() {
		System.out.println("start1()...");
	}
	
	
	//start2 X O
	public int[] start2() {
		System.out.println("start2()...");
		return new int[] {11,22,33};
	}
	
	//start3 O X
	public void start3(String[] names) {
		System.out.println("start3()...");
		for (String name : names) {
			System.out.println(name);
		}
	}
	
	
	//start4 O O
	public Car[] start4(Car car) {
		System.out.println("start4()...");
		System.out.println(car);
		return new Car[] {new Car(),new Car(),new Car()};
	}
	
	public void start5(int ... sus) {
		System.out.println("start5()...");
		for (int i : sus) {
			System.out.println(i);
			if(i==66)return;
		}
		System.out.println("end start5()...");
		//return;
	}
	public int start6(int ... sus) {
		System.out.println("start6()...");
		for (int i : sus) {
			System.out.println(i);
			if(i==66)return 99;
		}
		System.out.println("end start6()...");
		return 0;
	}
	public int start6(String ... sus) {
		System.out.println("start6()...");
		
		return 0;
	}
	public int start6(int x,int y) {
		System.out.println("start6()...");
		
		return 0;
	}

}
