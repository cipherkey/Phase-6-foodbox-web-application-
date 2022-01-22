package user_side_testing;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class User_login {
  @Test
  public void LoginTest() throws InterruptedException {
    
	  System.setProperty("webdriver.gecko.driver", "C:\\Software\\selenium\\selenium\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
    
    driver.get("http://localhost:4200/login");
    Thread.sleep(5000);
    
    driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("vijay patil");
	driver.findElement(By.name("password")).sendKeys("vijay123");
	WebElement login=driver.findElement(By.xpath("/html/body/app-root/div/div/app-login/div/form/div/div[3]/button"));
	login.click();
	login.click();
	System.out.println("User Login");
    Thread.sleep(5000);  
    driver.quit();
  }
}
