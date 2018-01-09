package controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Customer;

@Controller
public class CustomerController {
	
	Map<String,Customer> customers;
	public CustomerController() {
		customers=new HashMap<String, Customer>();
	}
	
	@RequestMapping("/")
	public String login(Customer cust){
	    return "test";
	}
	
	@RequestMapping(value="/getCustomers",method=RequestMethod.GET)
	public String getCustomer(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "custSave";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="saveCustomer")
	public String saveCustomer(@Valid Customer customer,BindingResult bindingResult){
		if(bindingResult.hasErrors())
			return "custSave";
	//	model.addAttribute("customer", customer);
		System.out.println(customer.toString());
		customers.put(customer.getEmail(), customer);
		return "custSaveSuccess";
	}
}
