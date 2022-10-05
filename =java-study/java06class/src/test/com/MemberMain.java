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
		
		//주변에 객체로 만들만한 대상을 선정해서
		//클래스를 만들어오세요.5개 이하.
		
		//서로다른 회원4명의 정보를 담는 회원배열생성 및 출력
		//값은 임의의값을 넣는데 세터사용할것, 반복문사용권장.
		
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
