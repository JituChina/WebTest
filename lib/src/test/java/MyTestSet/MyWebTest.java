package MyTestSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyWebTest {

	@Test public void MyTest() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		String title = driver.getTitle();
		System.out.println("The Titile is: " + title);
		WebElement temp;
		temp = driver.findElement(By.name("q"));

		Assert.assertEquals(title, "Google");
		temp.sendKeys("Gradle vs Maven");
		temp.sendKeys(Keys.ENTER);
		
		
		Thread.sleep(8000);
		
		driver.close();
		
	}

}
