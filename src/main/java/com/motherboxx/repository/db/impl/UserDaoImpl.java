package com.motherboxx.repository.db.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.motherboxx.model.User;
import com.motherboxx.repository.db.UserDao;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	public void setDb(BaseDao db) {
		this.db = db;
	}

	private BaseDao db;

	@Override
	public User getUserById(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> getAllUsers() {
		// TODO Auto-generated method stub
		FindIterable<Document> iterable = db.getDB().getCollection("users").find();
		iterable.forEach(new Block<Document>() {
		    @Override
		    public void apply(final Document document) {
		        System.out.println(document);
		    }
		});
		return new ArrayList<>();
	}
	
	
	
	


}
