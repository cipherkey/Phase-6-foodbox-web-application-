package admin_portal_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Product_Edit {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Software\\selenium\\selenium\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
    //implicit wait
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

      // redirect on update product page 
         driver.get("http://localhost:4200/update/26");
         //http://localhost:4200/category/1
     	 driver.findElement(By.name("description")).sendKeys("It Indian Spicey Nonweage Foood");   

	}

}
