package com.yatra.qa.TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yatra.qa.base.TestBase;
import com.yatra.qa.pages.HotelBooking;
import com.yatra.qa.util.TestUtil;

public class TC_01_HotelBooking extends TestBase {
	
	HotelBooking hb;
	TestUtil testutil;
	
	

	
	public TC_01_HotelBooking(){
		super();
	}

	@BeforeClass
	public void Setup() {
		initialization();
		hb = new HotelBooking();
		testutil=new TestUtil();
		
		

	}
	
	@Test(priority = 1)
	public void hotelBookinTest() {
		
		
		hb.hotelBooking();
		hb.hotelName("JW Marriott");
		
	}
	
	@Test(priority = 2)
	public void roomBooking() {
		hb.choosroom();
		//driver.navigate().refresh();
		
		
		hb.roomBookml("raj@gmail.com");
		hb.roomBookph("9985864521");
		hb.fName("Raj");
		hb.lName("Sakhare");
}
	
	
	@Test(priority = 3)
	public void paymentGatway() {
		
		hb.payment();
	}
	
	@AfterClass
	public void tearDown() {
		//driver.close();
	}
}
