package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderSection {
	
	@FindBy (xpath = "(//a[@href='/services'])[1]")private WebElement services;
    @FindBy (xpath = "(//a[@href='/shopify-experts'])[1]")private WebElement shopify;
    @FindBy (xpath = "(//a[@href='/blogs'])[1]")private WebElement blog;
    @FindBy (xpath = "(//a[@href='/careers'])[1]")private WebElement careers;
    @FindBy (xpath = "(//a[@href='/casestudies'])[1]")private WebElement casestudies;
    @FindBy (xpath = "(//a[@href='/about-us'])[1]")private WebElement aboutus;
    @FindBy (xpath = "(//a[@href='/contact-us'])[1]")private WebElement contactus;
    @FindBy (xpath = "//button[@class='speak-btn btn-header-2 btn-white btn btn-outline-success my-2 my-sm-0']")private WebElement letsspeak;
    @FindBy (xpath = "//span[text()='Quality Assurance (QA) Engineer']")private WebElement text;
  
  
    
    public HeaderSection(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickonServices()
    {
    	services.click();
    }
    
    public void clickonShopify()
    {
    	shopify.click();
    }
	
    public void clickonBlog()
    {
    	blog.click();
    }
    
    public void clickonCareers()
    {
    	careers.click();
    }
    
    public void clickonCaseStudies()
    {
    	casestudies.click();
    }
    
    public void clickonAboutUs()
    {
    	aboutus.click();
    }
    
    public void clickonContactUs()
    {
    	contactus.click();
    }
    
    public void clickonLetsSpeak()
    {
    	letsspeak.click();
    }
    
    public String get_Text()
    {
    	return text.getText();
    	
    }
}
