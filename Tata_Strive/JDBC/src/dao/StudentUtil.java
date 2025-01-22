package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Types;
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
					"CREATE TABLE if not exists Student(stud_id int primary key auto_increment, Stud_Name varchar(20) not null, Stud_course varchar(15), Stud_age tinyint);");
		}
	}

	public static void allStudentDetails() throws SQLException {

		try (Statement stmt = connectToDb().createStatement()) {

			ResultSet rs = stmt.executeQuery("CALL AllStudents();");

			System.out.println("ID \t Name \t Course \t Age");
			while (rs.next()) {
				System.out.println(String.format("%d \t %s \t %s \t %d", rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getInt(4)));
			}
		}
	}

	public static void TopStudents(int n) throws SQLException {
		try (PreparedStatement pstmt = connectToDb().prepareStatement(
				"CALL Head(?)")) {
			pstmt.setInt(1, n);
			ResultSet rs = pstmt.executeQuery();

			System.out.println("ID \t Name \t Course \t Age");
			while (rs.next()) {
				System.out.println(String.format("%d \t %s \t %s \t %d", rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getInt(4)));
			}
		}
	}

	public static void BottomStudents(int n) throws SQLException {
		try (PreparedStatement pstmt = connectToDb().prepareStatement(
				"CALL Tail(?)")) {
			pstmt.setInt(1, n);
			ResultSet rs = pstmt.executeQuery();

			System.out.println("ID \t Name \t Course \t Age");
			while (rs.next()) {
				System.out.println(String.format("%d \t %s \t %s \t %d", rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getInt(4)));
			}
		}
	}

	public static Student detailsById(int id) throws SQLException {
		try (CallableStatement pstmt = connectToDb().prepareCall("CALL StudentById(?)")) {
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			return (rs.next()) ? new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)) : null;
		}
	}

	public static boolean insertDetails(Student student) throws SQLException {
		try (CallableStatement pstmt = connectToDb().prepareCall("CALL InsertStudent(?, ?, ?)")) {
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getCourse());
			pstmt.setInt(3, student.getAge());

			int r = pstmt.executeUpdate();
			return r > 0;
		}
	}

	public static boolean updateStudentDetails(int id, Student student) throws SQLException {
		try (CallableStatement pstmt = connectToDb().prepareCall("CALL UpdateStudent(?, ?, ?, ?)")) {
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getCourse());
			pstmt.setInt(3, student.getAge());
			pstmt.setInt(4, id);

			int r = pstmt.executeUpdate();
			return r > 0;
		}
	}

	public static boolean deleteStudentDetails(int id) throws SQLException {
		try (CallableStatement pstmt = connectToDb().prepareCall("CALL DeleteStudent(?)")) {
			pstmt.setInt(1, id);

			int r = pstmt.executeUpdate();
			return r > 0;
		}
	}

	public static int Count() throws SQLException {

		try (Connection conn = connectToDb();
				CallableStatement stmt = conn.prepareCall("{CALL TotalCount(?)}")) {

			stmt.registerOutParameter(1, Types.INTEGER);

			stmt.execute();

			return stmt.getInt(1);
		}

	}

	public static void SortedByattribute(String att) throws SQLException {

		try (CallableStatement stmt = connectToDb().prepareCall("CALL sortBy(?)")) {
			stmt.setString(1, att);

			ResultSet rs = stmt.executeQuery();

			System.out.println("ID \t Name \t Course \t Age");
			while (rs.next()) {
				System.out.println(String.format("%d \t %s \t %s \t %d", rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getInt(4)));
			}
		}
	}

	public static int countByCourse(String course) throws SQLException {
		try (CallableStatement pstmt = connectToDb().prepareCall(
				"CALL CourseCount(?)")) {
			pstmt.setString(1, course);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				return rs.getInt(1);
			}
		}
		return 0;
	}

	public static int countByAttribute(String att, String val) throws SQLException {
		try (CallableStatement pstmt = connectToDb().prepareCall("CALL attributeCount(?, ?);")) {
			pstmt.setString(1, att);
			pstmt.setString(2, val);
			
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		}
		return 0;
	}

	public static void beginTransaction() throws SQLException {
		Connection conn = connectToDb();
		if (conn != null) {
			conn.setAutoCommit(false);
		}
	}

	public static void commitTransaction() throws SQLException {
		Connection conn = connectToDb();
		if (conn != null) {
			conn.commit();
		}
	}

	public static void rollbackTransaction() throws SQLException {
		Connection conn = connectToDb();
		if (conn != null) {
			conn.rollback();
		}
	}

	public static void closeConnection() throws SQLException {
		Connection conn = connectToDb();
		if (conn != null && !conn.isClosed()) {
			conn.close();
		}
	}

}