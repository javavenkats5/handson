package com.web.dao;

import com.web.model.User;

public interface UserDao {
	
public User selectUser(String userId,String password);

public User updateUser(User user);

public boolean deleteUser(String userId);

}
