import java.sql.*;
import java.util.*;
class InsertMultipleRecords
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
		while(true)
		{
		System.out.println("Enter the Student Id");
		int sid=sc.nextInt();
		System.out.println("Enter the Student Name");
		String name=sc.next();
		System.out.println("Enter the Amount");
		double amount=sc.nextFloat();
		//String sql_qry="insert into rama values("+sid+",'"+name+"',"+amount+")";
		String sql_qry=String.format("insert into prithi values (%d,'%s',%f)",sid,name,amount);
		st.executeUpdate(sql_qry);
		System.out.println("Record Inserted Successfully");
		System.out.println("Do you want Insert One more record[Yes/No]");
		String option=sc.next();
		if (option.equalsIgnoreCase("No"))
		{
			break;
		}
		}
		con.close();
	}
}