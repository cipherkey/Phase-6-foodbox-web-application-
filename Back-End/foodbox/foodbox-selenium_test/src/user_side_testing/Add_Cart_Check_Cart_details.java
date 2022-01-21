package user_side_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Add_Cart_Check_Cart_details {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Software\\selenium\\selenium\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    
	    //  Add Cart
	    driver.get("http://localhost:4200");
        driver.findElement(By.xpath("/html/body/app-root/div/div/app-product-list/div/div/div/div[1]/div[1]/div/div[2]/button")).click();
       // check cart details
        driver.findElement(By.xpath("/html/body/app-root/div/div/header/div/div/div/app-cart-status/div/a/div")).click();

	}

}
