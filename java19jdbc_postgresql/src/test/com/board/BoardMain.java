package test.com.board;

import test.com.board.model.BoardDAO;
import test.com.board.model.BoardDAOimpl;
import test.com.board.model.BoardVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

public class BoardMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello Board");
//		1. 입력 2. 수정 3. 삭제 4. 번호검색 5. 모두검색 6. 키워드 검색
        //BoardVO - num,title,content,writer,wdate
        //BoardDAO -interface(입력,수정,삭제,올검색,하나검색,검색어검색)
        //BoardDAOimpl - BoardDAO상속받아구현
        //BoardMain - 객체생성,함수호출,출력....

        BoardDAO dao = new BoardDAOimpl();

        BoardVO vo = new BoardVO();
        boolean On = true;
        int Num = 0;
        String Title = null;
        String Content = null;
        String Writer = null;

        while (On) {
            System.out.println();
            System.out.println("실행할 메뉴를 선택하세요.");
            System.out.println("1. 입력 2. 수정 3. 삭제 4. 번호검색 5. 모두 검색 6. 키워드 검색 9. 종료");
            System.out.println();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int select = Integer.parseInt(br.readLine());
            switch (select) {
                case 1:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("입력 페이지");
                    System.out.println("-----------------------------------------");
                    System.out.print("제목: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Title = br.readLine();
                    System.out.print("내용: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Content = br.readLine();
                    System.out.print("작성자: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Writer = br.readLine();
                    vo.setTitle(Title);
                    vo.setContent(Content);
                    vo.setWriter(Writer);
                    int result = dao.insert(vo);
                    if (result == 1) {
                        System.out.println("입력 성공");
                        System.out.println("=========================================");
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("수정 페이지");
                    System.out.println("-----------------------------------------");
                    System.out.print("글 번호: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Num = Integer.parseInt(br.readLine());
                    System.out.print("제목: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Title = br.readLine();
                    System.out.print("내용: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Content = br.readLine();
                    System.out.print("작성자: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Writer = br.readLine();
                    System.out.println();
                    vo = new BoardVO();
                    vo.setNum(Num);
                    vo.setTitle(Title);
                    vo.setContent(Content);
                    vo.setWriter(Writer);
                    result = dao.update(vo);
                    if (result == 1) {
                        System.out.println("수정 성공");
                        System.out.println("=========================================");
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("삭제 페이지");
                    System.out.println("-----------------------------------------");
                    System.out.print("글 번호: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Num = Integer.parseInt(br.readLine());
                    vo = new BoardVO();
                    vo.setNum(Num);
                    result = dao.delete(vo);
                    if (result == 1) {
                        System.out.println("삭제 성공");
                        System.out.println("=========================================");
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("번호 검색 페이지");
                    System.out.println("-----------------------------------------");
                    System.out.print("글 번호: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Num = Integer.parseInt(br.readLine());
                    vo = new BoardVO();
                    vo.setNum(Num);
                    BoardVO vo2 = dao.selectOne(vo);
                    System.out.println("-----------------------------------------");
                    System.out.println("No\t title\tcontent\twriter\twdate");
                    System.out.println("-----------------------------------------");
                    System.out.println(vo2.getNum() + "\t" + vo2.getTitle() + "\t" + vo2.getContent() + "\t" + vo2.getWriter() + "\t" + vo2.getWdate());
                    System.out.println();
                    System.out.println("=========================================");
                    break;
                case 5:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("모두 검색 페이지");
                    System.out.println("-----------------------------------------");
                    List<BoardVO> vos = dao.selectAll();
                    System.out.println("-----------------------------------------");
                    System.out.println("No\t title\tcontent\twriter\twdate");
                    System.out.println("-----------------------------------------");
                    for (BoardVO x : vos) {
                        System.out.println(x.getNum() + "\t" + x.getTitle() + "\t" + x.getContent() + "\t" + x.getWriter() + "\t" + x.getWdate());
                    }
                    System.out.println("=========================================");
                    break;
                case 6:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("키워드 검색 페이지");
                    System.out.println("-----------------------------------------");
                    System.out.print("Key: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    String Key = br.readLine();
                    System.out.print("Word: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    String Word = br.readLine();
                    System.out.println();
                    List<BoardVO> vos2 = dao.searchList(Key, Word);
                    System.out.println("-----------------------------------------");
                    System.out.println("No\t title\tcontent\twriter\twdate");
                    System.out.println("-----------------------------------------");
                    for (BoardVO x : vos2) {
                        System.out.println(x.getNum() + "\t" + x.getTitle() + "\t" + x.getContent() + "\t" + x.getWriter() + "\t" + x.getWdate());
                    }
                    System.out.println("=========================================");
                    break;
                case 9:
                    On = false;
                    break;
            }
        }

    }//end main

}//end class
