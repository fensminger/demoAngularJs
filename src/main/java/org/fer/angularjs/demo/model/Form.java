package org.fer.angularjs.demo.model;

import java.math.BigDecimal;

public class Form {
	private String name;
	private String descr;
	private BigDecimal price;
	
	public Form() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Form [name=" + name + ", descr=" + descr + ", price=" + price
				+ "]";
	}
}
