package com.yatra.qa.TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yatra.qa.base.TestBase;
import com.yatra.qa.pages.HotelBooking;
import com.yatra.qa.pages.LoginPage;
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
	
	@Test
	public void hotelBookinTest()  {
		
		
		hb.hotelBooking();
		hb.hotelName("JW Marriott");
		hb.choosroom();
		//driver.navigate().refresh();
		
		hb.roomBookml("fhfhuyu@gmail.com");
		hb.roomBookph("9985864521");
		hb.fName("hghj");
		hb.lName("nbnbn");
}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
