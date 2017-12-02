package com.nt.mod1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcApp {
  private static final String GET_EMP_COUNT_QUERY="SELECT COUNT(*) FROM EMP";
	public static void main(String[] args) {
		InputStream is=null;
		Properties props=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
		 is=new FileInputStream("src/main/java/com/nt/commons/jdbc.properties");
		 props=new Properties();
		 props.load(is);
		 System.out.println(props);
		 //write jdbc code
		  Class.forName(props.getProperty("jdbc.driver"));
		  con=DriverManager.getConnection(props.getProperty("jdbc.url"),props.getProperty("jdbc.username"),props.getProperty("jdbc.password"));
		  ps=con.prepareStatement(GET_EMP_COUNT_QUERY);
		  rs=ps.executeQuery();
		  if(rs.next()){
			  System.out.println("Emp count::::"+rs.getInt(1));
		  }//if
		}//try
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			
			try{
				if(con!=null)
					con.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}//finally
	}//main
}//class
