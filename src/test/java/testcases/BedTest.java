package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pageobjects.Bedpage;
import pageobjects.Dashboardpage;
import pageobjects.Loginpage;

public class BedTest extends Testbase{
	
	Loginpage lp;
	Dashboardpage dp;
	Bedpage bp;
	

	public BedTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		
		initialization();
		lp=new Loginpage(driver);
		dp=new Dashboardpage(driver);
		bp=new Bedpage(driver);
		dp=lp.login(props.getProperty("username"), props.getProperty("password"));
		dp.setup();
		dp.clickonbed();
		
	}
	@Test
	public void bedstatus() {
		
		bp.Bedstatus();
	}
	
	@Test(dependsOnMethods = "bedstatus")
	public void bed() {
		
		bp.Bed();
	}
	
	@Test
	public void bedtype() {
		
		bp.BedType();
	}
	@Test
	public void bedgroup() {
		
		bp.BedGroup();
	}
	@Test
	public void floor() {
		
		bp.Floor();
	}
	
	@AfterMethod
	public void close() {
		
		driver.close();
	}

}
