package WebDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// google 
	/*	
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("selenium interview questions");
		element.sendKeys(Keys.ENTER);
		List<WebElement> ele= driver.findElements(By.className("LC20lb"));
		System.out.println(ele.size());
		//for (WebElement e:ele) {
		//	System.out.println(e.getText());
		//  }   
   */

//===============================================================================

		
		// shiva concept test html
	/*	
		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.get("https://shivaconceptsolution.com/backupmain/test.html");
		driver.findElement(By.xpath("//html/body/input[1]")).sendKeys("himanshu");
		driver.findElement(By.xpath("//html/body/input[2]")).sendKeys("abc@123");
		driver.findElement(By.xpath("//html/body/input[3]")).sendKeys("sharma8486@gmail.com");
		driver.findElement(By.xpath("//html/body/input[4]")).sendKeys("10-07-2023");
		driver.findElement(By.xpath("//html/body/input[5]")).sendKeys("8546523256");
   */
//=================================================================================

		// ebay
		
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.ebay.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    Stopwatch watch = null;
	    try {
	    	watch = Stopwatch.createStarted();
	    	driver.findElement(By.linkText("Electroics")).click();
	    }catch (Exception e)
	    {
	    	watch.stop();
	    	System.out.println(e);
	    	System.out.println(watch.elapsed(TimeUnit.SECONDS)+"seconds");
	    }
	    
	    
//==============================================================================	    
		
		// baeldung 
	/*	
		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.baeldung.com");
		driver.findElement(By.id("menu-item-6138")).click();
		driver.findElement(By.xpath("//a[@href='/about']")).click();
		List<WebElement> ele = driver.findElements(By.tagName("p"));
		System.out.println("total paragraph is "+ele.size());
		for(WebElement e:ele) {
			System.out.println(e.getText());
		}
       */
//=================================================================================

	/*    
		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium WebDriver");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> ele = driver.findElements(By.cssSelector("div.s-result-item"));
		System.out.println("total no. of search result "+ele.size());
	*/	
	
//==================================================================================	
	
	
		
	}

}
