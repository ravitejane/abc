package ins.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ins.model.User;
import ins.service.UserServiceImpl;
import ins.util.ResponseModel;

@Controller
public class CreateUserController {
	
	UserServiceImpl service=new UserServiceImpl();
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public @ResponseBody List<User> getUsers()
	{	
		System.out.println("users");
		return service.getUsers();
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable("id") int id)
	{
		System.out.println(id);
		System.out.println(service.getUser(id).toString());
		return service.getUser(id);
	}
	
	@RequestMapping(value="/saveUser",method=RequestMethod.POST)
	public @ResponseBody User saveUser(@RequestBody User user)
	{
		System.out.println("save User call");
		System.out.println(user.toString());
		return service.saveUser(user);
	}
	
	@RequestMapping("/get")
	public @ResponseBody ResponseModel statusTest()
	{
		ResponseModel rs=new ResponseModel();
		rs.setData(service.getUsers());
		rs.setStatusCode(200);
		rs.setStatus("Success");
		return rs;
	}

}
