package org_helper;
import java.io.*;
import java.sql.*;
public class ReadcsvAndLoadDB {

	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("D:\\Giri tech hub notes\\project\\Employee.csv");
		BufferedReader br = new BufferedReader(fr);
		String line;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeproject","root","root");
		if(conn!=null)
		{
			while((line=br.readLine())!=null)
			{	
				String cols[]=line.split(",");
				PreparedStatement pmt=conn.prepareStatement("insert into employee values");
				//pmt.setInt(0, id);
				pmt.setString(1,cols[1]);
				pmt.setString(3,cols[2]);
				pmt.setString(4, cols[3]);
			}
		}
		else {
			System.out.println("Data base not connected...!");
		}
		
	}

}
