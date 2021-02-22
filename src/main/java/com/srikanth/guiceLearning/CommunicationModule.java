package com.srikanth.guiceLearning;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class CommunicationModule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(MessageService.class).to(EmailService.class);
		
		bind(MessageService.class).annotatedWith(Names.named("smsService"))
		  .to(SMSService.class);
	}

}
