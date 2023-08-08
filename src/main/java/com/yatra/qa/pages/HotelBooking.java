package com.yatra.qa.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.yatra.qa.base.TestBase;
import com.yatra.qa.util.TestUtil;

public class HotelBooking extends TestBase{
	
	//WebDriver driver;
	//Actions actions;

	
	
		
//		ldriver=rdriver;
//		PageFactory.initElements(rdriver, this);
//		this.actions= new Actions(ldriver);
	public HotelBooking(){
		
		PageFactory.initElements(driver,this);
	
	}
	
	
	@FindBy(xpath="//span[text()='Hotels']")
	WebElement hotelClick;
	
	@FindBy(xpath="//input[@id='BE_hotel_destination_city']")
	WebElement city;
	
	@FindBy(xpath="//li[normalize-space()='Pune, Maharashtra, India (1757 hotels)']")
	WebElement destcity;
	
	@FindBy(xpath="//input[@id='BE_hotel_checkin_date']")
	WebElement checkindate;
	
	@FindBy(xpath="//td[@data-date='18/08/2023']")
	WebElement checkindateclick;
	
	@FindBy(xpath="//input[@id='BE_hotel_checkout_date']")
	WebElement checkoutdate;
	
	@FindBy(xpath="//td[@data-date='20/08/2023']")
	WebElement checkoutdateclick;
	
	
	
	@FindBy(xpath="//span[@class='txt-ellipses hotel_passengerBox travellerPaxBox']")
	WebElement selecttraveler;
	
	@FindBy(xpath="//span[@class='ddSpinnerMinus']")
	WebElement minusraveler;
	
	@FindBy(xpath="//input[@id='BE_hotel_htsearch_btn']")
	WebElement searchhotel;
	
	@FindBy(id="hotelFilterInput")
	WebElement hotelname;
	
	@FindBy(xpath="//i[@class='ytfi-search']")
	WebElement search;
	
	@FindBy(xpath="//a[text()='JW Marriott Hotel Pune']")
	//@FindBy(xpath="//span[@class='new-blue-button medium choose-room-button nowrap ng-binding']")
	WebElement chooseroom;
	
	//@FindBy(xpath="/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]")
	//span#choose-room-disable
	//(//span[contains(@id,'choose-room-disable')])[1]
	//(//span[text()='Choose Room'])[1]
	//WebElement chooseroombtn;
	
	
	@FindBy(xpath="//li[@id='roomWrapper292254322']//button[contains(@class,'choose-room-button')][normalize-space()='Book Now']")
	WebElement booknow;
	
	//@FindBy(xpath="//li[@id='roomWrapper292254322']//button[contains(@class,'choose-room-button')][normalize-space()='Book Now']")
	//WebElement booknow1;
	
	//@FindBy(xpath="(//button[@ng-if='!isAppFor.destranet && room.bookable'])[1]")
	//WebElement booknow;
	//button[@class='new-blue-button newBtn  choose-room-button '])[1]
	
	//@FindBy(xpath="//input[@id='additionalContactEmail']")
	@FindBy(xpath="//input[@class='form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required ng-valid-pattern']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='additionalContactMobile']")
	WebElement mobile;
	
	
	
	@FindBy(xpath="//select[@class='ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched']")
	WebElement title;
	
	@FindBy(xpath="//option[@value='Mr']")
	WebElement option;
	
	@FindBy(xpath="//input[@name='fname0']")
	WebElement fname;
	
	@FindBy(xpath="//input[@name='lname0']")
	WebElement lname;
	
	@FindBy(xpath="//textarea[@class='ng-pristine ng-untouched ng-valid ng-empty']")
	WebElement sperequest;
	
	@FindBy(xpath="//button[@class='button primary rounded contn-btn new-btn ng-binding']")
	WebElement contn;
	
	@FindBy(xpath="//input[@value='Check Availability']")
	WebElement CheckA;
	
	
	@FindBy(xpath="//a[@id='cc']")
	WebElement creditcard;
	
	@FindBy(xpath="//input[@id='cc_cno_id']")
	WebElement cardno;
	
	@FindBy(xpath="//input[@id='cc_cardholder_name_id']")
	WebElement cardname;
	
	@FindBy(xpath="//option[@value=\"05\"]")
	WebElement emonth;
	
	@FindBy(xpath="//option[@value='2024']")
	WebElement eyear;
	
	@FindBy(xpath="//input[@id='cc_cvv_id']")
	WebElement cvv;
	
	/*
	
	@FindBy(xpath="//a[@id='dc']")
	WebElement debitcard;
	
	@FindBy(xpath="//a[@id='nb']")
	WebElement netbanking;
	
	@FindBy(xpath="//a[@id='tez']")
	WebElement gpay;
	
	@FindBy(xpath="//a[@id='mw']")
	WebElement mobilewallet;
	
	
*/
	
	public void hotelBooking()  {
		
		
		hotelClick.click();
		
		city.click();
		
		city.sendKeys("Pune");
		
		destcity.click();
		
		checkindate.click();
		
		checkindateclick.click();
		
		checkoutdate.click();
		
		checkoutdateclick.click();
		
		selecttraveler.click();
		
		minusraveler.click();
		
		searchhotel.click();
		
	}
		public void hotelName(String hname) {
			hotelname.click();
			
			hotelname.sendKeys(hname);
			hotelname.sendKeys(Keys.ENTER);
			
			//search.sendKeys(Keys.ENTER);
			//chooseroom.click();
			
			//chooseroombtn.click();
			//chooseroombtn.submit();
			
			
		/*	
			*/
			
		} 
		
	
		public void choosroom() {
			chooseroom.click();
			String parentwindowhandle=driver.getWindowHandle();
			System.out.println(parentwindowhandle);

			
			Set<String> handles=driver.getWindowHandles();
			
			Iterator<String> it=handles.iterator();
			String parentwindow=it.next();
			System.out.println(parentwindow);
			
			String childwindow=it.next();
			System.out.println(childwindow);
			driver.switchTo().window(childwindow);
			
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollIntoView();", booknow);
			//js.executeScript("window.scrollBy(0,1000)","");
			 booknow.click();
			// booknow1.click();
			 
			 
			 
			 
//			 WebDriverWait wait = new WebDriverWait(driver, 10);
//			 booknow = wait.until(ExpectedCondition.elementToBeClickable());
//			 
			
		/*	for(String handle: handles) {
				System.out.println(handle);
			
				if(handle.equals(parentwindowhandle)) {
					driver.switchTo().window(handle);
					chooseroom.click();
					
					JavascriptExecutor js = (JavascriptExecutor)driver;
					 //js.executeScript("arguments[0].scrollIntoView();", booknow1);
					js.executeScript("window.scrollBy(0,1000)","");
					booknow1.click(); */
					
					}
			
			
					
		public void roomBookml(String mail) {
		/*	
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.switchTo().frame("notification-frame-173058b31");
			
			driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
			
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollIntoView();", booknow);
			 
			//js.executeScript("window.scrollBy(0,1000)","");
		
			 */
			email.click();
			email.sendKeys(mail);
			
		}
		public void roomBookph(String ph) {
			
			mobile.sendKeys(ph);
			//title.click();
			option.click();
		}
		
		
		public void fName(String fn) {
			
			//CheckA.click();
			fname.sendKeys(fn);
		}
	

		public void lName(String ln) {
			
			lname.sendKeys(ln);
			//sperequest.click();
			sperequest.sendKeys("jsajgjghgjgj");
			
			contn.click();
			
			
		}
		
		
		public void payment() {
			
			creditcard.click();
			cardno.sendKeys("854862154875");
			cardname.sendKeys("Raj Sakhare");
			emonth.click();
			eyear.click();
			cvv.sendKeys("123");
			
			
			
//			debitcard.click();
//			netbanking.click();
//			gpay.click();
//			mobilewallet.click();
			
	
			}
}

