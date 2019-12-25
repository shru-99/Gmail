package Generic_methods;

import org.openqa.selenium.WebDriver;

public class Generic_webdriver {
	public void get(WebDriver driver, String url)
	{
		driver.get(url);
	}
	public String currenturl(WebDriver driver)
	{
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		return curl;
	}

}
