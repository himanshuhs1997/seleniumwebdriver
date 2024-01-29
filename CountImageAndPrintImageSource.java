package WebDriver;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountImageAndPrintImageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 
	System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");	
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://eroomrent.in/index.php");
	List<WebElement> ele = driver.findElements(By.className("img-fluid"));
		System.out.println("total image is"+ele.size());
		for (WebElement e:ele) {
			String s = e.getAttribute("src");
			System.out.println(s);
		}
 
		
//=====================================================================
	
/*		
	//	 Scanner flipkart
		
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter url without http and https");
		String url= sc.next();
		driver.get("https://"+url);
		List<WebElement> ele = driver.findElements(By.tagName("img"));
		System.out.println("total image is "+ele.size());
		for (WebElement e:ele) {
			String s = e.getAttribute("src");
			int position = s.lastIndexOf("/");
			String imagename = s.substring(position+1);
			System.out.println("src is "+s+"imagename is "+imagename);
		}
	*/	
//============================================================================
		
	/*	
		// shiva concept solution
		
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shivaconceptsolution.com/");
		List<WebElement> ele1= driver.findElements(By.tagName("img"));
		System.out.println("total image is "+ele1.size());
		for (WebElement e:ele1) 
		{
			String s= e.getAttribute("src");
			System.out.println("src is "+s);
		}
	*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
