package pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Testbase;

public class Bedpage extends Testbase{
	
	@FindBy(xpath="(//a[@href=\"http://kareclouds.com/admin/setup/bed/status\"])[2]")
	WebElement bedstatus;
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement search;
	
	@FindBy(xpath=" //a[@href=\"http://kareclouds.com/admin/setup/bed\"]")
	WebElement bed;
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement bedsearch;
	@FindBy(xpath="//a[@data-toggle=\"modal\"]")
	WebElement addbed;
	@FindBy(xpath="(//input[@type=\"text\"])[3]")
	WebElement name;
	@FindBy(id="bed_type")
	WebElement beddtype;
	@FindBy(id="bed_group")
	WebElement beddgroup;
	@FindBy(id="addbedbtn")
    WebElement bedsave;
	
	
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/setup/bedtype\"]")
	WebElement bedtype;
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement bedtypesearch;
	@FindBy(xpath="//a[@class=\"btn btn-primary btn-sm addbed\"]")
	WebElement bedtypeadd;
	@FindBy(id="invoice_no")
	WebElement bedtypename;
	@FindBy(id="addbedtypebtn")
	WebElement bedtypesave;
	
	
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/setup/bedgroup\"]")
	WebElement bedgroup;
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement bedgroupsearch;
	@FindBy(xpath="//a[@data-toggle=\"modal\"]")
	WebElement bedgroupadd;
	@FindBy(xpath="(//input[@class=\"form-control\"])[1]")
	WebElement bedgroupname;
	@FindBy(xpath="(//select[@class=\"form-control\"])[1]")
	WebElement bedgroupselect;
	@FindBy(xpath="(//textarea[@name=\"description\"])[1]")
	WebElement bedgroupdescription;
	@FindBy(id="addwardbtn")
	WebElement bedgroupsave;
	
	
	@FindBy(xpath="//a[@href=\"http://kareclouds.com/admin/setup/floor\"]")
	WebElement floor;
	@FindBy(xpath="//input[@placeholder=\"Search...\"]")
	WebElement floorsearch;
	@FindBy(xpath="//a[@data-target=\"#myModal\"]")
	WebElement flooradd;
	@FindBy(id="invoice_no")
	WebElement floorname;
	@FindBy(id="invoice_no")
	WebElement floordescription;
	@FindBy(id="addfloorbtn")
	WebElement floorsave;
	
	public Bedpage(WebDriver driver) throws IOException {
		super();
		Testbase.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public void Bedstatus() {
		
		bedstatus.click();
		search.click();
	}
	
	public void Bed() {
		
		bed.click();
		bedsearch.sendKeys("test");
		addbed.click();
		name.sendKeys("vvydd");
		Select sel =new Select(beddtype);
		sel.selectByIndex(1);
		//beddtype.sendKeys("standard");
		Select sele = new Select(beddgroup);
		sele.selectByIndex(2);
		//beddgroup.sendKeys("NICU-1st Floor");
		bedsave.click();
		
	}
	
	public void BedType() {
		
		bedtype.click();
		bedtypesearch.sendKeys("friend");
		bedtypeadd.click();
		bedtypename.sendKeys("vvydd");
		bedtypesave.click();
	}
	
	public void BedGroup() {
		
		bedgroup.click();
		bedgroupsearch.sendKeys("NICU");
		bedgroupname.sendKeys("vvydd");
		Select selec = new Select(bedgroupselect);
		selec.selectByIndex(3);
		bedgroupdescription.sendKeys("vdd");
		bedgroupsave.click();
	}
	
	public void Floor() {
		
		floor.click();
		floorsearch.sendKeys("Kare123@clouds.com");
		flooradd.click();
		floorname.sendKeys("vvydd");
		floordescription.sendKeys("standard");
		floorsave.click();
	}

}
