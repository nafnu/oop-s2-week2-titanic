package com.jetbrains;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/titanicmanifest", "Nat", "m+S0sh1@tp/6");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(" SELECT * FROM passengers");

            System.out.println("before while");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(4));
            }
            System.out.println("after while");

            con.close();

        } catch (Exception e) {
            System.out.println(e.toString());

        } finally {
        }
    }
}