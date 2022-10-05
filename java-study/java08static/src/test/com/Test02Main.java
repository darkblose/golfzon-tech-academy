package test.com;

public class Test02Main {

	public static void main(String[] args) {
		
		System.out.println("Hello SingleTon");
		
		
		Test02SingleTon singleTon1 = 
				Test02SingleTon.getInstance();
		System.out.println(singleTon1);
		Test02SingleTon singleTon2 = 
				Test02SingleTon.getInstance();
		System.out.println(singleTon2);
		
	}//end main

}//end class
