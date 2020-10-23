import java.sql.*;


public class jdbc1 {
	jdbc1.forName("com.mysql.jdbc.Driver");
	String dburl  = "jdbc:mysql://localhost/dbName";

	Connection con =  DriverManager.getConnection (dburl, ID, PWD );

	public static Connection getConnection() throws Exception{
		String url = "jdbc:oracle:thin:@117.16.46.111:1521:xe";
		String user = "smu";
		String password = "smu";
		Connection conn = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	Statement stmt = con.createStatement();
	
	ResultSet rs = stmt.executeQuery("select no from user" );
	
	ResultSet rs =  stmt.executeQuery( "select no from user" );
	while ( rs.next() )
	      System.out.println( rs.getInt( "no") );
}
