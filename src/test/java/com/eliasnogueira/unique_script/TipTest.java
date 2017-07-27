package com.eliasnogueira.unique_script;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.eliasnogueira.po.MainScreenPageObject;
import com.eliasnogueira.support.Utils;

import io.appium.java_client.AppiumDriver;

public class TipTest {

	private AppiumDriver<?> driver;
	
	@Before
	public void setUp() throws Exception {
		driver = Utils.returnDriver(Utils.readProperty("run.platform"));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testCalculateDefaultTip() {
		MainScreenPageObject mainScreen = new MainScreenPageObject(driver);
		
		mainScreen.fillBillAmount("100");
		mainScreen.clickCalculateTip();
		
		assertEquals("$15.00", mainScreen.getTipAmount());
		assertEquals("$115.00", mainScreen.getTotalAmount());
		
	}

}
