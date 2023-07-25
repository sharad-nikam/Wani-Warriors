package com.yatra.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 
import com.yatra.qa.base.TestBase;

public class SignUp extends TestBase {
	
	
@FindBy(id="SignUpBtn")
WebElement loginClick;

@FindBy(id="login-input")
WebElement emailid;

@FindBy(id="ogin-continue-btn")
WebElement continueclick;

@FindBy(id="//input[@id='signup-mobile-number']")
WebElement mobilenum;

@FindBy(id="//input[@id='//input[@id='signup-password']")
WebElement password;

@FindBy(id="//input[@id='signup-user-first-name']")
WebElement firstname;
 

@FindBy(id="//input[@id='signup-user-last-name']")
WebElement lastname;

 

@FindBy(xpath="//a[@class='logo']")
WebElement yatralogo;


public SignUp(){
	PageFactory.initElements(driver, this);
}

public String validateSignUpTitle(){
	return driver.getTitle();
	
	}

public boolean validateCRMImage(){
	return yatralogo.isDisplayed();
}

 

}