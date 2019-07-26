package com.Spring.form.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.Spring.custom.validation.CourseCode;

import lombok.Data;

@Data
public class Customer {
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	@Pattern(regexp="^[a-zA-Z]+$", message="invalid name")
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	@Pattern(regexp="^[a-zA-Z]+$", message="invalid name")
	private String lastName;
	@Min(value=0,message="must be grater than  or equals to zero")
	@Max(value=10,message="must be less than  or equals to 10")
	@NotNull(message="is required")
	
	private int passes;
	@Pattern(regexp="^[a-zA-Z0-9]{6}", message="only 5 char/digits")
	private String postalcode;
	
	@CourseCode	
	private String  courseCode;

}
