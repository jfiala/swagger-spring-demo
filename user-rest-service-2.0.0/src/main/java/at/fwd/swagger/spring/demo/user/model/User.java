package at.fwd.swagger.spring.demo.user.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    
    // TODO Swagger-Springfox-2.0.0: Strange behaviour after added @ApiModelProperty to enum attribute
    // BEFORE: "state":{"type":"string","enum":["ACTIVE","DISABLED"]}
    // AFTER: "state":{"type":"string","description":"Current state"}
    //@ApiModelProperty(value = "Current state")
    private State state;
    
    @JsonIgnore
	private String hiddenString;
   
    private Byte[] photo;
    
    private List<Category> categories;
    
    private List<Location> locations;
    
    private Map<String, Location> locationMap;
    
    public User() {
    	categories = new ArrayList<Category>();
    	locations = new ArrayList<Location>();
    	locationMap = new HashMap<String, Location>();
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
	
	public String getHiddenString() {
		return hiddenString;
	}
	public void setHiddenString(String hiddenString) {
		this.hiddenString = hiddenString;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
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

	public Map<String, Location> getLocationMap() {
		return locationMap;
	}

	public void setLocationMap(Map<String, Location> locationMap) {
		this.locationMap = locationMap;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

    
    
    
}

