package test.com.employee.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOimpl implements EmployeeDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public EmployeeDAOimpl() throws ClassNotFoundException {

        Class.forName(EmployeeDB_postgres.DRIVER_NAME);
        System.out.println("Driver successed..");
//			jdbcConnectionTest();

    }//end constructor

    private void jdbcConnectionTest() throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER, EmployeeDB_postgres.PASSWORD);
        System.out.println("conn successed...");
        String sql = "select version() as version";
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("version"));
        }


    }

    @Override
    public int insert(EmployeeVO vo) throws SQLException {
        int flag = 0;
        conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER, EmployeeDB_postgres.PASSWORD);
        System.out.println("conn successed...");

        pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_INSERT);

        pstmt.setString(1, vo.getFirst_name());
        pstmt.setString(2, vo.getLast_name());
        pstmt.setString(3, vo.getEmail());
        pstmt.setInt(4, vo.getSalary());
        pstmt.setString(5, vo.getHire_date());
        flag = pstmt.executeUpdate();
        return flag;
    }

    @Override
    public int update(EmployeeVO vo) throws SQLException {

        int flag = 0;
        conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER, EmployeeDB_postgres.PASSWORD);
        System.out.println("conn successed...");
        // 삽입 수정 삭제 : DML

        pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_UPDATE);
        pstmt.setString(1, vo.getFirst_name());
        pstmt.setString(2, vo.getLast_name());
        pstmt.setString(3, vo.getEmail());
        pstmt.setInt(4, vo.getSalary());
        pstmt.setString(5, vo.getHire_date());
        pstmt.setInt(6, vo.getNum());
        flag = pstmt.executeUpdate();

        return flag;
    }

    @Override
    public int delete(EmployeeVO vo) throws SQLException {
        int flag = 0;

        conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER, EmployeeDB_postgres.PASSWORD);
        System.out.println("conn successed...");
        // �Է�,����,���� : DML

        pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_DELETE);
        pstmt.setInt(1, vo.getNum());
        flag = pstmt.executeUpdate();

        return flag;
    }

    @Override
    public EmployeeVO selectOne(EmployeeVO vo) throws SQLException {
        EmployeeVO vo2 = new EmployeeVO();
        conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER, EmployeeDB_postgres.PASSWORD);
        System.out.println("conn successed...");
        // �˻� : DQL
        pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SELECT_ONE);
        pstmt.setInt(1, vo.getNum());
        rs = pstmt.executeQuery();

        while (rs.next()) {
            vo2.setNum(rs.getInt("num"));
            vo2.setFirst_name(rs.getString("first_name"));
            vo2.setLast_name(rs.getString("last_name"));
            vo2.setEmail(rs.getString("email"));
            vo2.setSalary(rs.getInt("salary"));
            vo2.setHire_date(rs.getString("hire_date"));
        }
        return vo2;
    }

    @Override
    public List<EmployeeVO> selectAll() throws SQLException {

        List<EmployeeVO> vos = new ArrayList<>();
        conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER, EmployeeDB_postgres.PASSWORD);
        System.out.println("conn successed...");
        pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SELECT_ALL);
        rs = pstmt.executeQuery();

        while (rs.next()) {
            EmployeeVO vo = new EmployeeVO();
            vo.setNum(rs.getInt("num"));
            vo.setFirst_name(rs.getString("first_name"));
            vo.setLast_name(rs.getString("last_name"));
            vo.setEmail(rs.getString("email"));
            vo.setSalary(rs.getInt("salary"));
            vo.setHire_date(rs.getString("hire_date"));
            vos.add(vo);
        }
        return vos;
    }

    @Override
    public List<EmployeeVO> searchList(Integer searchKey, String searchWord) throws SQLException {
        List<EmployeeVO> vos = new ArrayList<EmployeeVO>();
        conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER, EmployeeDB_postgres.PASSWORD);
        System.out.println("conn successed...");
        // 검색 : DQL
        if (searchKey == 2) {
            pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SEARCH_LIST_FN);
        } else if (searchKey == 3) {
            pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SEARCH_LIST_LN);
        } else if (searchKey == 4) {
            pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SEARCH_LIST_email);
        } else if (searchKey == 6) {
            pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SEARCH_LIST_HD);
        }

        pstmt.setString(1, "%" + searchWord + "%");
        rs = pstmt.executeQuery();

        while (rs.next()) {
            EmployeeVO vo = new EmployeeVO();
            vo.setNum(rs.getInt("num"));
            vo.setFirst_name(rs.getString("first_name"));
            vo.setLast_name(rs.getString("last_name"));
            vo.setEmail(rs.getString("email"));
            vo.setSalary(rs.getInt("salary"));
            vo.setHire_date(rs.getString("hire_date"));
            vos.add(vo);
        }
        return vos;
    }

    @Override
    public List<EmployeeVO> searchPoint(Integer searchkey, Integer searchPoint) throws SQLException {
        List<EmployeeVO> vos = new ArrayList<EmployeeVO>();
        conn = DriverManager.getConnection(EmployeeDB_postgres.URL, EmployeeDB_postgres.USER, EmployeeDB_postgres.PASSWORD);
        System.out.println("conn successed...");
        // 검색 : DQL
        if (searchkey == 1) {
            pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SEARCH_LIST_NUM);
        } else if (searchkey == 5) {
            pstmt = conn.prepareStatement(EmployeeDB_postgres.SQL_SEARCH_LIST_salary);
        }

        pstmt.setInt(1, searchPoint);
        rs = pstmt.executeQuery();

        while (rs.next()) {
            EmployeeVO vo = new EmployeeVO();
            vo.setNum(rs.getInt("num"));
            vo.setFirst_name(rs.getString("first_name"));
            vo.setLast_name(rs.getString("last_name"));
            vo.setEmail(rs.getString("email"));
            vo.setSalary(rs.getInt("salary"));
            vo.setHire_date(rs.getString("hire_date"));
            vos.add(vo);
        }
        return vos;
    }
}

