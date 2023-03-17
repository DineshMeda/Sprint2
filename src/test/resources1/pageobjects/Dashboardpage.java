package pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;


public class Dashboardpage extends Testbase {
	Actions action = new Actions(driver);
	
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/\"]")
	WebElement setup;
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/admin/search\"]")
	WebElement patientpage;
	@FindBy(xpath="(//i[@class='fas fa-angle-right'])[39]")
	WebElement hospitalcharges;
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/setup/bed/status\"]")
	WebElement bed;
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/visitorspurpose\"]")
	WebElement frontoffice;
	
	
	

	public Dashboardpage(WebDriver driver) throws IOException {
		super();
		Testbase.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setup() {
		
		action.moveToElement(setup).click().build().perform();
		
	}
		
		public void clickonpatientpage()  {
			
			
			action.moveToElement(patientpage).click().build().perform();
			return;
	}
		public void clickonhospitalpage() throws InterruptedException {
			
			Thread.sleep(1000);
			
			action.moveToElement(hospitalcharges).click().build().perform();
			return;
			
		}
		
		public void clickonbed() {
			
			action.moveToElement(bed).click().build().perform();
			return;
		}
		
		public void clickonfrontofficepage()  {
			
			action.moveToElement(frontoffice).click().build().perform();
			return;
		}

}
