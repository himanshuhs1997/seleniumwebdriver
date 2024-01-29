package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Searchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// search page of eroomrent 
		
	/*	
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eroomrent.in/index.php");
		WebElement element = driver.findElement(By.id("cat"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Flat");
		WebElement element1 = driver.findElement(By.id("subcat"));
		Select dropdown1 = new Select(element1);
		dropdown1.selectByVisibleText("1 BHK");
		WebElement element2 = driver.findElement(By.id("location"));
		Select dropdown2 = new Select(element2);
		dropdown2.selectByVisibleText("Saket Square");
		driver.findElement(By.className("btn-one")).click();
	*/	
		
//========================================================================
		
	/*	
		// shortcut of search page of eroomrent
		
		Select dd = new Select(driver.findElement(By.id("cat")));
		dd.selectByIndex(1);
		Select dd1= new Select(driver.findElement(By.id("subcat")));
		dd1.selectByIndex(1);
		Select dd2 = new Select(driver.findElement(By.id("location")));
		dd2.selectByIndex(5);
		driver.findElement(By.className("btn-one")).click();
	*/	
	
//==========================================================================
		
	/*	
		// search page of Amazon
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		WebElement element = driver.findElement(By.name("url"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Car & Motorbike");
		driver.findElement(By.className("nav-input")).sendKeys("honda city car cover");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("nav-logo-sprites")).click();
	*/	
		
//==================================================================================		
	
	/*	
		// not working
		
	    System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement ele =driver.findElement(By.xpath("//html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[2]/div[2]/div/div/div/img"));
		Select s= new Select(ele);
		s.selectByIndex(2);
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
