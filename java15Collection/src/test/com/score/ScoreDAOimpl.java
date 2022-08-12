package test.com.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreDAOimpl implements ScoreDAO {

	public ScoreDAOimpl() {
		System.out.println("ScoreDAOimpl()");
	}

	@Override
	public int insert(ScoreVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int update(ScoreVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int delete(ScoreVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public ScoreVO selectOne(ScoreVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);

		ScoreVO vo2 = new ScoreVO();
		vo2.setNum(11);
		vo2.setName("kim");
		vo2.setKor(99);
		vo2.setEng(88);
		vo2.setMath(77);

		return vo2;
	}

	@Override
	public List<ScoreVO> selectAll() {
		System.out.println("selectAll()...");
		List<ScoreVO> vos = new ArrayList<ScoreVO>();

		for (int i = 0; i < 3; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setNum(11 + i);
			vo.setName("kim" + i);
			vo.setKor(96 + i);
			vo.setEng(88 + i);
			vo.setMath(77 + i);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public List<ScoreVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchList()....");
		System.out.println(searchKey);
		System.out.println(searchWord);

		List<ScoreVO> vos = new ArrayList<ScoreVO>();

		for (int i = 0; i < 3; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setNum(11 + i);
			vo.setName("kim" + i);
			vo.setKor(96 + i);
			vo.setEng(88 + i);
			vo.setMath(77 + i);
			vos.add(vo);
		}
		return vos;
	}

}
