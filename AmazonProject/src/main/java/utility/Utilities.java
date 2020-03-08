package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.BaseClass;

public class Utilities extends BaseClass{
	public static Properties readPropertiesFile() throws IOException {
		File Prop = new File("C:\\Users\\Soumick\\eclipse-workspace\\AmazonProject\\Application.properties");
		FileInputStream fis = new FileInputStream(Prop);
		Properties p = new Properties();
		p.load(fis);
		return p;
	}
	public static void takeScreenshot() throws IOException {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Soumick\\eclipse-workspace\\AmazonProject\\Screenshot\\"+System.currentTimeMillis()+".png"));
	}
	public static void ExplicitWait_ElementToBeClickable(String xPath) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPath)));
	}
}
