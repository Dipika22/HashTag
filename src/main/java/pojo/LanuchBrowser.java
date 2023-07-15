package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanuchBrowser {
	
	public static WebDriver launchbrowser()
	{
		 
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions (); 
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver (option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		
		return driver;
	}

}
