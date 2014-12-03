package ca.springmvc.application.controller;

import javax.inject.Inject; 

import java.util.Map; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ca.springmvc.application.service.PersoneService;

@Controller 
public class HomeController {
	public static final int DEFAULT_PERSONE_PER_PAGE = 25;
	
	@Autowired
	private PersoneService personeService;
	
	@Inject 
	public HomeController(PersoneService spitterService) {
		this.personeService = spitterService; 
	}
	@RequestMapping({"/","/home"})
	public String showHomePage(Map<String, Object> model) {
		System.out.println("Home");
		System.out.println(personeService.getRecentPersones(DEFAULT_PERSONE_PER_PAGE).size());
		model.put("persones", personeService.getRecentPersones(DEFAULT_PERSONE_PER_PAGE));
		return "home"; 
	}
	
//	@RequestMapping(value="/login")
//	public String login(@RequestParam(value = "error", required = false) String error,
//		@RequestParam(value = "logout", required = false) String logout) {
//		System.out.println("LOGIN CONTROLLER");
//		System.out.println(error);
// 
//	  return "home";
// 
//	}
}