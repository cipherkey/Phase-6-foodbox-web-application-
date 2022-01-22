package user_side_testing;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;


public class Place_Order {
	
	public String baseUrl = "http://localhost:4200";
	String driverPath = "C:\\Software\\selenium\\\\selenium\\geckodriver.exe";
	public WebDriver driver ;
	
  @BeforeTest
  public void launchBrowser() {

      System.out.println("Launching Firefox Browser");
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }


@Test(priority=0) public void login_Pass() {
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("http://localhost:4200/login");
		  WebElement username= driver.findElement(By.xpath("/html/body/app-root/div/div/app-login/div/form/div/div[1]/input")); 
		  WebElement password= driver.findElement(By.xpath("/html/body/app-root/div/div/app-login/div/form/div/div[2]/input"));
		  
		  WebElement login=driver.findElement(By.xpath("//button[text()='Log in']")); 
		  
		  username.sendKeys("vijay patil"); 
		  password.sendKeys("vijay123"); 
		 
		  login.click();
		  login.click();
		  
		  String actualUrl="http://localhost:4200/products";
		  String expectedUrl= driver.getCurrentUrl();
		  if(actualUrl.equalsIgnoreCase(expectedUrl)) {
		  System.out.println("Login Successful"); }
		  driver.manage().window().maximize();
}




 @Test(priority=1) public void add_cart()
  {
 
	WebElement add=driver.findElement(By.xpath("/html/body/app-root/div/div/app-product-list/div/div/div/div[2]/div[1]/div/div[2]/button"));
	add.click();
	
  }
 
 @Test(priority=2) public void check_cart_details() throws InterruptedException
 {

	WebElement add=driver.findElement(By.xpath("/html/body/app-root/div/div/header/div/div/div/app-cart-status/div/a/i"));
	add.click();
    Thread.sleep(2000);
 }
 

 
 @Test(priority=3) public void checkout()
 {

	WebElement add=driver.findElement(By.xpath("/html/body/app-root/div/div/app-cart-details/div/div/div/div/table/tr[3]/td[2]/a/button"));
	add.click();
	System.out.println("Comfirm Order");
	
  
 
 }
 
 
 
 
 
}
