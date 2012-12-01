package org.fer.angularjs.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
}
