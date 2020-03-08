package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import base.BaseClass;

public class LogIn extends BaseClass{

	static WebElement SignInBlock = driver.findElement(By.id("nav-link-accountList"));
	static WebElement SignInButton = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
	String Username = "//input[@name='email']";
	String BtnContinue = "//input[@id='continue']";
	String Password = "//input[@id='ap_password']";
	String BtnLogIn = "//input[@id='signInSubmit']";
	
	public static void signIn() throws InterruptedException {
		Actions ac = new Actions(driver);
		ac.moveToElement(SignInBlock).build().perform();
		Thread.sleep(5000);
		SignInButton.click();
	}
	public void enterUserName(String a) throws InterruptedException {
		driver.findElement(By.xpath(Username)).sendKeys(a);
		Thread.sleep(5000);
		driver.findElement(By.xpath(BtnContinue)).click();		
	}
	public void enterPassword(String b) throws InterruptedException {
		driver.findElement(By.xpath(Password)).sendKeys(b);
		Thread.sleep(5000);		
	}
	public void clickLogInBtn() throws InterruptedException {
		driver.findElement(By.xpath(BtnLogIn)).click();
		Thread.sleep(5000);		
	}
}
