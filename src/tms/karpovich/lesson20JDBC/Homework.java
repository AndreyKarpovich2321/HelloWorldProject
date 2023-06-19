package tms.karpovich.lesson20JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/main", "root", "msqlsrvrpss")){
            PreparedStatement ps = connection.prepareStatement("SELECT ID, NAME, AGE, `GROUP NAME`, CITY FROM STUDENTS\n" +
                    "INNER JOIN CITIES ON NAME = `STUDENT NAME`\n");
            //ps.setInt(1,1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                studentsList.add(new Student(rs.getInt("ID"), rs.getInt("AGE"), rs.getInt("GROUP NAME"), rs.getString("NAME"), rs.getString("CITY")));
            }
            System.out.println(studentsList);
            deleteStudent(connection);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deleteStudent(Connection connection) throws SQLException {
        PreparedStatement ps;
        var name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input student's name you want to delete ");
        name = scanner.next();
        ps = connection.prepareStatement("DELETE from STUDENTS WHERE NAME = ?;\n" + "DELETE FROM CITIES WHERE 'STUDENT NAME' = ?;");
        ps.setString(1, name);
        ps.setString(2, name);
        ps.execute();
    }
}
