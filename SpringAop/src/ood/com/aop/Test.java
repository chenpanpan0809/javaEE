package ood.com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ood.com.entity.User;
import ood.com.service.Userservice;

public class Test {
private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
 Userservice userservice = (Userservice) ctx.getBean("service");
 User user = new User();
 user.setId(1);
 user.setUsername("panpan");
 user.setPassword("12345");
 user.setEmail("19784335@qq.com");
 userservice.addNewUser(user);
	}

}
