package teja.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import teja.com.model.Doctor;
import teja.com.model.Login;
import teja.com.service.DoctorService;
import teja.com.service.LoginService;

@Controller
public class DoctroController {
	
	private LoginService ls;
	@Autowired
	public void setLs(LoginService ls) {
		this.ls = ls;
	}
	
	
private DoctorService doctorService;

@Autowired
public void setDoctorService(DoctorService doctorService) {
	this.doctorService = doctorService;
}

	@RequestMapping(value = "/doctors", method = RequestMethod.GET)
	public String listDoctors(Model model) {
		model.addAttribute("doctor", new Doctor());
		model.addAttribute("listDoctors", this.doctorService.listDoctors());
		return "doctor";
	}
	
	//For add and update person both
	@RequestMapping(value= "/doctor/add", method = RequestMethod.POST)
	public String addDoctor(@ModelAttribute("doctor") Doctor d){
		
		if(d.getdId() == null){
			//new person, add it
			
			String dId=this.doctorService.addDoctor(d);
			Login l=new Login();
			l.setUsername(dId);
			l.setPassword("f9f16d97c9d8c6f2cab37bb6d1f1992");
			l.setRole("doctor");
			ls.addLogin(l);
		}else{
			//existing person, call update
		
			this.doctorService.updateDoctor(d);
		}
		
		return "redirect:/doctors";
		
	}
	
	@RequestMapping("/remove/{dId}")
    public String removeDoctor(@PathVariable("dId") String dId){
		
	
        this.doctorService.removeDoctor(dId);
       
        return "redirect:/doctors";
    }
 
    @RequestMapping("/edit/{dId}")
    public String editDoctor(@PathVariable("dId") String dId, Model model){
    	
        model.addAttribute("doctor", this.doctorService.getDoctorById(dId));
        model.addAttribute("listDoctors", this.doctorService.listDoctors());
        return "doctor";
    }

}
