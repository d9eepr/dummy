package com.mvc.dao;
import java.sql.*;

import com.mvc.exceptions.MVCException;
public class DBConnection {
	public Connection connetDb() throws MVCException
	{
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","deep");
			
		}
		catch(Exception e) {
			throw new MVCException ("Connection Error"+e.getMessage());
			
		}
		return con;
		}
	}


