package at.fwd.swagger.spring.demo.user.model;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

public class User {

    private long id;
    
    private String name;
    
    private Link link;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Link getLink() {
		return link;
	}
	public void setLink(Link link) {
		this.link = link;
	}
    
    
    
}

