package com.restaurantcravx.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.restaurantcravx.qa.pages.RatingAndFeedback;
import com.restaurantcravx.qa.pages.DashboardPage;
import com.restaurantcravx.qa.pages.Discounts;
import com.restaurantcravx.qa.pages.LoginPage;
import com.restaurantcravx.qa.pages.Timing;
import com.restaurantcravx.qa.pages.StaffManagementPage;
import com.restaurantcravx.qa.pages.SubAdminManagementPage;
import com.restaurantcravx.qa.pages.ProfilePage;
import com.restaurantcravx.qa.pages.PromotionalNotificationPage;
import com.restaurantcravx.qa.pages.ProductCataloguePage;
import com.restaurantcravx.qa.pages.EventNotificationPage;
import com.restaurantcravx.qa.pages.OneToOneNotificationPage;
import com.restaurantcravx.qa.pages.InfoPage;
import com.restaurantcravx.qa.pages.PhotoGalleryPage;
import com.restaurantcravx.qa.base.TestBase;
import com.restaurantcravx.qa.pages.AccessRoleManagementPage;
import com.restaurantcravx.qa.pages.AddTablePage;
import com.restaurantcravx.qa.pages.LogoutPage;
import com.restaurantcravx.qa.pages.CommunicationDetails;
import com.restaurantcravx.qa.pages.CatalogueImages;
import com.restaurantcravx.qa.pages.TableManagementPage;

public class DashboardPageTest extends TestBase {

	AccessRoleManagementPage accessrolemanagementPage;
	AddTablePage addtablePage;
	CatalogueImages catalogueimages;
	CommunicationDetails communicationdetailsPage;
	LoginPage loginPage;
	LogoutPage logoutPage;
	DashboardPage dashboardPage;
	RatingAndFeedback ratingandfeedbackPage;
	Discounts discountsPage; 
	Timing timingPage;
	StaffManagementPage staffmanagementPage;
	SubAdminManagementPage subadminmanagementPage;
	ProfilePage profilePage;
	PromotionalNotificationPage promotionalPage;
	ProductCataloguePage productcataloguePage;
	EventNotificationPage eventnotificationPage;
	OneToOneNotificationPage onetoonenotificationPage;
	InfoPage infoPage;
	PhotoGalleryPage photogalleryPage;
	TableManagementPage tablemanagementPage;
	
	
	public DashboardPageTest(){
		super();
	
	}
	
		@BeforeMethod
		public void setUp(){
			initialization();

			dashboardPage = new DashboardPage();
			loginPage = new LoginPage();
			dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password")) ;
		}
	

	
		@Test(priority =1)
		public void TopBarLogo(){
			driver.findElement(By.xpath("//input[@type='file']"));
			
		}
		
		@Test(priority =2)
		public void LogoRestName(){
			driver.findElement(By.xpath("//div[@class='logorestname']"));
		}
		
		@Test(priority =3)
		public void LogoCompanyName(){
			driver.findElement(By.xpath("//div[@class='logocompanyname']"));
		}
	
		@Test(priority =4)
		public void Welcome(){
			driver.findElement(By.xpath("//span[normalize-space()='Welcome']"));
		}
	
		@Test(priority =5)
		public void AdminName(){
			driver.findElement(By.xpath("//span[normalize-space()='Aishwarya Restaurant']"));
		}
		
		@Test(priority =6)
		public void UserTopProfile(){
			driver.findElement(By.cssSelector("img[alt='user']"));
		}
		
		@Test(priority =7)
		public void Heading(){
			driver.findElement(By.cssSelector("div[class='sc-jzJRlG IMYkJ'] h1"));
		}
		
		@Test(priority =8)
		public void ClickOnRatingAndFeedbackPage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/myFeedbackListing']")).click();
		}
		
		@Test(priority =9)
		public void ClickOnDiscountsPage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/discountInfo']")).click();
		}
		
		
		@Test(priority =10)
		public void ClickOnTimingPage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/timingInfo']")).click();
		}
		
		@Test(priority =11)
		public void ClickOnCommunicationDetailsPage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/communicationInfo']")).click();
		}
		
		@Test(priority =12)
		public void ClickOnCatalogueImagesPage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/menuInfo']")).click();
		}
		
		@Test(priority =13)
		public void ClickOnInfoPage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/outletInfo']")).click();
		}
		
		@Test(priority =14)
		public void ClickOnPhotoGalleryPage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/imagesInfo']")).click();
		}
		
		@Test(priority =15)
		public void ClickOnProductCataloguePage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/menuBuilder']")).click();
		}
		
		@Test(priority =16)
		public void ClickOnOneToOneNotificationPage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/oneOnOneListing']")).click();
		}
		
		
		@Test(priority =17)
		public void ClickOnEventNotificationPage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/eventNotification']")).click();
		}
		
		
		@Test(priority =18)
		public void ClickOnPromotionalNotificationPage(){
			driver.findElement(By.xpath("//a[@href='/Dashboard/promotionalListing']")).click();
		}
		
		@Test(priority =19)
		public void ClickOnStaffManagementPage(){
			driver.findElement(By.linkText("Staff Management")).click();
		}
		
		@Test(priority =20)
		public void ClickOnSubAdminManagementPage(){
			driver.findElement(By.linkText("Sub Admin Management")).click();
		}
		
		@Test(priority =21)
		public void ClickOnAccessRoleManagementPage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/accessRolesListing']")).click();
		}
		
		@Test(priority =22)
		public void ClickOnAddTablePage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/addtable']")).click();
		}
		
		@Test(priority =23)
		public void ClickOnTableManagementPage(){
			driver.findElement(By.cssSelector("a[href='/Dashboard/tablemanagement']")).click();
		}
		
		@AfterMethod

		public void tearDown(){
			driver.quit();
	
		}

}
