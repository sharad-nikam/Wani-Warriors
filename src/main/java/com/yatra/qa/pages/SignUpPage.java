package com.yatra.qa.pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import com.yatra.qa.base.TestBase;

public class SignUpPage extends TestBase {

	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	WebElement myacc;
	
	@FindBy(id = "signInBtn")
	WebElement loginClick;


	@FindBy(id = "login-input")
	WebElement emailid;

	@FindBy(xpath ="//button[contains(@id,'login-continue-btn')]")
	WebElement continueclick;

	@FindBy(xpath = "//input[@id='signup-mobile-number']")
	WebElement mobilenum;

	@FindBy(xpath = "//input[@id='signup-password']")
	WebElement password;
	
	@FindBy(xpath = "//select[contains(@id,'signup-user-designation')]")
	WebElement title;
	
	@FindBy(xpath = "//input[@id='signup-user-first-name']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='signup-user-last-name']")
	WebElement lastname;

	@FindBy(xpath = "//a[@class='logo']")
	WebElement yatralogo;

	@FindBy(id = "signup-form-continue-btn")
	WebElement createaccountbtn;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateSignUpTitle() {
		return driver.getTitle();

	}

	public boolean validateYatralogo() {
		return yatralogo.isDisplayed();
	}
	
}

//	public LoginPage signup() {
//		Actions s=new Actions(driver);
//		s.moveToElement(myacc).build().perform();
//		
//		loginClick.click();
//		emailid.sendKeys("harshwani599@gmail.com");
//		continueclick.click();
//		mobilenum.sendKeys("7499657175");
//		password.sendKeys("Harshad@1996");
//		Select sc=new Select(title);
//		sc.selectByVisibleText("Mr.");
//		
//		firstname.sendKeys("Harsh");
//		lastname.sendKeys("Wani");
//		createaccountbtn.click();
//		// loginBtn.click();
//		driver.navigate().back();
//		return new LoginPage();
//
//	}
	 
//}
