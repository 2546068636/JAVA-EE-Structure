package com.util;
import java.sql.*;
public class DBUtil {
    public static Connection getConn(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/javaee?characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&serverTimezone=UTC";
        String user = "root";
        String pwd = "root";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConn(Connection conn, PreparedStatement ps, ResultSet rs){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
