package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment01 {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		// Navigate to the login page
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		
		//Entering username and password
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
		
		//Click On Login Button
		driver.findElement(By.className("radius")).click();
		
		// Print the login message displayed
		System.out.println("Login Message: " + driver.findElement(By.id("flash")).getText());
				
		// Print the background color of the login message
		System.out.println("Background Color: " + driver.findElement(By.id("flash")).getCssValue("background-color"));
		
		//Wait for 3 seconds
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
		
		
		

	}

}
