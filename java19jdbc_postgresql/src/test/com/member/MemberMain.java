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


        // table ����,����,��������,���� : DDL

        MemberDAO dao = new MemberDAOimpl();

        // �������,����,�Է� : DML
        MemberVO vo = new MemberVO();
        boolean On = true;
        int Num = 0;
        String Id = null;
        String Pw = null;
        String Name = null;
        String Tel = null;

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
                    System.out.print("���̵�: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Id = br.readLine();
                    System.out.print("PW: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Pw = br.readLine();
                    System.out.print("�̸�: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Name = br.readLine();
                    System.out.print("��ȭ��ȣ: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Tel = br.readLine();
                    vo.setId(Id);
                    vo.setPw(Pw);
                    vo.setName(Name);
                    vo.setTel(Tel);
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
                    System.out.print("ȸ�� ��ȣ: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Num = Integer.parseInt(br.readLine());
                    System.out.print("���̵�: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Id = br.readLine();
                    System.out.print("PW: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Pw = br.readLine();
                    System.out.print("�̸�: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Name = br.readLine();
                    System.out.print("��ȣ: ");
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
                        System.out.println("���� ����");
                        System.out.println("=========================================");
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("=========================================");
                    System.out.println("���� ������");
                    System.out.println("-----------------------------------------");
                    System.out.print("ȸ�� ��ȣ: ");
                    br = new BufferedReader(new InputStreamReader(System.in));
                    Num = Integer.parseInt(br.readLine());
                    vo = new MemberVO();
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
                    System.out.println("��� �˻� ������");
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
                    System.out.println("Ű���� �˻� ������");
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
