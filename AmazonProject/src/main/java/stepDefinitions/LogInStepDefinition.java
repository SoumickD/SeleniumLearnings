package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjectModel.LogIn;
import utility.Utilities;

public class LogInStepDefinition extends BaseClass {
	
	@Given("^Launch the Browser$")
	public void launch_the_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E://Selenium//chromedriver_win32/chromedriver.exe/");
		driver = new ChromeDriver();
		}

	@Then("^Enter the URL$")
	public void enter_the_URL() throws Throwable {
		driver.get(Utilities.readPropertiesFile().getProperty("URL"));
		Thread.sleep(11000);
	}

	@Then("^Maximize the Window$")
	public void maximize_the_Window() throws Throwable {
		driver.manage().window().maximize();
		String browserTitle = driver.getTitle();
		if(browserTitle.contains("Online Shopping"))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^Click on Sign In$")
	public void click_on_Sign_In() throws Throwable {
		LogIn.signIn();
	}
	
	@Then("^Enter Username as \"([^\"]*)\"$")
	public void enter_Username_as(String arg1) throws Throwable {
		LogIn a = new LogIn();
		a.enterUserName(arg1);
	}

	@Then("^Enter Password as \"([^\"]*)\"$")
	public void enter_Password_as(String arg1) throws Throwable {
		LogIn a = new LogIn();
		a.enterPassword(arg1);
	}

	@Then("^Log in$")
	public void log_in() throws Throwable {
		LogIn a = new LogIn();
		a.clickLogInBtn();
		Utilities.takeScreenshot();
	}

}
