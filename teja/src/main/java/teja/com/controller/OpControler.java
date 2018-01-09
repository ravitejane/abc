package teja.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import teja.com.model.Login;
import teja.com.model.OutPatent;
import teja.com.service.LoginService;
import teja.com.service.OutPatentService;

@Controller
public class OpControler {
	
	private OutPatentService outPatentService;	
	
	@Autowired
	public void setOs(OutPatentService outPatentService) {
		this.outPatentService = outPatentService;
	}
	
	private LoginService loginService;
	@Autowired
	public void setLs(LoginService loginService) {
		this.loginService = loginService;
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
		
		OutPatent outPatent=new OutPatent();
		outPatent.setName(username);
		outPatent.setEmail(email);
		outPatent.setPhoneNo(phonenumber);
		outPatent.setGender(gender);
		
		
		try
		 {		    
		    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    outPatent.setDateOfBirth(simpleDateFormat.parse(dob));
		    
		  } catch (ParseException ex) 
		  {
		        System.out.println("Parse Exception");
		  }
		
		
		
		
		Login l=new Login();
		l.setUsername(outPatentService.addOutPatent(outPatent)+"");
		l.setPassword(password);
		l.setRole("patent");
		
		loginService.addLogin(l);
		
		
		
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
	
	
	@RequestMapping(value= "/opUpdate")
	public String addDoctor(@ModelAttribute("outPatent") OutPatent d){
		
		System.out.println("hoo");
		System.out.println(d.getGender());
		return null;
	}
	
	
	
	
	@RequestMapping(value= "/editProfile/{patentId}", method = RequestMethod.GET)
	public String editProfile(@PathVariable("patentId") String patentId,Model model)
	{
		model.addAttribute("outPatent", outPatentService.getOutPatentById(Integer.parseInt(patentId)));
		return "opUpdateProfile";
	}
	
	@RequestMapping(value= "/bookAppointment/{patentId}", method = RequestMethod.GET)
	public String bookAppointment(@PathVariable("patentId") String patentId,Model model)
	{
		model.addAttribute("patent", outPatentService.getOutPatentById(Integer.parseInt(patentId)));
		return "opBookAppointment";
	}
	
	@RequestMapping(value= "/statusOfAppointment/{patentId}", method = RequestMethod.GET)
	public String statusOfAppointment(@PathVariable("patentId") String patentId,Model model)
	{
		model.addAttribute("patent", outPatentService.getOutPatentById(Integer.parseInt(patentId)));
		return "opAppointmentStatus";
	}

}
