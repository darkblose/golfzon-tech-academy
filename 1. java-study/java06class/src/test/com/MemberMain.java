package test.com;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberVO vo = new MemberVO();
		vo.setNum(1);
		vo.setId("admin");
		vo.setPw("hi1234");
		vo.setName("lee");
		vo.setTel("010");
		System.out.println(vo);
		
		vo = new MemberVO();
		System.out.println(vo);
		
		vo = new MemberVO(9,"tester","hi2424","kim","02");
		System.out.println(vo);
		System.out.print(vo.getNum()+" ");
		System.out.print(vo.getId()+" ");
		System.out.print(vo.getPw()+" ");
		System.out.print(vo.getName()+" ");
		System.out.println(vo.getTel());
		
		//�ֺ��� ��ü�� ���鸸�� ����� �����ؼ�
		//Ŭ������ ����������.5�� ����.
		
		//���δٸ� ȸ��4���� ������ ��� ȸ���迭���� �� ���
		//���� �����ǰ��� �ִµ� ���ͻ���Ұ�, �ݺ���������.
		
		MemberVO[] vos = new MemberVO[4];
		for (int i = 0; i < vos.length; i++) {
			vo = new MemberVO();
			vo.setNum(i+1);
			vo.setId("admin"+(i+1));
			vo.setPw("hi1234"+(i+1));
			vo.setName("lee"+(i+1));
			vo.setTel("010"+(i+1));
			vos[i] = vo;
		}
		
		for (MemberVO x : vos) {
			System.out.println(x);
		}

	}//end main

}//end class
