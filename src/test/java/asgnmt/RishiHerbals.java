package asgnmt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RishiHerbals {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://rishiherbalindia.linker.store/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
	}
	@Test
	public void test() throws Exception
	{
		//registration
		
		/*driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a")).click();                                                               //my acc
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();                                                       //register
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("sweety2000@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Sweety2000");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();                          //i agree
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
		driver.navigate().refresh();*/
		
		//login
		
		//driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[3]/a")).click();                                         //logout
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a")).click();                                                  //my acc
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")).click();                                         //login
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("sweety2000@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Sweety2000");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("herbal agro growth booster",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]")).click();                                     //add wishlist
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();                                               //wishlist
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();                                                    //skin
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();                     //cream
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]")).click();                                     //wishlist
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		
		//login validation
		
		String expurl="https://rishiherbalindia.linker.store/safety";
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		if(expurl.equals(actualurl))
		{
			System.out.println("login successful...");
		}
		else
		{
			System.out.println("login failed...");
		}
		
	}

}

