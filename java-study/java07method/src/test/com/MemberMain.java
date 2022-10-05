package test.com;

public class MemberMain {

	public static void main(String[] args) {
		System.out.println("Hello Member");
		
		MemberVO vo = new MemberVO();
		vo.setId("admin1");
		vo.setPw("hi123451");
		vo.setName("kim1");
		vo.setTel("021");
		
		MemberProcess mp = new MemberProcess();
		int result = mp.insert(vo);
		System.out.println("result:"+result);
		
		vo = new MemberVO();
		vo.setId("admin99");
		vo.setPw("hi123499");
		vo.setName("kim99");
		vo.setTel("0299");
		vo.setNum(99);
		result = mp.update(vo);
		System.out.println("result:"+result);//1
		
		vo.setNum(88);
		vo.setId("admin88");
		result = mp.delete(vo);
		System.out.println("result:"+result);//1
		
		MemberVO[] vos = mp.selectAll();
		//for~
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		
		vo.setNum(77);
		MemberVO vo2 = mp.selectOne(vo);
		System.out.println(vo2);
		
//		MemberVO[] vos2 = mp.searchList("name","ki");
		MemberVO[] vos2 = mp.searchList("tel","010");
		for (MemberVO x : vos2) {
			System.out.println(x);
		}
	}//end main

	

	

}//end class
