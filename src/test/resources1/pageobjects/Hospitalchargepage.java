package pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Testbase;

public class Hospitalchargepage extends Testbase{
	
	@FindBy(xpath="(//a[@href=\"http://kareclouds.com/admin/charges\"])[2]")
	WebElement charges;
	@FindBy(xpath="//input[@aria-controls=\"DataTables_Table_0\"]")
	WebElement chargesearch;
	@FindBy(xpath="//a[@class=\"btn btn-primary btn-sm charge\"]")
	WebElement addcharge;
	@FindBy(xpath="//select[@onchange=\"getcharge_category(this.value, 'charge_category')\"]")
	WebElement chargetype;
	@FindBy(id="charge_category")
	WebElement chargecategory;
	@FindBy(xpath="(//input[@class=\"form-control\"])[1]")
	WebElement code;
	@FindBy(id="standard_charge")
	WebElement standardcharge;
	@FindBy(xpath="(//textarea[@class=\"form-control\"])[1]")
	WebElement description;
	@FindBy(xpath="//div[@class=\"chargesborbg\"]")
	WebElement chargesfortpa;
	@FindBy(id="formaddbtn")
	WebElement save;
	
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/chargecategory/charges\"]")//charge category
	WebElement Chargecategory;
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement search;
	@FindBy(xpath="//a[@class=\"btn btn-primary btn-sm charge_category\"]")
	WebElement addchargecategory;
	@FindBy(id="type")
	WebElement name;
	@FindBy(xpath="(//textarea[@name=\"description\"])[1]")
	WebElement description1;
	@FindBy(xpath="(//select[@name=\"charge_type\"])[1]")
	WebElement chargetype1;
	@FindBy(id="formaddbtn")
	WebElement submit;
	
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/consultcharges\"]")//Doctor opd charges
	WebElement doctoropd;
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement opdsearch;
	@FindBy(xpath="//a[@onclick=\"holdModal('myModal')\"]")
	WebElement addchargeopd;
	@FindBy(xpath="(//span[@class=\"select2-selection__rendered\"])[1]")
	WebElement doctor;
	@FindBy(xpath="//td[normalize-space()='anil']")
	WebElement doctor1;
	@FindBy(xpath="(//input[@name=\"standard_charge\"])[1]")
	WebElement opdstandardcharge;
	@FindBy(xpath="//div[@class=\"chargesborbg\"]")
	WebElement opdchargesfortpa;
	@FindBy(id="formaddbtn")
	WebElement opdsave;
	
	//charge type
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/chargetype\"]")
	WebElement Chargetype;
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement chargetypesearch;
	@FindBy(xpath="//a[@data-target=\"#myModal\"]")
	WebElement addchargetype;
	@FindBy(xpath="//input[@name=\"charge_type\"]")
	WebElement Chargetype1;
	@FindBy(xpath="(//button[@class=\"btn btn-info pull-right\"])[1]")
	WebElement ctsave;
	

	public Hospitalchargepage(WebDriver driver) throws IOException {
		super();
		Testbase.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	public void Charges() {
		
		charges.click();
		chargesearch.sendKeys("Xray");
		addcharge.click();
		Select sel =new Select(Chargetype);
		sel.selectByVisibleText("Supplier");
		chargecategory.click();
		standardcharge.sendKeys("120");
		description.sendKeys("null");
		chargesfortpa.click();
		save.click();
	}
	
	public void Chargecategory() {
		
		Chargecategory.click();
		chargesearch.sendKeys("hello");
		addchargecategory.click();
		name.sendKeys("durga");
		description1.sendKeys("hello");
		Select sele =new Select(chargetype1);
		sele.selectByVisibleText("Tests");
		submit.click();

	}
	
	public void Doctoropd() throws InterruptedException {
		
		doctoropd.click();
		opdsearch.sendKeys("Sonia");
		addchargeopd.click();
		//Select select =new Select(doctor);
		//select.selectByIndex(1);
		doctor.click();
		Thread.sleep(2000);
		//doctor1.click();
        opdstandardcharge.sendKeys("121");
		opdchargesfortpa.click();
		opdsave.click();
		
	}
	
	public void ChargesType() {
		
		Chargetype.click();
		chargetypesearch.sendKeys("sac");
		addchargetype.click();
		Chargetype1.sendKeys("standard");
		ctsave.click();
	}

}
