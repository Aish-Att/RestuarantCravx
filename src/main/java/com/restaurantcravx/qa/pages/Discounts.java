package com.restaurantcravx.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.restaurantcravx.qa.base.TestBase;

public class Discounts extends TestBase{

	@FindBy(xpath ="//span[normalize-space()='DISCOUNT MANANGEMENT']")
	WebElement DiscountsPageHeading;
	
	@FindBy(xpath ="//div[@class='category-btns scrollbar-cat']//button[1]")
	WebElement MembershipDiscount;
	
	@FindBy(xpath ="//button[4]")
	WebElement OneDashboard;
	
	@FindBy(xpath ="//div[@class='category-btns']//button[1]")
	WebElement ForIndividual;
	
	@FindBy(xpath ="//div[@class='user-type']//button[1]")
	WebElement IRegular;
	

	@FindBy(xpath ="//input[@id='monday']")
	WebElement IRegCheckboxM;
	
	@FindBy(xpath ="//input[@id='assuredDis0']")
	WebElement IRegAssuredDiscountM;
	
	@FindBy(xpath ="//div[@class='sc-bxivhb ikeTCJ isoLayoutContentWrapper']//div[2]//div[4]//div[1]//div[1]//span[1]//span[1]")
	WebElement IRegAddTimeSlotM;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement IRegSaveDiscounts;
	
	
	@FindBy(xpath ="//div[@class='user-type']//button[2]")
	WebElement IVip;
	
	
	@FindBy(xpath ="//input[@id='monday']")
	WebElement IVipCheckboxM;
	
	
	@FindBy(xpath ="//input[@id='assuredDis0']")
	WebElement IVipAssuredDiscountM;
	
	
	@FindBy(xpath ="//div[@class='sc-bxivhb ikeTCJ isoLayoutContentWrapper']//div[2]//div[4]//div[1]//div[1]//span[1]//span[1]")
	WebElement IVipAddTimeSlotM;
	
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement IVipSaveDiscounts;
	
	
	@FindBy(xpath ="//div[@class='category-btns']//button[2]")
	WebElement Corporate;
	
	@FindBy(xpath ="//div[@class='user-type']//button[1]")
	WebElement CRegular;
	

	@FindBy(xpath ="//input[@id='monday']")
	WebElement CRegCheckboxM;
	
	@FindBy(xpath ="//input[@id='assuredDis0']")
	WebElement CRegAssuredDiscountM;
	
	@FindBy(xpath ="//div[@class='sc-bxivhb ikeTCJ isoLayoutContentWrapper']//div[2]//div[4]//div[1]//div[1]//span[1]//span[1]")
	WebElement CRegAddTimeSlotM;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement CRegSaveDiscounts;
	
	
	@FindBy(xpath ="//div[@class='user-type']//button[2]")
	WebElement CVip;
	
	
	@FindBy(xpath ="//input[@id='monday']")
	WebElement CVipCheckboxM;
	
	
	@FindBy(xpath ="//input[@id='assuredDis0']")
	WebElement CVipAssuredDiscountM;
	
	
	@FindBy(xpath ="//div[@class='sc-bxivhb ikeTCJ isoLayoutContentWrapper']//div[2]//div[4]//div[1]//div[1]//span[1]//span[1]")
	WebElement CVipAddTimeSlotM;
	
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement CVipSaveDiscounts;
	
	//Initializing the Page Objects:
	
	public Discounts()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions:
	
	public boolean DiscountsPageHeading(){
		return DiscountsPageHeading.isDisplayed();
	}
	
	public Discounts cliclOnMembershipDiscount()
	{
		MembershipDiscount.click();
		return new Discounts();
	}
	
	public void clickOnForIndividual()
	{
		Actions action = new Actions(driver);
		action.moveToElement(ForIndividual).build().perform();
		ForIndividual.click();
	}
	
	
	
	
	
	
}
