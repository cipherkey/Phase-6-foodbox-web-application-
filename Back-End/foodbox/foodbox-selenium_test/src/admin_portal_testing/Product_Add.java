package admin_portal_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Product_Add {

	public static void main(String[] args) {
		

		 System.setProperty("webdriver.gecko.driver", "C:\\Software\\selenium\\selenium\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		 driver.get("http://localhost:4200/add-product");
			driver.findElement(By.name("name")).sendKeys("Tantoori");
			driver.findElement(By.name("description")).sendKeys("It Indian Spicey Nonweage Foood");
			driver.findElement(By.name("price")).sendKeys("$34");
		
		driver.findElement(By.name("imageUrl")).sendKeys("https://image.shutterstock.com/image-photo/arabian-arabic-cuisine-grilled-tandoori-260nw-1202127400.jpg");
		  Select dropdown = new Select(driver.findElement(By.xpath("/html/body/app-root/div/div/app-add-product/div/form/div[5]/select")));  
           dropdown.selectByVisibleText("Indian");  
           driver.findElement(By.xpath("/html/body/app-root/div/div/app-add-product/div/form/div[6]/button")).click();
	}

}
