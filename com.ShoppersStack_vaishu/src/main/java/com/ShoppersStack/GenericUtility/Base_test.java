package com.ShoppersStack.GenericUtility;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack.Pom.Home_Page;
import com.ShoppersStack.Pom.Login_Page;
import com.ShoppersStack.Pom.Welcome_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Base_test {
	public WebDriver driver;
	public static WebDriver ListnerDriver;
	public file_utility utility=new file_utility();
	public Webdriver_utility webUtility=new Webdriver_utility(); 
	public Welcome_Page welcomePage;
	public Login_Page loginPage;
	public Home_Page homePage;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest Test;
	Java_Utility javautil=new Java_Utility();

	@BeforeSuite
	public void beforesuite() {
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("BeforeTest");
		spark = new ExtentSparkReporter(FrameWorkConstants.reportPath+javautil.localDateTime()+"html");
		report = new ExtentReports();
		report.attachReporter(spark);
		Test = report.createTest("Demo");
	}
	@BeforeClass
	public void beforeclass() throws IOException {
		System.out.println("BeforeClass");
		String browser=FrameWorkConstants.chromeValue;
		String url=utility.readDataFromPropertyFile("url");
		if(browser.contains("chrome")) {
			driver=new ChromeDriver();
		}else if (browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}else if (browser.contains("edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("Enter Valid Browser");
		}
		ListnerDriver=driver;
		welcomePage=new Welcome_Page(driver);
		loginPage=new Login_Page(driver);
		homePage=new Home_Page(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
		}
	@BeforeMethod
	  public void beforeMethods() throws IOException {
		System.out.println("Before method");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("loginBtn")));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",welcomePage.getLoginBtn());
		loginPage.getEmailTB().sendKeys(utility.readDataFromPropertyFile("email"));
		loginPage.getPasswordTB().sendKeys(utility.readDataFromPropertyFile("password"));
		loginPage.getLoginBtn().click();
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		homePage.getAccountSettingsBtn().click();
		homePage.getLogoutBtn().click();

	}

	@AfterClass
	public void afterclass() throws InterruptedException {
		System.out.println("@AfterClass");
		Thread.sleep(3000);
		driver.quit();
	}
	@AfterTest
	public void aftertest() {
		System.out.println("@AfterTest");
			System.out.println("AfterSuite");
			report.flush();
			
		}
	
	@AfterSuite
	public void aftersuit() {
		System.out.println("@AfterSuit");
	}
	

}
