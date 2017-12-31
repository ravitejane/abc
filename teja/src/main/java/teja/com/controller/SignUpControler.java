package teja.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpControler {
	
	
	
	
	@RequestMapping("/login")
    public void removePerson(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,
    		@RequestParam("pwd") String pwd,@RequestParam("email") String email){
	
       
    }
	

}
