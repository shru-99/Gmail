package Generic_methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_select {
	public void selectIndex(WebElement ele,int i)
	{
		Select s=new Select(ele);
		s.selectByIndex(i);
	}
	public void selectvalue(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	public void selectText(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	public void deselectAll(WebElement ele)
	{
		Select s=new Select(ele);
		s.deselectAll();
	}
	public void deselectIndex(WebElement ele,int i)
	{
		Select s=new Select(ele);
		s.deselectByIndex(i);
	}
	public void deselectvalue(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.deselectByValue(value);
	}
	public void deselectText(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.deselectByVisibleText(text);
	}
	public void AllSelectedOptions(WebElement ele)
	{
		Select s=new Select(ele);
		s.getAllSelectedOptions();
	}
	public void FirstSelectedOption(WebElement ele)
	{
		Select s=new Select(ele);
		s.getFirstSelectedOption();
	}
	public void Options(WebElement ele)
	{
		Select s=new Select(ele);
		s.getOptions();
	}
	public void Multiple(WebElement ele)
	{
		Select s=new Select(ele);
		s.isMultiple();
	}
}
