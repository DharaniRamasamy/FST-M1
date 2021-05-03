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

public class HRM_Activity2 {
	
	WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/orangehrm");
	}
		
	@Test
	public void imageUrlTest() 
	{
		String title=driver.getTitle();
		System.out.println("The page title is " + title);
		
		WebElement img=driver.findElement(By.xpath("//div/img"));
		String url=img.getAttribute("src");
		System.out.println("The image url is " + url);
				
	}
  
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	 
	}
	}

