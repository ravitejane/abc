package teja.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    		@RequestParam("gender") String gender,HttpServletRequest request,  
    		 HttpServletResponse response) throws IOException	{
	
		
		
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
		
		response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		    out.println("<html>");
		    out.println("<h1>Registered successfully please loign</h1>");
		    out.println("<a href='http://localhost:8080/teja/views/login.jsp'>Login Here</a>");
		    out.println("</html>");
		    out.println();
		    out.println();
		
		return null;
	}

}
