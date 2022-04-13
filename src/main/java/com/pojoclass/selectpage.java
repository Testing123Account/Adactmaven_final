package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectpage {
	public static WebDriver driver;
	@FindBy(id="radiobutton_0")
	private WebElement select;
	@FindBy(id="continue")
	private WebElement conti;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getConti() {
		return conti;
	}
	
	public selectpage(WebDriver driver)
	{
	selectpage.driver=driver;
		PageFactory.initElements(driver,this);
	}
	}
