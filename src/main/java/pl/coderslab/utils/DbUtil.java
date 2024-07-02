package pl.coderslab.utils;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
   /* private static DataSource dataSource;
    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();   }
    private static DataSource getInstance() {
        if (dataSource == null) {
            try {
                Context initContext = new InitialContext();
                Context envContext = (Context)initContext.lookup("java:/comp/env");
                dataSource = (DataSource)envContext.lookup("jdbc/users");
            } catch (NamingException e) { e.printStackTrace(); }
        }
        return dataSource;
    }*/
    private static String DB_URL = "jdbc:mysql://localhost:3306/workshop3?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static String DB_URL_WEB_INF = "jdbc:mysql://localhost:3306/logWebInfo?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static String DB_USER = "root";
    private static String DB_PASSWORD = "coderslab";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
    public static Connection connectWebInfo() throws SQLException {
        return DriverManager.getConnection(DB_URL_WEB_INF, DB_USER, DB_PASSWORD);
    }
}
