package test.com.score.model;

import java.util.Objects;

public class ScoreVO {
    private int num;
    private String name;
    private int kor;
    private int eng;
    private int math;

    private int total;

    private double average;

    private String grade;

    public ScoreVO(int num, String name, int kor, int eng, int math, int total, double average, String grade) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = total;
        this.average = average;
        this.grade = grade;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // �Ű������� ���� ������.-����Ʈ������.
    // ��������
    public ScoreVO() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreVO scoreVO = (ScoreVO) o;
        return num == scoreVO.num && kor == scoreVO.kor && eng == scoreVO.eng && math == scoreVO.math && total == scoreVO.total && Double.compare(scoreVO.average, average) == 0 && Objects.equals(name, scoreVO.name) && Objects.equals(grade, scoreVO.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name, kor, eng, math, total, average, grade);
    }

    @Override
    public String toString() {
        return "ScoreVO{" + "num=" + num + ", name='" + name + '\'' + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total + ", average=" + average + ", grade='" + grade + '\'' + '}';
    }
}
