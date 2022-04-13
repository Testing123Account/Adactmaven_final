package com.runnerfile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass1.baseclass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\feature\\Login.feature",
							glue="com.StepDefinition",
							monochrome=true,
							dryRun=false,
							strict=true,
									plugin= {"html:Reports/Cucumber_Report",
											"pretty",
											"json:Reports/Json_Report",
											"com.cucumber.listener.ExtentCucumberFormatter:Reports/extent_cucumber.html"
}
						)

public class Runner_class {

	public static WebDriver driver;

	
	@BeforeClass
	public static void setUp() {
		driver=baseclass1.getbrowser("Chrome");
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}}
