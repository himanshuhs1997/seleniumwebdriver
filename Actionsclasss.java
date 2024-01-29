package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionsclasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eroomrent.in/index.php");
		WebElement ele = driver.findElement(By.linkText("Owner-G"));
	    Actions obj = new Actions(driver);
	    Action ref = obj.moveToElement(ele).build();
	    ref.perform();
	    driver.findElement(By.partialLinkText("Login")).click();

		
//==============================================================================
		
	/*	System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/");
        WebElement ele = driver.findElement(By.linkText("Home"));
        WebElement td = driver.findElement(By.xpath("//html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]"));
		String color = td.getCssValue("background-color");
		System.out.println(color);
		Actions obj = new Actions(driver);
		Action ref = obj.moveToElement(ele).build();
		ref.perform();
		String color1 = td.getCssValue("background-color");
		System.out.println(color1);
		*/
		
//======================================================================
		
	
		
		
  }
}
