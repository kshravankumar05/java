import java.sql.*;
import java.util.*;
class DeleteSingleRecord
{
	public static void main(String[] args) throws Exception 
	{
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String db_uname="system";
		String db_password="12345";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(jdbc_url,db_uname,db_password);
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Id");
		int sid=sc.nextInt();
		String sql_qry=String.format("delete from prithi where sid=%d",sid);
		st.executeUpdate(sql_qry);
		System.out.println("Record Deleted Successfully");
		con.close();
	}
}