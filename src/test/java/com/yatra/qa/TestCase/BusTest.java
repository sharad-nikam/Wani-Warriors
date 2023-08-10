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


	
	@Test(priority=1)
	public void bookBusTicket() {
		buspage.busBooking();
		
		
	}//
	
	@Test(priority=2)
	public void bookBusSeat() {
		buspage.seatBooking();
	}
	
	@Test(priority=3)
	public void bookBusSeatPreferences() {
		buspage.seatPreferences();
	}
	
	@Test(priority=4)
	public void bookPaymentMethod() {
		//buspage.paymentMethod(vAddress);
		
		buspage = buspage.paymentMethod(prop.getProperty("vAddress"));
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
