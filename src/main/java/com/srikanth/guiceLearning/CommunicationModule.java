package com.srikanth.guiceLearning;

import com.google.inject.AbstractModule;

public class CommunicationModule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(MessageService.class).to(EmailService.class);

	}

}
