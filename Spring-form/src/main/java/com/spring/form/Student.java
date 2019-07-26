package com.spring.form;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Student {
	@NotNull(message="is required")
	@Size(min=1)
	private String fname;
	private String lname;
	private String country;
	private LinkedHashMap<String,String> countries;
	private String favoriteLanguage;
	private LinkedHashMap<String, String> favoriteLanguageOption;
	private String operationSystem;
	public Student() {
		countries=new LinkedHashMap<>();
		countries.put("IN", "India");
		countries.put("usa", "USA");
		countries.put("UK", "Uk");
		countries.put("CH", "China");
		
		// populate favorite language options
        favoriteLanguageOption = new LinkedHashMap<>();

        // parameter order: value, display label
        
        favoriteLanguageOption.put("Java", "Java");
        favoriteLanguageOption.put("C#", "C#");
        favoriteLanguageOption.put("PHP", "PHP");
        favoriteLanguageOption.put("Ruby", "Ruby");     
	}

}
