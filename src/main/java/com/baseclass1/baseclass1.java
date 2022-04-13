package com.baseclass1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class baseclass1 {

	public static WebDriver driver;
	public static WebDriver getbrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		
		}
	
	driver.manage().window().maximize();
	return driver;
	
	}
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public static void dropDown(WebElement E1,String type,String V) {
		Select S=new Select(E1);
		if(type.equalsIgnoreCase("VisibleText")) {
			S.selectByVisibleText(V);
		}
		else if(type.equalsIgnoreCase("ByValue")) {
			S.selectByValue(V);
		}
		else if(type.equalsIgnoreCase("ByIndex")) {
			int byIndex=Integer.parseInt(V);
			S.selectByIndex(byIndex);
		}
	}
	public static void clickButton(WebElement E1) {
		E1.click();
	}
	public static void inputText(WebElement E1,String Value) {
		E1.sendKeys(Value);
	}
	public static void getURL(String url) {
		driver.get(url);
	}
	public static void thread() throws InterruptedException {
		Thread.sleep(5000);
	}
	public static void screenshot() throws Throwable {
	TakesScreenshot Ts = (TakesScreenshot) driver;
	File src = Ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\DPS\\eclipse-workspace\\AdactinNew_PROJECT\\Pictures\\Pic.png");
	FileUtils.copyFile(src, dest);
	}
	public static void close() {
		driver.close();
	}
}