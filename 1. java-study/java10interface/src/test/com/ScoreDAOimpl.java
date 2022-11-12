package test.com;

public class ScoreDAOimpl implements ScoreDAO {

	public ScoreDAOimpl() {
		System.out.println("ScoreDAOimpl()...");
	}

	@Override
	public int insert(ScoreVO vo) {
		System.out.println("insert()....");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int update(ScoreVO vo) {
		System.out.println("update()....");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int delete(ScoreVO vo) {
		System.out.println("delete()....");
		System.out.println(vo);

		return 1;
	}

	@Override
	public ScoreVO selectOne(ScoreVO vo) {
		System.out.println("selectOne()....");
		System.out.println(vo);

		ScoreVO vo2 = new ScoreVO();
		vo2.setNum(1);
		vo2.setName("kim");
		vo2.setKor(90);
		vo2.setEng(91);
		vo2.setMath(92);
		return vo2;
	}

	@Override
	public ScoreVO[] selectAll() {
		System.out.println("selectAll()....");

		ScoreVO[] vos = new ScoreVO[3];
		for (int i = 0; i < vos.length; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setNum(1 + i);
			vo.setName("kim" + i);
			vo.setKor(90 + i);
			vo.setEng(91 + i);
			vo.setMath(92 + i);
			vos[i] = vo;
		}
		return vos;
	}

	@Override
	public ScoreVO[] searchList(String searchKey, String searchWord) {
		System.out.println("searchList()....");
		System.out.println(searchKey);
		System.out.println(searchWord);

		ScoreVO[] vos = new ScoreVO[3];
		for (int i = 0; i < vos.length; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setNum(10 + i);
			vo.setName("kim" + i);
			vo.setKor(80 + i);
			vo.setEng(81 + i);
			vo.setMath(82 + i);
			vos[i] = vo;
		}
		return vos;
	}

}
