package at.fwd.swagger.spring.demo.user.model;

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
    
    private State state;
    
    @JsonIgnore
	private String hiddenString;
   
    private Byte[] bytes;
    
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
	public Byte[] getBytes() {
		return bytes;
	}
	public void setBytes(Byte[] bytes) {
		this.bytes = bytes;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}

    
    
    
}

