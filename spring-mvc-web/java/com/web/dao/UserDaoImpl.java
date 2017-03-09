package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.web.model.User;

public class UserDaoImpl implements UserDao{
	
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public User selectUser(String userId, String password) {

		String sql = "SELECT * FROM USER_DATA WHERE USER_ID=? AND PASSWORD=?";
		Connection conn = null;
		User userObj=null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			//Execute Query
			ResultSet rs= ps.executeQuery();
			
			//Retrieve the date from resultset
			if(rs!=null && rs.next()){
				String firstName=rs.getString("FIRST_NAME");
				String lastName=rs.getString("LAST_NAME");
				
				userObj=new User();
				userObj.setFirstName(firstName);
				userObj.setLastName(lastName);
				userObj.setUserId(userId);
				
			}
			
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
		
		return userObj;
	}

	@Override
	public boolean deleteUser(String userId) {
		
		String sql = "DELETE FROM USER_DATA WHERE USER_ID=?";
		Connection conn = null;
		boolean result=false;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userId);
			//Execute Query
			ps.execute();
			int deletedRowsCnt=ps.getUpdateCount();
			if(deletedRowsCnt > 0){
				result=true;
			}
			System.out.println("result:"+result+":deleted Rows Cnt:"+deletedRowsCnt);
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		System.out.println("dao-result:"+result);
		
		return result;
	}

	@Override
	public User updateUser(User user) {
		return null;
	}
	
}
