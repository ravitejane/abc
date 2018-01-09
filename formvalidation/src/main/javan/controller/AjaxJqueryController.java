package controller;

import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import model.Customer.Gender;

@Controller
public class AjaxJqueryController {
	
	@RequestMapping(method=RequestMethod.POST,value="/ajaxpost2")
	public String postMethod1(@RequestParam("name") String name,@RequestParam("age") String age){
		System.out.println("in post method");
		System.out.println(name+" "+age);
		 return name;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/ajaxpost")
	public void postMethod(HttpServletRequest request,@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("age") String age,
			@RequestParam("gender") Gender gender,@RequestParam("birthday") Date birthday,@RequestParam("phoneno") String phone){
		System.out.println(email+" "+name+" "+phone+" "+gender+" "+birthday+" "+age);
		System.out.println("in post controller");
		System.out.println(name);
		
		
		/*Enumeration keys = request.getParameterNames(); 
		HashMap map = new HashMap(); 
		String key = null; 
		while(keys.hasMoreElements()){ 
		      key = keys.nextElement().toString(); 
		      map.put(key, request.getParameter(key));
		      System.out.println(key);
		}
		
		System.out.println("in post controller");
		HashMap hm = new HashMap();
		hm.putAll(request.getParameterMap());
		System.out.println(hm);
		
		
		System.out.println(hm);*/
	}

}
