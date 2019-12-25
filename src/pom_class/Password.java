package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password {
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwdtbox;
	@FindBy(xpath="(//span[@class='RveJvd snByac'])[1]")
	private WebElement nxbtn;
	public Password(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setpassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void nextbutton()
	{
		nxbtn.click();
	}

}
