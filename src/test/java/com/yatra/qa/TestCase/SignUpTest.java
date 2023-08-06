package com.yatra.qa.TestCase;

 


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yatra.qa.base.TestBase;
import com.yatra.qa.pages.LoginPage;
import com.yatra.qa.pages.SignUpPage;


public class SignUpTest extends TestBase {
	SignUpPage signuppage;
	LoginPage loginpage;
	 

	@BeforeClass
	public void setUp(){
		initialization();
		signuppage = new SignUpPage();	
		loginpage= new LoginPage();
	 
}
	
	@Test(priority=1)
	public void signuppageTitleTest(){
		String title = signuppage.validateSignUpTitle();
		Assert.assertEquals(title, "Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com");	
	
	}
	@Test(priority=2)
	public void yatraLogoImageTest(){
		boolean flag = signuppage.validateYatralogo();
		Assert.assertTrue(flag);
	}
	
//	@Test(priority=3)
//	public void signupTest() {
//		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
//		loginpage=signuppage.signup();
//	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
