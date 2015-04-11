package at.fwd.swagger.spring.demo.user.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * User object (shows long, String, enum, Byte[])
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@ApiModel(value="User", description="User object")
public class User {

	@ApiModelProperty(value = "ID of the user", required = true, position = 2)
    private long id;
    
    @ApiModelProperty(value = "Name of the user", required = true, position = 1)
	private String name;
    
    // TODO Swagger-Springfox (develop-2.0 + 2.1.2-M2 + 2.1.2-M1) with Swagger-1.2: Enum seems not yet supported (https://github.com/springfox/springfox/issues/668)
    @ApiModelProperty(value = "State", required = false, position = 3)
    @JsonIgnore
    private State state;
        
    @JsonIgnore
	private String hiddenString;

    // TODO Swagger-Codegen-2.0.13: causes error with swagger-codegen-2.0.13: reserved word "byte" not allowed
    @ApiModelProperty(notes="demo for java.lang.Byte[]")
    private Byte[] photo;
    
    @ApiModelProperty(notes="demo for java.util.List")
    private List<Category> categories;
    
    private List<Location> locations;

    // TODO Swagger-Springfox-1.0.2: Maps are not yet supported correctly in Swagger 1.0.2 - result in Entry«string,Location»
    //private Map<String, Location> locationMap;


    public User() {
    	categories = new ArrayList<Category>();
    	locations = new ArrayList<Location>();
    	
    }
    
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

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getHiddenString() {
		return hiddenString;
	}

	public void setHiddenString(String hiddenString) {
		this.hiddenString = hiddenString;
	}

	public Byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

        
}

