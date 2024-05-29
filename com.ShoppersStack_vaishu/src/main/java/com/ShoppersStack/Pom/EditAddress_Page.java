
package com.ShoppersStack.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAddress_Page {
	public EditAddress_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "Home")
	private WebElement officeBtn;
	
	@FindBy(id = "Name")
	private WebElement nameTf;
	
	@FindBy(id = "House/Office Info")
	private WebElement houseTf;
	
	@FindBy(id = "Street Info")
	private WebElement strretInfo;
	
	@FindBy(id = "Landmark")
	private WebElement landmark;
	
	@FindBy(xpath = "(//*[name()='svg'])[12]")
	private WebElement country;
	
	@FindBy(xpath = "(//div[contains(@class,'MuiPaper')])[11]/ul/li[4]")
	private WebElement selectCountry;
	
	@FindBy(xpath = "//input[@name='State']")
	private WebElement state;
	
	@FindBy(xpath = "//li[text()='Maharashtra']")
	private WebElement selectState;
	
	@FindBy(xpath = "//input[@name='City']")
	private WebElement city;
	
	@FindBy(xpath = "//li[text()='Nashik']")
	private WebElement selectCity;
	
	@FindBy(id = "Pincode")
	private WebElement pincode;
	
	@FindBy(id = "Phone Number")
	private WebElement phoneNumber;
	
	@FindBy(id = "Update Address")
	private WebElement updateAddress;

	public WebElement getOfficeBtn() {
		return officeBtn;
	}

	public WebElement getNameTf() {
		return nameTf;
	}

	public WebElement getHouseTf() {
		return houseTf;
	}

	public WebElement getStrretInfo() {
		return strretInfo;
	}

	public WebElement getLandmark() {
		return landmark;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getSelectState() {
		return selectState;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getSelectCity() {
		return selectCity;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getUpdateAddress() {
		return updateAddress;
	}
}