package test.com;

public class ScoreMain {

	public static void main(String[] args) {
		System.out.println("Hello Score....");

		ScoreDAO dao = new ScoreDAOimpl();

		// 1.insert
		ScoreVO vo = new ScoreVO();
		vo.setNum(1);
		vo.setName("lee");
		vo.setKor(99);
		vo.setEng(88);
		vo.setMath(77);

		int result = dao.insert(vo);
		System.out.println("result:" + result);

		// 2.update
		vo = new ScoreVO();
		vo.setNum(2);
		vo.setName("lee2");
		vo.setKor(92);
		vo.setEng(82);
		vo.setMath(72);
		result = dao.update(vo);
		System.out.println("result:" + result);

		// 3.delete
		vo = new ScoreVO();
		vo.setNum(3);
		result = dao.delete(vo);
		System.out.println("result:" + result);

		// 4.selectOne
		vo = new ScoreVO();
		vo.setNum(1);
		ScoreVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);

		// 5.selectAll
		ScoreVO[] vos = dao.selectAll();
		for (ScoreVO x : vos) {
			System.out.println(x);
		}

		// 6.searchList
//		ScoreVO[] vos2 = dao.searchList("name", "le");
		ScoreVO[] vos2 = dao.searchList("kor", "90");
		for (ScoreVO x : vos2) {
			System.out.println(x);
		}
	}// end main

}// end class
