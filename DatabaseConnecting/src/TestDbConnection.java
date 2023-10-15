import java.sql.Connection;
import java.sql.DriverManager;

public class TestDbConnection {
	public static void main(String[] args) {
		String Url = "jdbc:postgresql://localhost:5432/Test;DatabaseName=Test;user=postgres;Password=sillicon";
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Trying to connect");
			Connection connection = DriverManager.getConnection(Url);

			System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
					+ connection.getMetaData().getDatabaseProductName());
		} catch (Exception e) {
			System.out.println("Unable to make connection with DB");
			e.printStackTrace();
		}
	}
}

//driverClassName: org.postgresql.Driver
//password: sillicon
//url: jdbc:postgresql://localhost:5432/mytest
//username: postgres