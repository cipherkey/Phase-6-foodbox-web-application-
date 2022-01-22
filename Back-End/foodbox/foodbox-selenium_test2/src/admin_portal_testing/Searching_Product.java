package admin_portal_testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
public class Searching_Product{
   public static void main(String[] args) {
	   System.setProperty("webdriver.gecko.driver", "C:\\Software\\selenium\\selenium\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
      //implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.get("http://localhost:4200/category");
      //identify element
      WebElement r = driver.findElement(By.xpath("/html/body/app-root/div/div/header/div/div/div/app-search/div/input"));
      r.sendKeys("Chelo ba Tahdig");
      // press ENTER
      r.sendKeys(Keys.RETURN);
      System.out.println("Search Sucessfully");
   }
}