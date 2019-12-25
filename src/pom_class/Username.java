package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Username {
	@FindBy(id="identifierId")
	private WebElement untbox;
	@FindBy(xpath="//span[@class='CwaK9']")
	private WebElement nxtbtn;
	public Username(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String un)
	{
		untbox.sendKeys(un);
	}
	public void nextbutton()
	{
		nxtbtn.click();
	}

}
