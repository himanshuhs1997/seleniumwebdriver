package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearCarRental {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.clearcarrental.com/");
		Thread.sleep(3000);
		// outstation-oneway
		driver.findElement(By.id("searchOpt1")).click();
		driver.findElement(By.id("oneW")).click();
		driver.findElement(By.name("sourceCity")).sendKeys("indore");
		driver.findElement(By.name("destinationCity")).sendKeys("bhopal");
		driver.findElement(By.name("travelDate")).sendKeys("08-sep-2024");
		driver.findElement(By.id("timePickExample")).sendKeys("05:15 PM");
		driver.findElement(By.xpath("//*[@id=\"buttonDiv\"]/button")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);

		// outstation-roundtrip
		driver.findElement(By.id("searchOpt1")).click();
		driver.findElement(By.id("rndT")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("mumbai");
		driver.findElement(By.id("destinationCity4")).sendKeys("delhi");
		driver.findElement(By.id("datepicker")).sendKeys("10-sep-2024");
		driver.findElement(By.name("travelDateEnd")).sendKeys("12-sep-2024");
		driver.findElement(By.name("pTime")).sendKeys("07:15 PM");
		driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/div[3]/div/form/div/div[1]/div[7]/button")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);

		// outstation-multicity
		driver.findElement(By.id("searchOpt1")).click();
		driver.findElement(By.id("multiC")).click();
		driver.findElement(By.name("sourceCity")).sendKeys("mumbai");
		driver.findElement(By.name("destinationCity")).sendKeys("delhi");
		driver.findElement(By.className("AddRemoveBtn")).click();
		driver.findElement(By.id("destinationCity5")).sendKeys("bhopal");
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("12-sep-2024");
		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).sendKeys("14-sep-2024");
		driver.findElement(By.name("pTime")).sendKeys("09:49 PM");
		driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/div[3]/div/form/div/div[5]/div[4]/button")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);

		// local-halfday
		driver.findElement(By.id("searchOpt2")).click();
		driver.findElement(By.id("oneW")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("mumbai");
		driver.findElement(By.id("datepicker")).sendKeys("15-sep-2024");
		driver.findElement(By.name("travelDateEnd")).sendKeys("15-sep-2024");
		driver.findElement(By.name("pTime")).sendKeys("07:15 PM");
		driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/div[3]/div/form/div/div[1]/div[9]/button")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);

		// local-fullday
		driver.findElement(By.id("searchOpt2")).click();
		driver.findElement(By.id("rndT")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("bhopal");
		driver.findElement(By.id("datepicker")).sendKeys("17-sep-2024");
		driver.findElement(By.name("travelDateEnd")).sendKeys("17-sep-2024");
		driver.findElement(By.name("pTime")).sendKeys("07:15 PM");
		driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/div[3]/div/form/div/div[1]/div[7]/button")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);

		// transfer- railway station
		driver.findElement(By.id("searchOpt3")).click();
		driver.findElement(By.id("oneW")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("Ahmedabad");
		driver.findElement(By.name("pickUpLocation")).sendKeys("Kalupur Railway Station (adi)");
		driver.findElement(By.id("dropLocation")).sendKeys("A One Hotel");
		driver.findElement(By.id("datepicker")).sendKeys("20-sep-2024");
		driver.findElement(By.name("travelDateEnd")).sendKeys("20-sep-2024");
		driver.findElement(By.name("pTime")).sendKeys("01:45 PM");
		driver.findElement(By.xpath("//*[@id=\"buttonDiv\"]/button")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);

		// transfer- Airport
		driver.findElement(By.id("searchOpt3")).click();
		driver.findElement(By.id("rndT")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("Agra");
		driver.findElement(By.name("pickUpLocation")).sendKeys("Kheria Airport (agr)");
		driver.findElement(By.id("dropLocation")).sendKeys("Ashok Tourist Lodge");
		driver.findElement(By.id("datepicker")).sendKeys("20-sep-2023");
		driver.findElement(By.name("travelDateEnd")).sendKeys("20-sep-2024");
		driver.findElement(By.name("pTime")).sendKeys("01:45 PM");
		driver.findElement(By.xpath("//*[@id=\"buttonDiv\"]/button")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);

		// transfer- Area/hotel
		driver.findElement(By.id("searchOpt3")).click();
		driver.findElement(By.id("multiC")).click();
		driver.findElement(By.id("sourceCity4")).sendKeys("indore");
		driver.findElement(By.name("pickUpLocation")).sendKeys("Ajay Bagh Colony");
		driver.findElement(By.id("dropLocation")).sendKeys("Devi Ahilya Bai Holkar Airport (idr)");
		driver.findElement(By.id("datepicker")).sendKeys("08-sep-2023");
		driver.findElement(By.name("travelDateEnd")).sendKeys("08-sep-2024");
		driver.findElement(By.name("pTime")).sendKeys("01:45 PM");
		driver.findElement(By.xpath("//*[@id=\"buttonDiv\"]/button")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);

		// deals- oneway deals
		driver.findElement(By.id("searchOpt7")).click();
		driver.findElement(By.id("rndT")).click();
		driver.findElement(By.name("sourceCity")).sendKeys("Agra");
		driver.findElement(By.name("destinationCity")).sendKeys("mumbai");
		driver.findElement(By.name("travelDate")).sendKeys("08-sep-2024");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[3]/div/form/div/div[1]/div[7]/button")).click();

	}
}
