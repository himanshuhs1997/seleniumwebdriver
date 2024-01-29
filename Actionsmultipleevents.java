package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionsmultipleevents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 
		  System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
		  WebElement ele = driver.findElement(By.id("txt1")); 
		  Actions obj= new Actions(driver); 
		  Action ref = obj.moveToElement(ele).click().keyDown(ele,Keys.SHIFT).sendKeys("himanshu").doubleClick().build(); 
		  ref.perform();
		 */

//==============================================================================

		// shiva concept --- test.html
	/*	
		   System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
		   Actions obj= new Actions(driver);
		   WebElement ele = driver.findElement(By.id("txt1")); 
		   ele.sendKeys("himanshu");
		  obj.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		  obj.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		  obj.sendKeys(Keys.TAB).build().perform();
		  obj.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
    */  
		
//======================================================================

		//eroomrent-----registration (copy , pest)
		
		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://eroomrent.in");
		   Actions obj= new Actions(driver);
		   WebElement ele = driver.findElement(By.linkText("Owner-G"));
		   obj.moveToElement(ele).build().perform();
		   driver.findElement(By.partialLinkText("Register")).click();
		   WebElement ele1 = driver.findElement(By.name("txtfname"));
		   WebElement ele2= driver.findElement(By.name("txtPassword"));
		   obj.moveToElement(ele1).click().sendKeys("himanshu");
		   obj.keyDown(Keys.CONTROL).sendKeys("a","c");
		   obj.moveToElement(ele2).click().keyDown(Keys.CONTROL).sendKeys("v");
		   obj.keyUp(Keys.CONTROL).build().perform();
		   
//======================================================================		   
		   
		
		//eroomrent-----login (cut , pest)
	/*	
		   System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://eroomrent.in");
		   Actions obj= new Actions(driver);
		   WebElement ele = driver.findElement(By.linkText("Owner-G"));
		   obj.moveToElement(ele).build().perform();
		   driver.findElement(By.partialLinkText("Login")).click();
		   WebElement ele1= driver.findElement(By.name("txtEmail"));
		   WebElement ele2= driver.findElement(By.name("txtPassword"));
		   obj.moveToElement(ele1).click().sendKeys("himanshu");
		   obj.keyDown(Keys.CONTROL).sendKeys("a","x");
		   obj.moveToElement(ele2).click().keyDown(Keys.CONTROL).sendKeys("v");
		   obj.keyUp(Keys.CONTROL).build().perform();
	*/	   
		
//=========================================================================			
		
	/*	
	      // demo site
		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		Actions actions = new Actions(driver);
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Mr.Peter Haynes");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("PeterHaynes@toolsqa.com");
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("43 School Lane London EC71 9GO");

		// Select the Current Address using CTRL + A
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		// Copy the Current Address using CTRL + C
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		// Press the TAB Key to Switch Focus to Permanent Address
		actions.sendKeys(Keys.TAB).build().perform();

		// Paste the Address in the Permanent Address field using CTRL + V
		actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		*/
	}

}
