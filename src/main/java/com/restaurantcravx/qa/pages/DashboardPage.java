package com.restaurantcravx.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.restaurantcravx.qa.base.TestBase;

public class DashboardPage extends TestBase{

	
	@FindBy(xpath = "//input[@type='file']")
	WebElement TopBarLogo;
	
	@FindBy(xpath = "//div[@class='logorestname']")
	WebElement LogoRestName;
	
	@FindBy(xpath = "//div[@class='logocompanyname']")
	WebElement LogoCompanyName;
	
	@FindBy(xpath = "//span[normalize-space()='Welcome']")
	WebElement Welcome;
	
	@FindBy(xpath = "//span[normalize-space()='Aishwarya Restaurant']")
	WebElement AdminName;
	
	@FindBy(xpath = "//img[@alt='user']")
	WebElement UserTopProfile;
	
	
	@FindBy(xpath = "//a[@href='/dashboard/Profile']")
	WebElement Profile;
	
	@FindBy(xpath = "//a[@href='#']")
	WebElement Logout;
	
	@FindBy(xpath = "//h1[normalize-space()='RESTAURANT ADMIN DASHBOARD']")
	WebElement Heading;
	
	@FindBy(xpath = "//a[@href='/dashboard/myFeedbackListing']")
	WebElement RatingAndFeedback;
	
	@FindBy(xpath = "//a[@href='/dashboard/discountInfo']")
	WebElement Discounts;
	
	@FindBy(xpath = "//a[@href='/dashboard/timingInfo']")
	WebElement Timing;
	
	@FindBy(xpath = "//a[@href='/dashboard/communicationInfo']")
	WebElement CommunicationDetails;
	
	@FindBy(xpath = "//a[@href='/dashboard/menuInfo']")
	WebElement CatalogueImages;
	
	@FindBy(xpath = "//a[@href='/dashboard/outletInfo']")
	WebElement Info;
	
	@FindBy(xpath = "//a[@href='/dashboard/imagesInfo']")
	WebElement PhotoGallery;
	
	@FindBy(xpath = "//a[@href='/dashboard/menuBuilder']")
	WebElement ProductCatalogue;
	
	@FindBy(xpath = "//a[@href='/dashboard/oneOnOneListing']")
	WebElement OneToOneNotification;
	
	@FindBy(xpath = "//a[@href='/dashboard/eventNotification']")
	WebElement EventNotification;
	
	@FindBy(xpath = "//a[@href='/dashboard/promotionalListing']")
	WebElement PromotionalNotification;
	
	@FindBy(xpath = "//a[@href='/dashboard/staffListing']")
	WebElement StaffManagement;
	
	@FindBy(xpath = "//a[@href='/dashboard/subAdminListing']")
	WebElement SubAdminManagement;
	
	@FindBy(xpath = "//a[@href='/dashboard/accessRolesListing']")
	WebElement AccessRoleManagement;
	
	@FindBy(xpath = "//a[@href='/dashboard/addtable']")
	WebElement AddTable;
	
	@FindBy(xpath = "//a[@href='/dashboard/tablemanagement']")
	WebElement TableManagement;
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean TopBarLogo()
	{
		return TopBarLogo.isDisplayed();
	}
	
	public boolean LogoRestName()
	{
		return LogoRestName.isDisplayed();
	}
	
	
	public boolean LogoCompanyName()
	{
		return LogoCompanyName.isDisplayed();
	}
	
	public boolean Welcome()
	{
		return Welcome.isDisplayed();
	}
	
	public boolean AdminName()
	{
		return AdminName.isDisplayed();
	}
	
	public ProfilePage cliclOnProfileLink()
	{
		Profile.click();
		return new ProfilePage();
	}
	
	public LogoutPage cliclOnLogoutLink()
	{
		Logout.click();
		return new LogoutPage();
	}
	
	public void clickOnNewRatingAndFeedback()
	{
		Actions action = new Actions(driver);
		action.moveToElement(RatingAndFeedback).build().perform();
		RatingAndFeedback.click();
	}
	
	public void clickOnNewDiscounts()
	{
		Actions action = new Actions(driver);
		action.moveToElement(Discounts).build().perform();
		Discounts.click();
	}
	
	public void clickOnNewTiming()
	{
		Actions action = new Actions(driver);
		action.moveToElement(Timing).build().perform();
		Timing.click();
	}
	
	public void clickOnNewCommunicationDetails()
	{
		Actions action = new Actions(driver);
		action.moveToElement(CommunicationDetails).build().perform();
		CommunicationDetails.click();
	}
	
	public void clickOnNewCatalogueImages()
	{
		Actions action = new Actions(driver);
		action.moveToElement(CatalogueImages).build().perform();
		CatalogueImages.click();
	}
	
	public void clickOnNewInfo()
	{
		Actions action = new Actions(driver);
		action.moveToElement(Info).build().perform();
		Info.click();
	}
	
	public void clickOnNewPhotoGallery()
	{
		Actions action = new Actions(driver);
		action.moveToElement(PhotoGallery).build().perform();
		PhotoGallery.click();
	}
	
	public void clickOnNewOneToOneNotification()
	{
		Actions action = new Actions(driver);
		action.moveToElement(OneToOneNotification).build().perform();
		OneToOneNotification.click();
	}
	
	public void clickOnNewOneToEventNotification()
	{
		Actions action = new Actions(driver);
		action.moveToElement(EventNotification).build().perform();
		EventNotification.click();
	}
	
	public void clickOnNewPromotionalNotification()
	{
		Actions action = new Actions(driver);
		action.moveToElement(PromotionalNotification).build().perform();
		PromotionalNotification.click();
	}
	
	public void clickOnNewStaffManagement()
	{
		Actions action = new Actions(driver);
		action.moveToElement(StaffManagement).build().perform();
		StaffManagement.click();
	}
	
	public void clickOnNewSubAdminManagement()
	{
		Actions action = new Actions(driver);
		action.moveToElement(SubAdminManagement).build().perform();
		SubAdminManagement.click();
	}
	
	public void clickOnNewAccessRoleManagement()
	{
		Actions action = new Actions(driver);
		action.moveToElement(AccessRoleManagement).build().perform();
		AccessRoleManagement.click();
	}
	
	public void clickOnNewAddTable()
	{
		Actions action = new Actions(driver);
		action.moveToElement(AddTable).build().perform();
		AddTable.click();
	}
	
	public void clickOnNewTableManagement()
	{
		Actions action = new Actions(driver);
		action.moveToElement(TableManagement).build().perform();
		TableManagement.click();
	}
}
