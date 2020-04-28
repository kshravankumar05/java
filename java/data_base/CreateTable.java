import java.sql.*;
class CreateTable
{
	public static void main(String[] args) throws Exception 
	{
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String db_uname="system";
		String db_password="12345";
		String sql_query="create table prithi (sid number(5),name varchar2(20),amount number(7))";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(jdbc_url,db_uname,db_password);
		Statement st=con.createStatement();
		st.executeUpdate(sql_query);
		System.out.println("Table Created Successfully");
		con.close();
	}
}
