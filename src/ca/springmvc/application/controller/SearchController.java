package ca.springmvc.application.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.springmvc.application.service.PersoneService;

@Controller
@RequestMapping("/search")
public class SearchController {
	
	public static final int DEFAULT_PERSONE_PER_PAGE = 25;
	
	@Autowired
	private PersoneService personeService;

	@Inject 
	public SearchController(PersoneService spitterService) {
		this.personeService = spitterService; 
	}
	
	@RequestMapping("/searchById")
	public String getPersoneById(@RequestParam(value = "id") String name, Map<String, Object> model) {
		System.out.println("searchById");
		System.out.println(personeService.getPersoneById(name).size());
		model.put("persones", personeService.getPersoneById(name));
		return "home"; 
	}

}
