package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider { 
	static Connection con;  //non static members cannot be used in static methods therefore conveted to static
	public static Connection createC() {
		try {
			//step 1--initially load the driver
			Class.forName("com.mysql.jdbc.Driver");//this always give exception error so need to put in try block
			
			//step 2-- create the connnection.store it in some variable named con here with class connection
			String user = "Priyanshu";
			String password = "1234";
			String url ="jdbc:mysql://localhost:3306/student_manage";
			con = DriverManager.getConnection(url, user, password);
		}catch(Exception e){
			e.printStackTrace();
		}
	return con;  //here due to return of variable con the return type above changed to connection
}
}
