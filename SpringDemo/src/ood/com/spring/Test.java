package ood.com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
private static ApplicationContext ctx;
private static void print(Object object) {
	// TODO Auto-generated method stub
	System.out.println(object);
}
public static void test1(){
	User user = new User();
	user.setName("panpan");
	user.setAdress("hefei");
	print(user);
}
public static void test2(){
	
	ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	User user = (User) ctx.getBean("User");
	print(user);
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
	}

}
