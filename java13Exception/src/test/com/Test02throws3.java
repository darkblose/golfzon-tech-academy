package test.com;

import java.sql.*;

public class Test02throws3 {
    public static void main(String[] args) {
        System.out.println("Hello throws");
        // throws 처리: 예외 전가
        // try ~ catch : 예외 처리

        //java.sql.*;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(null, null, null);
            pstmt = conn.prepareStatement(null);
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
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
                    rs.close();
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
        }
        System.out.println("end main()...");
    }// end main
}// end class
