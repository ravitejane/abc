package teja.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OpControler {
	
	@RequestMapping(value= "/opRegister", method = RequestMethod.POST)
	public String registerOp(@RequestParam("username") String username,
			@RequestParam("password") String password,
    		@RequestParam("dob") String dob
    		,@RequestParam("email") String email
    		,@RequestParam("phonenumber") String phonenumber,
    		@RequestParam("gender") String gender)	{
		
		
		System.out.println(username+" "+password+" "+dob);
		
		
		return null;
	}

}
