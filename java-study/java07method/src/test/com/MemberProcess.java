package test.com;

public class MemberProcess {

	public int insert(MemberVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);
		return 1;
	}

	public int update(MemberVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		return 1;
	}

	public int delete(MemberVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);
		return 1;
	}

	public MemberVO[] selectAll() {
		System.out.println("selectAll()...");
		
		MemberVO[] vos = new MemberVO[3];
		
		for (int i = 0; i < vos.length; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(44+i);
			vo.setId("admin44"+i);
			vo.setPw("hi1234544"+i);
			vo.setName("kim44"+i);
			vo.setTel("044"+i);
			vos[i] = vo;
		}
		return vos;
	}

	public MemberVO selectOne(MemberVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);
		
		MemberVO vo2 = new MemberVO();
		vo2.setNum(77);
		vo2.setId("admin77");
		vo2.setPw("hi123477");
		vo2.setName("kim77");
		vo2.setTel("0277");
		return vo2;
	}

	public MemberVO[] searchList(
			String searchKey, String searchWord) {
		System.out.println("searchList()...");
		System.out.println(searchKey);
		System.out.println(searchWord);
		
		MemberVO[] vos = new MemberVO[4];
		for (int i = 0; i < vos.length; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(55+i);
			vo.setId("admin55"+i);
			vo.setPw("hi1234555"+i);
			vo.setName("kim55"+i);
			vo.setTel("010"+i);
			vos[i] = vo;
		}
		return vos;
	}

}
//010-3858-9494 �缺ȣ