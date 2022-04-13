package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	public static WebDriver driver;
	@FindBy(name="logout")
	private WebElement Logout;
	public WebElement getLogout() {
		return Logout;
	}
	public Logoutpage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}
}
