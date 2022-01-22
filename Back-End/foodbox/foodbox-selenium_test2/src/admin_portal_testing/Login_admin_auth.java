package admin_portal_testing;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class Login_admin_auth {
	
	
  @Test
  public void LoginTest() throws InterruptedException {
    
	  System.setProperty("webdriver.gecko.driver", "C:\\Software\\selenium\\selenium\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver(); 
	  driver.manage().window().maximize(); 
	  Actions action = new Actions(driver);
	  driver.get("http://localhost:4200/login"); 

	  WebElement username= driver.findElement(By.xpath("/html/body/app-root/div/div/app-login/div/form/div/div[1]/input")); 
	  WebElement password= driver.findElement(By.xpath("/html/body/app-root/div/div/app-login/div/form/div/div[2]/input"));
	  
	  WebElement login=driver.findElement(By.xpath("//button[text()='Log in']")); 
	  
	  username.sendKeys("admin"); 
	  password.sendKeys("admin"); 
	 
	  login.click();
	  login.click();
	  String actualUrl="http://localhost:4200/login/products"; 
	  
	  String expectedUrl= driver.getCurrentUrl(); 
	 
	
  }
}