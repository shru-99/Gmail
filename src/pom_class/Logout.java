package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy(xpath="//span[@class='gb_Ia gbii']")
	private WebElement logbtn;
	@FindBy(xpath="//a[@id='gb_71']")
	private WebElement sgnbtn;
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clkto()
	{
		logbtn.sendKeys();
	}
	public void signbutton()
	{
		sgnbtn.click();
	}

}
