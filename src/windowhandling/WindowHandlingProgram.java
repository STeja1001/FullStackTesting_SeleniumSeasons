package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandlingProgram {

	WebDriver driver;

	@BeforeMethod
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void windowHandlingProgramTest() throws InterruptedException {
		
		String mainMenuWid=driver.getWindowHandle();
//		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
//		
//		Set<String> allLinks=driver.getWindowHandles();
//		
//		for(String link:allLinks) {
//			driver.switchTo().window(link);
//			if(driver.getTitle().equals("Not Found")) {
//				break;
//			}
//		}
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shiva");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().window(mainMenuWid);
		
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		Set<String> allLinks=driver.getWindowHandles();
			
		for(String link:allLinks) {
			driver.switchTo().window(link);
			if(driver.getTitle().equals("Not Found")) {
				break;
			}
		}
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shiva");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Parent Guide')]")).click();
	
		allLinks=driver.getWindowHandles();
		for(String link:allLinks) {
		driver.switchTo().window(link);
		Thread.sleep(2000);
			if(driver.getTitle().equals("Parent guide to Google Play - Google Play Help	")) {
				break;
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(mainMenuWid);
}


	@AfterMethod
	public void driverQuit() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
