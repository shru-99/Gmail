package test_scripts;

import org.testng.annotations.Test;

import Generic_methods.Generic_BAM;
import pom_class.Logout;
import pom_class.Password;
import pom_class.Username;

public class Launch_Gmail extends Generic_BAM
{
	@Test
	public void login() throws InterruptedException
	{
		Username uns=new Username(driver);
		uns.username("dakshayini9.89@gmail.com");
		uns.nextbutton();
		Thread.sleep(3000);
		Password pw=new Password(driver);
		pw.setpassword("09111989");
		Thread.sleep(3000);
		pw.nextbutton();
		Thread.sleep(3000);
//		Logout signbtn=new Logout(driver);
//		signbtn.clkto();
//		Thread.sleep(3000);
//		signbtn.signbutton();
//		Thread.sleep(3000);
	}
}
