package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pageobjects.Dashboardpage;
import pageobjects.Hospitalchargepage;
import pageobjects.Loginpage;
import pageobjects.Patient;

public class PatientTest extends Testbase {
	
	Dashboardpage dp;
	Loginpage lp;
	Patient pp;
	Hospitalchargepage hp;
	
	public PatientTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void Launchsetup() throws IOException {
		initialization();
		lp= new Loginpage(driver);
		dp= new Dashboardpage(driver);
		pp= new Patient(driver);
		dp=lp.login(props.getProperty("username"), props.getProperty("password"));
		dp.setup();
		dp.clickonpatientpage();
			
	}
	
	@Test
	public void addpatientlist() {
		
		pp.addpatient();
		
	}
	
	@Test
	public void searchbutton() {
		
		pp.search();
	}
	
	@Test
	public void disabledpatientlist() {
		
		pp.disabledpatient();
	}

}
