package ca.springmvc.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import ca.springmvc.application.dao.PersoneDAO;
import ca.springmvc.application.utils.Persone;

@Component
public class PersoneService {
	
	public List<Persone> getRecentPersones(int personesNumber){
		
	      ApplicationContext context = 
	    		  new ClassPathXmlApplicationContext("application-context.xml");

	      PersoneDAO dao = (PersoneDAO) context.getBean("personeDAO");
	      
	      List<Persone> list = dao.listEmployees();
		
		return list;
	}
	
	public List<Persone> getPersoneById(String id){
		
	      ApplicationContext context = 
	    		  new ClassPathXmlApplicationContext("application-context.xml");

	      PersoneDAO dao = (PersoneDAO) context.getBean("personeDAO");
	      
	     
	    		  
	      Persone p = dao.getPersoneByID(Integer.parseInt(id));
	      
	      List<Persone> list = new ArrayList<Persone>();
		
	      list.add(p);
	      
		return list;
	}

}
