package HRMS_EMP; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EMP_Dashboard {
	
	
	
		WebDriver driver ;
		
		public EMP_Dashboard(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		

		@FindBy(xpath="//*[@formcontrolname='workFrom']")
		WebElement text_click_workingform;
		
		//@FindBy(xpath="//*[@class='form-select ng-touched ng-dirty ng-valid']")
		//WebElement text_selectworkingformdropdown;
		
		@FindBy(xpath="//*[@formcontrolname='mode']")
		WebElement text_selectmode;
		
		//@FindBy(xpath="//select[@class='form-select ng-pristine ng-invalid ng-touched']//option")
		//WebElement  text_mode;
		
		@FindBy(xpath="//button[@class='btn btn-success']")
		WebElement btn_clock_In;
		
		@FindBy(xpath="//button[@class='btn btn-warning']")
		WebElement btn_clock_out;
		
		@FindBy(xpath="//input[@formcontrolname='date']")
		WebElement text_date;
		
		
		@FindBy(xpath="//input[@formcontrolname='reason']")
		WebElement text_reason;
		
		@FindBy(xpath="//button[@class='btn btn-primary']")
		WebElement btn_requestRegulation;
		
		public void clickworkingform() 
		{
			text_click_workingform.click();
			Select se = new Select(text_click_workingform);
			se.selectByVisibleText("REMOTE");
		}
		
		//public void selectworkingformdropdown() 
		//{
		//	Select se = new Select(text_selectworkingformdropdown);
		//	se.selectByVisibleText("REMOTE");
		//}
		
		public void selectmode() 
		{
			text_selectmode.click();
			Select se = new Select(text_selectmode);
			se.selectByVisibleText("MOBILE");
		}
		
		//public void mode()
		//{
		//	text_mode.click();
		//}
		
		public void clockin() 
		{
			btn_clock_In.click();
		}
		
		public void clockout() 
		{
			btn_clock_out.click();
		}
		
		public void date()
		{
			text_date.sendKeys("18-09");
		}
		
		
		public void reason(String reason)
		{
			text_reason.sendKeys(reason);
		}
		
		public void requestregulation()
		{
			
			text_reason.click();
		}
		
		public void requestbutton()
		{
			btn_requestRegulation.click();
		}
		
		
		
		
		
		
	}
	
	

