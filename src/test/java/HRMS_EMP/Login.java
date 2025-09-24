package HRMS_EMP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver ;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	WebElement text_username;
	
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	WebElement text_password;
	
	@FindBy(xpath="//button[@class='switch-btn']")
	WebElement text_switch_to_user;
	
	@FindBy(xpath="//button[@class='login-btn']")
	WebElement text_Login_button;
	
	
	public void username(String name) 
	{
		text_username.sendKeys(name);
	}
	
	public void password(String password) 
	{
		text_password.sendKeys(password);
	}
	
	public void switchtouser() 
	{
		text_switch_to_user.click();
	}
	
	public void Loginbutton()
	{
		text_Login_button.click();
	}
	
	
	

}
