package HRMS_EMP;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HRMS_EMP.EMP_Dashboard;
import HRMS_EMP.Login;
import utility.DataDriven;



public class Testclass {
	
	
	WebDriver driver;
	DataDriven DDT = new DataDriven();

	
	@BeforeClass
	public void setupbrowser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://54.172.43.105:4200//login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
	}
	
	@Test
	public void Login_test() throws IOException 
	{
		
		Login login_page = new Login(driver);
		login_page.username(DDT.readData(1, 0));
		login_page.password(DDT.readData(1, 1));
		login_page.switchtouser();
		login_page.Loginbutton();
	}
	
	@Test
	public void empdashboard() throws IOException, InterruptedException 
	{

		EMP_Dashboard dashboard = new EMP_Dashboard(driver);
		dashboard.clickworkingform();
		Thread.sleep(1000);
		//dashboard.selectworkingformdropdown();
		dashboard.selectmode();
		//dashboard.mode();
		Thread.sleep(1000);
		
		dashboard.clockin();
		Thread.sleep(1000);
		
		dashboard.clockout();
		Thread.sleep(1000);
		
		dashboard.date();
		Thread.sleep(1000);
		
		dashboard.reason(DDT.readData(1, 4));
		Thread.sleep(1000);
		
		dashboard.requestregulation();
		Thread.sleep(1000);
		
		dashboard.requestbutton();
		
	}
	

}
