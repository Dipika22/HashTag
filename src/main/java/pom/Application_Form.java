package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Application_Form {
	
@FindBy(xpath= "//input[@name='name']") private WebElement name;
@FindBy(xpath= "//input[@name='email']") private WebElement emailid;
@FindBy(xpath= "//input[@name='phone']") private WebElement phone;
@FindBy(xpath= "//input[@name='notice_time']") private WebElement noticeperiod;
@FindBy(xpath= "//input[@name='experience']") private WebElement exp;
@FindBy(xpath= "//input[@type='file']") private WebElement resume;
@FindBy(xpath= "//textarea[@name='description']") private WebElement intro;
@FindBy(xpath= "//button[text()='APPLY NOW']") private WebElement apply;

public Application_Form(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void enterName(String fullname)
{
	name.sendKeys(fullname);
}

public void enterEmail(String email)
{
	emailid.sendKeys(email);
}
public void enterPhoneno(String no)
{
	phone.sendKeys(no);
}
public void enterNoticetime(String time)
{
	noticeperiod.sendKeys(time);
}
public void enterExp(String experience)
{
	exp.sendKeys(experience);
}
public void selectResume()
{
	resume.click();
}
public void enterDescription(String desc)
{
	intro.sendKeys(desc);
}
public void clickOnApply()
{
	apply.click();
}
}
