package assignments;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment04BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.print("Enter the Browser name to launch: ");
		
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		
		WebDriver driver;
		
		switch (input) {
		case "chrome": {
			// Launch chrome browser
						driver=new ChromeDriver();
						break;
		}
		case "firefox": {
			// Launch firefox browser
			driver=new FirefoxDriver();
						break;
				}
		case "edge": {
			// Launch edge browser
			driver=new EdgeDriver();
						break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
		
		//Wait for 3 seconds
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		

	}

}
