package test.com.board;

import java.util.Date;
import java.util.List;

public class BoardMain {

	public static void main(String[] args) {
		System.out.println("Hello Board"); 

		//BoardVO - num,title,content,writer,wdate
		//BoardDAO -interface(�Է�,����,����,�ð˻�,�ϳ��˻�,�˻���˻�)
		//BoardDAOimpl - BoardDAO��ӹ޾Ʊ���
		//BoardMain - ��ü����,�Լ�ȣ��,���....
		
		BoardDAO dao = new BoardDAOimpl();
		
		//1.insert
		BoardVO vo = new BoardVO();
		vo.setNum(22);
		vo.setTitle("title2");
		vo.setContent("content2");
		vo.setWriter("kim2");
		vo.setWdate(new Date());
		int result = dao.insert(vo);
		System.out.println("result:"+result);
		//2.update
		vo = new BoardVO();
		vo.setNum(33);
		vo.setTitle("title3");
		vo.setContent("content3");
		vo.setWriter("kim3");
		vo.setWdate(new Date());
		result = dao.update(vo);
		System.out.println("result:"+result);
		
		//3.delete
		vo = new BoardVO();
		vo.setNum(44);
		result = dao.delete(vo);
		System.out.println("result:"+result);
		
		//4.selectOne
		vo = new BoardVO();
		vo.setNum(55);
		BoardVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);
		
		//5.selectAll
		List<BoardVO> vos = dao.selectAll();
		for (BoardVO x : vos) {
			System.out.println(x);
		}
		
		//6.searchList
//		List<BoardVO> vos2 = dao.searchList("title", "ti");
//		List<BoardVO> vos2 = dao.searchList("content", "co");
		List<BoardVO> vos2 = dao.searchList("writer", "ki");
		for (BoardVO x : vos2) {
			System.out.println(x);
		}
		

	}//end main

}//end class
