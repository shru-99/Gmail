package Generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_actions {
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public void rightclick(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	public void dragdrop(WebDriver driver,WebElement ele,WebElement ele1)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(ele, ele1).perform();
	}
	

}
