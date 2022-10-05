package test.com.score;

import test.com.score.model.ScoreDAO;
import test.com.score.model.ScoreDAOimpl;
import test.com.score.model.ScoreVO;

import java.util.List;

public class ScoreMain {

    public static void main(String[] args) {
        System.out.println("Hello Score....");

        ScoreDAO dao = new ScoreDAOimpl();
        int total = 0;
        int average = 0;
        String grade = null;

        // 1.insert

        ScoreVO vo = new ScoreVO();
        vo.setName("YYY");
        vo.setKor(99);
        vo.setEng(88);
        vo.setMath(78);
        total = vo.getKor() + vo.getEng() + vo.getMath();
        vo.setTotal(total);
        average = total / 3;
        vo.setAverage(average);
        if (average >= 90) {
            vo.setGrade("A");
        } else if (average >= 80) {
            vo.setGrade("B");
        } else if (average >= 80) {
            vo.setGrade("C");
        } else if (average >= 80) {
            vo.setGrade("D");
        } else {
            vo.setGrade("F");
        }

        int result = dao.insert(vo);
        System.out.println("result:" + result);

        // 2.update
        vo = new ScoreVO();
        vo.setNum(33);
        vo.setName("kim");
        vo.setKor(100);
        vo.setEng(100);
        vo.setMath(100);
        total = vo.getKor() + vo.getEng() + vo.getMath();
        vo.setTotal(total);
        average = total / 3;
        vo.setAverage(average);
        if (average >= 90) {
            vo.setGrade("A");
        } else if (average >= 80) {
            vo.setGrade("B");
        } else if (average >= 80) {
            vo.setGrade("C");
        } else if (average >= 80) {
            vo.setGrade("D");
        } else {
            vo.setGrade("F");
        }
        result = dao.update(vo);
        System.out.println("result:" + result);

        // 3.delete
        vo = new ScoreVO();
        vo.setNum(30);
        result = dao.delete(vo);
        System.out.println("result:" + result);

        // 4.selectOne
        vo = new ScoreVO();
        vo.setNum(18);
        ScoreVO vo2 = dao.selectOne(vo);
        System.out.println(vo2);

        // 5.selectAll
        List<ScoreVO> vos = dao.selectAll();
        for (ScoreVO x : vos) {
            System.out.println(x);
        }

        // 6.searchList
        List<ScoreVO> vos2 = dao.SearchNAME("name", "k");
        for (ScoreVO x : vos2) {
            System.out.println(x);
        }
        vos2 = dao.SearchPoint("kor", 100);
        for (ScoreVO x : vos2) {
            System.out.println(x);
        }
        vos2 = dao.SearchPoint("math", 90);
        for (ScoreVO x : vos2) {
            System.out.println(x);
        }
        vos2 = dao.SearchPoint("eng", 80);
        for (ScoreVO x : vos2) {
            System.out.println(x);
        }
        vos2 = dao.SearchPoint("total", 280);
        for (ScoreVO x : vos2) {
            System.out.println(x);
        }
        vos2 = dao.SearchPoint("average", 60);
        for (ScoreVO x : vos2) {
            System.out.println(x);
        }
        vos2 = dao.SearchNAME("grade", "A");
        for (ScoreVO x : vos2) {
            System.out.println(x);
        }
    }// end main
}// end class
