package com.StepDefinition;
import org.openqa.selenium.WebDriver;

import com.baseclass1.baseclass1;
import com.helperfile.FileReadManager;
import com.pojoclass.pageobjmanager;
import com.runnerfile.Runner_class;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_DefinitionAdactin extends baseclass1{
	public static WebDriver driver=Runner_class.driver;
	public static pageobjmanager pom=new pageobjmanager(driver);
	private String status;
	
	
	@Before
	public void beforeHook(Scenario s) {
	String name=s.getName();
	System.out.println("Before Hooks: "+name);
	}
	
	@After
	public void afterHook(Scenario s) {
		status=s.getStatus();
		System.out.println("After Hooks:"+status);
	}

	@Given("^user is launching the browser$")
	public void user_is_launching_the_browser() throws Throwable {
		getURL(FileReadManager.getInstance_FRM().getInstance_CR().getUrl());
	}

	@When("^user is entering the \"([^\"]*)\" in the username field$")
	public void user_is_entering_the_in_the_username_field(String username) throws Throwable {
		inputText(pom.getInstalp().getUname(),username); 
	}

	@When("^user is entering the \"([^\"]*)\" in the password field$")
	public void user_is_entering_the_in_the_password_field(String pass) throws Throwable {
		inputText(pom.getInstalp().getPswd(),pass);
	}

	@Then("^the user click the login button$")
	public void the_user_click_the_login_button() throws Throwable {
		clickButton(pom.getInstalp().getLog());
	}

	@Given("^The user is directed to search hotel page$")
	public void the_user_is_directed_to_search_hotel_page() throws Throwable {
		
	}
	@When("^the user is selecting the location from the location dropdown menu$")
	public void the_user_is_selecting_the_location_from_the_location_dropdown_menu() throws Throwable {
		dropDown(pom.getInstasp().getPlace(),"VisibleText","London");
	
	}
	@And("^the user is selecting the  hotel from the hotel dropdown menu$")
	public void the_user_is_selecting_the_hotel_from_the_hotel_dropdown_menu() throws Throwable {
		dropDown(pom.getInstasp().getHotel(),"VisibleText","Hotel Hervey");
	}

	

	@And("^the user is selecting the type of the room from the roomtype dropdown menu$")
	public void the_user_is_selecting_the_type_of_the_room_from_the_roomtype_dropdown_menu() throws Throwable {
		dropDown(pom.getInstasp(). getRtype(),"VisibleText","Double");
	}

	@And("^the user is selecting the number of rooms from the number of rooms dropdown menu$")
	public void the_user_is_selecting_the_number_of_rooms_from_the_number_of_rooms_dropdown_menu() throws Throwable {
		dropDown(pom.getInstasp().getRnos(),"byValue","2");
	}
	@And("^the user is entering the CheckInDate in the Checkin Date field$")
	public void the_user_is_entering_the_CheckInDate_in_the_Checkin_Date_field() throws Throwable {
		inputText(pom.getInstasp().getDin() ,"25/3/2022");
	}

	@And("^the user is entering the CheckOutDate in the CheckOutDate field$")
	public void the_user_is_entering_the_CheckOutDate_in_the_CheckOutDate_field() throws Throwable {
		inputText(pom.getInstasp().getDout(),"26/3/2022");
	}

	

	@And("^the user is choosing the adult counting from the Adultperroom dropdown menu$")
	public void the_user_is_choosing_the_adult_counting_from_the_Adultperroom_dropdown_menu() throws Throwable {
		dropDown(pom.getInstasp().getARoom1(),"byValue","3");
	}

	@And("^the user is choosing the  Children counting from the Childrenperroom dropdown menu$")
	public void the_user_is_choosing_the_Children_counting_from_the_Childrenperroom_dropdown_menu() throws Throwable {
		dropDown(pom.getInstasp().getCRoom(),"byIndex","3");
		
	}

	@Then("^the user is clicking the search button$")
	public void the_user_is_clicking_the_search_button() throws Throwable {
clickButton(pom.getInstasp().getSearch());
		
		
	}

	@Given("^The user is directed to the select hotel page$")
	public void the_user_is_directed_to_the_select_hotel_page() throws Throwable {
		
		
	
	}

	@When("^the user is clicking the radio button of select hotel$")
	public void the_user_is_clicking_the_radio_button_of_select_hotel() throws Throwable {
	clickButton( pom.getInstasl().getSelect());
		
		
	}

	@Then("^the user is clicking the continue button$")
	public void the_user_is_clicking_the_continue_button() throws Throwable {
		clickButton(pom.getInstasl().getConti());
		
	}

	@Given("^the user is directed to the book a hotel page$")
	public void the_user_is_directed_to_the_book_a_hotel_page() throws Throwable {
		
	}
	@When("^the user is entering the Firstname of the user in the firstname field$")
	public void the_user_is_entering_the_Firstname_of_the_user_in_the_firstname_field() throws Throwable {
		inputText(pom.getInstabp().getFname(),"Andrew");
	}
	@And("^the user is entering the Lastname  of the user in the Lastname field$")
	public void the_user_is_entering_the_Lastname_of_the_user_in_the_Lastname_field() throws Throwable {
		inputText(pom.getInstabp().getLname(),"Desouza");
	}

	@And("^the user is enetring the BillingAddress in the Billing Address field$")
	public void the_user_is_enetring_the_BillingAddress_in_the_Billing_Address_field() throws Throwable {
		inputText(pom.getInstabp().getAddr(),"35,Harrington road,Toronto");

	}

	@And("^the user is entering  the Credit card no of the user in the field$")
	public void the_user_is_entering_the_Credit_card_no_of_the_user_in_the_field() throws Throwable {
		dropDown(pom.getInstabp().getCCT(),"ByValue","VISA");
	}

	

	

	@And("^the user is entering  the \"([^\"]*)\" of the user in the field$")
	public void the_user_is_entering_the_of_the_user_in_the_field(String arg1) throws Throwable {
		inputText(pom.getInstabp().getCCN(),"2376493071823415");
		
	}

	@And("^the user is choosing the \"([^\"]*)\"and the \"([^\"]*)\" of the expiry date from the dropdown menu$")
	public void the_user_is_choosing_the_and_the_of_the_expiry_date_from_the_dropdown_menu(String arg1, String arg2) throws Throwable {
		dropDown(pom.getInstabp().getEmon(),"VisibleText","May");
		dropDown(pom.getInstabp().getEyear(),"ByValue","2022");
		
		
		
		
	}
	@And("^the user is entering teh \"([^\"]*)\" in the required field$")
	public void the_user_is_entering_teh_in_the_required_field(String arg1) throws Throwable {
		inputText(pom.getInstabp().getCCV(),"145");
	}

	

	@Then("^the user is clicking the Booknow button$")
	public void the_user_is_clicking_the_Booknow_button() throws Throwable {
		clickButton(pom.getInstabp().getBooknow());
		
		
		close();
	}


	}


