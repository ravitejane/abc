package teja.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import teja.com.model.Person;
@Controller  
public class HelloWorldController {  
	
	
    @RequestMapping("/hello")  
    public ModelAndView helloWorld() 
    {
    	Person p=new Person();
    	p.setId(519);
    	p.setName("ravi teja gattineni");
    	p.setCountry("india");
    	
    
    	
    	
    	System.out.println("coollllll");
        String message = "HELLO SPRING MVC HOW R U";  
        return new ModelAndView("hellopage", "message", message);  
    }  
}