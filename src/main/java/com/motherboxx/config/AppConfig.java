package com.motherboxx.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.motherboxx.repository.db.UserDao;
import com.motherboxx.repository.db.impl.BaseDao;
import com.motherboxx.repository.db.impl.UserDaoImpl;

@Configuration
public class AppConfig {

	
    @Bean(name="baseDao")
    public BaseDao baseDao() {
    	//TODO-factor these out
        return new BaseDao("localhost", 27107, "User_unit_test");
    }
    
    @Bean(name="userDao")
    public UserDaoImpl userDao(){
    	return new UserDaoImpl();
    }
}
