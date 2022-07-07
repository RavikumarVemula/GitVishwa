package automation.Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public BaseClass() throws IOException
	{
		prop = new Properties();		
		FileInputStream fis = new FileInputStream("./src/test/java/automation/utility/data.properties");		
		prop.load(fis);
	}
	
	public void startApplication()
	{
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("launchURL");
	
		driver = BrowserFactory.StartApplication(driver, browser, url);
	}
	
	public void stopApplication()
	{
		BrowserFactory.CloseApplication(driver);
	}

}
