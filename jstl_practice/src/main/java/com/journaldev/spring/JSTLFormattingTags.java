package com.journaldev.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.model.Person;

@Controller
public class JSTLFormattingTags {
	
	@RequestMapping(value = "/fmt_parseNumber", method = RequestMethod.GET)
    public String fmt_parseNumber(){
        return "fmt_parseNumber";
	}
	
	@RequestMapping(value = "/fn_lenght_substring1", method = RequestMethod.GET)
    public String fn_lenght_substring(Model model){
		model.addAttribute("person",new Person(518,"gattineni ravi teja","india"));   
        return "fn_lenght_substring";
	}

}
