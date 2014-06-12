package com.test.hello;

import static org.testng.Assert.*;
import org.testng.annotations.Test;



public class HelloWorldTest {

	@Test(enabled=false)
	public void should_get_greeting_message(){
		
		def h = new HelloWorld()
		[-2,-1,0,1].each{
			if(it > 0)
				assertEquals("Hello World <",h.getGreetingMessage(1))	
			else
				assertEquals("Hello World",h.getGreetingMessage(it))	
		}		
	}
}
