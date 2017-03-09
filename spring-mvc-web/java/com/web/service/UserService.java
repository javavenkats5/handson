package com.web.service;

import com.web.dao.UserDao;
import com.web.model.User;

public class UserService {
	
	UserDao userDao;
	public User validateUser(String userId, String password){
		
		User user=null;
		if(userId!=null && password!=null){
			
			user= userDao.selectUser(userId,password);
			if(user!=null){
				user.setMsg("Successful login");
				System.out.println("Successful login");
			}else{
				System.err.println("Invalid login please retry.");
			}
		}
		
		return user;
	}
	public boolean deleteUser(String userId) {
		
		boolean result=false;
		if(userId!=null ){
			
			result= userDao.deleteUser(userId);
			
		}
		System.out.println("service-result:"+result);
		return result;
	}

	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
