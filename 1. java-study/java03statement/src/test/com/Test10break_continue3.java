package test.com;

public class Test10break_continue3 {

	public static void main(String[] args) {
		// switch or �ݺ��������� ��� �ʿ��Ҷ�
		// �׸� >> break
		// -if���� ���� ������ ���� ����� ���� ����������.
		// ��ŵ(�ǳʶٱ�) >>continue
		// -if���� ���� ������ ���� ����� ���� �����ΰ���.

		// �Լ��� ���Ұ����� ���ư��� >> return

		f_x: for (int x = 0; x < 5; x++) {
			System.out.print(x + ":");
			for (int i = 0; i < 10; i++) {
				if (i == 5)
					break f_x;
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("================");

		f_x: for (int x = 0; x < 5; x++) {
			System.out.print(x + ":");
			for (int i = 0; i < 10; i++) {
				if (i == 5)
					continue f_x;
				System.out.print(i);
			}
			System.out.println();
		}

	}// end main

}// end class
