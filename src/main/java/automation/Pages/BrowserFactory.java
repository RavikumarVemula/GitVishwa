package automation.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
		public static WebDriver StartApplication(WebDriver driver, String browserName, String launchURL)
		{
			if(browserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			else if(browserName.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("Edge"))
			{
				System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			}
			else
				System.out.println("Broswer Not Supported");
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); 
			driver.manage().window().maximize();
			driver.get(launchURL); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			return driver;
		}
		public static void CloseApplication(WebDriver driver)
		{
			driver.quit();
		}

}
