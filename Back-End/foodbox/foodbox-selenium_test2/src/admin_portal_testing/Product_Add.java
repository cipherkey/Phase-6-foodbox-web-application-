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


public class Product_Add{
	
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

@Test(priority=1) public void Add_product() {
	
	//Click on Add Product Button
	 
	driver.findElement(By.xpath("/html/body/app-root/div/aside/app-product-category-menu/div/nav/ul/li[8]/button")).click(); 
     
	// To fill input Fill 
	 driver.findElement(By.name("name")).sendKeys("Chiken masala");   
 	 driver.findElement(By.name("description")).sendKeys("It Indian Spicey Nonweage Foood");   
 	 driver.findElement(By.name("price")).sendKeys("$20");   
 	 driver.findElement(By.name("imageUrl")).sendKeys("https://s1.1zoom.me/big0/499/Meat_products_Roast_483781.jpg");   
 	 
 	 
 	 // click On add button
 	 
 	 driver.findElement(By.xpath("/html/body/app-root/div/div/app-add-product/div/form/div[6]/button")).click(); 

      
	
	
	
	
	
	
	
}



}

