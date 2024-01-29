package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTotalHeadingOfPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eroomrent.in");
		List<WebElement> ele = driver.findElements(By.tagName("h1"));
		System.out.println(ele.size());
	      for (WebElement e:ele) {
			System.out.println(e.getText());
		}
   */
//==============================================================================	
		
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eroomrent.in/about.php");
		List<WebElement> ele1 = driver.findElements(By.tagName("p"));
		System.out.println(ele1.size());
		for (WebElement e:ele1) {
			System.out.println(e.getText());
		}
		
}
}


