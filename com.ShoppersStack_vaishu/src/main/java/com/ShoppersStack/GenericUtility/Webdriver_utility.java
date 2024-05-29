package com.ShoppersStack.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_utility {
	public void selectByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void selectByVisbleText(WebElement element, String text) {
		Select select=new Select(element);
		select.selectByValue(text);
	}
	public void selectByIndex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void deSelectByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.deselectByValue(value);
	}
	public void deSelectByVisbleText(WebElement element, String text) {
		Select select=new Select(element);
		select.deselectByVisibleText(text);
	}
	public void deSelectByIndex(WebElement element,int index) {
		Select select=new Select(element);
		select.deselectByIndex(index);
	}
	public void deSelectAll(WebElement element) {
		Select select=new Select(element);
		select.deselectAll();
	}
	
	public void actionMoveToElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	
	public void getScreenShotOfCompleteWebPage(WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dstn=new File("");
		FileHandler.copy(temp, dstn);
		
	}
	
	public void getScreenShotOfWebElement(WebElement element) throws IOException {
		File temp=element.getScreenshotAs(OutputType.FILE);
		File dstn=new File("");
		FileHandler.copy(temp, dstn);
		
	}
	

}
