package teja.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;


import teja.com.model.Person;  
import teja.com.service.PersonService;
@Controller  
public class HelloWorldController {  
	
	@Autowired
	PersonService ps;
    @RequestMapping("/hello")  
    public ModelAndView helloWorld() 
    {
    	Person p=new Person();
    	p.setId(519);
    	p.setName("ravi teja gattineni");
    	p.setCountry("india");
    	
    	ps.addPerson(p);
    	
    	
    	System.out.println("coollllll");
        String message = "HELLO SPRING MVC HOW R U";  
        return new ModelAndView("hellopage", "message", message);  
    }  
}