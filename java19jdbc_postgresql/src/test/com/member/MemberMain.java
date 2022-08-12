package test.com.member;

import test.com.member.model.MemberDAO;
import test.com.member.model.MemberDAOimpl;
import test.com.member.model.MemberVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MemberMain {


    public static void main(String[] args) throws IOException {
        System.out.println("Hello jdbc....");


        // table 생성,삭제,내용제거,수정 : DDL

        MemberDAO dao = new MemberDAOimpl();

        // 내용수정,삭제,입력 : DML
        MemberVO vo = new MemberVO();
        boolean On = true;
        int Num = 0;
        String Id = null;
        String Pw = null;
        String Name = null;
        String Tel = null;

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
                    System.out.print("아이디: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Id = br.readLine();
                    System.out.print("PW: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Pw = br.readLine();
                    System.out.print("이름: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Name = br.readLine();
                    System.out.print("전화번호: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Tel = br.readLine();
                    vo.setId(Id);
                    vo.setPw(Pw);
                    vo.setName(Name);
                    vo.setTel(Tel);
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
                    System.out.print("회원 번호: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Num = Integer.parseInt(br.readLine());
                    System.out.print("아이디: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Id = br.readLine();
                    System.out.print("PW: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Pw = br.readLine();
                    System.out.print("이름: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Name = br.readLine();
                    System.out.print("번호: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Tel = br.readLine();
                    System.out.println();
                    vo = new MemberVO();
                    vo.setNum(Num);
                    vo.setId(Id);
                    vo.setPw(Pw);
                    vo.setName(Name);
                    vo.setTel(Tel);
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
                    System.out.print("회원 번호: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Num = Integer.parseInt(br.readLine());
                    vo = new MemberVO();
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
                    vo = new MemberVO();
                    vo.setNum(Num);
                    MemberVO vo2 = dao.selectOne(vo);
                    System.out.println("-----------------------------------------");
                    System.out.println("No\t ID\t\tPW\t\tNAME\tTEL");
                    System.out.println("-----------------------------------------");
                    System.out.println(vo2.getNum() + "\t" + vo2.getId() + "\t" + vo2.getPw() + "\t" + vo2.getName() + "\t" + vo2.getTel());
                    System.out.println();
                    System.out.println("=========================================");
                    break;
                case 5:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("모두 검색 페이지");
                    System.out.println("-----------------------------------------");
                    List<MemberVO> vos = dao.selectAll();
                    System.out.println("-----------------------------------------");
                    System.out.println("No\t ID\t\tPW\t\tNAME\tTEL");
                    System.out.println("-----------------------------------------");
                    for (MemberVO x : vos) {
                        System.out.println(x.getNum() + "\t" + x.getId() + "\t" + x.getPw() + "\t" + x.getName() + "\t" + x.getTel());
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
                    List<MemberVO> vos2 = dao.searchList(Key, Word);
                    System.out.println("-----------------------------------------");
                    System.out.println("No\t ID\\ttPW\t\tNAME\tTEL");
                    System.out.println("-----------------------------------------");
                    for (MemberVO x : vos2) {
                        System.out.println(x.getNum() + "\t" + x.getId() + "\t" + x.getPw() + "\t" + x.getName() + "\t" + x.getTel());
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
