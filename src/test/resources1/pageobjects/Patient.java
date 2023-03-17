package pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class Patient extends Testbase {
	
	@FindBy(id="addp")
	WebElement Addpatient;
	
	@FindBy(xpath="//input[@type=\"search\"]")
	WebElement Search;
	
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/admin/disablepatient\"]")
	WebElement Disabledpatientlist;
	
	@FindBy(id="name")
	WebElement Name;
	
	@FindBy(xpath="(//input[@type=\"text\"])[11]")
	WebElement Guardianname;
	
	@FindBy(xpath="//input[@aria-controls=\"DataTables_Table_0\"]")
	WebElement Disabledsearch;
	
	@FindBy(id="addformgender")
	WebElement dropdown;
	
	@FindBy(id="birth_date")
	WebElement bd;
	
	@FindBy(id="age_year")
	WebElement agey;
	
	@FindBy(id="age_month")
	WebElement agem;
	
	@FindBy(xpath="(//select[@name=\"blood_group\"])[2]")
	WebElement dropdown1;//blood group
	
	@FindBy(xpath="(//select[@name=\"marital_status\"])[2]")
	WebElement dropdown2;//marital status
	
	@FindBy(id="number")
	WebElement phone;
	
	@FindBy(id="addformemail")
	WebElement email;
	
	@FindBy(xpath="(//input[@name=\"address\"])[2]")
    WebElement address; 
	
	@FindBy(xpath="(//textarea[@name=\"known_allergies\"])[1]")
	WebElement allergies;
	
	@FindBy(id="formaddpabtn")
	WebElement save;
	

	public Patient(WebDriver driver) throws IOException {
		super();
		 Testbase.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	public void addpatient() {
		
		Addpatient.click();
		Name.sendKeys("send");
		Guardianname.sendKeys("null");
		dropdown.sendKeys("Male");
		dropdown1.sendKeys("AB+");
		dropdown2.sendKeys("Single");
		phone.sendKeys("11111111");
		email.sendKeys("abcde@gmail.com");
		agey.sendKeys("2022");
		agem.sendKeys("jan");
		//bd.sendKeys("28/11/2022");
	    String month= "november 2022";
	    String day= "28";
	    driver.findElement(By.id("birth_date")).click();
	    while(true) {
	    	
	    	String text =driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
	    	
	    	if(text.equals(month)) {
	    	break;
	    	}
	    	else {
	    		driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='prev'][normalize-space()='«']")).click();
	    	}
	    	driver.findElement(By.xpath("//html[1]//body[1]//div[6]//div[1]//table[1]//tbody[1]//tr//td[contains(text(),"+day+"]")).click();
	    	
	    }
		save.click();
		
		
	}
	
	public void search() {
		
		Search.click();
		Search.sendKeys("1005");
		
	}
	
	public void disabledpatient() {
		
		Disabledpatientlist.click();
		Disabledsearch.sendKeys("9123456795");
		
		
	}
	

}
