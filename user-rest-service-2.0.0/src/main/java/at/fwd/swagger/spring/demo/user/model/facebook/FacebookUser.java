package at.fwd.swagger.spring.demo.user.model.facebook;

import java.util.List;

import com.wordnik.swagger.annotations.ApiModelProperty;

import at.fwd.swagger.spring.demo.user.model.Category;

/**
 * TODO: complete api
 * 
 * @author johannes.fiala@fwd.at
 *
 */
public class FacebookUser {

	@ApiModelProperty(notes="Page ID. No access token is required to access this field")
	Long id;
	
	@ApiModelProperty(notes="Information about the Page")
	String name;
	
	String about;
	
	String description;
	
	String founded;

	List<Category> category_list;
	
	private String mission;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFounded() {
		return founded;
	}

	public void setFounded(String founded) {
		this.founded = founded;
	}

	public List<Category> getCategory_list() {
		return category_list;
	}

	public void setCategory_list(List<Category> category_list) {
		this.category_list = category_list;
	}

	public String getMission() {
		return mission;
	}

	public void setMission(String mission) {
		this.mission = mission;
	}
	
	
	
}
