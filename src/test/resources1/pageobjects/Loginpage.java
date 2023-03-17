package pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class Loginpage extends Testbase {


	@FindBy(id="email")
	private WebElement user;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(className="btn")
	private WebElement submit;
	
	
	public Loginpage(WebDriver driver) throws IOException {
		super();
		Testbase.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Dashboardpage login(String un,String pwd) throws IOException {
		
		user.sendKeys(un);
		password.sendKeys(pwd);
		submit.click();
		return new Dashboardpage(driver);
		
		
	}

	public static void main(String[] args) {

	}

}
