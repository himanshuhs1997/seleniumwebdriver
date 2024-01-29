package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//use for frame page click option
		
	    System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("AbstractWebDriverEventListener")).click();
		
		
// =============================================================		
	/*	
       // click option example if frame are not available
		
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		WebElement ele = driver.findElement(By.partialLinkText("Python"));
		ele.click();
		
		   // this are not uses
		
		//driver.switchTo().frame("row");
		//driver.findElement(By.linkText("About")).click();
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
