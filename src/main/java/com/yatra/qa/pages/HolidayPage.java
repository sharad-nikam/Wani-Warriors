package com.yatra.qa.pages;
 
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.yatra.qa.base.TestBase;

public class HolidayPage extends TestBase {
	

	@FindBy(xpath="//span[text()='Holidays']")
	WebElement holidayicon;
	
	@FindBy(xpath="//input[@id='BE_holiday_leaving_city']")
	WebElement departFromDropdown;
	
	@FindBy(xpath ="//div[@class='viewport']/div/div/div[3]")
	WebElement departFromDropdown1;
	
	@FindBy(id ="holiday_destination_city")
	WebElement goingToDropdown;
	
	@FindBy(xpath = "//div[@class='viewport']/div/div/div[4]")
	WebElement goingToDropdown1;
	
	@FindBy(xpath = "//span[contains(@class,'sprite pointDwnPax holi_passengerBox')]")
	WebElement monthofTravel;
	
	@FindBy(xpath = "//div[contains(@class,'overview')]/ul/li[3]")
	WebElement monthofTravel1;
	
	@FindBy(xpath = "//input[contains(@type,'submit')]")
	WebElement searchHoliday;
	
	@FindBy(xpath = "//span[normalize-space()='Trip Duration']//i[@class='icon icon-down-open']")
	WebElement holidaymenu;
	
	@FindBy(css ="button[class='btn btn-primary']")
	WebElement filterDone;
	
	@FindBy(xpath = "//a[contains(text(),'Price')]")
	WebElement sortBy;
	
	@FindBy(linkText = "Chalo Dubai")
	WebElement flag;
	
	@FindBy(xpath = "//button[text()='Book Now']")
	WebElement bookNow;
	
	@FindBy(xpath = "//span[@class='yt-date ng-binding'][normalize-space()='11']")
	WebElement departureDateInput;
	
	@FindBy(xpath = "(//span[@class='yt-increase'])[2]")
	WebElement departureDateInput1;
	
	@FindBy(xpath= "(//button[@class='yt-sub'])[1]")
	WebElement Adult;
	
//	@FindBy(xpath = "(//span[@class='yt-price ng-binding ng-scope'])[16]")
//	WebElement room;
//	
//	@FindBy(xpath = "(//select[@ng-model='children'])[1]")
//	WebElement child1;
//	
//	@FindBy(xpath = "(//select[@ng-model='children'])[2]")
//	WebElement child2;
//	
	@FindBy(xpath="//select[@placeholder='Select State']")
    WebElement stateInput;
	
	@FindBy(css = ".yt-primary-btn.red-button")
	WebElement proceedButton;
	
	@FindBy(css = "form[id='guestForm'] span[class='box']")
	WebElement checkbox;
	
	
	@FindBy(xpath= "//input[@id='login_email']")
	WebElement email;
	
	@FindBy(xpath= "//input[@id='login_password']")
	WebElement pswd;
	
	@FindBy(xpath= "(//input[@id='userContinue'])[1]")
	WebElement proceedToBook;
	
	@FindBy(xpath= "(//i[@class='PaymentSprite pointDwnPax'])[2]")//
	WebElement title;
	
	@FindBy(xpath= "(//span[contains(@class,'ddlabel')][normalize-space()='Ms'])[1]")
	WebElement title1;
	
	@FindBy(css= "#firstNameElem_1_1")
	WebElement firstName;
	
	@FindBy(css= "#middleNameElem_1_1")
	WebElement middleName;
	
	@FindBy(css= "#lastNameElem_1_1")
	WebElement lastName;
	
			@FindBy(xpath= "(//i[@class='PaymentSprite pointDwnPax'])[3]")
			WebElement Date;
			
			@FindBy(xpath= "(//span[contains(@class,'ddlabel')][normalize-space()='09'])[1]")
			WebElement Date1;
			
			@FindBy(xpath= "(//i[contains(@class,'PaymentSprite pointDwnPax')])[4]")
			WebElement month;
			
			@FindBy(xpath= "(//span[contains(@class,'ddlabel')][normalize-space()='Jun'])[1]")
			WebElement month1;
			
			@FindBy(xpath= "(//i[contains(@class,'PaymentSprite pointDwnPax')])[5]")
			WebElement year;
			
			@FindBy(xpath= "(//span[contains(@class,'ddlabel')][normalize-space()='1998'])[1]")
			WebElement year1;
			
			@FindBy(xpath= "//input[@id='nameForGST']")
			WebElement customerName;
			
			@FindBy(xpath= "//input[@id='addressForGST']")
			WebElement address;
			
			@FindBy(xpath= "//input[@id='panForGST']")
			WebElement pan;
			
			@FindBy(xpath= "//span[@id='gotoPayment']")
			WebElement continued;
			
			@FindBy(xpath="//span[contains(text(),'Pay with UPI')]")
			WebElement upi;
			
			@FindBy(xpath="//a[@id='cc'][1]") //
			WebElement ccTab;
			
		   @FindBy(xpath="//body/div[4]/div[1]/div[1]/form[1]/div[2]/div[2]/div[6]/div[1]/div[4]/div[1]/div[2]/div[11]/article[1]/ul[1]/li[1]/div[1]/div[1]/label[1]")
			WebElement ccNo;
		
		  @FindBy(xpath="//input[@id='payNow']")
			WebElement payNow;
	
	public HolidayPage() {
		//return driver.getTitle();
		PageFactory.initElements(driver, this);
       }
	
	public void holiday() {
		holidayicon.click();
		departFromDropdown.click();
		departFromDropdown1.click();
		goingToDropdown.click();
		goingToDropdown1.click();
		monthofTravel.click();
		monthofTravel1.click();
		searchHoliday.click();
		holidaymenu.click();
		
}
	public void tripDuration() {
//	List<WebElement> checkboxes= driver.findElements(By.xpath("//div[@id='srpRoot']//li[1]//div[1]//ul[1]//li"));
//	System.out.println("Total no of checkbox: " +checkboxes.size());
//	
//	int totalcheckbox=checkboxes.size();
//	for(int i=0;i<totalcheckbox;i++)
//	{
//		
//		if(i<3)
//		{
//		checkboxes.get(i).click();
//		}
//	}
		
	filterDone.click();
	sortBy.click();
	}
	
	public void flagMenu()
	{
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)", "");
		flag.click();
		bookNow.click();
		departureDateInput.click();
		departureDateInput1.click();
		Adult.click();
//		room.click();
//		int i=0;
//        while(i<2)
//        {
//        driver.findElement(By.xpath("(//button[contains(text(),'+')])[2]")).click();
//        i++;
//        System.out.println(driver.findElement(By.xpath("(//sub[normalize-space()='(Below 12 years)'])[1]")).getText());
//        }
//        Select drop=new Select(child1);
//        drop.selectByVisibleText("7 Years");
//        Select drop1=new Select(child2);
//        drop1.selectByVisibleText("4 Years");
		
        Select drp=new Select(stateInput);
        drp.selectByVisibleText("Maharashtra");
         proceedButton.click();
//        Assert.assertEquals("37,822",driver.findElement(By.xpath("//span[@id='payTotalAmountWithoutPromo']")).getText());  
//        System.out.println("Fare Total Ammount : " + driver.findElement(By.xpath("//span[@id='payTotalAmountWithoutPromo']")).getText());
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        checkbox.click();
        email.sendKeys("harshwani599@gmail.com");
        pswd.sendKeys("Harshad@1996");
        proceedToBook.click();
        
	}
	public void passagerDetails()
	{
		title.click();
		title1.click();
		firstName.sendKeys("Namrata");
		middleName.sendKeys("R");
		lastName.sendKeys("Darekar");
		Date.click();
		Date1.click();
		month.click();
		month1.click();
		year.click();
		year1.click();
		customerName.sendKeys("Namrata Darekar");
		address.sendKeys("Pune");
		pan.sendKeys("YUGFJ2046V");
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		continued.click();
	}
	
	public boolean verifyUPIpayment(){
		return upi.isDisplayed();
	}
	
	public boolean verifyCCpayment(){
		ccTab.click();
		return ccNo.isDisplayed();
	}

	public boolean verifyPayNow(){
	
		return payNow.isDisplayed();
	}
	
	

	

	
}
