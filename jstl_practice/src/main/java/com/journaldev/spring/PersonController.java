package com.journaldev.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.model.Person;

@Controller
public class PersonController {
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit(Model model){
		model.addAttribute("person", new Person(519,"raviteja","india"));
        return "springform";
    }
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute Person p){
		System.out.println(p.getName());
        return "springform";
    }

}
