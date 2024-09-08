package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.test;


@RestController
public class controller {

	public static Logger logger=LoggerFactory.getLogger(controller.class);
	
	@RequestMapping("/hello")
	public String  mail(@RequestBody test test1) {
		logger.info("Inside the hello endpoint");
		MockMailSender mailSender=new MockMailSender();
		mailSender.send(test1);
	
		return "Mail Sent";
	}

}
