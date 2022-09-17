package com.restaurantcravx.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.restaurantcravx.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//img[@alt='Logo']")
	WebElement CheckQkLogo;
	
	@FindBy(xpath ="//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath ="//button[@type='button']")
	WebElement ProceedBtn;
	
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	
	@FindBy(xpath ="//button[@type='button']")
	WebElement SignInBtn;
	
	@FindBy(xpath ="//span[normalize-space()='Forgot password ?']")
	WebElement ForgetPassword;
	
	//Initializing the Page Objects:
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
	
	    
		public boolean validateCheckQkLogo(){
			return CheckQkLogo.isDisplayed();
		}
		
		
		public DashboardPage login(String un, String pwd){
			username.sendKeys(un);
			ProceedBtn.click();
			password.sendKeys(pwd);;
			SignInBtn.click();
		
		return new DashboardPage();
		
  }
	}
