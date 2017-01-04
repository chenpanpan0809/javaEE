package set;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BoyConstructor {
	private static Logger logger = Logger.getLogger(BoyConstructor.class);
	private GirlFriend girlFriend;
	private static ApplicationContext ctx;

	public BoyConstructor() {

	}

	public BoyConstructor(GirlFriend girlFriend) {
		this.girlFriend = girlFriend;
	}

	public static void main(String[] args) {
		//ctx = new FileSystemXmlApplicationContext("D:\\workspace\\spring-ioc-core\\src\\applicationContext-set.xml");
		//ctx = new FileSystemXmlApplicationContext("/src/applicationContext-set.xml");
		ctx = new ClassPathXmlApplicationContext("applicationContext-set.xml");	
		BoyConstructor boy = (BoyConstructor) ctx.getBean("boyConstructor");
		logger.info(boy.girlFriend.speak());
	}

}
