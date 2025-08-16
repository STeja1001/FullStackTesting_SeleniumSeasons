package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment02 {

	public static void main(String[] args) throws InterruptedException {
		
			// Launch chrome browser
			WebDriver driver=new ChromeDriver();
				
			// Navigate to the login page
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			//Click on Create new account
			driver.findElement(By.linkText("Create new account")).click();
			
			//Selecting DateOfBirth
			Select selectDate=new Select(driver.findElement(By.id("day")));
			selectDate.selectByValue("10");
			
			Select selectMonth=new Select(driver.findElement(By.id("month")));
			selectMonth.selectByVisibleText("Jan");
			
			Select selectYear=new Select(driver.findElement(By.id("year")));
			selectYear.selectByValue("1998");
			
			//Wait for 3 seconds
			Thread.sleep(3000);
			
			//close the browser
			driver.quit();
			
			

	}

}
