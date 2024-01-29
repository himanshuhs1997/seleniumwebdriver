package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextActionsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
		   Actions obj = new Actions(driver);
		   WebElement ele = driver.findElement(By.id("txt1"));
		   WebElement ele1 =driver.findElement(By.id("txt2"));
		   obj.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys("himanshu").contextClick();
		   obj.keyDown(Keys.CONTROL).sendKeys("a","c");
		   obj.moveToElement(ele1).click().keyDown(Keys.CONTROL).sendKeys("v");
		   obj.keyUp(Keys.CONTROL).build().perform();
		   
	
	
	
	
	
	
	
	}

}
