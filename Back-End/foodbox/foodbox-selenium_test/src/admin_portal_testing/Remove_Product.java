package admin_portal_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Remove_Product {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Software\\selenium\\selenium\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
	   // /html/body/app-root/div/div/app-product-list/div/div/div/div[2]/div[1]/div/div[2]/button[1]
	    driver.get("http://localhost:4200/category/1");
        driver.findElement(By.xpath("/html/body/app-root/div/div/app-product-list/div/div/div/div[2]/div[1]/div/div[2]/button[1]")).click();

	    
	   

	    
	} 

}
