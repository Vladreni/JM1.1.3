package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/jmpreproject";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public Connection getConnection() {
        Connection connection = null;

        //System.out.println("Registering JDBC driver...");
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to load class.");
            e.printStackTrace();
        }

        //System.out.println("Creating database connection...");
        try {
            connection = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
            System.out.println("Connection OK!");
        } catch (SQLException th) {
            System.out.println("Connection ERROR!");
            th.printStackTrace();
        }

        return connection;
    }
}
