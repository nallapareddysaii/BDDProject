package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	
	WebDriver driver;
	

@Given("User opens {string} browser")
public void user_opens_browser(String browserName) {
	
	if(browserName.equalsIgnoreCase("chrome"))
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
    
}

@Given("User launches app URL using {string}")
public void user_launches_app_url_using(String url) {
	
	driver.get(url);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
    
}

@When("User enters text {string} in textbox using xpath {string}")
public void user_enters_text_in_textbox_using_xpath(String text, String xpath) {
	
	driver.findElement(By.xpath(xpath)).sendKeys(text);    
}

@When("User clicks button using xpath {string}")
public void user_clicks_button_using_xpath(String xpath) {
	
	driver.findElement(By.xpath(xpath)).click();
   
}

@Then("validate title to be {string}")
public void validate_title_to_be(String expTitle) {
	
	Assert.assertEquals(driver.getTitle(), expTitle);
    
}



}
