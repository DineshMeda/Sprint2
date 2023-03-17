package testcases;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pageobjects.Dashboardpage;
import pageobjects.Loginpage;
import pageobjects.Patient;

public class DashboardTest extends Testbase {
	
	Dashboardpage dp;
	Loginpage lp;
	Patient pp;
	
	
	public DashboardTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void LaunchBrowser() throws IOException {
		
		initialization();
		lp = new Loginpage(driver);
		dp = new Dashboardpage(driver);
		dp=lp.login(props.getProperty("username"), props.getProperty("password"));
		dp.setup();
		
	}
	
	@Test(priority=1)
	
	public void Patientpage() throws IOException {
		
		
		 dp.clickonpatientpage();
		
		
	}
	@Test(priority=2)
	public void Hospital() throws InterruptedException {
		
		dp.clickonhospitalpage();
	}
	@Test(priority=3)
	public void Bed() {
		
		dp.clickonbed();
	}
	
	@Test(priority=4)
	public void Frontoffice() {
		
		dp.clickonfrontofficepage();
	}
	
	
	@AfterMethod
	
	public void close() {
		
		driver.close();
	}
	
	
	

}
