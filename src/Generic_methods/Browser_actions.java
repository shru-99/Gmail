package Generic_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Browser_actions
{
	Robot r;
	public Browser_actions()
	{
		
		try {
			new Robot();
		} catch (AWTException e) {
	
		}
		
	}
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void minimize()
	{
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
		
	}
	public void close()
	{
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_C);
	}
	public void resize(WebDriver driver)
	{
		Dimension d=new Dimension(200, 400);
		driver.manage().window().setSize(d);
	}
	public void drag(WebDriver driver)
	{
		Point p=new Point(300, 400);
		driver.manage().window().setPosition(p);	
	}
	public void newTab()
	{
		r.keyPress(KeyEvent.VK_T);
	}
	

}
