package adact_mavenfinal;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseclass1.baseclass1;
import com.helperfile.FileReadManager;
import com.pojoclass.pageobjmanager;

public class adactfinal extends baseclass1 {
	public static WebDriver driver=getbrowser("Chrome");
	public static pageobjmanager pom=new pageobjmanager(driver);
	
	
	public static void main(String[] args) throws IOException {
	
	getURL(FileReadManager.getInstance_FRM().getInstance_CR().getUrl());
	implicitwait();

	inputText(pom.getInstalp().getUname(),"TestingAccount");
	inputText(pom.getInstalp().getPswd(),"Password");
	clickButton(pom.getInstalp().getLog());
	
	dropDown(pom.getInstasp().getPlace(),"VisibleText","London");
	dropDown(pom.getInstasp().getHotel(),"VisibleText","Hotel Hervey");
	dropDown(pom.getInstasp(). getRtype(),"VisibleText","Double");
	dropDown(pom.getInstasp().getRnos(),"byValue","2");
	inputText(pom.getInstasp().getDin() ,"25/3/2022");
	inputText(pom.getInstasp().getDout(),"26/3/2022");
	dropDown(pom.getInstasp().getARoom1(),"byValue","3");
	dropDown(pom.getInstasp().getCRoom(),"byIndex","3");
	clickButton(pom.getInstasp().getSearch());
	
	clickButton( pom.getInstasl().getSelect());
	clickButton(pom.getInstasl().getConti());
	
	
	inputText(pom.getInstabp().getFname(),"Andrew");
	inputText(pom.getInstabp().getLname(),"Desouza");
	inputText(pom.getInstabp().getAddr(),"35,Harrington road,Toronto");
	inputText(pom.getInstabp().getCCN(),"2376493071823415");
	dropDown(pom.getInstabp().getCCT(),"ByValue","VISA");
	dropDown(pom.getInstabp().getEmon(),"VisibleText","May");
	dropDown(pom.getInstabp().getEyear(),"ByValue","2022");
	inputText(pom.getInstabp().getCCV(),"145");
	clickButton(pom.getInstabp().getBooknow());
	
	//thread();
	//screenshot();
	clickButton(pom.getInstalop().getLogout());
	close();
}

}
