package org.fer.angularjs.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Links {

	private List<Link> links;

	public List<Link> getLinks() {
		if (null == links) {
			links = new ArrayList<Link>();
		}
		return links;
	}

	
	
	
	
}
