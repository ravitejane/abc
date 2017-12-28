package tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import tiles.model.Person;
@Controller  
public class HelloWorldController {  
	
	
	
    @RequestMapping("/hello")  	
    public ModelAndView helloWorld() 
    {
    	Person p=new Person();
    	p.setId(519);
    	p.setName("ravi teja gattineni");
    	p.setCountry("india");
        return new ModelAndView("index", "message", p);  
    }  
    
    @RequestMapping("/test")  	
    public ModelAndView helloWorld1() 
    {
    	Person p=new Person();
    	p.setId(519);
    	p.setName("ravi teja gattineni");
    	p.setCountry("india");
        return new ModelAndView("test", "message", p);  
    }  
    
    
    
}