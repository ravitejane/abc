package teja.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import teja.com.model.Bed;
import teja.com.service.BedService;

@Controller
public class BedController {
	
	@Autowired
	private BedService bedService;

	public void setBedService(BedService bedService) {
		this.bedService = bedService;
	}

	@RequestMapping(value = "/beds", method = RequestMethod.GET)
	public String listBeds(Model model) {
		model.addAttribute("bed", new Bed());		
		model.addAttribute("listBeds", this.bedService.listBed());		
		return "bed";
	}
	
	@RequestMapping(value= "/bedUpdate", method = RequestMethod.POST)
	public String updateBed(@ModelAttribute("bed") Bed d)
	{
		System.out.println(d.toString());
		this.bedService.updateBed(d);
		return "redirect:/beds";
	}
	
	//For add and update person both
	@RequestMapping(value= "/bed/add", method = RequestMethod.POST)
	public String addBed(@ModelAttribute("bed") Bed d){
		this.bedService.addBed(d);
		
	/*	String bedone=d.getBedNo();
		if(this.bedService.getBedByNo(bedone)!=null)
		{
			this.bedService.updateBed(d);
		}
		else
		{
			this.bedService.addBed(d);
		}
		*/
		return "redirect:/beds";
		
	}
	
	@RequestMapping("/removeBed/{bedNo}")
    public String removeBed(@PathVariable("bedNo") String bedNo){
		
	
        this.bedService.removeBed(bedNo);
       
        return "redirect:/beds";
    }
 
    @RequestMapping("/editBed/{bedNo}")
    public String editBed(@PathVariable("bedNo") String bedNo, Model model){
    	
    	model.addAttribute("bed", this.bedService.getBedByNo(bedNo));
		model.addAttribute("listBeds", this.bedService.listBed());
		return "bed";
    }


}
