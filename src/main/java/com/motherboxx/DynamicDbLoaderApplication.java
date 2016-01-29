package com.motherboxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.motherboxx.config.AppConfig;
import com.motherboxx.repository.db.UserDao;

@SpringBootApplication
public class DynamicDbLoaderApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DynamicDbLoaderApplication.class, args);
	    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    
	    UserDao dao = (UserDao) context.getBean("userDao");
	    
	}
}
