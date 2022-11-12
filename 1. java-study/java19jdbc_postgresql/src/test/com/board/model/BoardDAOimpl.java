package test.com.board.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOimpl implements BoardDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public BoardDAOimpl() {
        System.out.println("BoardDAOimpl()..");
        try {
            Class.forName(BoardDB_postgres.DRIVER_NAME);
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
            conn = DriverManager.getConnection(BoardDB_postgres.URL, BoardDB_postgres.USER, BoardDB_postgres.PASSWORD);
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
    public int insert(BoardVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);

        int flag = 0;
        try {
            conn = DriverManager.getConnection(BoardDB_postgres.URL, BoardDB_postgres.USER, BoardDB_postgres.PASSWORD);
            System.out.println("conn successed...");

            pstmt = conn.prepareStatement(BoardDB_postgres.SQL_INSERT);

            pstmt.setString(1, vo.getTitle());
            pstmt.setString(2, vo.getContent());
            pstmt.setString(3, vo.getWriter());
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
    public int update(BoardVO vo) {
        System.out.println("update()...");

        int flag = 0;

        try {
            conn = DriverManager.getConnection(BoardDB_postgres.URL, BoardDB_postgres.USER, BoardDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // 삽입 수정 삭제 : DML

            pstmt = conn.prepareStatement(BoardDB_postgres.SQL_UPDATE);
            pstmt.setString(1, vo.getTitle());
            pstmt.setString(2, vo.getContent());
            pstmt.setString(3, vo.getWriter());
            pstmt.setInt(4, vo.getNum());
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
    public int delete(BoardVO vo) {
        System.out.println("delete()...");
        int flag = 0;

        try {
            conn = DriverManager.getConnection(BoardDB_postgres.URL, BoardDB_postgres.USER, BoardDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // �Է�,����,���� : DML

            pstmt = conn.prepareStatement(BoardDB_postgres.SQL_DELETE);
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
    public BoardVO selectOne(BoardVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo.getNum());

        BoardVO vo2 = new BoardVO();
        try {
            conn = DriverManager.getConnection(BoardDB_postgres.URL, BoardDB_postgres.USER, BoardDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // �˻� : DQL
            pstmt = conn.prepareStatement(BoardDB_postgres.SQL_SELECT_ONE);
            pstmt.setInt(1, vo.getNum());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                vo2.setNum(rs.getInt("num"));
                vo2.setTitle(rs.getString("title"));
                vo2.setContent(rs.getString("content"));
                vo2.setWriter(rs.getString("writer"));
                vo2.setWdate(rs.getTimestamp("wdate"));
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
    public List<BoardVO> selectAll() {
        System.out.println("selectAll()...");

        List<BoardVO> vos = new ArrayList<BoardVO>();

        try {
            conn = DriverManager.getConnection(BoardDB_postgres.URL, BoardDB_postgres.USER, BoardDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // �˻� : DQL
            pstmt = conn.prepareStatement(BoardDB_postgres.SQL_SELECT_ALL);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                BoardVO vo = new BoardVO();
                vo.setNum(rs.getInt("num"));
                vo.setTitle(rs.getString("Title"));
                vo.setContent(rs.getString("Content"));
                vo.setWriter(rs.getString("Writer"));
                vo.setWdate(rs.getTimestamp("Wdate"));
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
    public List<BoardVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()...");
        System.out.println(searchKey);
        System.out.println(searchWord);

        List<BoardVO> vos = new ArrayList<BoardVO>();
        try {
            conn = DriverManager.getConnection(BoardDB_postgres.URL, BoardDB_postgres.USER, BoardDB_postgres.PASSWORD);
            System.out.println("conn successed...");
            // 검색 : DQL
            if (searchKey.equals("title")) {
                pstmt = conn.prepareStatement(BoardDB_postgres.SQL_SEARCH_LIST_TITLE);
            } else if (searchKey.equals("content")) {
                pstmt = conn.prepareStatement(BoardDB_postgres.SQL_SEARCH_LIST_CONTENT);
            } else if (searchKey.equals("writer")) {
                pstmt = conn.prepareStatement(BoardDB_postgres.SQL_SEARCH_LIST_WRITER);
            }

            pstmt.setString(1, "%" + searchWord + "%");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                BoardVO vo = new BoardVO();
                vo.setNum(rs.getInt("num"));
                vo.setTitle(rs.getString("title"));
                vo.setContent(rs.getString("content"));
                vo.setWriter(rs.getString("writer"));
                vo.setWdate(rs.getTimestamp("wdate"));
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
