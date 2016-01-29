package com.motherboxx.repository.db.impl;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class BaseDao {
	
	//TODO-Factor these out to config file
	
	private MongoClient mongoClient;
	private MongoDatabase db;
	
	public BaseDao(String url, int port, String db){
		this.mongoClient = new MongoClient(url, port);
		this.db = mongoClient.getDatabase(db);
	}

}
