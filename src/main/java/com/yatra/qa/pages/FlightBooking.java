package com.yatra.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.yatra.qa.base.TestBase;

public class FlightBooking extends TestBase {

//	public String dCity = "Pune";
//	public String aCity = "Chennai";
//	public String tDate = "28/08/2023";
	WebDriverWait wait = new WebDriverWait(driver, 5);

	// @FindBy(linkText = "Flights")

	@FindBy(xpath = "//a[contains(@id,'booking_engine_flights')]")
	WebElement flightTab;

	@FindBy(xpath = "//a[@title=\"One Way\"]")
	WebElement oneWay;

	@FindBy(xpath = "(//input[@id='BE_flight_origin_city'])[1]")
	WebElement origin;

	@FindBy(xpath = "//input[@id='BE_flight_origin_city']")
	WebElement origin1;

	@FindBy(xpath = "//input[@id='BE_flight_arrival_city']")
	WebElement source;

	@FindBy(xpath = "//input[@id='BE_flight_arrival_city']")
	WebElement source1;

	@FindBy(xpath = "//input[@id='BE_flight_origin_date']")
	WebElement oDate;
	//// td[@id='22/04/2024']

	@FindBy(xpath = "//div[@id=\\\"BE_flight_paxInfoBox\\\"]")
	WebElement pBox;

	@FindBy(xpath = "//input[@value='Search Flights']") //// input[@id='BE_flight_flsearch_btn'])[1]
	WebElement search;

	@FindBy(xpath = "//p[normalize-space()='Duration']")
	WebElement duration;

	@FindBy(xpath = "(//button[contains(@class,'fs-14 secondary-button button cursor-pointer bold')][normalize-space()='View Fares'])[1]")
	WebElement viewFare;

	@FindBy(xpath = "(//button[@class='ml-10 fs-12 secondary-button button cursor-pointer bold'][normalize-space()='Book'])[1]")
	WebElement book;

	@FindBy(xpath = "(//select[@id='title0'])[1]") // driver.findElement(By.id("title"))
	WebElement title;

	@FindBy(xpath = "//input[@id='additionalContactEmail']")
	WebElement email;

	@FindBy(xpath = "//input[@id='additionalContactMobile']")
	WebElement contactMobile;

	@FindBy(xpath = "//input[@id='travellerf0']")
	WebElement uFname;

	@FindBy(xpath = "//input[@id='travellerl0']")
	WebElement uLname;

	@FindBy(xpath = "//button[@class='button primary pax-proceed-btn cursor-pointer']")
	WebElement continue1;

	@FindBy(xpath = "//div[@id='traveller-dom']//button[@class='button primary rounded'][normalize-space()='Confirm']")
	WebElement confirm;

	@FindBy(xpath = "(//button[normalize-space()='Yes, Please'])[1]")
	WebElement autoSeat;

	@FindBy(xpath = "//button[@id='gtm_saveflightreview']") // (//button[normalize-space()='Proceed To Payment'])[1]
	WebElement proceed;

	@FindBy(xpath = "//input[@ng-click=\"continueWithInsurance(false)\"]")
	WebElement noInsurance;

	@FindBy(xpath = "//span[contains(text(),'Pay with UPI')]")
	WebElement upi;

	@FindBy(xpath = "//a[@id='cc'][1]") //
	WebElement ccTab;

	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[6]/div[1]/div[4]/div[1]/div[2]/div[11]/article[1]/ul[1]/li[1]/div[1]/div[1]/label[1]")
	WebElement ccNo;

	@FindBy(xpath = "//input[@id='payNow']")
	WebElement payNow;

	public FlightBooking() {
		PageFactory.initElements(driver, this);
	}

	public void oneWayFlightsrc() {
		flightTab.click();
		oneWay.click();
	}

	public void selcF1(String dCity) {
		origin.click();
//		FluentWait fwait = new FluentWait(driver);
//		fwait.withTimeout(Duration.ofSeconds(10));

		origin.sendKeys(dCity);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/section[1]/div[1]"
						+ "/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/div[1]/div[1]/ul"
						+ "[1]/div[1]/div[1]/div[1]/li[1]/div[1]/p[2]")));
		 //origin1.sendKeys(dCity);

		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]"
				+ "/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]"
				+ "/li[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/div[1]/div[1]/div[1]/li[1]/div[1]/p[2]")).click();

	}

	public void selcF2(String aCity) {
		source.click();
		source.sendKeys(aCity);

		// source1.sendKeys(aCity);
		driver.findElement(By.xpath("(//p[@class='ac_cityname'])[1]")).click();
	}

	public void selcDate(String tDate) {
		oDate.click();
		WebElement date1 = driver.findElement(By.xpath("//td[@id='29/08/2023']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		jse.executeScript("arguments[0].scrollIntoView();", date1);

		// driver.findElement(By.xpath(date1)).click();

		// oDate.sendKeys(tDate);
		date1.click();

		// pBox.click();
		search.click();

	}

	public void oneWayFlightsel() {

		duration.click();

		viewFare.click();

		book.click();

	}

	public void oneWayFlightuserD() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		email.click();
		email.sendKeys("demo@gmail.com");

		contactMobile.click();
		contactMobile.sendKeys("9870709090");

		jse.executeScript("arguments[0].scrollIntoView();", title);
		Select select = new Select(title); // driver.findElement(By.id("title"))
		select.selectByVisibleText("Mr.");

		uFname.click();
		uFname.sendKeys("Demo Demo");

		uLname.click();
		uLname.sendKeys("Demo");

		jse.executeScript("arguments[0].scrollIntoView();", continue1);
		continue1.click();

		confirm.click();

		jse.executeScript("arguments[0].click();", autoSeat);
		autoSeat.click();

		jse.executeScript("arguments[0].scrollIntoView();", proceed);
		proceed.click();

		if (noInsurance.isDisplayed()) {
			noInsurance.click();
		} else {
			System.out.println("Insurance Suggetion Not Displayed");
		}
	}

	public boolean verifyUPIpayment() {
		return upi.isDisplayed();
	}

	public boolean verifyCCpayment() {
		ccTab.click();
		return ccNo.isDisplayed();
	}

	public boolean verifyPayNow() {

		return payNow.isDisplayed();
	}
}
