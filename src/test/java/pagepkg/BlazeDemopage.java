package pagepkg;

   import org.openqa.selenium.By;
   import org.openqa.selenium.WebDriver;


  public class BlazeDemopage {

	WebDriver driver;
	By nme=By.name("name");
	By cmpy=By.name("company");
	By emil=By.id("email");
	By pswd=By.name("password");
	By cpswd=By.name("password_confirmation");
	
	By reg=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	By log=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	
	public BlazeDemopage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setregvalues(String name,String company,String email,String pasword,String cpasword)
	{
		driver.findElement(nme).sendKeys(name);
		driver.findElement(cmpy).sendKeys(company);
		driver.findElement(emil).sendKeys(email);
		driver.findElement(pswd).sendKeys(pasword);
		driver.findElement(cpswd).sendKeys(cpasword);
	}
	
	public void register()
	{
		driver.findElement(reg).click();
		driver.navigate().refresh();
	}
	
	public void setlogvalues(String emal,String psword)
	{
		driver.findElement(emil).sendKeys(emal);
		driver.findElement(pswd).sendKeys(psword);
	}
	
	public void login()
	{
		driver.findElement(log);
	}
}

