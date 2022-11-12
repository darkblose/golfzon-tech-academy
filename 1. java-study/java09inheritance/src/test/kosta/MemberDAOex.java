package test.kosta;

public class MemberDAOex extends MemberDAO {

	public MemberDAOex() {
		System.out.println("MemberDAOex()...");
	}
	
	@Override
	public int insert(MemberVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int update(MemberVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int delete(MemberVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public MemberVO[] selectAll() {
		System.out.println("selectAll()...");

		MemberVO[] vos = new MemberVO[3];

		for (int i = 0; i < vos.length; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(44 + i);
			vo.setId("admin44" + i);
			vo.setPw("hi1234544" + i);
			vo.setName("kim44" + i);
			vo.setTel("044" + i);
			vos[i] = vo;
		}
		return vos;
	}

	@Override
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

	@Override
	public MemberVO[] searchList(String searchKey, String searchWord) {
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
