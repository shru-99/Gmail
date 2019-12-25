package Generic_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Generic_webelement {
	public String text_element(WebElement ele)
	{
		String text = ele.getText();
		System.out.println(text);
		
		return text;
	}
	public String Attribute(WebElement ele,String a)
	{
		String title = ele.getAttribute(a);
		System.out.println(title);
		return title;
	}
	public String CSSvalue(WebElement ele,String b)
	{
		String value = ele.getCssValue(b);
		System.out.println(value);
		return value;
	}
	public Point location(WebElement ele)
	{
		Point loc = ele.getLocation();
		System.out.println(loc);
		return loc;
		
	}
	public int location1(WebElement ele)
	{
		Point loc = ele.getLocation();
		System.out.println(loc);
		int x = loc.getX();
		System.out.println(x);
		return x;
	}
	public int location2(WebElement ele)
	{
		Point loc = ele.getLocation();
		System.out.println(loc);
		int y = loc.getY();
		System.out.println(y);
		return y;
	}
	public Rectangle Rect(WebElement ele)
	{
		Rectangle rec = ele.getRect();
		System.out.println(rec);
		return rec;
	}
	public int sizeheight(WebElement ele)
	{
		int h = ele.getSize().getHeight();
		System.out.println(h);
		return h;
	}
	public int sizewidth(WebElement ele)
	{
		int w = ele.getSize().getWidth();
		System.out.println(w);
		return w;
	}
	public boolean displayed(WebElement ele)
	{
		boolean b = ele.isDisplayed();
		System.out.println(b);
		return b;
	}
	public boolean enabled(WebElement ele)
	{
		boolean en = ele.isEnabled();
		System.out.println(en);
		return en;
	}
	public boolean selected(WebElement ele)
	{
		boolean selec = ele.isSelected();
		System.out.println(selec);
		return selec;
	}
	public void sendkeys(WebElement ele,String pass)
	{
		ele.sendKeys(pass);
		
	}
}
