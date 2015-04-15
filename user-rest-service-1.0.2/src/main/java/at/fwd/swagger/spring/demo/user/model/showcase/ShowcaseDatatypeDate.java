package at.fwd.swagger.spring.demo.user.model.showcase;

import java.util.Calendar;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * Datatype to demo all Java primitives
 * @author johannes.fiala@fwd.at
 *
 */
public class ShowcaseDatatypeDate {

	@JsonIgnore
	private Date date;
	
	@JsonIgnore
	private Calendar calendar;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	
	
	
	
	
	
	
	
}
