package com.srikanth.guiceLearning;
import java.util.*;

public class SMSService implements MessageService {

	@Override
	public void sendMessage(String message, String receiver) {
		// TODO Auto-generated method stub
		System.out.println("Sending Message \n" + message + " for " +receiver+" via -- SMSService\n");
		
	}

}
