package test.com;

public class Test04for_main {

	
	
	public static void main(String[] args) {
		// �ݺ��� - for, while , do~while
		// for�ݺ��� : �󸶸�ŭ,����,�Ⱓ,,,,
		// while�ݺ��� : ���ѹݺ����� Ư�� ��ȣ,��Ȳ�϶� �׸�
		for (int i = 0; i < 10; i++) {
			if (i%2 != 0) {
				System.out.printf("<%d>\n",i);
			}
		}
		
		//0123456789
		//0123456789
		//0123456789
		
		
		for (int x = 0; x < 3; x++) {
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("========");
		
		//2*1=2, 2*2=4,..., 2*9=18
		//3*1=3, 3*2=6,..., 3*9=27
		//...
		//9*1=9, 9*2=18,..., 9*9=81
		
		for (int x = 2; x < 10; x++) {
			for (int i = 1; i < 10; i++) {
//				System.out.print(x+"*"+i+"="+(x*i)+" ");
				System.out.printf("%2d *%2d=%2d ",x,i,x*i);
			}
			System.out.println();
		}
		System.out.println("========");
		
	}//end main

}//end class
