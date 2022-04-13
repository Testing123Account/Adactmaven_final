package adact_mavenfinal;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class adactinnew_script {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DPS\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver Ain = new ChromeDriver();
		Ain.get("https://adactinhotelapp.com/");
		Ain.manage().window().maximize();
		Ain.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Uname = Ain.findElement(By.name("username"));
		Uname.sendKeys("TestingAccount");
		WebElement pswd = Ain.findElement(By.id("password"));
		pswd.sendKeys("Password");
		WebElement Login = Ain.findElement(By.id("login"));
		Login.click();

		WebElement Loca = Ain.findElement(By.id("location"));
		Select D1 = new Select(Loca);
		D1.selectByValue("London");
		WebElement Hname = Ain.findElement(By.id("hotels"));
		Select H1 = new Select(Hname);
		H1.selectByValue("Hotel Hervey");
		WebElement Rtype = Ain.findElement(By.id("room_type"));
		Select R1 = new Select(Rtype);
		R1.selectByValue("Double");
		WebElement Rnos = Ain.findElement(By.name("room_nos"));
		Select R2 = new Select(Rnos);
		R2.selectByValue("2");
		WebElement Din = Ain.findElement(By.id("datepick_in"));

		Din.sendKeys("11/3/2022");
		WebElement Dout = Ain.findElement(By.id("datepick_out"));

		Dout.sendKeys("12/3/2022");
		WebElement ARoom1 = Ain.findElement(By.name("adult_room"));
		Select ARM = new Select(ARoom1);
		ARM.selectByValue("3");
		WebElement CRoom = Ain.findElement(By.name("child_room"));
		Select CRM = new Select(CRoom);
		CRM.selectByValue("3");
		WebElement Search = Ain.findElement(By.id("Submit"));
		Search.click();

		WebElement select1 = Ain.findElement(By.id("radiobutton_0"));
		select1.click();
		WebElement continue1 = Ain.findElement(By.name("continue"));
		continue1.click();

		WebElement Fname1 = Ain.findElement(By.name("first_name"));
		Fname1.sendKeys("Testing");
		WebElement Lname1 = Ain.findElement(By.name("last_name"));
		Lname1.sendKeys("Account");
		WebElement Addr = Ain.findElement(By.name("address"));
		Addr.sendKeys("35,Thirunavur road,Kamaraj nagar,Mogappair west");
		WebElement CCNo = Ain.findElement(By.name("cc_num"));
		CCNo.sendKeys("2376493071823415");
		WebElement CCT = Ain.findElement(By.id("cc_type"));
		Select CCType = new Select(CCT);
		CCType.selectByValue("VISA");
		WebElement EMon = Ain.findElement(By.id("cc_exp_month"));
		Select EMonth = new Select(EMon);
		EMonth.selectByValue("5");
		WebElement EYr = Ain.findElement(By.id("cc_exp_year"));
		Select EYear = new Select(EYr);
		EYear.selectByValue("2022");
		WebElement CVV = Ain.findElement(By.id("cc_cvv"));
		CVV.sendKeys("145");
		WebElement Booknow = Ain.findElement(By.name("book_now"));
		Booknow.click();
		WebElement Logout = Ain.findElement(By.name("logout"));
		Logout.click();

		TakesScreenshot Ts = (TakesScreenshot) Ain;
		File src = Ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\DPS\\eclipse-workspace\\Adactinnew\\Pictures\\Pic.png");
		FileUtils.copyFile(src, dest);
	}
}


