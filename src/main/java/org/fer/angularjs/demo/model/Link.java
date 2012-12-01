
package org.fer.angularjs.demo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "link", propOrder = {
    "url",
    "name"
})
public class Link implements Serializable {
	private static final long serialVersionUID = 915463885337269781L;
	
    @XmlElement(name = "url", required = true)
    protected String url;
    @XmlElement(name = "name", required = true)
    protected String name;

    public Link(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}

	public Link() {
		super();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
