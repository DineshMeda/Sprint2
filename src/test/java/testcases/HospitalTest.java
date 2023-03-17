package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pageobjects.Dashboardpage;
import pageobjects.Hospitalchargepage;
import pageobjects.Loginpage;

public class HospitalTest extends Testbase {
	
	Loginpage lp;
	Dashboardpage dp;
	Hospitalchargepage hp;
	

	public HospitalTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void LaunchBrowser() throws IOException, InterruptedException {
		
		initialization();
		lp=new Loginpage(driver);
		dp=new Dashboardpage(driver);
		hp=new Hospitalchargepage(driver);
		dp=lp.login(props.getProperty("username"), props.getProperty("password"));
		dp.setup();
		dp.clickonhospitalpage();
	}
	
	@Test
	public void charges() {
		
		hp.Charges();
	}
	
	@Test
	public void chargescategory() {
		
		hp.Chargecategory();
	}

	@Test
	public void doctoropd() throws InterruptedException {
		
		hp.Doctoropd();
		Thread.sleep(2000);
	}
	
	@Test
	public void chargestype() {
		
		hp.ChargesType();
	}
}
