package com.ShoppersStack.testScripts;

import org.testng.annotations.Test;

import com.ShoppersStack.GenericUtility.Base_test;
import com.ShoppersStack.Pom.My_Address_Page;
import com.ShoppersStack.Pom.My_Profile_Page;

public class verify_user_is_able_delete_address_or_not_Test extends Base_test{
	@Test
	public void deleteAddress() throws InterruptedException {
		homePage.getAccountSettingsBtn().click();
		homePage.getMyProfileBtn().click();
		
		My_Profile_Page myProfilePage=new My_Profile_Page(driver);
		myProfilePage.getMyAddressesBtn().click();
		
		My_Address_Page myAddressPage=new My_Address_Page(driver);
		myAddressPage.getDeleteAddressBtn().click();
		Thread.sleep(2000);
		myAddressPage.getYesBtn().click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
}