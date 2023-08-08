package com.yatra.qa.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yatra.qa.base.TestBase;
import com.yatra.qa.pages.BusPage;
import com.yatra.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	BusPage buspage;

	public LoginPageTest() {
		super();
	}

	@BeforeClass
	public void Setup() {
		initialization();
		loginpage = new LoginPage();

	}

//	@Test(priority = 1)
//	public void loginPageTitleTest() {
//		String title = loginpage.validateLoginTitle();
//		Assert.assertEquals(title, "Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com");
//	}
//	
//	@Test(priority=2)
//	public void loginPageLogo() {
//		boolean flag = loginpage.validateYatralogo();
//		Assert.assertTrue(flag);
//		
	//}
	
	@Test(priority=3)
	public void loginTest() throws InterruptedException {
		Thread.sleep(1000);
		buspage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
				
	}//
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
