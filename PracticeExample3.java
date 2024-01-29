package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*
		System.setProperty("WebDriver.chrome.driver","C://ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://eroomrent.in");
        
        
        // for tittle print 
        String s = driver.getTitle();
        if (s!="") {
        	System.out.println("tittle is "+s);
        	if (s.length()<60) {
        		System.out.println("valid");
        	}else {
        		System.out.println("invalid");
        	}
        }else {
        	System.out.println("tittle is not set");
        }
    */  
		
//============================================================================
	/*	
        // for webpage url
        driver.findElement(By.partialLinkText("Contact")).click();
	    String s1 = driver.getCurrentUrl();
	    System.out.println(s1);
	*/
		
//============================================================================
		
	/*	
	    // fill details
	    driver.findElement(By.name("firstname")).sendKeys("himanshu sharma");
	    driver.findElement(By.name("city")).sendKeys("nhrrei@gmail.com");
	    driver.findElement(By.name("cnct")).sendKeys("9846569865");
	    driver.findElement(By.name("subject")).sendKeys("hfu hfirhe hrfieuh hri");
	    driver.findElement(By.name("btnsubmit")).click();
    */
		
//=========================================================================
		
	/*	
	    // for check search dropdown option
	    driver.get("https://eroomrent.in/index.php");
	    driver.navigate().refresh();
	    Select dd = new Select(driver.findElement(By.id("cat")));
	    dd.selectByIndex(2);
	    Select dd1 = new Select(driver.findElement(By.id("subcat")));
	    dd1.selectByIndex(1);
	    Select dd2 = new Select(driver.findElement(By.id("location")));
	    dd2.selectByIndex(5);
	    driver.findElement(By.className("btn-one")).click();
 
 */
//============================================================================
		
	/*	
	    // for check logo path
	    WebElement image = driver.findElement(By.className("img-fluid"));
	    String s= image.getAttribute("src");
	    System.out.println(s);
	    driver.get(s);
	*/
//==============================================================================
		
	/*	
	    //image name
	    String s1 = image.getAttribute("src");
	    int position = s1.lastIndexOf("/");
	    String imagename = s1.substring(position+1);
	    System.out.println(imagename);
	    String alt = image.getAttribute("alt");
	    System.out.println("s1 is "+s1);
	    driver.get(s1);
        System.out.println("alt "+alt);
        */
		
//=============================================================================		
	
	/*	
	    // count image
	    List<WebElement> ele = driver.findElements(By.className("img-fluid"));
	    System.out.println("count is "+ele.size());
	    for (WebElement e:ele) {
	    	String s = e.getAttribute("src");
	    	System.out.println(s);
	    }
	*/
		
//==============================================================================
		
  /*		
	    // page source code
	    System.out.println(driver.getPageSource());
  */	    
	   
	/*	// get text -- check heading ,paragraph
	    WebElement ele2= driver.findElement(By.tagName("h1"));
	    String s= ele2.getText();
	    System.out.println(s);
	*/
//================================================================================
	/*	
	    //get css value
	    
        driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
	    WebElement value = driver.findElement(By.xpath("//html/body/input[8]"));
	    String color = value.getCssValue("color");
	    String width = value.getCssValue("width");
	    String height = value.getCssValue("height");
	    System.out.println("color is "+color);
	    System.out.println("width is "+width);
	    System.out.println("height is "+height);
     */
		
//===============================================================================
	/*	
        // get location
        WebElement ele = driver.findElement(By.tagName("input"));
        int s= ele.getLocation().x;
        int s1= ele.getLocation().y;
        System.out.println("x is "+s);
        System.out.println("y is "+s1);
    */
//===================================================================================

	/*	
        System.setProperty("WebDriver.chrome.driver","C://ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://nxtgenaiacademy.com/demo-site/");
        WebElement ele =driver.findElement(By.tagName("h3"));
        String s= ele.getText();
        System.out.println(s);
        driver.findElement(By.name("vfb-5")).sendKeys("ram");
        driver.findElement(By.name("vfb-7")).sendKeys("sharma");
      WebElement ele1 =  driver.findElement(By.name("vfb-31"));
      int s1= ele1.getLocation().y;
      System.out.println("y location is "+s1);
      WebElement ele2= driver.findElement(By.id("vfb-31-2"));
      int s2 = ele2.getLocation().y;
      System.out.println("second y location is"+s2);
      if(s1==s2) {
    	  System.out.println("radio button is aligned");
      }else {
    	  System.out.println("radio button is not aligned");
      }
    driver.findElement(By.name("vfb-31")).click();
    driver.findElement(By.name("vfb-13[address]")).sendKeys("bhawarkua");
    driver.findElement(By.name("vfb-13[address-2]")).sendKeys("Ab road");
    driver.findElement(By.name("vfb-13[city]")).sendKeys("indore");
    driver.findElement(By.name("vfb-13[state]")).sendKeys("mp");
    driver.findElement(By.name("vfb-13[zip]")).sendKeys("454552");
    driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[2]/div[1]/div/section/div/div[1]/div/div/div/div/div/form/fieldset[1]/ul/li[4]/div/span[6]/span/span[1]/span")).click();
    driver.findElement(By.xpath("//html/body/span[2]/span/span[2]/ul/li[79]")).click();
	driver.findElement(By.name("vfb-14")).sendKeys("ram686@gmail.com");
	driver.findElement(By.name("vfb-18")).sendKeys("11/07/2023");
	
	
	driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[2]/div[1]/div/section/div/div[1]/div/div/div/div/div/form/fieldset[1]/ul/li[7]/span[1]/span/span[1]/span/span[1]")).click();
	driver.findElement(By.xpath("//html/body/span[2]/span/span[2]/ul/li[9]")).click();
	driver.findElement(By.id("select2-vfb-16-min-container")).click();
	driver.findElement(By.className("select2-results__option select2-results__option--selectable select2-results__option--highlighted")).click();
	driver.findElement(By.name("vfb-19")).sendKeys("9585452536");
	driver.findElement(By.name("vfb-20[]")).click();
	driver.findElement(By.name("vfb-23")).sendKeys("manual testing");
	driver.findElement(By.id("vfb-3")).sendKeys("99");
	driver.findElement(By.id("vfb-4")).click();

	*/
	
	
	
	
	}

}
