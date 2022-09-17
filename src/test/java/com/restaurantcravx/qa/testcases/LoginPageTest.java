package com.restaurantcravx.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.restaurantcravx.qa.base.TestBase;
import com.restaurantcravx.qa.pages.DashboardPage;
import com.restaurantcravx.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	
	public LoginPageTest(){
		super();
	
	}
	
		@BeforeMethod
		public void setUp(){
			initialization();
			loginPage = new LoginPage();	
		}
	
	
		@Test(priority =1)
		public void loginPageTitleTest(){
			String title = loginPage.validateLoginPageTitle();
			Assert.assertEquals(title, "ChecQk | Restaurant Admin");
		}
		
		
		@Test(priority =2)
		public void loginTest(){
//			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password")) ;
		}
	
		@Test(priority =3)
		public void CheckQkLogo(){
			boolean flag = loginPage.validateCheckQkLogo();
			Assert.assertTrue(flag);
		}
	
		@AfterMethod

		public void tearDown(){
			driver.quit();
	
		}


}
