package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.jdbcConnection;
import model.Student;

public class StudentUtil {

	private static Connection connectToDb() {
		return jdbcConnection.getInstance().getConn();
	}

	public static boolean createStudentTable() throws SQLException {
		try (Statement stmt = connectToDb().createStatement()) {
			return !stmt.execute(
					"CREATE TABLE if not exists Student(stu_id int primary key auto_increment, Stud_Name varchar(20) not null, Stud_course varchar(15), Stu_age tinyint);");
		}
	}

	public static void allStudentDetails() throws SQLException {

		try (Statement stmt = connectToDb().createStatement()) {

			ResultSet rs = stmt.executeQuery("SELECT * FROM student;");

			System.out.println("ID \t Name \t Course \t Age");
			while (rs.next()) {
				System.out.println(String.format("%d \t %s \t %s \t %d", rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getInt(4)));
			}
		}
	}

	public static Student detailsById(int id) throws SQLException {
		try (PreparedStatement pstmt = connectToDb().prepareStatement("SELECT * FROM student WHERE stu_id = ?")) {
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			return (rs.next()) ? new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)) : null;
		}
	}

	public static boolean insertDetails(Student student) throws SQLException {
		String query = "INSERT INTO Student (Stud_Name, Stud_course, Stu_age) VALUES (?, ?, ?)";
		try (PreparedStatement pstmt = connectToDb().prepareStatement(query)) {
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getCourse());
			pstmt.setInt(3, student.getAge());

			int r = pstmt.executeUpdate();
			return r > 0;
		}
	}

	public static boolean updateStudentDetails(int id, Student student) throws SQLException {
		String query = "UPDATE Student SET Stud_Name = ?, Stud_course = ?, Stu_age = ? WHERE stu_id = ?";
		try (PreparedStatement pstmt = connectToDb().prepareStatement(query)) {
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getCourse());
			pstmt.setInt(3, student.getAge());
			pstmt.setInt(4, id);

			int r = pstmt.executeUpdate();
			return r > 0;
		}
	}

	public static boolean deleteStudentDetails(int id) throws SQLException {
        String query = "DELETE FROM Student WHERE stu_id = ?";
        try (PreparedStatement pstmt = connectToDb().prepareStatement(query)) {
            pstmt.setInt(1, id);

            int r = pstmt.executeUpdate();
            return r > 0;
        }
    }
}