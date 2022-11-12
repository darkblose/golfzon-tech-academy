package test.com.board;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardDAOimpl implements BoardDAO {

	public BoardDAOimpl() {
		System.out.println("BoardDAOimpl()..");
	}

	@Override
	public int insert(BoardVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int update(BoardVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int delete(BoardVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public BoardVO selectOne(BoardVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);

		BoardVO vo2 = new BoardVO();
		vo2.setNum(55);
		vo2.setTitle("title55");
		vo2.setContent("content55");
		vo2.setWriter("kim55");
		vo2.setWdate(new Date());
		return vo2;
	}

	@Override
	public List<BoardVO> selectAll() {
		System.out.println("selectAll()...");

		List<BoardVO> vos = new ArrayList<BoardVO>();
		for (int i = 0; i < 3; i++) {
			BoardVO vo = new BoardVO();
			vo.setNum(11 + i);
			vo.setTitle("title1" + i);
			vo.setContent("content1" + i);
			vo.setWriter("kim1" + i);
			vo.setWdate(new Date());
			vos.add(vo);
		}

		return vos;
	}

	@Override
	public List<BoardVO> searchList(
			String searchKey, String searchWord) {
		System.out.println("searchList()...");
		System.out.println(searchKey);
		System.out.println(searchWord);

		List<BoardVO> vos = new ArrayList<BoardVO>();
		for (int i = 0; i < 3; i++) {
			BoardVO vo = new BoardVO();
			vo.setNum(22 + i);
			vo.setTitle("title2" + i);
			vo.setContent("content2" + i);
			vo.setWriter("kim2" + i);
			vo.setWdate(new Date());
			vos.add(vo);
		}

		return vos;
	}

}
