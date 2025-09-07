package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment03 {

	WebDriver driver;
	@BeforeMethod
	public void browserLaunch() {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void assignment03() {

		Actions action=new Actions(driver);
		WebElement mainMenu=driver.findElement(By.xpath("//span[text()='Fashion']"));
		action.moveToElement(mainMenu).pause(2000).build().perform();
		
		WebElement subMenu=mainMenu.findElement(By.xpath("//a[text()='Women Ethnic']"));
		action.moveToElement(subMenu).pause(2000).build().perform();
		
		WebElement subSubMenu=subMenu.findElement(By.xpath("//a[text()='Women Sarees']"));
		action.moveToElement(subSubMenu).pause(2000).click().build().perform();
		

		
	}
	
	@AfterMethod
	public void driverQuit() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
