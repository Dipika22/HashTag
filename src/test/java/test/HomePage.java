package test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.LanuchBrowser;
import pom.Application_Form;
import pom.HeaderSection;



public class HomePage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void browser()
	{
		
		 driver = LanuchBrowser.launchbrowser();
	
	}

	@Test
	public void verifyHeaderScetion() throws InterruptedException
	{
		HeaderSection headerSection = new HeaderSection(driver);
		headerSection.clickonServices();
		headerSection.clickonShopify();
		headerSection.clickonBlog();
		headerSection.clickonCaseStudies();
		headerSection.clickonCareers();
		headerSection.clickonContactUs();
		headerSection.clickonAboutUs();
		
		headerSection.clickonLetsSpeak();
		
		Application_Form application = new Application_Form(driver);
		application.enterName("Dipika Badgujar");
		application.enterEmail("dipikabadgujar22@gmail.com");
		application.enterPhoneno("8483062042");
		application.enterNoticetime("30");
		application.enterExp("2");
		application.selectResume();
		
		Thread.sleep(30000);
		
		application.enterDescription("Hello, My name is Dipika");
		
		application.clickOnApply();
		
		String str = headerSection.get_Text();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(str == "Quality Assurance (QA) Engineer" );
		softAssert.assertAll();
		
		
	}

}
