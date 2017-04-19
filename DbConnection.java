package stringFn;

import java.sql.*;
public class DbConnection {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		String url="jdbc:mysql://localhost:3306/database";
		String uName="mysql";
		String pwd="root";
		
		Class.forName("com.mysql.jdbc.driver");
		Connection con = DriverManager.getConnection(url,uName,pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from `leadsinformation`");
		rs.next();
		System.out.println(rs.getString(0));
		
		st.close();
		
		con.close();
		
	}

}
