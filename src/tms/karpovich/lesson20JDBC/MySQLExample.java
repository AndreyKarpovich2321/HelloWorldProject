package tms.karpovich.lesson20JDBC;

import java.sql.*;

public class MySQLExample {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/test_db","root", "root")){
            connection.setAutoCommit(false);
            //            connection.prepareStatement("\n" +
//                    "insert into DEVELOPERS(NAME, POSITION, AGE) values ('Anton', 'PM', 35), ('Nick', 'BA', 30);").execute();
//            ResultSet rs = connection.prepareStatement("select * from DEVELOPERS").executeQuery();
            PreparedStatement ps = connection.prepareStatement("select * from DEVELOPERS where ID = ?");
            ps.setInt(1,1);
            ResultSet rs = ps.executeQuery();
            connection.commit();
            connection.rollback();
            while (rs.next()){
                System.out.println(rs.getInt("ID") + " " + rs.getString("NAME")
                        + " " + rs.getInt("AGE"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
