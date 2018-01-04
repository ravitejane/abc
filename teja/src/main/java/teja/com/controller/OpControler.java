package teja.com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import teja.com.model.Login;
import teja.com.model.OutPatent;
import teja.com.service.LoginService;
import teja.com.service.OutPatentService;

@Controller
public class OpControler {
	
	private OutPatentService os;	
	
	@Autowired
	public void setOs(OutPatentService os) {
		this.os = os;
	}
	
	private LoginService ls;
	@Autowired
	public void setLs(LoginService ls) {
		this.ls = ls;
	}

	@RequestMapping(value= "/opRegister", method = RequestMethod.POST)
	public String registerOp(@RequestParam("username") String username,
			@RequestParam("password") String password,
    		@RequestParam("dob") String dob
    		,@RequestParam("email") String email
    		,@RequestParam("phonenumber") int phonenumber,
    		@RequestParam("gender") String gender)	{
	
		
		
		/*
		 * registering the OutPatent
		 */
		
		OutPatent op=new OutPatent();
		op.setName(username);
		op.setEmail(email);
		op.setPhoneNo(phonenumber);
		op.setGender(gender);
		
		
		try
		 {		    
		    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    op.setDateOfBirth(simpleDateFormat.parse(dob));
		    
		  } catch (ParseException ex) 
		  {
		        System.out.println("Parse Exception");
		  }
		
		
		
		
		Login l=new Login();
		l.setUsername(os.addOutPatent(op)+"");
		l.setPassword(password);
		l.setRole("patent");
		
		ls.addLogin(l);
		
		
		
		System.out.println(username+" "+password+" "+dob);
		
		
		return null;
	}

}
