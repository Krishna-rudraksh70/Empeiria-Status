package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.jdbcConnection;
import model.User;

public class UserUtil {

    private static Connection connectToDb() {
        return jdbcConnection.getInstance().getConn();
    }

    public static User loginUser(String username, String password) throws SQLException {
        String query = "SELECT * FROM management WHERE username = ? AND password = ?";
        try (PreparedStatement pstmt = connectToDb().prepareStatement(query)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("role")
                );
            }
        }
        return null;
    }
}
