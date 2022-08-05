package test.com;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        System.out.println("Hello Board");

//        BoardVO - num(integer),title,content,writer(string),wdate(type: date)
//        BoardDAO - interface(입력, 수정, 삭제, 전부검색, 하나검색, 검색어검색)
//        BoardDAOimpl - (BoardDAO를 상속받아서 구현
//        BoardMain - 객체생성, 함수호출, 출력...

        BoardDAO dao = new BoardDAOimpl();
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss:SSS");
        String wDate = sdf.format(now);

        // 1.insert
        BoardVO vo = new BoardVO();
        vo.setNum(1);
        vo.setTitle("Copy1");
        vo.setContent("Copy1Copy1");
        vo.setWriter("tls123");
        now = new Date();
        vo.setwDate(wDate);

        int result = dao.insert(vo);
        System.out.println("result:" + result);

        // 2.update
        vo = new BoardVO();
        vo.setNum(2);
        vo.setTitle("Copy2");
        vo.setContent("Copy2Copy2");
        vo.setWriter("tls987");
        now = new Date();
        vo.setwDate(wDate);
        result = dao.update(vo);
        System.out.println("result:" + result);

        // 3.delete
        vo = new BoardVO();
        vo.setNum(3);
        result = dao.delete(vo);
        System.out.println("result:" + result);

        // 4.selectOne
        vo = new BoardVO();
        vo.setNum(1);
        BoardVO vo2 = dao.selectOne(vo);
        System.out.println(vo2);

        // 5.selectAll
        List<BoardVO> vos = dao.selectAll();
        for (BoardVO x : vos) {
            System.out.println(x);
        }

        // 6.searchList
        List<BoardVO> vos2 = dao.searchList("copy", "900");
        for (BoardVO x : vos2) {
            System.out.println(x);
        }
    } //end main
}//end class
