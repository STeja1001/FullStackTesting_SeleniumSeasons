package alllinkstesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllLinksTesting {
	
	WebDriver driver;
	
	@BeforeMethod
	public void browserLaunch() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void allLinksExecuteHere() {
//		WebElement mainLink=driver.findElement(By.xpath("//div[text()='Connect with Us']/parent::div"));
//		List<WebElement> links= mainLink.findElements(By.tagName("a"));
//		
//		for(WebElement link:links) {
//			System.out.println(link.getAttribute("href"));
//		}
		
		driver.findElement(By.xpath("//a[contains(text(),'Sell on')]/parent::li/following-sibling::li[3]")).click();
	}
	
	@AfterMethod
	public void driverQuit() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
