package teja.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import teja.com.model.Login;
import teja.com.service.LoginService;
import teja.com.service.OutPatentService;

@Controller
public class LoginController {
	
	private LoginService ls;
	@Autowired
	public void setLs(LoginService ls) {
		this.ls = ls;
	}
	
	private OutPatentService os;	
	
	@Autowired
	public void setOs(OutPatentService os) {
		this.os = os;
	}


	@RequestMapping("/login")
    public String removePerson(@RequestParam("username") String username,@RequestParam("password") String password,
    		@RequestParam("role") String role,Model model){
		Login login=new Login();
		login.setUsername(username);
		login.setPassword(password);
		login.setRole(role);	
		
		String status=ls.checkLogin(login);
		if(status.equals("admin"))
		{
			return "admin";
		}
		else if(status.equals("doctor"))
		{
			return "redirect:/doctors";
		}
		else if(status.equals("patent"))
		{
			model.addAttribute("patent", os.getOutPatentById(Integer.parseInt(username)));
			return "outPatent";
		}
		else
		{
			return "login";
		}
       
    }
}
