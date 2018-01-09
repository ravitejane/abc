package ins.service;

import ins.dao.UserDao;
import ins.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

	UserDao dao=new UserDao();
	public List<User> getUsers() {
		
		return dao.getUsers();
	}

	public User getUser(int id) {
		
		return dao.getUser(id);
	}

	public User saveUser(User user) {
		
		return dao.saveUser(user);
	}
	

}
