package com.ShoppersStack.testScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack.GenericUtility.Base_test;
import com.ShoppersStack.Pom.EditAddress_Page;
import com.ShoppersStack.Pom.My_Address_Page;
import com.ShoppersStack.Pom.My_Profile_Page;

public class check_user_is__able_to_upadateAddress_Test extends Base_test {
	@Test
	public void updateAddress() throws IOException, InterruptedException, AWTException {
		homePage.getAccountSettingsBtn().click();
		Thread.sleep(2000);
		homePage.getMyProfileBtn().click();
		
		My_Profile_Page myProfilePage=new My_Profile_Page(driver);
		Thread.sleep(2000);
		myProfilePage.getMyAddressesBtn().click();

		My_Address_Page myAddressPage=new My_Address_Page(driver);
		Thread.sleep(2000);
		myAddressPage.getUpdateAddressBtn().click();
		
		EditAddress_Page editAddress=new EditAddress_Page(driver);
		Robot rorbot=new Robot();
		
		editAddress.getNameTf().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		editAddress.getNameTf().sendKeys(utility.readDataFromExcelFile("Sheet1", 2, 0));
		Thread.sleep(2000);
		
		editAddress.getHouseTf().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		editAddress.getHouseTf().sendKeys(utility.readDataFromExcelFile("Sheet1", 2, 1));
		Thread.sleep(2000);
		
		editAddress.getStrretInfo().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		editAddress.getStrretInfo().sendKeys(utility.readDataFromExcelFile("Sheet1", 2, 2));
		Thread.sleep(2000);
		
		editAddress.getLandmark().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		editAddress.getLandmark().sendKeys(utility.readDataFromExcelFile("Sheet1", 2, 3));
		Thread.sleep(2000);
		
		editAddress.getPincode().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		editAddress.getPincode().sendKeys(utility.readDataFromExcelFile("Sheet1", 2, 4));
		Thread.sleep(2000);
	
		editAddress.getPhoneNumber().click();
		rorbot.keyPress(KeyEvent.VK_CONTROL);
		rorbot.keyPress(KeyEvent.VK_A);
		rorbot.keyRelease(KeyEvent.VK_CONTROL);
		editAddress.getPhoneNumber().sendKeys(utility.readDataFromExcelFile("Sheet1", 2, 5));
		Thread.sleep(2000);
		
		editAddress.getUpdateAddress().click();
		Thread.sleep(6000);
	}
}