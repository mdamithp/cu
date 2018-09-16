package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private static WebDriver driver;
	
	@Given("^I navigate to google home page$")
	public void i_navigate_to_google_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","src\\test\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	    
	}

	@When("^I type \"([^\"]*)\" on the search box$")
	public void i_type_on_the_search_box(String x) throws Throwable {
	   WebElement we=driver.findElement(By.id("lst-ib"));
	   we.sendKeys(x);
	   we.sendKeys(Keys.RETURN);
	   
	}

	@Then("^I will be able to see the test result$")
	public void i_will_be_able_to_see_the_test_result() throws Throwable {
		driver.getTitle();
	    
	}


}
