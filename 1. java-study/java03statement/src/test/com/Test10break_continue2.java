package test.com;

public class Test10break_continue2 {

	public static void main(String[] args) {
		// switch or �ݺ��������� ��� �ʿ��Ҷ�
		// �׸� >> break 
		//		-if���� ������ ������ ���� ����� ������ ����������.
		// ��ŵ(�ǳʶٱ�) >>continue  
		//		-if���� ������ ������ ���� ����� ������ �����ΰ���.

		// �Լ��� ���Ұ����� ���ư��� >> return
		
		for (int x = 0; x < 5; x++) {
			if(x==2)break;
			System.out.print(x+":");
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		System.out.println("================");
		
		
		for (int x = 0; x < 5; x++) {
			if(x==2)continue;
			System.out.print(x+":");
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}//end main

}//end class