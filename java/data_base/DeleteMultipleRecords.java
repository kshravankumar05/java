import java.sql.*;
import java.util.*;
class DeleteMultipleRecords
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
		System.out.println("Enter the Cutoff Salary ");
		double salary=sc.nextDouble();
		String sql_qry=String.format("delete from karuna where sal>=%f",salary);
		int recordsCount=st.executeUpdate(sql_qry);
		System.out.println(recordsCount+"  Records Deleted Successfully");
		con.close();
	}
}