package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pageobjects.Dashboardpage;
import pageobjects.Frontooficepage;
import pageobjects.Loginpage;

public class FrontofficeTest extends Testbase {
	
	Loginpage lp;
	Dashboardpage dp;
	Frontooficepage fp;

	public FrontofficeTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		
		initialization();
		lp=new Loginpage(driver);
		dp=new Dashboardpage(driver);
		fp=new Frontooficepage(driver);
		dp=lp.login(props.getProperty("username"),props.getProperty("password"));
		dp.setup();
		dp.clickonfrontofficepage();
	}
	
	@Test
	public void purpose() {
		
		fp.Purpose();
	}
	
	@Test
	public void complaintype() {
		
		fp.Complaintype();
	}
	
	@Test
	public void source() {
		
		fp.Source();
	}
	
	@Test
	public void appointpriority() {
		
		fp.Appointmentpriority();
	}
	
	@AfterMethod
	public void close() {
		
		driver.close();
	}

}
