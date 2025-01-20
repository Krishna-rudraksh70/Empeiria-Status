package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnection {
    
    private static jdbcConnection dbconn;
	
	private Connection connection;
	
	private final String url = "jdbc:mysql://127.0.0.1:3306/database";
	private final String user = "username";
	private final String pass = "password";
	
	
	private jdbcConnection() {
		try {
			connection = DriverManager.getConnection(url, user, pass);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static jdbcConnection getInstance() {
		if(dbconn==null)
		{
			synchronized (jdbcConnection.class) {
				if(dbconn==null)
				{
					dbconn = new jdbcConnection();
				}
			}
		}
		return dbconn;
	}
	
	public Connection getConn() {
		return connection;
	}
}
