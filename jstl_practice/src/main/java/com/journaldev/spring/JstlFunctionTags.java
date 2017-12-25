package com.journaldev.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.model.Person;

@Controller
public class JstlFunctionTags {
	
	@RequestMapping(value = "/fn_replace", method = RequestMethod.GET)
    public String fn_replace(){
        return "fn_replace";
	}
	
	@RequestMapping(value = "/fn_substring_before_after", method = RequestMethod.GET)
    public String fn_substring_before_after(){
        return "fn_substring_before_after";
	}
	
	@RequestMapping(value = "/fn_lenght_substring", method = RequestMethod.GET)
    public String fn_lenght_substring(Model model){
		model.addAttribute("person",new Person(518,"gattineni ravi teja","india"));   
        return "fn_lenght_substring";
	}
	
	@RequestMapping(value = "/fn_toLoweUpperCase", method = RequestMethod.GET)
    public String fn_toLoweUpperCase(Model model){
		model.addAttribute("person",new Person(518,"gattineni ravi teja","india"));   
        return "fn_toLoweUpperCase";
	}
	
	@RequestMapping(value = "/fn_split", method = RequestMethod.GET)
    public String fn_split(Model model){
		model.addAttribute("person",new Person(518,"welcome gattineni ravi teja ","india"));   
        return "fn_split";
	}
	
	@RequestMapping(value = "/fn_indexof", method = RequestMethod.GET)
    public String fn_indexof(){
        return "fn_indexof";
	}
	
	@RequestMapping(value = "/fn_escapexml", method = RequestMethod.GET)
    public String fn_escapexml(){
        return "fn_escapexml";
	}
	
	@RequestMapping(value = "/fn_endswith", method = RequestMethod.GET)
    public String fn_endswith(Model model){
		model.addAttribute("person",new Person(518,"ravi teja","india"));        
        return "fn_endswith";
    }
	
	@RequestMapping(value = "/fn_containsIC", method = RequestMethod.GET)
    public String fn_containsIC(Model model){
		model.addAttribute("person",new Person(518,"raviteja","india"));        
        return "fn_containsIC";
    }
	
	@RequestMapping(value = "/fn_contains", method = RequestMethod.GET)
    public String fn_contains(){
        return "fn_contains";
	}

}
