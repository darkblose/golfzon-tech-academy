package test.com;

public class CarMain {

	public static void main(String[] args) {
		System.out.println("hello car...");
		
		Car c = new Car();
		System.out.println(c);
		
		Car c_bmw = new Car("BMW");
		System.out.println(c_bmw);
		
		c = new Car(300);
		System.out.println(c);
		
		c = new Car("KN","����");
		System.out.println(c);
		
		Car c_po = new Car("������","����",1000);
		System.out.println(c_po);
		
		
		//////////��ü�迭//////////////////
		
		//�ڵ��� �δ��� ����(BMW,������)�� ���� �迭����,����ϱ�.
		System.out.println("============");
		Car[] cs = new Car[2];
		cs[0] = c_bmw;
		cs[1] = c_po;
		
		for (Car car : cs) {
			System.out.println(car);
		}
		
	}// end main

}// end class
