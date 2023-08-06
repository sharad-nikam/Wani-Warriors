package com.yatra.qa.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.yatra.qa.base.TestBase;
import com.yatra.qa.pages.FlightBooking;
import com.yatra.qa.pages.SignUp;
import com.yatra.qa.util.TestUtil;

public class FlightBookigTest extends TestBase {

	FlightBooking fl;
	TestUtil testUtil;
	SignUp signup;

	public FlightBookigTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {
		initialization();
		fl = new FlightBooking();
		testUtil = new TestUtil();
		TestUtil.runTimeInfo("error", "login successful");

	}

	@Test(priority = 1)
	public void flightsrc() {
		fl.oneWayFlightsrc();
		fl.selcF1(dCity);
		fl.selcF2(aCity);
		fl.selcDate(tDate);
	}

	@Test(priority = 2)
	public void flightSelec() {

		fl.oneWayFlightsel();
	}

	@Test(priority = 3)
	public void flightUserDetails() {

		fl.oneWayFlightuserD();
	}

	@Test(priority = 4)
	public void paymentPg() {

		Assert.assertTrue(fl.verifyUPIpayment(), "UPI Payment Tab missing on the page");
		Assert.assertTrue(fl.verifyCCpayment(), "CC Payment Tab missing on the page");
		Assert.assertTrue(fl.verifyPayNow(), "PayNow Button missing on the page");

	}

	@AfterTest
	public void tearDown() {

	}

}
