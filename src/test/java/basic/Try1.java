package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

		public class Try1 {
			
			@Test
			public void createOrganizations() {
				WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:8888");
			    driver.findElement(By.name("user_name")).sendKeys("admin");
			    driver.findElement(By.name("user_password")).sendKeys("admin");
			    WebElement btn=driver.findElement(By.id("submitButton"));
			    btn.click();
	}

}
