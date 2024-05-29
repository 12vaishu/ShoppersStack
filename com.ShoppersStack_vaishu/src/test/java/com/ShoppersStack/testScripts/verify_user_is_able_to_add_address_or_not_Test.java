package com.ShoppersStack.testScripts;
import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack.GenericUtility.Base_test;
import com.ShoppersStack.Pom.Address_Form_Page;
import com.ShoppersStack.Pom.My_Address_Page;
import com.ShoppersStack.Pom.My_Profile_Page;


public class verify_user_is_able_to_add_address_or_not_Test extends Base_test {
	
	@Test
	public void addAddress() throws IOException, InterruptedException {
		homePage.getAccountSettingsBtn().click();
		homePage.getMyProfileBtn().click();
		
		My_Profile_Page myProfilePage=new My_Profile_Page(driver);
		Thread.sleep(2000);
		myProfilePage.getMyAddressesBtn().click();
		Thread.sleep(2000);
		My_Address_Page myAddressPage=new My_Address_Page(driver);
		myAddressPage.getAddAddressesBtn().click();
		Thread.sleep(2000);
		
		Address_Form_Page addressForm=new Address_Form_Page(driver);
		addressForm.getOfficeRBtn().click();
		
		addressForm.getNameTf().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 0));
		addressForm.getHouseTf().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 1));
		addressForm.getStreetTf().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 2));
		addressForm.getLandMarkTf().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 3));
		
		webUtility.selectByValue(addressForm.getCountry(),utility.readDataFromPropertyFile("country"));
		webUtility.selectByValue(addressForm.getState(),utility.readDataFromPropertyFile("State"));
		webUtility.selectByValue(addressForm.getCity(),utility.readDataFromPropertyFile("city"));
		
		addressForm.getPincodeTf().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 4));
		addressForm.getPhoneNumberTf().sendKeys(utility.readDataFromExcelFile("Sheet1", 1, 5));
		Thread.sleep(2000);
		addressForm.getAddAddressBtn().click();	
		Thread.sleep(3000);
	}
		
		
		
		
		

}
