package admin_portal_testing;
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


public class Admin_Automation {
	
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
		  
		  username.sendKeys("admin"); 
		  password.sendKeys("admin"); 
		 
		  login.click();
		  login.click();
		  
		  String actualUrl="http://localhost:4200/products";
		  String expectedUrl= driver.getCurrentUrl();
		  if(actualUrl.equalsIgnoreCase(expectedUrl)) {
		  System.out.println("Login Successful"); }
		  driver.manage().window().maximize();
}




 @Test(priority=2) public void remove_product()
  {
	driver.get("http://localhost:4200/update");  
	WebElement add=driver.findElement(By.xpath("/html/body/app-root/div/div/app-product-list/div/div/div/div[2]/div[1]/div/div[2]/button[2]"));
	add.click();
  }

  @Test(priority=3) public void edit_item() {
	  
	 
    driver.get("http://localhost:4200/update-product/13");
  //  http://localhost:4200/update-product/13 
 
    WebElement add=driver.findElement(By.xpath("//button[text()='Update']"));
	add.click();
	
    WebElement add1=driver.findElement(By.xpath("/html/body/app-root/div/div/app-update-product/div/p/a"));

    System.out.println("product updtate Confirmed");

  }

 



}



