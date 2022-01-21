package admin_portal_testing;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class Login_admin_auth {
	
	
  @Test
  public void LoginTest() throws InterruptedException {
    
	  System.setProperty("webdriver.gecko.driver", "C:\\Software\\selenium\\selenium\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	 
      
    driver.get("http://localhost:4200/login");
    Thread.sleep(5000);
    
    driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/app-root/div/div/app-login/div/form/div/div[1]/input")).sendKeys("vijay patil");
	driver.findElement(By.xpath("/html/body/app-root/div/div/app-login/div/form/div/div[2]/input")).sendKeys("vijay123");
	Actions action = new Actions(driver);
	WebElement link = driver.findElement(By.xpath("//input[@text()='Log In']"));
	action.doubleClick(link).perform();
	// actionProvider("/html/body/app-root/div/div/app-login/div/form/div/div[3]/button").build().perform();
	try 
	{
		WebDriverWait wait=new WebDriverWait(driver, 14);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("http://localhost:4200/")));
		System.out.println("Login Successfull");

//		driver.findElement(By.xpath("/html/body/app-root/nav/ul/li[5]/div/a[2]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/form/h3")));
//		System.out.println("Signed Out");
	}
	catch(Exception e) 
	{
		System.out.println("Error in browser!!\nPlease have a look");
	}
	
    Thread.sleep(5000);  
    driver.quit();
  }
}