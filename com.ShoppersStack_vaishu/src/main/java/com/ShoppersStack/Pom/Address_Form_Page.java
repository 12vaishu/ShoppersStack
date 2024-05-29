

package com.ShoppersStack.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Form_Page {
	public Address_Form_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "Office")
	private WebElement officeRBtn;
	
	@FindBy(id = "Name")
	private WebElement nameTf;
	
	@FindBy(id = "House/Office Info")
	private WebElement houseTf;
	
	@FindBy(id = "Street Info")
	private WebElement streetTf;
	
	@FindBy(id = "Country")
	private WebElement country;
	
	@FindBy(id = "State")
	private WebElement state;
	
	public WebElement getOfficeRBtn() {
		return officeRBtn;
	}

	public WebElement getNameTf() {
		return nameTf;
	}

	public WebElement getHouseTf() {
		return houseTf;
	}

	public WebElement getStreetTf() {
		return streetTf;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPincodeTf() {
		return pincodeTf;
	}

	public WebElement getPhoneNumberTf() {
		return phoneNumberTf;
	}

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
	}
	@FindBy(id = "City")
	private WebElement city;
	
	@FindBy(id = "Pincode")
	private WebElement pincodeTf;
	
	@FindBy(id = "Phone Number")
	private WebElement phoneNumberTf;
	
	@FindBy(id = "addAddress")
	private WebElement addAddressBtn;
	
	@FindBy(id="Landmark")
	private WebElement Landmark;

	public WebElement getLandMarkTf() {
		
		return Landmark;
	}
}
