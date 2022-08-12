package test.com.mine;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class BoardVO {

    private int num;
    private String title;
    private String content;
    private String writer;
    private String wDate;

    public BoardVO() {
        System.out.println("BoardVO...");
        num = 1;
        title = "First";
        content = "A1A2A3";
        writer = "LEE";
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss:SSS");
        wDate = sdf.format(now);
    }

    public BoardVO(int num, String title, String content, String writer, String wDate) {
        this.num = num;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.wDate = wDate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getwDate() {
        return wDate;
    }

    public void setwDate(String wDate) {
        this.wDate = wDate;
    }

    @Override
    public String toString() {
        return "BoardVO{" + "num=" + num + ", title='" + title + '\'' + ", content='" + content + '\'' + ", writer='" + writer + '\'' + ", wDate='" + wDate + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardVO boardVO = (BoardVO) o;
        return num == boardVO.num && Objects.equals(title, boardVO.title) && Objects.equals(content, boardVO.content) && Objects.equals(writer, boardVO.writer) && Objects.equals(wDate, boardVO.wDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, title, content, writer, wDate);
    }
}
