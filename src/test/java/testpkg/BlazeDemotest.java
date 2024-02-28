package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.BlazeDemopage;


public class BlazeDemotest {
	
	WebDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url() 
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void testreg()
	{
		BlazeDemopage ob=new BlazeDemopage(driver);
		ob.setregvalues("sweety","ibm","sweety@gmail.com","sweety123", "sweety123");
		ob.register();
	}
	public void testlogin()
	{
		BlazeDemopage ob=new BlazeDemopage(driver);
		ob.setlogvalues("sweety@gmail.com","sweety123");
		ob.login();
	}

}
