package com.srikanth.guiceLearning;

import com.google.inject.Inject;

public class Communication {
	
	@Inject
	private MessageService messageService;
	
	public void sendTestMessage(String receiver) {
		messageService.sendMessage("Hello this is for testing", receiver);
	}
}
