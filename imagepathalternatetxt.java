package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imagepathalternatetxt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://eroomrent.in");
	    WebElement ele = driver.findElement(By.className("img-fluid"));
	    String src = ele.getAttribute("src");
	    String alt = ele.getAttribute("alt");
	    System.out.println("src ic "+src);
	    System.out.println("alt is "+alt);
	*/
		
//==================================================================================
		
	/*	
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://eroomrent.in");
	    WebElement ele= driver.findElement(By.className("img-fluid"));
	    String s= ele.getAttribute("src");
	    int position = s.lastIndexOf("/");
	    String image = s.substring(position+1);
	    System.out.println(image);               // for image name
	    String alt = ele.getAttribute("alt");
	    System.out.println("src is "+s);        // for logo path
	    driver.get(s);                         // for image show
	    System.out.println("alt is "+alt);     //
	*/
		
//======================================================================================
		
	/*	
		System.setProperty("WebDriver.chrome.driver","c://ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement ele = driver.findElement(By.tagName("img"));
		String src= ele.getAttribute("src");
		int position = src.lastIndexOf("/");
		String imagename = src.substring(position+1);
		System.out.println(imagename);
		String alt = ele.getAttribute("alt");
		System.out.println("src is "+src);
		driver.get(src);
		System.out.println("alt is "+ alt);
	*/
	
	
	
	}

}
