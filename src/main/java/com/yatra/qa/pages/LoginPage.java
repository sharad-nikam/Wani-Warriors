package com.yatra.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 
import com.yatra.qa.base.TestBase;
import com.yatra.qa.util.TestUtil;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	WebElement myacc;
	
	@FindBy(id = "signInBtn")
	WebElement loginClick;

	@FindBy(id = "login-input")
	WebElement emailid;
	
	@FindBy(xpath = "//input[@id='login-password']")
	WebElement password;
	

	@FindBy(xpath = "//button[@id='login-submit-btn']")
	WebElement loginbtn;
	

	@FindBy(xpath = "//a[@class='logo']")
	WebElement yatralogo;
	
	@FindBy(css = "button#login-continue-btn")
	WebElement continuebtn;
	
	//
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
//	public String validateLoginTitle() {
//		return driver.getTitle();
//}
//	public boolean validateYatralogo() {
//		return yatralogo.isDisplayed();
//	}
	public BusPage login(String un, String ps)   {
		Actions s=new Actions(driver);
		s.moveToElement(myacc).build().perform();
		loginClick.click();
		emailid.sendKeys(un);
		continuebtn.click();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 
		password.sendKeys(ps);
		loginbtn.click();
		
		return new BusPage();
}
}
