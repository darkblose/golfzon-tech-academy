package test.com.member;

import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		System.out.println("Hello Member....");
		
		MemberDAO dao = new MemberDAOimpl();
		
		MemberVO vo = new MemberVO();
		vo.setId("aaa");
		vo.setPw("111");
		vo.setName("a1a1");
		vo.setTel("111");
		
		int result = dao.insert(vo);
		System.out.println("result:"+result);
		
		vo = new MemberVO();
		vo.setId("bbb");
		vo.setPw("222");
		vo.setName("b2b2");
		vo.setTel("222");
		result = dao.insert(vo);
		System.out.println("result:"+result);
		
		vo = new MemberVO();
		vo.setId("ccc");
		vo.setPw("333");
		vo.setName("c3c3");
		vo.setTel("333");
		result = dao.insert(vo);
		System.out.println("result:"+result);

		vo = new MemberVO();
		vo.setId("zzz");
		vo.setPw("999");
		vo.setName("z9z9");
		vo.setTel("999");
		vo.setNum(2);
		result = dao.update(vo);
		System.out.println("result:"+result);//1
		
		vo = new MemberVO();
		vo.setNum(3);
//		vo.setId("admin88");
		result = dao.delete(vo);
		System.out.println("result:"+result);//1
		
		List<MemberVO> vos = dao.selectAll();
		//for~
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		
		
		vo.setNum(77);
		MemberVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);
		
		List<MemberVO> vos2 = dao.searchList("name","ki");
//		List<MemberVO> vos2 = dao.searchList("tel","010");
		for (MemberVO x : vos2) {
			System.out.println(x);
		}
		
	}//end main

}//end class
