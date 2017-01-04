package ood.com.service;

import lombok.Setter;
import ood.com.dao.UserDao;
import ood.com.entity.User;

public class UserServiceImpl implements Userservice {
	@Setter
private UserDao dao;
	@Override
	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		dao.save(user);
		
	}

}
