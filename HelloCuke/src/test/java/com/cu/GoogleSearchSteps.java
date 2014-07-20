package com.cu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;

public class GoogleSearchSteps {
	
	WebDriver driver;
	
	public GoogleSearchSteps(){
		// Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        driver = new FirefoxDriver();
	}
	
	@Given("^I open Google.com$")
	public void I_open_Google(){
		// And now use this to visit Google
		driver.get("http://www.google.com");
		// Alternatively the same thing can be done like this
		// driver.navigate().to("http://www.google.com");
	}
	
	@Given("^I search ('[a-zA-Z0-9 ]+')$")
	public void I_search_java(String keyWord){
		// Find the text input element by its name
		WebElement element = driver.findElement(By.name("q"));
		// Enter something to search for
		element.sendKeys(keyWord.replaceAll("'", ""));
		
		// Now submit the form. WebDriver will find the form for us from the element
		element.submit();
	}

	@Given("^I should see the ('[a-zA-Z0-9 ]+') search results$")
	public void I_should_see_the_search_results_for_java(final String keyWord){
		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());
		
		// Google's search is rendered dynamically with JavaScript.
		// Wait for the page to load, timeout after 10 seconds
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith(keyWord.replaceAll("'", ""));
			}
		});
		
		// Should see: "java - Google Search"
		System.out.println("Page title is: " + driver.getTitle());
	}

}
