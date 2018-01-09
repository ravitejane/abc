package ins.dao;

import ins.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDao 
{
	
	
	public List<User> getUsers() {		
		return users;
	}
	
	public User getUser(int id) {
		User user=new User();
		for(User u:users)
		{
			if(u.getId()==id)
			{
				user=u;
			}
		}
		return user;
	}
	
	public User saveUser(User user) {
		users.add(user);
		return user;
	}
	
	
	List<User> users=new ArrayList<User>();
	public UserDao() {
		User u1=new User(1,"ravi","asldkfj");
		User u3=new User(3,"teja","wertj");
		User u2=new User(2,"gatt","lkjhdkfj");
		users.add(u1);
		users.add(u2);
		users.add(u3);	
	}
	

}
