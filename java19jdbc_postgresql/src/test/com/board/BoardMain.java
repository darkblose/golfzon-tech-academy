package test.com.board;

import java.util.List;

public class BoardMain {

	public static void main(String[] args) {
		System.out.println("Hello Board"); 

		//BoardVO - num,title,content,writer,wdate
		//BoardDAO -interface(입력,수정,삭제,올검색,하나검색,검색어검색)
		//BoardDAOimpl - BoardDAO상속받아구현
		//BoardMain - 객체생성,함수호출,출력....
		
		BoardDAO dao = new BoardDAOimpl();
		
		//1.insert
		BoardVO vo = new BoardVO();

		vo.setTitle("t2t2t2t");
		vo.setContent("c2c2c2");
		vo.setWriter("l2l2l2l");

		int result = dao.insert(vo);
		System.out.println("result:"+result);
		//2.update
		vo = new BoardVO();
		vo.setNum(12);
		vo.setTitle("EEEEEE");
		vo.setContent("CCCCC3");
		vo.setWriter("LLLL3");
		result = dao.update(vo);
		System.out.println("result:"+result);
		
		//3.delete
		vo = new BoardVO();
		vo.setNum(44);
		result = dao.delete(vo);
		System.out.println("result:"+result);
		
		//4.selectOne
		vo = new BoardVO();
		vo.setNum(40);
		BoardVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);
		
		//5.selectAll
		List<BoardVO> vos = dao.selectAll();
		for (BoardVO x : vos) {
			System.out.println(x);
		}
		
		//6.searchList
		List<BoardVO> vos2 = dao.searchList("title", "ti");
		for (BoardVO x : vos2) {
			System.out.println(x);
		}
		vos2 = dao.searchList("content", "co");
		for (BoardVO x : vos2) {
			System.out.println(x);
		}
		vos2 = dao.searchList("writer", "ki");
		for (BoardVO x : vos2) {
			System.out.println(x);
		}

	}//end main

}//end class
