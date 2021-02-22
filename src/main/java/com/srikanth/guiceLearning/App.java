package com.srikanth.guiceLearning;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
        Injector injector = Guice.createInjector(new CommunicationModule());
        Communication myCommunication = injector.getInstance(Communication.class);
        myCommunication.sendTestMessage("Communication Device1");
        myCommunication.sendSMS("SMS Device1");
    }
}
