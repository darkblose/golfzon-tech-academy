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
//		1. �Է� 2. ���� 3. ���� 4. ��ȣ�˻� 5. ��ΰ˻� 6. Ű���� �˻�
        //BoardVO - num,title,content,writer,wdate
        //BoardDAO -interface(�Է�,����,����,�ð˻�,�ϳ��˻�,�˻���˻�)
        //BoardDAOimpl - BoardDAO��ӹ޾Ʊ���
        //BoardMain - ��ü����,�Լ�ȣ��,���....

        BoardDAO dao = new BoardDAOimpl();

        BoardVO vo = new BoardVO();
        boolean On = true;
        int Num = 0;
        String Title = null;
        String Content = null;
        String Writer = null;

        while (On) {
            System.out.println();
            System.out.println("������ �޴��� �����ϼ���.");
            System.out.println("1. �Է� 2. ���� 3. ���� 4. ��ȣ�˻� 5. ��� �˻� 6. Ű���� �˻� 9. ����");
            System.out.println();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int select = Integer.parseInt(br.readLine());
            switch (select) {
                case 1:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("�Է� ������");
                    System.out.println("-----------------------------------------");
                    System.out.print("����: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Title = br.readLine();
                    System.out.print("����: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Content = br.readLine();
                    System.out.print("�ۼ���: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Writer = br.readLine();
                    vo.setTitle(Title);
                    vo.setContent(Content);
                    vo.setWriter(Writer);
                    int result = dao.insert(vo);
                    if (result == 1) {
                        System.out.println("�Է� ����");
                        System.out.println("=========================================");
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("���� ������");
                    System.out.println("-----------------------------------------");
                    System.out.print("�� ��ȣ: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Num = Integer.parseInt(br.readLine());
                    System.out.print("����: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Title = br.readLine();
                    System.out.print("����: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Content = br.readLine();
                    System.out.print("�ۼ���: ");
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
                        System.out.println("���� ����");
                        System.out.println("=========================================");
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("���� ������");
                    System.out.println("-----------------------------------------");
                    System.out.print("�� ��ȣ: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Num = Integer.parseInt(br.readLine());
                    vo = new BoardVO();
                    vo.setNum(Num);
                    result = dao.delete(vo);
                    if (result == 1) {
                        System.out.println("���� ����");
                        System.out.println("=========================================");
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("��ȣ �˻� ������");
                    System.out.println("-----------------------------------------");
                    System.out.print("�� ��ȣ: ");
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
                    System.out.println("��� �˻� ������");
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
                    System.out.println("Ű���� �˻� ������");
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
