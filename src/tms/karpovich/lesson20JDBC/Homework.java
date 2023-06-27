package tms.karpovich.lesson20JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Program started");
        chooseOption();
    }

    private static void showStudents() {
        List<Student> studentsList = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/main", "root", "msqlsrvrpss")){
            PreparedStatement ps = connection.prepareStatement("SELECT ID, NAME, AGE, GROUP_ID, CITY FROM STUDENTS\n" +
                    "INNER JOIN CITIES ON NAME = STUDENT_NAME\n");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                studentsList.add(new Student(rs.getInt("ID"), rs.getInt("AGE"), rs.getInt("GROUP_ID"), rs.getString("NAME"), rs.getString("CITY")));
            }
            System.out.println(studentsList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        chooseOption();
    }

    private static void deleteStudent(){
        var name = "";
        System.out.println("Input student's name you want to delete");
        name = scanner.next();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/main", "root", "msqlsrvrpss")){
            PreparedStatement ps;

            ps = connection.prepareStatement("DELETE FROM STUDENTS WHERE NAME = ?");
            ps.setString(1, name);
            ps.execute();
            ps = connection.prepareStatement("DELETE FROM CITIES WHERE STUDENT_NAME = ?;");
            ps.setString(1, name);
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        chooseOption();
    }
    /*private static void deleteCity(){
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/main", "root", "msqlsrvrpss")){
            PreparedStatement ps;
            var city = "";
            System.out.println("Input city you want to delete");
            city = scanner.next();
            ps = connection.prepareStatement("DELETE FROM CITIES WHERE CITY = ?;");
            ps.setString(1, city);
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        chooseOption();
    }*/
    /*private static void addCity() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/main", "root", "msqlsrvrpss")){
            PreparedStatement ps;
            var city = "";
            var student = "";
            System.out.println("Input student name and city you want to add");
            student = scanner.next();
            city = scanner.next();
            ps = connection.prepareStatement("INSERT INTO CITIES values (?, ?);");
            ps.setString(1, student);
            ps.setString(2, city);
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        chooseOption();
    }*/
    private static void addStudent() {
        var name = "";
        var age = "";
        var group = "";
        var city = "";
        System.out.println("Input student name, age, group and city");
        name = scanner.next();
        age = scanner.next();
        group = scanner.next();
        city = scanner.next();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/main", "root", "msqlsrvrpss")){
            PreparedStatement ps;

            ps = connection.prepareStatement("INSERT INTO STUDENTS(NAME, AGE, GROUP_ID) values (?, ?, ?);");
            ps.setString(1, name);
            ps.setString(2, age);
            ps.setString(3, group);
            ps.execute();
            ps = connection.prepareStatement("INSERT INTO CITIES values (?, ?);");
            ps.setString(1, name);
            ps.setString(2, city);
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        chooseOption();
    }
    private static void chooseOption(){
        System.out.println("Choose what to do next: \n"
                + "1. Show students\n" + "2. Add student\n" + "3. Delete student\n" + "4. Finish program\n");
        //Scanner scanner1 = new Scanner(System.in);
        String option = scanner.next();
        switch (option){
            case "1" -> showStudents();
            case "2" -> addStudent();
            case "3" -> deleteStudent();
            case "4" -> System.out.println("Program finished");
        }
    }
}