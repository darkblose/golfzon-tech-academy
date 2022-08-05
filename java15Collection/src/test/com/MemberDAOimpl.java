package test.com;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {

    @Override
    public int insert(MemberVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        return 1;
    }

    @Override
    public int update(MemberVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        return 1;
    }

    @Override
    public int delete(MemberVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        return 1;
    }

    @Override
    public List<MemberVO> selectAll() {
        System.out.println("selectAll()...");

        List<MemberVO> vos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            MemberVO vo = new MemberVO();
            vo.setNum(11 + i);
            vo.setId("ad1212_" + i);
            vo.setPw("1q2w3e4r" + i);
            vo.setName("Kim_" + i);
            vo.setTel("02-111-123" + i);
            vos.add(vo);
        }
        return vos;
    }

    @Override
    public MemberVO selectOne(MemberVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);

        MemberVO vo2 = new MemberVO();
        vo2.setNum(999);
        vo2.setId("zx9876");
        vo2.setPw("0p9o8i7u");
        vo2.setName("Lee");
        vo2.setTel("02-987-6543");
        return vo2;
    }

    @Override
    public List<MemberVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList....");
        System.out.println(searchKey);
        System.out.println(searchWord);

        List<MemberVO> vos = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            MemberVO vo = new MemberVO();
            vo.setNum(55 + i);
            vo.setId("qw5656_" + i);
            vo.setPw("t5y6u7i8" + i);
            vo.setName("Choi_" + i);
            vo.setTel("063-789-456" + i);
            vos.add(vo);
        }
        return vos;
    }
}
