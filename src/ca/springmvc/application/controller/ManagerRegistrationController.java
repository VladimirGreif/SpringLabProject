package ca.springmvc.application.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ca.springmvc.application.service.PersoneService;
import ca.springmvc.application.utils.User;

@Controller
@RequestMapping("/registration")
public class ManagerRegistrationController {
	
	@Autowired
	private PersoneService personeService;
	
	@Inject 
	public ManagerRegistrationController(PersoneService spitterService) {
		this.personeService = spitterService; 
	}
	
	@RequestMapping(value = "/manager", method=RequestMethod.GET) 
	public String createSpitterProfile(Model model) {
		model.addAttribute(new User()); 
		return "spitters/edit";
	}

}
