package org.fer.angularjs.demo;

import java.util.ArrayList;
import java.util.List;

import org.fer.angularjs.demo.model.Link;
import org.fer.angularjs.demo.model.Links;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManagerRest {

	@RequestMapping(value="/menuTuto", method=RequestMethod.GET, headers = "Accept=application/json", produces="application/json")
	public ResponseEntity<String> getmenuTuto() {
		HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Type", "application/json; charset=utf-8");
		return new ResponseEntity<String>("["
		    +"{\"url\": \"ex1\","
		    +"\"name\": \"Demo 1\"},"
		    +"{\"url\": \"ex2\","
		    +"\"name\": \"Demo 2\"},"
    		+"{\"url\": \"ex3\","
    		+"\"name\": \"Demo 3\"},"
    		+"{\"url\": \"ex4\","
    		+"\"name\": \"Demo 4\"},"
    		+"{\"url\": \"ex5\","
    		+"\"name\": \"Demo 5\"}"
    		+"]", headers, HttpStatus.OK);
	}
	
	@RequestMapping(value="/menuTuto2", method=RequestMethod.GET)
	public @ResponseBody Links getmenuTuto2() {
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
	
}
