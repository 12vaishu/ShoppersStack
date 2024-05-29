package com.ShoppersStack.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Address_Page {
	public My_Address_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressesBtn;
	
	@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon MuiButton-iconSizeSmall css-u0g51i')])[1]")
	private WebElement updateAddressBtn;
	
	@FindBy(xpath = "(//span[contains(@class,'MuiButton-startIcon')])[2]")
	private WebElement deleteAddressBtn;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesBtn;

	public WebElement getYesBtn() {
		return yesBtn;
	}

	public WebElement getDeleteAddressBtn() {
		return deleteAddressBtn;
	}

	public WebElement getUpdateAddressBtn() {
		return updateAddressBtn;
	}

	public WebElement getAddAddressesBtn() {
		return addAddressesBtn;
	}
}

