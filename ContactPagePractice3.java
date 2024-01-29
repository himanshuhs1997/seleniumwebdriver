package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactPagePractice3 {		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://eroomrent.in");
		
		driver.findElement(By.partialLinkText("Contact")).click();
		String s= driver.getCurrentUrl();
		System.out.println("url is "+s);
		driver.findElement(By.linkText("FAQ")).click();
		String s1 = driver.getCurrentUrl();
		System.out.println("url is "+s1);
   
		
//=====================================================================		
	
	/*	
		System.setProperty("Webdriver.chrome.driver","c://Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.onlinesbi.sbi/#");
		driver.findElement(By.partialLinkText("Corporate Website")).click();
		String s= driver.getCurrentUrl();
		System.out.println(s);
		driver.navigate().back();
		driver.findElement(By.linkText("mCash")).click();
		System.out.println(driver.getCurrentUrl());
	*/	

//=========================================================================
	/*	
		// not working

		System.setProperty("Webdriver.chrome.driver","c://Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.partialLinkText("Demo Account")).click();
		String s= driver.getCurrentUrl();
		System.out.println(s);
	*/	
		
	
	}

}
