package Generic_methods;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_BAM implements Framework_constants
	{
	public WebDriver driver;
	@BeforeMethod
	public void openAppln() throws InterruptedException
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.get("https://www.gmail.com");
	}
	@AfterMethod
	public void closeAppln(ITestResult res) throws IOException 
	{
		int status=res.getStatus();
//		String tcname = res.getName();
		if(status==2)
		{
			Generic_photo .getphoto(driver);
		}
		
		driver.quit();
	}

}
