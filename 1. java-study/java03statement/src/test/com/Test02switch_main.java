package test.com;

public class Test02switch_main {

	public static void main(String[] args) {
		// switch~case~break
		System.out.println("hello switch");
		
		int key = 2;
		switch (key) {//����,char,String
		case 0:
			System.out.println("0000");
			break;//if���� ������ ���� ����� ���� ��������
		case 1:
			System.out.println("1111");
			break;//if���� ������ ���� ����� ���� ��������
		case 2:case 3:case 4:case 5:case 6:
			System.out.println("23456");
			if(key/3 > 1) {
				System.out.println("Big");
			}
			break;//if���� ������ ���� ����� ���� ��������

		default:
			System.out.println("default");
			//break;
		}
		
	}//end main

}//end class
