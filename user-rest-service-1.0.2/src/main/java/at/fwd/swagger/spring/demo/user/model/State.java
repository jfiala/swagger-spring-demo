package at.fwd.swagger.spring.demo.user.model;

import com.wordnik.swagger.annotations.ApiModel;

/**
 * state to demo enum
 * 
 * @author johannes.fiala@fwd.at
 *
 */
@ApiModel(value="State", description="State object")
public enum State {

	ACTIVE, DISABLED;
	
}
