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
		System.out.println("\n testsetset1");
	    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("\n testsetset2");

	    UserDao dao = (UserDao) context.getBean("userDao");
		System.out.println("\n testsetset3");
		dao.getAllUsers();
		System.out.println("\n testsetset4");

	}
}
