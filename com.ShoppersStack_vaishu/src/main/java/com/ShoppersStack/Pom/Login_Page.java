package com.ShoppersStack.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public Login_Page(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(id = "Email")
	private WebElement emailTB;
	
	@FindBy(id = "Password")
	private WebElement passwordTB;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginBtn;

	public WebElement getEmailTB() {
		return emailTB;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	
}