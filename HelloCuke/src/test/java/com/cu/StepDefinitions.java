package com.cu;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitions {
	MessageService messageService= new MessageService();
	
	private String msg;

	@Given("^I say ([a-zA-Z]*)$")
	public void i_say_Vikrant(String name) throws Throwable {
		msg = messageService.getMsg(name);
		System.out.println(msg);
	}

	@Then("^I should get message ([a-zA-Z ]*)$")
    public void i_should_get_message_Hello_Vikrant(String expectedMessage) throws Throwable {
		Assert.assertEquals(msg, expectedMessage);
    }
	
}
