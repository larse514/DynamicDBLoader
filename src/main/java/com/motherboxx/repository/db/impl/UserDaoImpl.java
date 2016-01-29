package com.motherboxx.repository.db.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.motherboxx.repository.db.UserDao;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	public void setDb(BaseDao db) {
		this.db = db;
	}

	private BaseDao db;


}
