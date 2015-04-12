package at.fwd.swagger.spring.demo.user.model;

import com.wordnik.swagger.annotations.ApiModel;

/**
 * Demo for enum State
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@ApiModel(description="State object")
public enum State {

	ACTIVE, DISABLED;
	
}
