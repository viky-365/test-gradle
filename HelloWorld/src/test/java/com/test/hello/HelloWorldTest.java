package com.test.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void should_get_greeting_message(){
		HelloWorld h = new HelloWorld();
		assertEquals("Hello World1",h.getGreetingMessage());
	}
}
