package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSeleniumWebDriver {

	public static void main(String[] args) {
	
	System.setProperty("Webdriver.chrome.driver","c://chromeriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
//========================================================================
		/*
		System.setProperty("Webdriver.chrome.driver","c://chromeriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.navigate().refresh();
		String s= driver.getTitle();
		if(s!="") {
		System.out.println("tittle is  "+s);
		  if (s.length()>70) {
			 System.out.println("tittle is valid "); 
		  }else {
			  System.out.println("tittle is not valid ");
		  }
		}else {
			System.out.println("tittle is not set ");
		}
	*/
//=============================================================================
		
		 /*  
		System.setProperty("Webdriver.chrome.driver","c://chromeriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("_30XB9F")).click();
		driver.findElement(By.className("YBLJE4")).click();
		String s= driver.getCurrentUrl();
		System.out.println(s);
	*/
//==========================================================================
		/*
		System.setProperty("Webdriver.chrome.driver","c://chromeriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		String s = driver.getPageSource();
		System.out.println(s);
		*/
//======================================================================
		/*
		System.setProperty("Webdriver.chrome.driver","c://chromeriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("_30XB9F")).click();
		WebElement ele = driver.findElement(By.className("aqQN50"));
		String s = ele.getAttribute("src");
		System.out.println(s);
		driver.get(s);
		*/
		
//==========================================================================
		/*
		System.setProperty("Webdriver.chrome.driver","c://chromeriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("_30XB9F")).click();
		WebElement ele = driver.findElement(By.className("aqQN50"));
		String s = ele.getAttribute("src");
		int positon = s.lastIndexOf("/");
		String image = s.substring(positon+1);
		System.out.println(image);
		*/
		
	}

}
