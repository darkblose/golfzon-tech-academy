package test.com.mine;

import java.util.ArrayList;
import java.util.List;

public class ScoreDAOimpl implements ScoreDAO {
    @Override
    public int insert(ScoreVO vo) {
        System.out.println("insert...");
        System.out.println(vo);
        return 1;
    }

    @Override
    public int update(ScoreVO vo) {
        System.out.println("update...");
        System.out.println(vo);
        return 1;
    }

    @Override
    public int delete(ScoreVO vo) {
        System.out.println("delete...");
        System.out.println(vo);
        return 1;
    }

    @Override
    public List<ScoreVO> selectAll() {
        System.out.println("selectAll...");

        List<ScoreVO> vos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ScoreVO vo = new ScoreVO();
            vo.setNum(1 + i);
            vo.setName("kim" + i);
            vo.setKor(90 + i);
            vo.setEng(91 + i);
            vo.setMath(92 + i);
            vos.add(vo);
        }
        return vos;
    }

    @Override
    public ScoreVO selectOne(ScoreVO vo) {
        System.out.println("selectOne()....");
        System.out.println(vo);

        ScoreVO vo2 = new ScoreVO();
        vo2.setNum(1);
        vo2.setName("kim");
        vo2.setKor(90);
        vo2.setEng(91);
        vo2.setMath(92);
        return vo2;
    }

    @Override
    public List<ScoreVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList....");
        System.out.println(searchKey);
        System.out.println(searchWord);

        List<ScoreVO> vos = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ScoreVO vo = new ScoreVO();
            vo.setNum(10 + i);
            vo.setName("kim" + i);
            vo.setKor(80 + i);
            vo.setEng(81 + i);
            vo.setMath(82 + i);
            vos.add(vo);
        }
        return vos;
    }
}
