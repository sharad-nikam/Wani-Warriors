package com.yatra.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.yatra.qa.base.TestBase;

public class BusPage extends TestBase{

//this.actions= new Actions(driver);

	public BusPage(){
		
		PageFactory.initElements(driver,this);
	
	}
	
	
	@FindBy(xpath=("//a[@id='booking_engine_buses']"))
	WebElement busClick;
	
	@FindBy(xpath=("//input[contains(@name,'bus_leaving')]"))
			WebElement depart;
	
	//@FindBy(xpath=("(//span[normalize-space()='Pune'])[1]"))
	@FindBy(xpath=("(//li[@class='active ac_over'])[1]"))
			WebElement departcity;
	
	//@FindBy(xpath=("//input[contains(@name,'bus_dest')]"))
	@FindBy(xpath=("(//input[@name='bus_dest'])[1]"))
			WebElement to;
	
	//@FindBy(xpath=("(//span[normalize-space()='Mumbai'])[1]"))
	@FindBy(xpath=("(//li[@class='active ac_over'])[1]"))
			WebElement tocity;
	
	@FindBy(xpath=("//input[contains(@name,'bus_depart_date')]"))
			WebElement departdate;
	
	@FindBy(xpath=("//td[@data-date='18/08/2023']"))
			WebElement searchbuses;
	
	@FindBy(xpath=("//input[@id='BE_bus_search_btn']"))
	WebElement searchbusesbtn;
	
	
	
	@FindBy(xpath=("(//div[text()='Select Seat'])[4]"))
	WebElement selectSet;
	
	@FindBy(xpath=("//a[normalize-space()='Upper Deck']"))
	WebElement upperdeck;
	
	//@FindBy(xpath=("//body/div[@id='busDesktop']/div[1]/div[6]/div[867]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[5]/li[2]/i[1]"))
	@FindBy(xpath=("//li[@snum='S15']"))
	WebElement seat;
	
	@FindBy(xpath=("//*[@id=\"city\"]/div/div/div[1]/div/select"))
	WebElement bording;
	
	@FindBy(xpath=("//*[@id=\"bp\"]/div/div/ul/li[3]/span[1]"))
	WebElement bordingpoint;
	
	@FindBy(xpath=("//*[@id=\"city\"]/div/div/div[2]/div/select"))
	WebElement droping;
	
	@FindBy(xpath=("//*[@id=\"dp\"]/div/div/ul/li[9]"))
	WebElement dropingpoint;
	
	@FindBy(xpath=("//div[text()='Confirm Seats']"))
	WebElement booknow;
	
	@FindBy(xpath=("(//input[@placeholder='Email Id'])[2]"))
	WebElement email;
	
	@FindBy(xpath=("//input[@placeholder=\"Mobile Number\"]"))
	WebElement mobile;
	
	@FindBy(xpath=("//input[@placeholder='Traveller Name']"))
	WebElement travelername;
	
	@FindBy(xpath=("//select[@class='gender-wdth']"))
	WebElement gender;
	
	@FindBy(xpath=("//option[@value='Male']"))
	WebElement male;
	
	@FindBy(xpath=("//select[@class='age-width']"))
	WebElement age;
	
	@FindBy(xpath=("//option[@value='26']"))
	WebElement age1;
	
	@FindBy(xpath=("(//div[@class='v-btn__content'])[1]"))
	WebElement proceed;
	
	
	
	
	public void busBooking() {
//		depart.click();
//		depart.sendKeys(dcity);
		
//		to.click();
//		to.sendKeys(gcity);
//		date.click();
//		date.click();
//		date.click();
//		date.click();		
		
		busClick.click();
		depart.click();
		depart.sendKeys("Pune");
		
		departcity.click();
		
		
		to.click();
		to.sendKeys("Mumbai");
		tocity.click();
		departdate.click();
		searchbuses.click();
		searchbusesbtn.click();
		
		selectSet.click();
		upperdeck.click();
		seat.click();
		
		//bording.click();
		Select select= new Select(bording);
		//select.selectByVisibleText("Chandni Chowk , Bus Stop, Towards Mumbai Road, Pune. - 12:35 AM");
		select.selectByIndex(1);
		//bordingpoint.click();
		//droping.click();
		Select select1= new Select(droping);
		select1.selectByIndex(3);
		//select1.selectByVisibleText("Parel");
		
		booknow.click();
		email.click();
		email.sendKeys("waniwarriers@gmail.com");
		mobile.click();
		mobile.sendKeys("9897864546");
		
		travelername.click();
		travelername.sendKeys("Wani Warriers");
		
		gender.click();
		male.click();
		
		age.click();
		age1.click();
		proceed.click();
		
		
		
		
		
		//dropingpoint.click();
		
		
		
		
		
		
	}
	
	
}