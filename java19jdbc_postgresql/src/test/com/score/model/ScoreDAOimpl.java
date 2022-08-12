package test.com.score.model;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScoreDAOimpl implements ScoreDAO {

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public ScoreDAOimpl() {
        System.out.println("ScoreDAOimpl()");
        try {
            Class.forName(ScoreDB_postgres.DRIVER_NAME);
            System.out.println("Driver successed..");

//			jdbcConnectionTest();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }//end constructor

    private void jdbcConnectionTest() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // �˻� : DQL
            String sql = "select version() as version";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("version"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } // end finally
    }

    @Override
    public int insert(ScoreVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);

        int flag = 0;
        try {
            conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // �Է�,����,���� : DML

            pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_INSERT);

            pstmt.setString(1, vo.getName());
            pstmt.setInt(2, vo.getKor());
            pstmt.setInt(3, vo.getMath());
            pstmt.setInt(4, vo.getEng());
            pstmt.setInt(5, vo.getTotal());
            pstmt.setDouble(6, vo.getAverage());
            pstmt.setString(7, vo.getGrade());

            flag = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } // end finally
        return flag;
    }

    @Override
    public int update(ScoreVO vo) {
        System.out.println("update()...");
        System.out.println(vo);

        int flag = 0;

        try {
            conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // 삽입 수정 삭제 : DML

            pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_UPDATE);
            pstmt.setString(1, vo.getName());
            pstmt.setInt(2, vo.getKor());
            pstmt.setInt(3, vo.getMath());
            pstmt.setInt(4, vo.getEng());
            pstmt.setInt(5, vo.getTotal());
            pstmt.setDouble(6, vo.getAverage());
            pstmt.setString(7, vo.getGrade());
            pstmt.setInt(8, vo.getNum());
            flag = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } // end finally


        return flag;
    }

    @Override
    public int delete(ScoreVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        int flag = 0;

        try {
            conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // �Է�,����,���� : DML

            pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_DELETE);
            pstmt.setInt(1, vo.getNum());
            flag = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } // end finally

        return flag;
    }

    @Override
    public ScoreVO selectOne(ScoreVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo.getNum());

        ScoreVO vo2 = new ScoreVO();
        try {
            conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // �˻� : DQL
            pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SELECT_ONE);
            pstmt.setInt(1, vo.getNum());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                vo2.setNum(rs.getInt("num"));
                vo2.setName(rs.getString("name"));
                vo2.setKor(rs.getInt("kor"));
                vo2.setMath(rs.getInt("math"));
                vo2.setEng(rs.getInt("eng"));
                vo2.setTotal(rs.getInt("total"));
                vo2.setAverage(rs.getDouble("average"));
                vo2.setGrade(rs.getString("grade"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } // end finally

        return vo2;
    }

    @Override
    public List<ScoreVO> selectAll() {
        System.out.println("selectAll()...");

        List<ScoreVO> vos = new ArrayList<ScoreVO>();

        try {
            conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // �˻� : DQL
            pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SELECT_ALL);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                ScoreVO vo = new ScoreVO();
                vo.setNum(rs.getInt("num"));
                vo.setName(rs.getString("name"));
                vo.setKor(rs.getInt("kor"));
                vo.setMath(rs.getInt("math"));
                vo.setEng(rs.getInt("eng"));
                vo.setTotal(rs.getInt("total"));
                vo.setAverage(rs.getDouble("average"));
                vo.setGrade(rs.getString("grade"));
                vos.add(vo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } // end finally
        return vos;
    }

    @Override
    public List<ScoreVO> SearchNAME(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);

        List<ScoreVO> vos = new ArrayList<ScoreVO>();
        try {
            conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // 검색 : DQL
            if (searchKey.equals("name")) {
                pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_NAME);
            } else if (searchKey.equals("grade")) {
                pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_GRADE);
            }
            pstmt.setString(1, "%" + searchWord + "%");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                ScoreVO vo = new ScoreVO();
                vo.setNum(rs.getInt("num"));
                vo.setName(rs.getString("name"));
                vo.setKor(rs.getInt("kor"));
                vo.setMath(rs.getInt("math"));
                vo.setEng(rs.getInt("eng"));
                vo.setTotal(rs.getInt("total"));
                vo.setAverage(rs.getDouble("average"));
                vo.setGrade(rs.getString("grade"));
                vos.add(vo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } // end finally

        return vos;
    }

    @Override
    public List<ScoreVO> SearchPoint(String searchKey, Integer searchPoint) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchPoint);

        List<ScoreVO> vos = new ArrayList<ScoreVO>();
        try {
            conn = DriverManager.getConnection(ScoreDB_postgres.URL, ScoreDB_postgres.USER, ScoreDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // 검색 : DQL
            if (searchKey.equals("num")) {
                pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_NUM);
            } else if (searchKey.equals("kor")) {
                pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_KOR);
            } else if (searchKey.equals("math")) {
                pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_MATH);
            } else if (searchKey.equals("eng")) {
                pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_ENG);
            }else if (searchKey.equals("total")) {
                pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_TOTAL);
            }else if (searchKey.equals("average")) {
                pstmt = conn.prepareStatement(ScoreDB_postgres.SQL_SEARCH_LIST_AVERAGE);
            }

            pstmt.setInt(1, searchPoint);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                ScoreVO vo = new ScoreVO();
                vo.setNum(rs.getInt("num"));
                vo.setName(rs.getString("name"));
                vo.setKor(rs.getInt("kor"));
                vo.setMath(rs.getInt("math"));
                vo.setEng(rs.getInt("eng"));
                vo.setTotal(rs.getInt("total"));
                vo.setAverage(rs.getDouble("average"));
                vo.setGrade(rs.getString("grade"));
                vos.add(vo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } // end finally

        return vos;
    }

}
