package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public static Connection getMysqlConnection() {
        String userName = "root";
        String password = "12345";
        String nameTable = "user";
        String url = "jdbc:mysql://localhost:3306/"+nameTable+"?user="+userName+"&password="+password;

        try {
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalStateException();
        }
    }
}
