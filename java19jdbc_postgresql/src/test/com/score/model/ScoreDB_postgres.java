package test.com.score.model;

public interface ScoreDB_postgres {
    String DRIVER_NAME = "org.postgresql.Driver";
    String URL = "jdbc:postgresql://localhost:5432/golfzon";
    String USER = "kosta";
    String PASSWORD = "hi123456";


    String SQL_INSERT = "insert into " + "score(num,name,kor,math,eng,total,average,grade)" + "values(nextval('seq_score'),?,?,?,?,?,?,?)";
    String SQL_UPDATE = "update score set name=?, kor=?, math=?, eng=?, total=?, average=?, grade=? where num=?";
    String SQL_DELETE = "delete from score where num=?";
    String SQL_SELECT_ALL = "select * from score order by num asc";
    String SQL_SELECT_ONE = "select * from score where num=?";
    String SQL_SEARCH_LIST_NUM ="select * from score where num = ? order by num asc";
    String SQL_SEARCH_LIST_NAME = "select * from score where name like ? order by num asc";
    String SQL_SEARCH_LIST_KOR = "select * from score where kor >= ? order by num asc";
    String SQL_SEARCH_LIST_MATH = "select * from score where math >= ? order by num asc";
    String SQL_SEARCH_LIST_ENG = "select * from score where eng >= ? order by num asc";
    String SQL_SEARCH_LIST_TOTAL = "select * from score where total >= ? order by num asc";
    String SQL_SEARCH_LIST_AVERAGE = "select * from score where average = ? order by num asc";
    String SQL_SEARCH_LIST_GRADE = "select * from score where grade like ? order by num asc";


}
