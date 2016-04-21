package com.zt.jdbcDemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import Bean.Student;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.zt.jdbcDemo.utils.MysqlHelper;

public class JDBCDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection con = null;
		Statement state = null;
		ResultSet rs = null;
		
		String sql_select = "select * from student";
		
		try {
			con = MysqlHelper.getConnection();
			state = (Statement) con.createStatement();
			rs = state.executeQuery(sql_select);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				int score = rs.getInt(4);
				Student stu = new Student(id, name, age, score);
				System.out.println(stu.toString());
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			MysqlHelper.releaseResource(con, state, rs);
		}
		
			
	}
	
	
	

}
