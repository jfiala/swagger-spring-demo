package at.fwd.swagger.spring.demo.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import at.fwd.swagger.spring.demo.user.model.showcase.ShowcaseDatatypeDate;
import at.fwd.swagger.spring.demo.user.model.showcase.ShowcaseDatatypeMath;
import at.fwd.swagger.spring.demo.user.model.showcase.ShowcaseDatatypePrimitives;

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

	@ApiModelProperty(notes = "ID of the user", required = true, position = 2)
    private long id;
    
    @ApiModelProperty(notes = "Name of the user", required = true, position = 1)
	private String name;
    
    @ApiModelProperty(notes = "First name of the user", required = true, position = 3)
	private String firstName;
    
    @ApiModelProperty(required = false, position = 3)
    private State state;
        
    @JsonIgnore
	private String hiddenString;

    // TODO Swagger-Codegen-2.0.13: causes error with swagger-codegen-2.0.13: reserved word "byte" not allowed, fixed as of 2.1.2-M1
    @ApiModelProperty(notes="demo for java.lang.Byte[]")
    private Byte[] photo;
    
    @ApiModelProperty(notes="demo for java.util.List")
    private List<Category> categories;
    
    private List<Location> locations;

    // TODO Swagger-Springfox-1.0.2: Maps are not yet supported correctly in Swagger 1.0.2 - result in Entry«string,Location»
    //private Map<String, Location> locationMap;

    private ShowcaseDatatypePrimitives primitives;
    
    private ShowcaseDatatypeMath math;
    
    @JsonIgnore
    private ShowcaseDatatypeDate date;
    
    @ApiModelProperty(notes="created")
    @JsonIgnore
    private Date createTimestamp;
    
    @ApiModelProperty(notes="last modified")
    @JsonIgnore
    private Date modifyTimestamp;
    
    @ApiModelProperty(notes="the nickname")
    private String nickname;

    public User() {
    	categories = new ArrayList<Category>();
    	locations = new ArrayList<Location>();
    	primitives = new ShowcaseDatatypePrimitives();
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

	public String getFirstName() {
		return firstName;
	} 

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public ShowcaseDatatypePrimitives getPrimitives() {
		return primitives;
	}

	public void setPrimitives(ShowcaseDatatypePrimitives primitives) {
		this.primitives = primitives;
	}

	public Date getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Date getModifyTimestamp() {
		return modifyTimestamp;
	}

	public void setModifyTimestamp(Date modifyTimestamp) {
		this.modifyTimestamp = modifyTimestamp;
	}

	public ShowcaseDatatypeMath getMath() {
		return math;
	}

	public void setMath(ShowcaseDatatypeMath math) {
		this.math = math;
	}

	public ShowcaseDatatypeDate getDate() {
		return date;
	}

	public void setDate(ShowcaseDatatypeDate date) {
		this.date = date;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

        
}

