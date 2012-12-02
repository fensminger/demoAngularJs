package org.fer.angularjs.demo;

import java.math.BigDecimal;

import org.fer.angularjs.demo.model.Form;
import org.fer.angularjs.demo.model.Link;
import org.fer.angularjs.demo.model.Links;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ManagerRest {

	@RequestMapping(value="/menuTuto", method=RequestMethod.GET)
	public @ResponseBody Links getmenuTuto() {
		//HttpHeaders headers = new HttpHeaders();
	    //headers.add("Content-Type", "application/json; charset=utf-8");
		
		Links links = new Links();
		
		links.getLinks().add(new Link("ex1", "Demo 1"));
		links.getLinks().add(new Link("ex2", "Demo 2"));
		links.getLinks().add(new Link("ex3", "Demo 3"));
		links.getLinks().add(new Link("ex4", "Demo 4"));
		links.getLinks().add(new Link("ex5", "Demo 5"));
		
		return links;
	}
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public @ResponseBody Form getForm() {
		Form form = new Form();
		
		form.setName("Nom");
		form.setDescr("Ma super longue description");
		form.setPrice(new BigDecimal("15.99"));
		
		return form;
	}
	
	@RequestMapping(value="/postForm", method=RequestMethod.POST)
	public @ResponseBody Form postForm(@RequestBody Form form) {
		System.out.println("Form -> "+form);
		return form;
	}
}
