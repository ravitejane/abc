package ins.service;

import java.util.List;

import ins.model.User;

public interface UserService {
	public List<User> getUsers();
	public User getUser(int id);
	public User saveUser(User user);
}
