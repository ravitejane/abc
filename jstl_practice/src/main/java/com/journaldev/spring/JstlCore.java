package com.journaldev.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.model.Person;

@Controller
public class JstlCore {
	
	@RequestMapping(value = "/curl", method = RequestMethod.GET)
    public String curl(){
        
        return "curl";
	}
	
	@RequestMapping(value = "/credirect", method = RequestMethod.GET)
    public String credirect(){
        
        return "credirect";
	}
	
	@RequestMapping(value = "/cparam", method = RequestMethod.GET)
    public String cparam(){
        
        return "cparam";
	}
    
	
	@RequestMapping(value = "/cfortokens", method = RequestMethod.GET)
    public String ctokens(){
        
        return "cfortokens";
	}
    
	
	@RequestMapping(value = "/cforeach", method = RequestMethod.GET)
    public String cforEach(Model model){
		model.addAttribute("persons", new Person[]{new Person(519,"raviteja","india"),new Person(515,"raviteja","india"),new Person(518,"raviteja","india")});        
        return "cforeach";
    }
	
	
	@RequestMapping(value = "/cchoose/{id}", method = RequestMethod.GET)
    public String cchoose(Model model,@PathVariable String id){
		
			int id1=Integer.parseInt(id);
			System.out.println(id1);
		model.addAttribute("person", new Person(id1,"raviteja","india"));
        return "cchoose";
    }
	
	
	
	
	@RequestMapping(value = "/cif/{id}", method = RequestMethod.GET)
    public String cif(Model model,@PathVariable String id){
		
			int id1=Integer.parseInt(id);
			System.out.println(id1);
		model.addAttribute("person", new Person(id1,"raviteja","india"));
        return "cif";
    }	
	
	@RequestMapping(value = "/cout", method = RequestMethod.GET)
	public String cout(Model model) {
		model.addAttribute("person", new Person(5,"raviteja","india"));
		model.addAttribute("listPersons", new Person(6,"raviteja","india"));
		return "cout";
	}
	
	@RequestMapping(value = "/cimport", method = RequestMethod.GET)
    public String cimport(){
        
        return "cimport";
    }
	
	@RequestMapping(value = "/ccatch", method = RequestMethod.GET)
    public String ccatch(){
        
        return "ccatch";
    }
	
	@RequestMapping(value = "/cset", method = RequestMethod.GET)
    public String cset(Model model){
		model.addAttribute("person", new Person(51,"raviteja","india"));
        return "cset";
    }
	
}
