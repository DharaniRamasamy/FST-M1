package OrangeHRMPkg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HRM_Activity1 {
	
	WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
	}
		
	@Test
	public void webTitleTest() 
	{
		String title=driver.getTitle();
		System.out.println("The page title is " + title);
		Assert.assertEquals("OrangeHRM",title);
						
	}
  
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	 
	}
	}

