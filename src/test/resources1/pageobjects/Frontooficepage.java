package pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class Frontooficepage extends Testbase{
	
	@FindBy(xpath="(//a[@href=\"http://kareclouds.com/admin/visitorspurpose\"])[2]")
	WebElement purpose;
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement search;
	@FindBy(xpath="//a[@class=\"btn btn-primary btn-sm addpurpose\"]")
	WebElement addpurpose;
	
	
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/complainttype\"]")
	WebElement complaintype;
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement searchcomplaintype;
	@FindBy(xpath="//a[@class=\"btn btn-primary btn-sm complain_type\"]")
	WebElement addcomplain;
	@FindBy(xpath="(//input[@name=\"complaint_type\"])[1]")
	WebElement complaintypename;
	@FindBy(xpath="(//textarea[@name=\"description\"])[1]")
	WebElement complaindescription;
	@FindBy(xpath="(//button[@type=\"submit\"])[3]")
	WebElement complainsave;
	
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/source\"]")
	WebElement source;
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement sourcesearch;
	@FindBy(xpath="//a[@class=\"btn btn-primary btn-sm addsource\"]")
	WebElement addsource;
	@FindBy(xpath="(//input[@name=\"source\"])[1]")
	WebElement sourcename;
	@FindBy(xpath="(//textarea[@class=\"form-control\"])[1]")
	WebElement sourcedescription;
	@FindBy(xpath="(//button[@class=\"btn btn-info pull-right\"])[1]")
	WebElement sourcesave;
	
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/appointpriority\"]")
	WebElement appointpriority;
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement priortysearch;
	@FindBy(xpath="//a[@class=\"btn btn-primary btn-sm addappointment\"]")
	WebElement addpriority;
	@FindBy(xpath="(//input[@name=\"appoint_priority\"])[1]")
	WebElement priorityname;
	@FindBy(id="formaddbtn")
	WebElement prioritysave;
	
	

	public Frontooficepage(WebDriver driver) throws IOException {
		super();
		Testbase.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	
	public void Purpose() {
		
		purpose.click();
		search.sendKeys("@");
		addpurpose.click();
	}
	
	public void Complaintype() {
		
		complaintype.click();
		searchcomplaintype.sendKeys("Hospital services");
		addcomplain.click();
		complaintypename.sendKeys("vvydd");
		complaindescription.sendKeys("network issue");
		complainsave.click();
	}
	
	public void Source() {
		
		source.click();
		sourcesearch.sendKeys("From visitors");
		addsource.click();
		sourcename.sendKeys("vvydd");
		sourcedescription.sendKeys("testing");
		sourcesave.click();
	}
	
	public void Appointmentpriority() {
		
		appointpriority.click();
		priortysearch.sendKeys("Normal");
		addpriority.click();
		priorityname.sendKeys("vvydd");
		prioritysave.click();
	}

}
