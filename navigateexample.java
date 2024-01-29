package WebDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	/*	
		System.setProperty("WebDriver.chrome.driver","c://ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shivaconceptsolution.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://shivaconceptdigital.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	*/
		
//===============================================================================
		
	/*	
		// total hyper link
		System.setProperty("WebDriver.chrome.driver","c://ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eroomrent.in/index.php");
		List<WebElement> s = driver.findElements(By.tagName("a"));
		int a=0, b=0;
		ArrayList arrlist = new ArrayList();
		for (WebElement o:s) {
			WebElement e= (WebElement)o;
			String u = e.getAttribute("href");
			if(u.equals("") || u.equals("#")) {
			a++;
		   }else {
		   	b++;
		   }
		arrlist.add(u);
		System.out.println(u);
		}
		for(Object o1:arrlist) {
			driver.navigate().to(o1.toString());
			driver.navigate().back();
			driver.navigate().refresh();
			
		}
		System.out.println("Total Hyperlinks are "+s.size());
		System.out.println("Total non Working Hyperlinks are "+a);
		System.out.println("Total working Hyperlinks are "+b);
		
	*/	
			
		
	}

}
