package com.SpringBootDemo.SpringBoot.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDemo.SpringBoot.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitConfigurationComtroller {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfiguration(){
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

}
