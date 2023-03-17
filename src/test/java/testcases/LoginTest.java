package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pageobjects.Dashboardpage;
import pageobjects.Loginpage;

public class LoginTest extends Testbase {
	
	
	Loginpage lp;
	Dashboardpage dp;
	
	public LoginTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		
		initialization();
		lp=new Loginpage(driver);
		dp=new Dashboardpage(driver);
		
	}
	
	@Test
	public void Login() throws IOException {
		
		dp=lp.login(props.getProperty("username"), props.getProperty("password"));
	}
	
	@AfterMethod
	public void close() {
		
		driver.close();
	}

}
