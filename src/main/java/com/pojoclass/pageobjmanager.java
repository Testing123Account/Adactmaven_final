package com.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageobjmanager {
	public static WebDriver driver;
	private searchpage sp;
	private Loginpage lp;
	private selectpage sl;
	private bookingpage bp;
	private Logoutpage lop;
	public  pageobjmanager(WebDriver driver2) {
		pageobjmanager.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	public Loginpage getInstalp() {
		lp=new Loginpage(driver);
		return lp;
	}
	
	
	public searchpage getInstasp() {
		sp=new searchpage(driver);
		
		return sp;
	}
	public selectpage getInstasl() {
		sl=new selectpage(driver);
		
		return sl;
	}
	public bookingpage getInstabp() {
		bp=new bookingpage(driver);
		
		return bp;
	}
	public Logoutpage getInstalop() {
		lop=new Logoutpage(driver);
		
		return lop;
	}
	
	
}
   
