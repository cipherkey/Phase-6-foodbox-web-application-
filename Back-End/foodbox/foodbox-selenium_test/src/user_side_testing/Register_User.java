package user_side_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register_User {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Software\\selenium\\selenium\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost:4200/register");
		
		driver.findElement(By.name("username")).sendKeys("vijay patil ");
		driver.findElement(By.name("email")).sendKeys("vap@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Asd2020");
		driver.findElement(By.name("phone")).sendKeys("132323");
		driver.findElement(By.name("city")).sendKeys("pune");
		driver.findElement(By.name("street")).sendKeys("abc nagar ");
		driver.findElement(By.name("password")).sendKeys("Asdf@2020");
		driver.findElement(By.name("zipcode")).sendKeys("243434");
		driver.findElement(By.xpath("/html/body/app-root/div/div/app-register/div/form/div[8]/button")).click();





	}

}

