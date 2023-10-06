package com.yatra.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.yatra.qa.base.TestBase;

public class BusPage extends TestBase {

//this.actions= new Actions(driver);

	public BusPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = ("//a[contains(@id,'booking_engine_buses')]"))
	WebElement busClick;

	@FindBy(xpath = ("//input[contains(@name,'bus_leaving')]"))
	WebElement depart;

	@FindBy(xpath = ("//div[contains(@class,'smooth-banner-transition')]//li[8]//span[1]"))
	// span[contains(text(),'Pune')]
	WebElement departcity;

	// @FindBy(xpath=("//input[contains(@name,'bus_dest')]"))
	@FindBy(xpath = ("//input[contains(@name,'bus_dest')]"))
	// input[@name='bus_dest']
	WebElement to;

	// @FindBy(xpath=("(//span[normalize-space()='Mumbai'])[1]"))
	@FindBy(xpath = ("//li[contains(@class,'flex1 autoCompleteInputCode destAutoSugestField safariFix__field activeBox')]//li[2]"))

	WebElement tocity;

	@FindBy(xpath = ("//input[contains(@name,'bus_depart_date')]"))
	WebElement departdate;

	@FindBy(xpath = ("//td[@data-date='08/09/2023']"))
	WebElement searchbuses;

	@FindBy(xpath = ("//input[@id='BE_bus_search_btn']"))
	WebElement searchbusesbtn;

	@FindBy(xpath = ("(//div[contains(text(),'Select Seat')])[4]"))
	WebElement selectSet;

	@FindBy(xpath = ("//a[normalize-space()='Upper Deck']"))
	WebElement upperdeck;

	// @FindBy(xpath=("//body/div[@id='busDesktop']/div[1]/div[6]/div[867]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[5]/li[2]/i[1]"))
	@FindBy(xpath = ("//li[@snum='S13']"))
	WebElement seat;

	@FindBy(xpath = ("//*[@id=\"city\"]/div/div/div[1]/div/select"))
	WebElement bording;

	@FindBy(xpath = ("//*[@id=\"bp\"]/div/div/ul/li[3]/span[1]"))
	WebElement bordingpoint;

	@FindBy(xpath = ("//*[@id=\"city\"]/div/div/div[2]/div/select"))
	WebElement droping;

	@FindBy(xpath = ("//*[@id=\"dp\"]/div/div/ul/li[9]"))
	WebElement dropingpoint;

	@FindBy(xpath = ("//div[text()='Confirm Seats']"))
	WebElement booknow;

	@FindBy(xpath = ("(//input[@placeholder='Email Id'])[2]"))
	WebElement email;

	@FindBy(xpath = ("//input[@placeholder=\"Mobile Number\"]"))
	WebElement mobile;

	@FindBy(xpath = ("//input[@placeholder='Traveller Name']"))
	WebElement travelername;

	@FindBy(xpath = ("//select[@class='gender-wdth']"))
	WebElement gender;

	@FindBy(xpath = ("//option[@value='Male']"))
	WebElement male;

	@FindBy(xpath = ("//select[@class='age-width']"))
	WebElement age;

	@FindBy(xpath = ("//option[@value='26']"))
	WebElement age1;

	@FindBy(xpath = ("(//div[@class='v-btn__content'])[1]"))
	WebElement proceed;

	@FindBy(css = (" input#payerVA"))
	WebElement paymentAddress;

	@FindBy(css = ("input#payNow"))
	WebElement payNow;

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
		// depart.sendKeys("Pune");

		departcity.click();

		to.click();
		// to.sendKeys("Mumbai");
		tocity.click();
		departdate.click();
		searchbuses.click();
		searchbusesbtn.click();

	}

	public void seatBooking() {
		selectSet.click();
		upperdeck.click();
		seat.click();

		// bording.click();
		Select select = new Select(bording);
		// select.selectByVisibleText("Chandni Chowk , Bus Stop, Towards Mumbai Road,
		// Pune. - 12:35 AM");
		select.selectByIndex(1);
		// bordingpoint.click();
		// droping.click();
		Select select1 = new Select(droping);
		select1.selectByIndex(3);
		// select1.selectByVisibleText("Parel");

		booknow.click();

	}

	public void seatPreferences() {
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
	}

	public BusPage paymentMethod(String add) {

		paymentAddress.sendKeys(add);
		payNow.click();

		return new BusPage();

		// dropingpoint.click();

	}

}
