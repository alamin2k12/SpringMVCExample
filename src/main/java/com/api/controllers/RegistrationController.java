package com.api.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Emp;

@RestController
public class RegistrationController {

	   @RequestMapping (value="/employeeregistration" , method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	    public @ResponseBody String registerEmployee (@RequestBody Emp employee)
	    {
	    	String return_value="Registration Successful";
	    	
	    	return return_value;
	    }
}
