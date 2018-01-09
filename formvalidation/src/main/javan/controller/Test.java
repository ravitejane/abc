package controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Customer;
import model.Customer.Gender;

@Controller
public class Test {
	@RequestMapping(method=RequestMethod.POST,value="test")
	public void getdata(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("age") String age,
			@RequestParam("gender") Gender gender,@RequestParam("birthday") Date birthday,@RequestParam("phoneno") String phone){
		System.out.println(email+" "+name+" "+phone+" "+gender+" "+birthday+" "+age);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="test2")
	public void getdata2(){
		System.out.println("test2 method");
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="test1")
	public void getdata(@ModelAttribute("customer") Customer customer){
		System.out.println(customer.toString());
		
	}

}
