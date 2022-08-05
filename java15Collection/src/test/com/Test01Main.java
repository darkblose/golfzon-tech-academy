package test.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01Main {
    public static void main(String[] args) {
        System.out.println("Hello Collection");
        String[] strs = new String[]{"aaa", "bbb"};

//        중복데이터 허용, 순서 있음, null 허용
//        수정(set), 삭제(remove), 추가(add), 검색(get) 가능
//        참조타입이라면 뭐든 삽입 가능

        List<Integer> list = new ArrayList<>();
        list.add(1000); //Integer
        list.add(1000); //Integer
//        list.add("kim"); //String
//        list.add("kim"); //String
//        list.add(3.14); //Double
        list.add(null); //null
        list.add(4000); //Integer
        list.add(5000); //Integer
        list.add(0, 9999);
        Object[] objs = list.toArray();
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(0);
        list.set(1, 999);

        System.out.println("========================");
        for (Integer x : list) {
            System.out.println(x);
        }

        System.out.println("========================");
        List<MemberVO> vos = new ArrayList<MemberVO>();
        vos.add(new MemberVO());
        vos.add(new MemberVO());
        vos.add(new MemberVO(11, "admin", "h11234", "KIM", "010-1111-2222"));
        vos.add(new MemberVO(11, "admin", "h11234", "KIM", "010-1111-2222"));

//        MemberVO vo = new MemberVO();
//        vos.add(vo);
//        vos.add(vo);
//        vos.add(vo);

        MemberVO vo = new MemberVO();
        vo.setNum(1);
        vo.setId("tester");
        vo.setPw("h1234");
        vo.setTel("02");
        vos.add(vo);
        vos.add(vo);
        vos.add(vo);

        System.out.println(vos.size());
        for (MemberVO x : vos) {
            System.out.print(x.getNum() + " ");
            System.out.print(x.getId() + " ");
            System.out.print(x.getPw() + " ");
            System.out.print(x.getName() + " ");
            System.out.println(x.getTel());
        }

        System.out.println("======================="); // 예전 버전의 for와 while 원리, 566페이지
//        for (Iterator iterator = vos.iterator(); iterator.hasNext(); ) {
//            MemberVO memberVO = (MemberVO) iterator.next();
//        }
//
//        while (vos.iterator().hasNext()) {
//            MemberVO memberVO = (MemberVO) vos.iterator().next();
//        }

    }
}
