package auto;

import org.springframework.stereotype.Component;

/**
 * component代表一种组件
 * 
 * @author win
 */
// @servive("usaGirlFriend")
// @Controller("usaGirlFriend")
// @Repository("usaGirlFriend")
@Component("usaGirlFriend")
public class UsaGirlFriend {
	public String speak() {
		return "english";
	}
}
