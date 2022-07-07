package automation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
		public static void StartApplication(WebDriver driver, String browserName, String launchURL)
		{
			if(browserName.equalsIgnoreCase("Chrome"))
			{
				System.getProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("Firefox"))
			{
				System.getProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("Edge"))
			{
				System.getProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			}
			else
				System.out.println("Broswer Not Supported");
		}
		public static void CloseApplication(WebDriver driver)
		{
			driver.quit();
		}

}
