package com.eliasnogueira.basic;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.eliasnogueira.po.MainScreenPageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class FasTipTestiOS {

	private AppiumDriver<MobileElement> driver;
	
	@Before
	public void setup() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.APP, new File("app/FasTip.app").getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone SE");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		
		driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
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
