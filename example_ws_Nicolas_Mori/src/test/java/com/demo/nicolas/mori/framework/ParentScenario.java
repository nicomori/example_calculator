package com.demo.nicolas.mori.framework;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.demo.nicolas.mori.page.object.CalculatorHomePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * This Class is created for make a helper for all the pages, and all the parts
 * of the a native app, or for execute all the drivers. And for create all the
 * objects of pages, or objects created in all the pages.
 * 
 */

public class ParentScenario {

	protected WebDriver driver;
	protected CalculatorHomePage calculatorHomePage;

	
	/**
	 * this method create the object driver for Android.
	 * 
	 * @param uuid of the device to use.
	 */
	public void startAndroid(String uuid) {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, uuid);
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.android2.calculator3");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		
		cap.setCapability("testobject_api_key", "266DE50BB1144087B603D03CE45E7C37");
		cap.setCapability("testobject_device", "LG_Nexus_5X_real");
		
		cap.setCapability("testobject_appium_version", "1.6.3");
		cap.setCapability("testobject_cache_device", "false");
		cap.setCapability("testobject_app_id", "2");
		cap.setCapability("testobject_suite_name", "Default Appium Suite");
		cap.setCapability("testobject_test_name", "Default Appium Test");
		
		

		try {
			driver = new AndroidDriver<WebElement>(new URL("http://appium.testobject.com/wd/hub"), cap);
		} catch (Exception e) {
			System.out.println("Exeption at the moment to generate the driver = " + e);
		}

		calculatorHomePage = new CalculatorHomePage(driver);
	}

}
