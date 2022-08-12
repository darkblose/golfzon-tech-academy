package test.com.mine;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardDAOimpl implements BoardDAO {
    @Override
    public int insert(BoardVO vo) {
        System.out.println("insert...");
        System.out.println(vo);
        return 1;
    }

    @Override
    public int update(BoardVO vo) {
        System.out.println("update...");
        System.out.println(vo);
        return 1;
    }

    @Override
    public int delete(BoardVO vo) {
        System.out.println("delete...");
        System.out.println(vo);
        return 1;
    }

    @Override
    public List<BoardVO> selectAll() {
        System.out.println("selectAll...");

        List<BoardVO> vos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            BoardVO vo = new BoardVO();
            vo.setNum(101 + i);
            vo.setTitle("Copy of 100" + i);
            vo.setContent("CopyCopyCopy" + i);
            vo.setWriter("Copier100" + i);
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
            String wDate = sdf.format(now);
            vo.setwDate(wDate);
            vos.add(vo);
        }
        return vos;
    }

    @Override
    public BoardVO selectOne(BoardVO vo) {
        System.out.println("selectOne...");
        System.out.println(vo);

        BoardVO vo2 = new BoardVO();
        vo2.setNum(101);
        vo2.setTitle("Copy of 300");
        vo2.setContent("3Copy3Copy3Copy");
        vo2.setWriter("3Copier300");
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String wDate = sdf.format(now);
        vo2.setwDate(wDate);
        return vo2;
    }

    @Override
    public List<BoardVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList....");
        System.out.println(searchKey);
        System.out.println(searchWord);

        List<BoardVO> vos = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            BoardVO vo = new BoardVO();
            vo.setNum(101 + i);
            vo.setTitle("Copy of 900" + i);
            vo.setContent("9Copy9Copy9Copy" + i);
            vo.setWriter("9Copier900" + i);
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
            String wDate = sdf.format(now);
            vo.setwDate(wDate);
            vos.add(vo);
        }
        return vos;
    }
}
