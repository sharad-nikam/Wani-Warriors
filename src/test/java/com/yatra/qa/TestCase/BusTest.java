package com.yatra.qa.TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yatra.qa.base.TestBase;
import com.yatra.qa.pages.BusPage;
import com.yatra.qa.pages.LoginPage;
import com.yatra.qa.util.TestUtil;

public class BusTest extends TestBase{
	
	
	BusPage buspage;
	TestUtil testutil;

	public BusTest() {
		super();
	}

	@BeforeClass
	public void Setup() {
		initialization();
		buspage = new BusPage();

	}


	
	@Test
	public void loginTest() {
		buspage.busBooking();
		
		
	}//
	@AfterClass
	public void tearDown() {
		//driver.close();
	}

}
