package com.restaurantcravx.qa.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import com.restaurantcravx.qa.base.TestBase;

public class RatingAndFeedback extends TestBase{
	
	@FindBy(xpath = "//span[@class='page-heading']//span[contains(text(),'Feedback')]")
	WebElement RatingandFeedbackHeading;

	@FindBy(xpath = "//li[normalize-space()='Active Records']")
	WebElement ActiveRecords;
	
	@FindBy(xpath = "//li[normalize-space()='Inactive Records']")
	WebElement InactiveRecords;
	
	@FindBy(xpath = "//div[normalize-space()='Visitor visito']")
	WebElement CustomerName;
	

	@FindBy(xpath = "//span[normalize-space()='Edit Feedback Info']")
	WebElement EditFeedBackInfo;
	
	@FindBy(xpath = "//span[normalize-space()='Reset Password']")
	WebElement ResetPassword;
	
	
}
