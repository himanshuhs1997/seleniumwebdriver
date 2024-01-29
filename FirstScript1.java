package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript1 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver" , "c://chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.shivaconceptsolution.com");


//=============================================================================		
   /*   
	
	public static void main(String args[]) {
	
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	*/
//==============================================================================	
	/*
	 
	System.setProperty("Webdriver.chrome.driver", "c://Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	*/
	
	
	
	
	
	
	
	}

}
