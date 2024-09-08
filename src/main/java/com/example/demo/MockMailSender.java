package com.example.demo;

import java.util.Objects;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;  //commons is warpper on slf4j , which internal uses logback and log by default is written into console
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.model.Registration;
import com.example.model.test;

public class MockMailSender implements MailSender{
	//removed component annotation to inject beans by using configuration class MailConfig.java
	

	private static Log log=LogFactory.getLog(MockMailSender.class);
	
	@Override
	public void send(test test1) {
		var eid=Optional.ofNullable(test1.getInvolvedParty())
				.map(InvolvedParty->InvolvedParty.getOrganisation())
				.map(Organisatin->Organisatin.getRegistrations())
				.map(registrations->{
					String eidd=null;
					for(Registration r: registrations)
					if(Objects.nonNull(r.getEid())) {
						eidd=String.valueOf(r.getEid().getCardtType());
					}
					return eidd;
				}).orElse(null);
	}
	
	//Description: when both mockmailsender and smtpmailsender are annoteted as component , because these classes implement mail sender interface
//
//Field mailSender in com.example.demo.controller required a single bean, but 2 were found:
//	- mockMailSender: defined in file [D:\sts projects\spring2\target\classes\com\example\demo\mailsender\MockMailSender.class]
//	- smtpMailSender: defined in file [D:\sts projects\spring2\target\classes\com\example\demo\mailsender\SmtpMailSender.class]
//
//This may be due to missing parameter name information
}
