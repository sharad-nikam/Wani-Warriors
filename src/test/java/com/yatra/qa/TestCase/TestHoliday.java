package com.yatra.qa.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.yatra.qa.base.TestBase;
import com.yatra.qa.pages.HolidayPage;
import com.yatra.qa.util.TestUtil;

public class TestHoliday extends TestBase{
	HolidayPage hp;
	TestUtil testUtil;
	public TestHoliday()
	{
		super();
	}
	@BeforeClass
	public void setup() throws InterruptedException
	{
	  initialization();	
	  hp= new HolidayPage();
	  testUtil=new TestUtil();
	}
	@Test
	public void holidayinit()
	{
	hp.holiday();
	hp.tripDuration();
	hp.flagMenu();
	hp.passagerDetails();
	//hp.selectdropdown(child1,"7 Years");
	}
	@Test
	public void paymentPg() {

		Assert.assertTrue(hp.verifyUPIpayment(), "UPI Payment Tab missing on the page");
		Assert.assertTrue(hp.verifyCCpayment(), "CC Payment Tab missing on the page");
		Assert.assertTrue(hp.verifyPayNow(), "PayNow Button missing on the page");

	}
	
}
