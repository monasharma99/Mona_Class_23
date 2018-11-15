package bookATicket;



import java.io.File;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class BookAnAirTicket {

	
	WebDriver driver;
	String expectedValue;
	String actualValue;
	
	@Test

	public void openBrowser() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe" );	
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("monasharma");
		driver.findElement(By.name("password")).sendKeys("Password");
		driver.findElement(By.name("login")).click();
		
		WebElement Departing = driver.findElement(By.name("fromPort"));
		Select dropDown = new Select(Departing);
		dropDown.selectByVisibleText("London");
		
		
		WebElement On = driver.findElement(By.name("fromMonth"));
		new Select(On);
		dropDown.selectByVisibleText("March");
		
		
		
		WebElement on = driver.findElement(By.name("fromDay"));
		new Select(on);
		dropDown.selectByIndex(10);
	
	
	
	
	}
	
	





		public void TakeScreenshot() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("C:\\ScreenShotsfrom Seleniume"));
		
	}

	
	}
		


