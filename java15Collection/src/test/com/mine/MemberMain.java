package test.com.mine;

import java.util.List;

public class MemberMain {
    public static void main(String[] args) {
        MemberDAO dao = new MemberDAOimpl();

        MemberVO vo = new MemberVO();
        vo.setNum(57);
        vo.setId("zx9876");
        vo.setPw("0p9o8i7u");
        vo.setName("Lee");
        vo.setTel("02-987-6543");

        int result = dao.insert(vo);
        System.out.println("result : " + result);

        vo = new MemberVO();
        vo.setId("admin99");
        vo.setPw("hi123499");
        vo.setName("kim99");
        vo.setTel("0299");
        vo.setNum(99);
        result = dao.update(vo);
        System.out.println("result:"+result);//1

        vo.setNum(88);
        vo.setId("admin88");
        result = dao.delete(vo);
        System.out.println("result:"+result);//1

        List<MemberVO> vos = dao.selectAll();
        //for~
        for (MemberVO x : vos) {
            System.out.println(x);
        }

        vo.setNum(77);
        MemberVO vo2 = dao.selectOne(vo);
        System.out.println(vo2);

        List<MemberVO> vos2 = dao.searchList("77","admin");
        for (MemberVO x : vos2) {
            System.out.println(x);
        }
    }
}
