package com.motherboxx.repository.db;

import java.util.ArrayList;

import com.motherboxx.model.User;

public interface UserDao {
	User getUserById(String name);
	ArrayList<User> getAllUsers();
}
