package com.ori;

import java.sql.*;

public class Sql {

    static final String DB_URL = "jdbc:mysql://localhost/JDB";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT id FROM Test";

    public static void main(String[] argus){

        try(Connection connection_string = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = connection_string.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);){
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
        }
    } catch (SQLException e){
        e.printStackTrace();
    }
}
}