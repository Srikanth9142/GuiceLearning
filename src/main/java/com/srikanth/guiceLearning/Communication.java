package com.srikanth.guiceLearning;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Communication {
	
	@Inject
	private MessageService messageService;
	
	@Inject @Named("smsService")
	private MessageService smsMessageService;
	
	public void sendSMS(String receiver) {
		smsMessageService.sendMessage("sent via annotated bindings", receiver);
	}
	
	public void sendTestMessage(String receiver) {
		messageService.sendMessage("Hello this is for testing", receiver);
	}
}
