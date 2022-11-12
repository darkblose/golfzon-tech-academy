package test.com;

public class Test02switch_main {

	public static void main(String[] args) {
		// switch~case~break
		System.out.println("hello switch");
		
		int key = 2;
		switch (key) {//정수,char,String
		case 0:
			System.out.println("0000");
			break;//if문을 제외한 가장 가까운 블럭을 빠져나가
		case 1:
			System.out.println("1111");
			break;//if문을 제외한 가장 가까운 블럭을 빠져나가
		case 2:case 3:case 4:case 5:case 6:
			System.out.println("23456");
			if(key/3 > 1) {
				System.out.println("Big");
			}
			break;//if문을 제외한 가장 가까운 블럭을 빠져나가

		default:
			System.out.println("default");
			//break;
		}
		
	}//end main

}//end class
